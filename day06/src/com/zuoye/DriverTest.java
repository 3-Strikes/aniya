package com.zuoye;

public class DriverTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("驱动加载成功: " + clazz.getName());

            // 尝试实例化驱动
            Object driver = clazz.getDeclaredConstructor().newInstance();
            System.out.println("驱动实例化成功: " + driver);
        } catch (Exception e) {
            System.err.println("测试失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
