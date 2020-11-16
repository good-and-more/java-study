package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 事务操作
* */
public class Demo10Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        //1.获取连接对象
        try {
            conn = JDBCUtils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //2.定义sql
            //2.1 张三-500
            String sql1 = "update account set balance = balance - ? where id = ?";
            //2.2 李四+500
            String sql2 = "update account set balance = balance + ? where id = ?";
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            //4.设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);

            //5.执行sql
            pstmt1.executeUpdate();

            //手动制造异常
            int i = 3/0;

            pstmt2.executeUpdate();

            //执行完毕，提交事务
            conn.commit();
        } catch (Exception throwables) {
            try {
                if(conn != null) {
                    conn.rollback();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
