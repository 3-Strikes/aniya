package com.zuoye;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {
    public static final String URL = "jdbc:mysql://localhost:3306/db_test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try {
            //显式创建驱动实例并注册
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            // 完全省略 Class.forName() - 使用 JDBC 4.0 自动加载
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM emp")) {

                System.out.println("数据库连接成功！开始查询数据...");

                while (rs.next()) {
                    String ename = rs.getString("ENAME");
                    int sal = rs.getInt("SAL");
                    System.out.println(ename + " 工资：" + sal);
                }
            }
        } catch (SQLException e) {
            System.err.println("数据库错误: " + e.getMessage());
            System.err.println("可能原因:");
            System.err.println("1. MySQL 服务未运行");
            System.err.println("2. 数据库连接信息错误");
            System.err.println("3. 表 emp 不存在");
            System.err.println("4. 驱动未正确添加到类路径");
            e.printStackTrace();

            // 添加类路径诊断信息
            System.out.println("\n==== 类路径诊断信息 ====");
            String classpath = System.getProperty("java.class.path");
            System.out.println("当前类路径: " + classpath);
        }
    }
}