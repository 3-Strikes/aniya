package 集合;

import java.util.ArrayList;
import java.util.List;

public class ScoreManger {
    private List<Student> students;

    public ScoreManger(){
        students = new ArrayList<>();
    }

    public void addStudent(String name,int score){
        for (Student s:students){
            if(s.getName().equals(name)){
                System.out.println("错误，学生"+name+"已存在！");
                return;
            }
        }
        students.add(new Student(name,score));
        System.out.println("添加成功:"+name);
    }

    public void removeStudent(String name){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                students.remove(i);
                System.out.println("删除成功:"+name);
                return;
            }
        }
        System.out.println("错误,未找到学生 "+name);
    }

    public void updateScore(String name,int newScore){
        for (Student s:students){
            if(s.getName().equals(name)){
                s.setScore(newScore);
                System.out.println("修改成功："+name+"的新成绩为"+newScore);
                return;
            }
        }
        System.out.println("错误,未找到学生 "+name);
    }

    public void queryScore(String name){
        for (Student s:students){
            if(s.getName().equals(name)){
                System.out.println(name+" 的成绩是："+s.getScore());
                return;
            }
        }
        System.out.println("错误,未找到学生 "+name);
    }

    public double calculateAverage(){
        if(students.isEmpty()){
            System.out.println("没有学生信息，无法计算平均分");
            return 0.0;
        }
        double total = 0;
        for (Student s:students){
            total+=s.getScore();
        }
        return total/students.size();
    }

    public void showAllStudents(){
        if(students.isEmpty()){
            System.out.println("当前没有学生信息");
            return;
        }
        System.out.println("所有学生信息：");
        for (Student s : students){
            System.out.println(s);
        }
    }



}

