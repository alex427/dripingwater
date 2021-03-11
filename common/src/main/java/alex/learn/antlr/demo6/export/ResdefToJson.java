package alex.learn.antlr.demo6.export;

import alex.learn.antlr.demo6.model.resdef.Resdef;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import alex.learn.antlr.demo6.model.resdef.*;
import alex.learn.antlr.demo6.model.sql.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Serialize Resdef to JSON.
 */
public class ResdefToJson {

	/**
	 * Convert Resdef to JSON.
	 * @param resdef Resdef
	 * @return Json content
	 */
	public String resdefToJson(final Resdef resdef) {
		final ObjectMapper objectMapper = new ObjectMapper();

		// Indent JSON
		//objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		// Escape null entries
		objectMapper.setSerializationInclusion(Include.NON_NULL);

		final OutputStream out = new ByteArrayOutputStream();
		try {
			objectMapper.writeValue(out, resdef.getEntities());
		} catch (final IOException e) {
			throw new RuntimeException(e);
		}
		return out.toString();
	}

}
