package 反射练习;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class reflectionEx {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.最常用写法
        Class clazz1 = Class.forName("反射练习.Student1");

        //2.常用来传递参数
        Class clazz2 = Student1.class;
        //3.当我们已经有了这个类的对象 才能使用 有局限性
        Student1 s = new Student1();
        Class clazz3 = s.getClass();

        System.out.println(clazz1==clazz2);
        System.out.println(clazz2==clazz3);

//        Constructor[] cons1 = clazz1.getConstructors();
//        for (Constructor con:cons1){
//            System.out.println(con);
//        }

//        获取构造方法    ↑只能获取公共的方法  ↓ 可获取全部的方法
//        Constructor[] cons2 = clazz2.getDeclaredConstructors();
//        for (Constructor con:cons2){
//            System.out.println(con);
//        }

//        Constructor con1 = clazz1.getDeclaredConstructor();
//        System.out.println(con1);
//
//        Constructor con2 = clazz2.getDeclaredConstructor(String.class);
//        System.out.println(con2);
//
//        Constructor con3 = clazz1.getDeclaredConstructor(int.class);
//        System.out.println(con3);
//
        Constructor con4 = clazz1.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);

        int modifiers = con4.getModifiers();
        System.out.println(modifiers);

        int parameterCount = con4.getParameterCount();
        System.out.println(parameterCount);
        Parameter[] Parameters = con4.getParameters();
        for(Parameter parameter:Parameters){
            System.out.println(parameter);
        }

        //表示临时取消权限验证  暴力反射
        con4.setAccessible(true);
        Student1 stu = (Student1) con4.newInstance("扫码了", 245);
        System.out.println(stu);


        Field name = clazz1.getDeclaredField("name");
        System.out.println(name);

        String n = name.getName();
        System.out.println(n);

        Class<?> type = name.getType();
        System.out.println(type);




    }
}
