package onjava.chapter.one.demo1.core;

/**
 * 同包结构，未继承，无法访问protected修饰的成员变量，也无法访问默认修饰
 */
public class ReqControl2 {
    public static void main(String[] args) {
        ReqControl a = new ReqControl();
        String field11 = a.field1;
        String field22 = a.field2;

    }
}
