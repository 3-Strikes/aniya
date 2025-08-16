package com.personal;

import java.lang.reflect.Constructor;
import java.util.Random;

public class Reflect_Exercise {

    public static void main(String[] args) throws Exception{
        //1.基础反射操作
        basicReflectionOperations();

    }

    static void basicReflectionOperations() throws Exception{
        System.out.println("\n=====基础反射操作======\n");

        //1.1创建实例（无参构造）
        Class<?> userClass = Class.forName("com.personal.Reflect_Exercise$User");
        Object user = userClass.getDeclaredConstructor().newInstance();
        System.out.println("创建实例：" + user);

        //1.2创建实例（有参构造）
        Constructor<?> ctor = userClass.getDeclaredConstructor(String.class,int.class);
        Object user2 = ctor.newInstance("张三",30);
        System.out.println("有参构造实例："+user2);

        //1.3获取所有字段（含私有）

    }

    static class User{
        private int id;
        public String name;
        public int age;
        public User(){
            this("未知",0);
        }

        public User(String name,int age){
            this.name = name;
            this.age = age;
            this.id = new Random().nextInt(1000);
        }

        public void setName(String name) {
            this.name = name;
        }
        private void privateMethod(String param){
            System.out.println("私有方法被调用！参数："+param);
        }

        @Override
        public String toString(){
            return "User{id=" +id+ ",name='" +name+ ",age=" +age+ "}";
        }
    }
}
