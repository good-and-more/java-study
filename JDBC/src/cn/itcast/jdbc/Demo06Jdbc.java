package cn.itcast.jdbc;

import java.sql.*;

/*
* 执行ddl语句
* */
public class Demo06Jdbc {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "select * from account";
            //3.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "");
            //4.获取执行sql的对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.1处理结果
            rs.next();
            //6.2获取数据
            int id = rs.getInt(1);
            String name = rs.getString(2);
            double balance = rs.getInt(3);
            System.out.println(id+"---"+name+"---"+balance);
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
