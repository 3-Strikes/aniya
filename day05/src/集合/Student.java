package 集合;

public class  Student{
    private String name;
    private int score;


    public Student(){

    }

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString(){
        return "Student{name='"+name+"', score="+score+"}";
    }
}
