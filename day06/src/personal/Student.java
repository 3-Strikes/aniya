package personal;

public class Student{
    private String name;
    private String className;
    private int score;
    private int age;
    private int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student(){

    }

    Student(String name,String className,int score,int age,int studentNumber){
        this.name = name;
        this.age = age;
        this.className = className;
        this.score = score;
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", score=" + score +
                ", age=" + age +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
