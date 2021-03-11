package alex.learn.antlr.demo4;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * author  : zhiguang
 * date    : 2018/7/12
 */


public class MainDrive {
    public static void main(String[] args) throws IOException {
        String file="F:\\sql.in";
        //创建输入文件流
        FileInputStream inputStream=new FileInputStream(file);
        //转化为字符流
        CharStream input= CharStreams.fromStream(inputStream);
        //创建词法分析器
        OracleQueryLexer lexer=new OracleQueryLexer(input);
        //获取Token集
        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
        //创建语法分析器
        OracleQueryParser parser= new OracleQueryParser(tokenStream);
        //分析语法
        ParseTree tree= parser.column_name();
        //遍历语法树，输出结果
        OracleQueryBaseVisitor visitor=new OracleQueryBaseVisitor();
        //当遍历树时如果出错，会返回空指针，在这里捕获
        try{
            visitor.visit(tree);
        }catch (NullPointerException e){
            System.out.println("oops, we have some problem");
        }
    }
}
