package zuoye;

public class test1 {
    public static void main(String[] args) {
        Rectangle rec1 =new Rectangle();
        rec1.setLength(8);
        rec1.setWidth(6);
        rec1.alllength();
        rec1.area();

        Rectangle rec2 = new Rectangle(4,3);
        rec2.area();
        rec2.alllength();
    }
}

class Rectangle{
    private int length;
    private int width;

    public Rectangle(){

    }

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void area(){
        System.out.println("长为："+length+"宽为："+width+"矩形面积为："+length*width);
    }

    public void alllength(){
        System.out.println("长为："+length+"宽为："+width+"矩形周长为："+(length+width)*2);
    }
}

