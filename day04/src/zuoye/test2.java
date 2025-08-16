package zuoye;

public class test2 {
    public static void main(String[] args) {
        GrilFriend g1 = new GrilFriend();
        g1.setName("BB");
        g1.setHigher(1.65);
        g1.setWeight(40);
        g1.wash();
        g1.cook();
        g1.show();

        GrilFriend g2 = new GrilFriend("cc",1.70,50);
        g2.wash();
        g2.cook();
        g2.show();
    }
}

class GrilFriend{

    private String name;
    private double higher;
    private double weight;

    public GrilFriend(){

    }

    public GrilFriend(String name,double higher,double weight){
        this.higher = higher;
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHigher(double higher) {
        this.higher = higher;
    }

    public double getHigher() {
        return higher;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void wash(){
        System.out.println(name+"正在洗衣服");
    }

    public void cook(){
        System.out.println(name+"正在做饭");
    }

    public void show(){
        System.out.println("姓名为："+name+" 身高为："+higher+" 体重为："+weight);
    }


}
