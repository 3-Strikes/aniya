package zuoye;

public class test {
    public static void main(String[] args) {
        Vehicle Bigcar = new Vehicle("大运","在cos减速带");
        Bigcar.start();
        Bigcar.run();

        Vehicle Smallcar = new Vehicle();
        Smallcar.setBrand("小米");
        Smallcar.setType("在以300码的速度冲向大运");
        Smallcar.start();
        Smallcar.run();
    }



}

class Vehicle{
    public Vehicle(){

    }
    public Vehicle(String brand,String type){
        this.brand = brand;
        this.type = type;
    }
    private String brand;
    private String type;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void start(){
        System.out.println(brand+"准备启动");
    }

    public void run(){
        System.out.println(brand+"在国道上横冲直撞"+type);
    }
}