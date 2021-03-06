package alex.learn.base.basics;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author  : zhiguang
 * date    : 2018/7/18
 */
public class CheDan implements Serializable {
    private String columnname;
    private String columntype;
    private String max;
    private String min;
    private String dformat;

    private List<String> legals = new ArrayList<>();
    private Map<String, String> regxx = new HashMap<>();

    public CheDan() {
        this.legals.add("NUMBER");
        this.legals.add("FLOAT");
        this.legals.add("LONG");
        this.legals.add("INTEGER");
        this.legals.add("DATE");
        this.regxx.put("yyyy-mm-dd", "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$");
        this.regxx.put("yyyy-mm-dd hh:mm:ss", "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$");
        this.regxx.put("yyyymmdd", "^[1-9]\\d{3}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$");
        this.regxx.put("yyyymmdd hh:mm:ss", "^[1-9]\\d{3}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$");
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getColumntype() {
        return columntype;
    }

    public void setColumntype(String columntype) throws IOException {
        for (String legal : this.legals) {
            if (null != columntype && columntype.equalsIgnoreCase(legal)) {
                this.columntype = columntype.toUpperCase();
            }
        }
        if (null == this.columntype) {
            throw new IOException("aaaa");
        }
    }


    public String getMax() {
        return max;
    }

    public void setMax(String max) throws IOException, ParseException {
        long time = 0L;
        SimpleDateFormat format = null;
        if (null == this.columntype) {
            throw new IOException("Columntype must be set prior.");
        } else if ("DATE".equals(this.columntype)) {
            if (max.matches(this.regxx.get("yyyy-mm-dd"))) {
                format = new SimpleDateFormat("yyyy-MM-dd");
                time = format.parse(max).getTime();
                this.dformat="yyyy-mm-dd";
            }else if(max.matches(this.regxx.get("yyyymmdd"))) {
                format = new SimpleDateFormat("yyyyMMdd");
                time = format.parse(max).getTime();
                this.dformat="yyyymmdd";
            }else if(max.matches(this.regxx.get("yyyy-mm-dd hh:mm:ss"))) {
                format = new SimpleDateFormat("yyyy-mm-dd hh:mm:s");
                time = format.parse(max).getTime();
                this.dformat="yyyy-mm-dd hh:mm:ss";
            }else if(max.matches(this.regxx.get("yyyymmdd hh:mm:ss"))) {
                format = new SimpleDateFormat("yyyymmdd hh:mm:s");
                time = format.parse(max).getTime();
                this.dformat="yyyymmdd hh:mm:ss";
            } else {
                throw new IOException("Date value has wrong format.");
            }
            this.max=time+"";
        } else {
            if (isNumeric(max)) {
                this.max = max;
            } else {
                throw new IOException("Illegal value is found.");
            }
        }

    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getDformat() {
        return dformat;
    }

    public void setDformat(String dformat) {
        this.dformat = dformat;
    }

    //??????????????? true????????????????????????
    public boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "CheDan{" +
                "columnname='" + columnname + '\'' +
                ", columntype='" + columntype + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                ", legals=" + legals +
                '}';
    }
}
