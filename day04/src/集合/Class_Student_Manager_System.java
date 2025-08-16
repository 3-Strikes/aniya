package 集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class_Student_Manager_System {
    private Map<String, List<Student>> classMap;

    public Class_Student_Manager_System(){
        classMap = new HashMap<>();
    }

    public void addStudentToClass(String className,Student student){
        if(!classMap.containsKey(className)){
            classMap.put(className,new ArrayList<>());
        }

        classMap.get(className).add(student);
        System.out.println("已添加学生 "+student.getName()+" 到 "+className);

    }

    public void queryClassStudents(String className){
        List<Student> students = classMap.get(className);
        if(students==null||students.isEmpty()){
            System.out.println(className+" 的学生列表：");
            return;
        }
        System.out.println(className+" 的学生列表");
        for (Student s:students){
            System.out.println(s);
        }

    }

    public double calculateAverageScore(){
        int totalScore=0;
        int totalStudents = 0;

        for (List<Student> students:classMap.values()){
            for (Student s:students){
                totalScore+=s.getScore();
                totalStudents++;
            }
        }
        if (totalStudents==0){
            return 0.0;
        }
        return (double) totalScore/totalStudents;

    }


    public void findOldestStudent(){
        if(classMap.isEmpty()){
            System.out.println("全校暂无学生");
            return;
        }
        Student oldestStudent = null;
        String oldestClass = "";
        int maxAge = -1;

        for (Map.Entry<String,List<Student>> entry:classMap.entrySet()) {
            String clasName = entry.getKey();
            for (Student s: entry.getValue()){
                if(s.getScore()>maxAge){
                    maxAge = s.getScore();
                    oldestStudent= s;
                    oldestClass = clasName;
                }
            }
        }

        System.out.println("全校年龄最大的学生是：");
        System.out.println(oldestStudent+",来自 "+oldestClass);

    }
}


