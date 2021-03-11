package alex.learn.base.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * author  : zhiguang
 * date    : 2018/7/18
 */
public class RegxWoker {

    static Pattern pt ;
    static Matcher match;

    public static boolean verify(String regx, String input){
        pt = Pattern.compile(regx);
        match = pt.matcher(input);
        match.find();

        return false;
    }
}
