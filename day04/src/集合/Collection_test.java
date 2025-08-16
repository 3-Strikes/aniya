package 集合;

public class Collection_test {
    public static void main(String[] args) {
        ScoreManger manager = new ScoreManger();

        // 测试添加学生
        manager.addStudent("张三", 85);
        manager.addStudent("李四", 92);
        manager.addStudent("张三", 78); // 测试重复添加

        // 测试显示所有学生
        manager.showAllStudents();

        // 测试修改成绩
        manager.updateScore("李四", 95);
        manager.updateScore("王五", 88); // 测试修改不存在的学生

        // 测试查询成绩
        manager.queryScore("张三");

        // 测试计算平均分
        double average = manager.calculateAverage();
        System.out.println("学生平均分：" + average);

        // 测试删除学生
        manager.removeStudent("张三");
        manager.removeStudent("赵六"); // 测试删除不存在的学生

        // 再次显示所有学生
        manager.showAllStudents();
    }
}

