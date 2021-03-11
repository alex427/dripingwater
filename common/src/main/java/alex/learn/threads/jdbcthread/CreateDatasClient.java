package alex.learn.threads.jdbcthread;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * author  : zhiguang
 * date    : 2018/7/10
 */

public class CreateDatasClient implements Runnable{
    private String url;

    public  CreateDatasClient(String url,String username,String password){
        this.url = url;
    }

    public static void main (String[] args) throws InterruptedException {
        String url ="jdbc:mysql://localhost:3306/mydb?"
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
        String username = "root";
        String password = "123456";

        //传统线程
       /* for (int i = 0; i < 10; i++){
            Thread tt = new Thread(new CreateDatasClient(url,username,password));
            tt.start();

        }*/
        //线程池
        Executor executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 20;i++){
            executor.execute(new CreateDatasClient(url,username,password));
        }
        ((ExecutorService) executor).awaitTermination(2,TimeUnit.SECONDS);
    }

    //各个线程单独建立连接，执行语句，关闭连接
    @Override
    public void run() {
        Connection conn = getConn(url);
        try {
            String sql = "insert into user values (0,'jetty',1,'worker','wuhan','gm',8000,5000);";
            String sql2 = "delete from user where name='jetty';";
            System.out.println(sql2);
            Statement stmt = (Statement) conn.createStatement();
            stmt.executeUpdate(sql2);
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConn(String url){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url);
            if (null != conn) {
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}

