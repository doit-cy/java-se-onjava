package onjava.chapter.three;

public class AboutSystem {
    public static void main(String[] args) {
//        System.getProperties().list(System.out); // 环境信息

        System.out.println(System.getProperty("user.name")); // 指定参数
    }
}
