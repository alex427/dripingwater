package alex.learn.antlr.demo5;

/**
 * author  : zhiguang
 * date    : 2018/7/12
 */
public class CalException extends Exception {
    private int line;
    private int column;
    private String msg;

    public CalException(int line,int column,String msg){
        this.line=line;
        this.column=column;
        this.msg=msg;
    }

    @Override
    public String toString() {
        return msg+",line:"+line+",column:"+column;
    }
}
