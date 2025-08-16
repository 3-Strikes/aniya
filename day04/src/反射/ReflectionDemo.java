package 反射;

import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // 1. 获取Class对象（3种方式）
        Class<?> clazz = Class.forName("反射.User");
        // Class<User> clazz = User.class;
        // Class<?> clazz = new User().getClass();

        // 2. 创建对象（无参构造）
        Object user = clazz.getDeclaredConstructor().newInstance();

        // 3. 操作字段（含私有字段）
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true); // 突破私有限制
        nameField.set(user, "张三");

        // 4. 调用方法（含私有方法）
        Method displayMethod = clazz.getDeclaredMethod("display");
        displayMethod.setAccessible(true);
        displayMethod.invoke(user);
    }
}

class User {
    private String name;
    private void display() {
        System.out.println("User: " + name);
    }
}

