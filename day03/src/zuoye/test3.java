package zuoye;

public class test3 {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        ph1.setBrand("apple");
        ph1.setColor("白色");
        ph1.setPrice(9999.0);
        ph1.call();
        ph1.sendMessage();

        Phone ph2 = new Phone("sumsung",10999.0,"黑色");
        ph2.call();
        ph2.sendMessage();
    }
}


class Phone{
    private String brand;
    private Double price;
    private String color;

    public Phone(){

    }

    public Phone(String brand,Double price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void call(){
        System.out.println("正在使用价格为"+price+"颜色为："+color+"的"+brand+"手机打电话。。。。");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"颜色为："+color+"的"+brand+"手机发短信。。。");
    }
}