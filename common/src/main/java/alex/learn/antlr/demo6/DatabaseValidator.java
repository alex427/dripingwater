package alex.learn.antlr.demo6;

import alex.learn.antlr.demo6.model.sql.*;
import alex.learn.antlr.demo6.report.*;
import alex.learn.antlr.demo6.model.sql.Database;
import alex.learn.antlr.demo6.model.sql.ForeignKey;
import alex.learn.antlr.demo6.model.sql.Table;
import alex.learn.antlr.demo6.report.Report;
import alex.learn.antlr.demo6.report.ReportLine;
import alex.learn.antlr.demo6.report.ReportLineStatus;

/**
 * Validate database
 */
public class DatabaseValidator {

	/**
	 * Report
	 */
	private final Report report;

	/**
	 * Constructor
	 * @param report Report (must not be null)
	 */
	public DatabaseValidator(final Report report) {
		this.report = report;
	}

	/**
	 * Validate database
	 * @param database Database
	 */
	public void validateDatabase(final Database database) {
		for(final Table table : database.getTables()) {
			validateTable(table);
		}
	}

	/**
	 * Validate table and return true if the table is valid.
	 * @param table Table
	 * @return true if the table is valid
	 */
	public void validateTable(final Table table) {
		// primary key with only one column
		if(table.getPrimaryKey().getColumnNames().size() > 1) {
			final ReportLine reportLine = new ReportLine();
			report.add(reportLine);
			reportLine.setReportLineStatus(ReportLineStatus.PRIMARY_KEY_MORE_THAN_ONE_COLUMN);
			reportLine.setTable(table.getName());
		}

		// foreign key with only one column
		for(final ForeignKey foreignKey : table.getForeignKeys()) {
			if((foreignKey.getColumnNameOrigins().size() > 1) || (foreignKey.getColumnNameTargets().size() > 1)) {
				final ReportLine reportLine = new ReportLine();
				report.add(reportLine);
				reportLine.setReportLineStatus(ReportLineStatus.FOREIGN_KEY_MORE_THAN_ONE_COLUMN);
				reportLine.setTable(table.getName());
			}
		}
	}

}
