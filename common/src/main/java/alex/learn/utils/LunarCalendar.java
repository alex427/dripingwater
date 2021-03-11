package alex.learn.utils;

import java.util.Calendar;


/**
 * Created by zhiguang on 2018/7/15.
 */
public class LunarCalendar {
    public static void main(String[] args) {
        Solar s = new Solar();
        s.getDate(2020, 9);
        String t = MutualConversion.solarToLundar(2009, 10, 12);
        String[] str = t.split("-");
        Lunar la = new Lunar(Integer.parseInt(str[0]), Integer
                .parseInt(str[1]), Integer.parseInt(str[2]));
        System.out.println("\n\n阳历2009-10-12日对应的农历日期为："+la.toString(1)+" "+la.toWeek());
        String t1 = MutualConversion.lundarToSolar(2019, 1, 1);
        String[] str1 = t1.split("-");
        Solar s1 = new Solar(Integer.parseInt(str1[0]), Integer
                .parseInt(str1[1]), Integer.parseInt(str1[2]));
        System.out.println("\n农历2019-1-1日对应的阳历日期为："+s1.toString()+" "+s1.toWeek());
    }
}
// 自定义日历类，其作用是实现阳历和农历日期相互转换的功能
class MutualConversion {
    // 阵列storeLunarMonth存储在每月一天的资料，每年从1901年到2100年的农历，农历只能是29或30天，
    // 每月表达12（或13）的二进制位在一年内，这是30 1中的相应位置的形式天，否则，29天
    private static final int[]storeLunarMonth = {
            0x4ae0,0xa570,0x5268,0xd260,0xd950,0x6aa8,
            0x56a0,0x9ad0,0x4ae8,0x4ae0,//1910
            0xa4d8,0xa4d0,0xd250,0xd548,0xb550,0x56a0,
            0x96d0,0x95b0,0x49b8,0x49b0,//1920
            0xa4b0,0xb258,0x6a50,0x6d40,0xada8,
            0x2b60,0x9570,0x4978,0x4970,0x64b0, //1930
            0xd4a0,0xea50,0x6d48,0x5ad0,0x2b60,
            0x9370,0x92e0,0xc968,0xc950,0xd4a0, //1940
            0xda50,0xb550,0x56a0,0xaad8,0x25d0,
            0x92d0,0xc958,0xa950,0xb4a8,0x6ca0, //1950
            0xb550,0x55a8,0x4da0,0xa5b0,0x52b8,
            0x52b0,0xa950,0xe950,0x6aa0,0xad50, //1960
            0xab50,0x4b60,0xa570,0xa570,
            0x5260,0xe930,0xd950,0x5aa8,0x56a0,0x96d0, //1970
            0x4ae8,0x4ad0,0xa4d0,0xd268,0xd250,
            0xd528,0xb540,0xb6a0,0x96d0,0x95b0, //1980
            0x49b0,0xa4b8,0xa4b0,0xb258,0x6a50,
            0x6d40,0xada0,0xab60,0x9370,0x4978, // 1990
            0x4970,0x64b0,0x6a50,0xea50,0x6b28,
            0x5ac0,0xab60,0x9368,0x92e0,0xc960, //2000
            0xd4a8,0xd4a0,0xda50,0x5aa8,0x56a0,
            0xaad8,0x25d0,0x92d0,0xc958,0xa950, //2010
            0xb4a0,0xb550,0xb550,0x55a8,0x4ba0
            ,0xa5b0,0x52b8,0x52b0,0xa930,0x74a8, //2020
            0x6aa0,0xad50,0x4da8,0x4b60,0x9570,
            0xa4e0,0xd260,0xe930,0xd530,0x5aa0, //2030
            0x6b50,0x96d0,0x4ae8,0x4ad0,0xa4d0,
            0xd258,0xd250,0xd520,0xdaa0,0xb5a0, //2040
            0x56d0,0x4ad8,0x49b0,0xa4b8,0xa4b0,
            0xaa50,0xb528,0x6d20,0xada0,0x55b0 //2050
    };
    // 阵列storeLunarLeapMonth存储的是农历1901年至2050年闰月的信息，0表示该年没有闰月，每个字符元素表示的存储两年。
    // 例如0x50该字符存储的是2009和2010年，0x表示八进制，5表示2009年闰5月，0表示2010没有闰月
    private static final char[] storeLunarLeapMonth = { 0x00, 0x50, 0x04, 0x00,
            0x20, // 1910
            0x60, 0x05, 0x00, 0x20, 0x70, // 1920
            0x05, 0x00, 0x40, 0x02, 0x06, // 1930
            0x00, 0x50, 0x03, 0x07, 0x00, // 1940
            0x60, 0x04, 0x00, 0x20, 0x70, // 1950
            0x05, 0x00, 0x30, 0x80, 0x06, // 1960
            0x00, 0x40, 0x03, 0x07, 0x00, // 1970
            0x50, 0x04, 0x08, 0x00, 0x60, // 1980
            0x04, 0x0a, 0x00, 0x60, 0x05, // 1990
            0x00, 0x30, 0x80, 0x05, 0x00, // 2000
            0x40, 0x02, 0x07, 0x00, 0x50, // 2010
            0x04, 0x09, 0x00, 0x60, 0x04, // 2020
            0x00, 0x20, 0x60, 0x05, 0x00, // 2030
            0x30, 0xb0, 0x06, 0x00, 0x50, // 2040
            0x02, 0x07, 0x00, 0x50, 0x03 // 2050
    };
    // 用矩阵存领存储从1901～2050年每一年的阳历和农历的偏移天数
    private static final char[] offseOfDays = { 49, 38, 28, 46, 34, 24, 43, 32,
            21, 40, // 1910
            29, 48, 36, 25, 44, 34, 22, 41, 31, 50, // 1920
            38, 27, 46, 35, 23, 43, 32, 22, 40, 29, // 1930
            47, 36, 25, 44, 34, 23, 41, 30, 49, 38, // 1940
            26, 45, 35, 24, 43, 32, 21, 40, 28, 47, // 1950
            36, 26, 44, 33, 23, 42, 30, 48, 38, 27, // 1960
            45, 35, 24, 43, 32, 20, 39, 29, 47, 36, // 1970
            26, 45, 33, 22, 41, 30, 48, 37, 27, 46, // 1980
            35, 24, 43, 32, 50, 39, 28, 47, 36, 26, // 1990
            45, 34, 22, 40, 30, 49, 37, 27, 46, 35, // 2000
            23, 42, 31, 21, 39, 28, 48, 37, 25, 44, // 2010
            33, 23, 41, 31, 50, 39, 28, 47, 35, 24, // 2020
            42, 30, 21, 40, 28, 47, 36, 25, 43, 33, // 2030
            22, 41, 30, 49, 37, 26, 44, 33, 23, 42, // 2040
            31, 21, 40, 29, 47, 36, 25, 44, 32, 22, // 2050
    };
    static boolean isLeapYearOfSolar(int year) {// 判断是否有闰年
        return ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
    }
    // 获取阳历中每个月的天数
    static int getSolarMonthOfDays(int year, int month) {
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
                || (month == 8) || (month == 10) || (month == 12))
            return 31;
        else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
            return 30;
        else if (month == 2) {
            if (isLeapYearOfSolar(year))
                return 29;
            else
                return 28;
        } else
            return 0;
    }
    // 获取新年的偏移天
    static int L_getOffsetOfDays(int year, int month, int day) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += getSolarMonthOfDays(year, i);
        }
        days += day - 1;
        return days;
    }
    static int L_getLeapMonth(int year) {
        char month = storeLunarLeapMonth[(year - 1901) / 2];
        if (year % 2 == 0)
            return (month & 0x0f);
        else
            return (month & 0xf0) >> 4;
    }
    // 获取当前年月的农历月
    static int L_getMonthDays(int year, int month) {
        int leapMonth = L_getLeapMonth(year);
        if ((month > 12) && (month - 12 != leapMonth) || (month < 0)) {
            System.out.println("输入的月份有错误");
            return -1;
        }
        if (month - 12 == leapMonth) {
            if ((storeLunarMonth[year - 1901] & (0x8000 >> leapMonth)) == 0)
                return 29;
            else
                return 30;
        }
        if ((leapMonth > 0) && (month > leapMonth))
            month++;
        if ((storeLunarMonth[year - 1901] & (0x8000 >> (month - 1))) == 0)
            return 29;
        else
            return 30;
    }
    // 获取当前年份的农历年
    static int getLunarYear(int year) {
        int iYearDays = 0;
        int leapMonth = L_getLeapMonth(year);
        for (int i = 1; i < 13; i++)
            iYearDays += L_getMonthDays(year, i);
        if (leapMonth > 0)
            iYearDays += L_getMonthDays(year, leapMonth + 12);
        return iYearDays;
    }
    static int getOffsetOfDays(int year, int month, int day) {
        int days = 0;
        int leapMonth = L_getLeapMonth(year);
        if ((leapMonth > 0) && (leapMonth == month - 12)) {
            month = leapMonth;
            days += L_getMonthDays(year, month);
        }
        for (int i = 1; i < month; i++) {
            days += L_getMonthDays(year, i);
            if (i == leapMonth)
                days += L_getMonthDays(year, leapMonth + 12);
        }
        days += day - 1;
        return days;
    }
    // 阳历转换成农历
    static String solarToLundar(int year, int month, int day) {
        int L_day, L_month, L_year;
        int days = L_getOffsetOfDays(year, month, day);
        int leapMonth = L_getLeapMonth(year);
        if (days < offseOfDays[year - 1901]) {
            L_year = year - 1;
            days = offseOfDays[year - 1901] - days;
            L_day = days;
            for (L_month = 12; days > L_getMonthDays(L_year, L_month); L_month--) {
                L_day = days;
                days -= L_getMonthDays(L_year, L_month);
            }
            if (0 == L_day)
                L_day = 1;
            else
                L_day = L_getMonthDays(L_year, L_month) - days + 1;
        } else {
            L_year = year;
            days -= offseOfDays[year - 1901];
            L_day = days + 1;
            for (L_month = 1; days >= 0; L_month++) {
                L_day = days + 1;
                days -= L_getMonthDays(L_year, L_month);
                if ((leapMonth == L_month) && (days > 0)) {
                    L_day = days;
                    days -= L_getMonthDays(L_year, L_month + 12);
                    if (days <= 0) {
                        L_month += 12 + 1;
                        break;
                    }
                }
            }
            L_month--;
        }
        return "" + L_year + "-" + L_month + "-" + L_day;
    }
    // 农历转换成阳历
    static String lundarToSolar(int year, int month, int day) {
        int S_year, S_month, S_day;
        int days = getOffsetOfDays(year, month, day) + offseOfDays[year - 1901];
        int iYearDays = isLeapYearOfSolar(year) ? 366 : 365;
        if (days >= iYearDays) {
            S_year = year + 1;
            days -= iYearDays;
        } else {
            S_year = year;
        }
        S_day = days + 1;
        for (S_month = 1; days >= 0; S_month++) {
            S_day = days + 1;
            days -= getSolarMonthOfDays(S_year, S_month);
        }
        S_month--;
        return "" + S_year + "-" + S_month + "-" + S_day;
    }
}
// 自定义星期类
class CustomWeek {
    int week;
    private String weeks[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };// 定义一个String数组，存储一周七天的星期
    public CustomWeek() {// 默认星期为星期日
        week = 0;
    }
    // 0：星期日 1：星期一 2：星期二 3：星期三 4：星期四 5：星期五 6：星期六
    public CustomWeek(int w) {
        if ((w > 6) || (w < 0)) {
            System.out
                    .println("CustomWeek out of range, I think you want Sunday");
            this.week = 0;
        } else
            this.week = w;
    }
    public String toString() {
        return weeks[week];
    }
}
// 自定义日期类
class CustomDate {
    public int year;
    public int month;
    public int day;
    private static int checkYear(int year) {// 检察输入的年份是否在指定的年份范围中
        if ((year > 1901) && (year < 2050))
            return year;
        else {
            System.out.println("输入的年份不在1901～2050之间，默认年份为1991年");
            return 1991;
        }
    }
    // 构造方法
    public CustomDate(int year, int month, int day) {
        this.year = checkYear(year);
        this.month = month;
        this.day = day;
    }
    public CustomDate(int year, int month) {
        this.year = checkYear(year);
        this.month = month;
        this.day = 1;
    }
    public CustomDate(int year) {
        this.year = checkYear(year);
        this.month = 1;
        this.day = 1;
    }
    public CustomDate() {// 默认初始化的日期为1991-01-01
        this.year = 1991;
        this.month = 1;
        this.day = 1;
    }
    public String toString() {
        return "" + this.year
                + (this.month > 9 ? "" + this.month : "0" + this.month)// 月以MM的形式表示
                + (this.day > 9 ? "" + this.day : "0" + this.day);// 日以dd的形式表示
    }
    public boolean equals(CustomDate md) {
        return ((md.day == this.day) && (md.month == this.month) && (md.year == this.year));
    }
}
// 阳历日期类,继承自定义日期
class Solar extends CustomDate {
    private static int checkMonth(int month) {// 检查月份是否越有效范围
        if (month > 12) {
            System.out.println("输入的月份越界, 默认月份为12月 ");
            return 12;
        } else if (month < 1) {
            System.out.println("输入的月份越界, 默认月份为1月");
            return 1;
        } else
            return month;
    }
    private static int checkDay(int year, int month, int day) {// 检查日期是否越有效范围
        int iMonthDays = MutualConversion.getSolarMonthOfDays(year, month);
        if (day > iMonthDays) {
            System.out.println("输入的日期越界, 默认日期为 " + iMonthDays + " ");
            return iMonthDays;
        } else if (day < 1) {
            System.out.println("输入的日期越界, 默认日期为1号");
            return 1;
        } else
            return day;
    }
    // SolarDate类的构造方法
    public Solar(int year, int month, int day) {
        super(year);
        this.month = checkMonth(month);
        this.day = checkDay(this.year, this.month, day);
    }
    public Solar(int year, int month) {
        super(year);
        this.month = checkMonth(month);
    }
    public Solar(int year) {
        super(year);
    }
    public Solar() {
        super();
    }
    // 以字符串的形式输出
    public String toString() {
        return "" + this.year
                + (this.month > 9 ? "-" + this.month : "-0" + this.month)
                + (this.day > 9 ? "-" + this.day : "-0" + this.day);
    }
    // 获取输入的年月日是星期几
    public CustomWeek toWeek() {
        int days = 0;
        for (int i = 1901; i < year; i++) {
            if (MutualConversion.isLeapYearOfSolar(i))
                days += 366;
            else
                days += 365;
        }
        days += MutualConversion.L_getOffsetOfDays(year, month, day);
        return new CustomWeek((days + 2) % 7);
    }
    public Lunar dateToLunar() {// 将输入日期转换成农历日期
        int year, month, day, iDate;
        Lunar ld;
        iDate = Integer.parseInt(MutualConversion.solarToLundar(this.year,
                this.month, this.day));
        year = iDate / 10000;
        month = iDate % 10000 / 100;
        day = iDate % 100;
        ld = new Lunar(year, month, day);
        return ld;
    }
    public void getDate(int year, int month) {
        Calendar calendar = Calendar.getInstance();// 获取一个Calendar对象
        int count = 0;// 定义一个计数变量
        calendar.set(Calendar.YEAR, year);// 设置年份
        calendar.set(Calendar.MONTH, month - 1);// 设置月份
        calendar.set(Calendar.DATE, 0);// 设置日期
        int days = MutualConversion.getSolarMonthOfDays(year, month);
        ;
        System.out.println(year + " 年 " + month + " 月 份 的 万 年 历 如 下：");
        System.out.println("星期日\t\t星期一\t\t星期二\t\t星期三\t\t星期四\t\t星期五\t\t星期六");
        while (count < days) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);// 设置添加日历的周期为1
            int day = calendar.getTime().getDay();// 获取日历的星期几表示数，例如：0：表示星期日
            if (count == 0) {// 根据星期几来决定输入几个tab
                for (int i = 0; i < day; i++) {
                    System.out.print("\t\t");
                }
            }
            if (day == 0) {// 如果是周日了则换行
                System.out.println();
            }
            String time = MutualConversion.solarToLundar(year, month, calendar
                    .getTime().getDate());
            String[] str = time.split("-");
            Lunar la = new Lunar(Integer.parseInt(str[0]), Integer
                    .parseInt(str[1]), Integer.parseInt(str[2]));
            String name = la.toString(0);
            System.out.print(calendar.getTime().getDate() + " ");// 获取日历中日期数
            System.out.print(name + "\t");// 获取日历中日期数
            count++;
        }
    }
}
// 农历日期类,继承自定义日期类
class Lunar extends CustomDate {
    private String upperFigure[] = { "零", "一", "二", "三", "四", "五", "六", "七",
            "八", "九", "十" };
    private static int checkDay(int year, int month, int day) {// 检查日期是否越有效范围
        int iMonthDays = MutualConversion.getSolarMonthOfDays(year, month);
        if (day > iMonthDays) {
            System.out.println("输入的日期越界, 默认日期为 " + iMonthDays + " ");
            return iMonthDays;
        } else if (day < 1) {
            System.out.println("输入的日期越界, 默认日期为1号");
            return 1;
        } else
            return day;
    }
    private static int checkMonth(int year, int month) {// 检查月份是否越有效范围
        if ((month > 12)
                && (month == MutualConversion.L_getLeapMonth(year) + 12)) {
            return month;
        } else if (month > 12) {
            System.out.println("输入的月份越界, 默认月份为12月 ");
            return 12;
        } else if (month < 1) {
            System.out.println("输入的月份越界, 默认月份为1月");
            return 1;
        } else
            return month;
    }
    // LunarDate类的构造方法
    public Lunar(int year, int month, int day) {
        super(year);
        this.month = checkMonth(this.year, month);
        this.day = checkDay(this.year, this.month, day);
    }
    public Lunar(int year, int month) {
        super(year);
        this.month = checkMonth(this.year, month);
    }
    public Lunar(int year) {
        super(year);
    }
    public Lunar() {
        super();
    }
    // 以字符串的形式输出
    public String toString(int n) {
        String sCalendar = "";
        if (n == 1) {
            sCalendar += "农历" + upperFigure[year / 1000]
                    + upperFigure[year % 1000 / 100]
                    + upperFigure[year % 100 / 10] + upperFigure[year % 10]
                    + "(" + toChineseEra() + ")年";
        }
        if (month > 12) {
            month -= 12;
            sCalendar += "闰";
        }
        if (month == 12)
            sCalendar += "腊月";
        else if (month == 11)
            sCalendar += "冬月";
        else if (month == 1)
            sCalendar += "正月";
        else
            sCalendar += upperFigure[month] + "月";
        if (day > 29)
            sCalendar += "三十";
        else if (day > 20)
            sCalendar += "二十" + upperFigure[day % 20];
        else if (day == 20)
            sCalendar += "二十";
        else if (day > 10)
            sCalendar += "十" + upperFigure[day % 10];
        else
            sCalendar += "初" + upperFigure[day];
        return sCalendar;
    }
    public CnWeek toWeek() {// 获取输入日期的星期几
        int days = 0;
        for (int i = 1901; i < year; i++)
            days += MutualConversion.getLunarYear(i);
        days += MutualConversion.getOffsetOfDays(year, month, day);
        return new CnWeek((days + 2) % 7);
    }
    public ChineseEra toChineseEra() {
        return new ChineseEra(year);
    }
    public Solar toSolarDate() {// 转换成阳历
        int year, month, day, iDate;
        Solar sd;
        iDate = Integer.parseInt(MutualConversion.lundarToSolar(this.year,
                this.month, this.day));
        year = iDate / 10000;
        month = iDate % 10000 / 100;
        day = iDate % 100;
        sd = new Solar(year, month, day);
        return sd;
    }
}
class CnWeek extends CustomWeek {// Week的子类
    private String sCnWeek[] = { "日", "一", "二", "三", "四", "五", "六" };
    // 调用父类的构造方法
    public CnWeek() {
        super();
    }
    public CnWeek(int week) {
        super(week);
    }
    public String toString() {
        return "星期" + sCnWeek[this.week];
    }
}
// 用天干地支形式表示农历年
class ChineseEra {
    int year;
    String[] westernNotation = { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬",
            "癸" };
    String[] chineseEraNotation = { "子", "丑", "寅", "卯", "辰", "巳", "午", "未",
            "申", "酉", "戌", "亥" };
    public ChineseEra() {
        int year = 1991;
    }
    public ChineseEra(int year) {
        if ((year < 2050) && (year > 1901))
            this.year = year;
        else
            this.year = 1991;
    }
    public String toString() {
        int temp;
        temp = Math.abs(year - 1924);
        return westernNotation[temp % 10] + chineseEraNotation[temp % 12];
    }
}
