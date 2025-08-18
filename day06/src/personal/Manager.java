package personal;

/*
    1、Manger类管理学生数据、有 添加 修改 查询 删除功能

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager{
    private List<Student> students;

    public Manager(){
        students = new ArrayList<>();
    }

    public void addStudent(String name,String className,int score,int age,int studentNumber){
        for(Student s:students){
            if(s.getName().equals(name)){
                System.out.println("错误，当前学生"+name+"已存在");
            }
        }
        students.add(new Student(name,className,score,age,studentNumber));
        System.out.println("添加成功！！！！！！！");
    }

    public void removeStudent(String name,int studentNumber){
        for (Student s:students){
            if(s.getName().equals(name)&&s.getStudentNumber()==studentNumber){
                System.out.println("查询存在，已删除："+name);
                students.remove(s);
                break;
            }
        }
        System.out.println("删除成功！！！");
    }

    //修改学生类 、但实际上学术类中有很多信息 建议单独写修改其他信息的方法之后集合到学生类中统一掉用
    public void updateStudent(String name,int studentNumber){
        Student q = queryStudent(name,studentNumber);
        if(q!=null){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要修改的数据：");
            int actNumber = sc.nextInt();
            switch (actNumber){
                case 1 -> {
                    
                }
            }





        }else {
            System.out.println("该学生不存在！");
        }
    }
    public Student queryStudent(String name,int studentNumber){
        for(Student s:students){
            if(s.getName().equals(name)&&s.getStudentNumber()==studentNumber){
                System.out.println("查询存在，信息为："+s.toString());
                return s;
            }
        }
        return null;
    }

}
