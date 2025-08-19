package zuoye;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("王"+i, random.nextInt(121), random.nextInt(101));
        }
        Student s = new Student();
        s.setName("李四");
        s.setScore(78);
        s.setAge(18);

        show(students);
        show(s);
    }

    public static void show(Student[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
        }
    }
    public static void show(Student s){
        System.out.println(s.toString());
    }
}
