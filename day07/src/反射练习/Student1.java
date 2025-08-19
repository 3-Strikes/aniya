package 反射练习;

public class Student1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student1(){

    }

    protected Student1(String name){
        this.name = name;
    }

    private Student1(int age){
        this.age = age;
    }

}
