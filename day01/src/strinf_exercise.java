public class strinf_exercise {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(10);
        sb.append("runoob..");
        System.out.println(sb);
        sb.append("!");
        sb.insert(8,"java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".append");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        System.out.println(sBuffer.reverse());//字符串反转
        System.out.println(sBuffer.delete(3,5));
        System.out.println(sBuffer.insert(2,"look"));
        System.out.println(sBuffer.replace(11,14,".top"));
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.charAt(7));
        System.out.println(sBuffer.indexOf("top"));
        System.out.println(sBuffer.lastIndexOf("o"));
        System.out.println(sBuffer.length());
    }
}
