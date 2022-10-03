package onjava.chapter.one.demo1.core;

/**
 * 同包结构下，可以继承到: 默认修饰、protected修饰
 * 同包结构下, 可以访问到：其他类型的对象的默认修饰、protected修饰
 */
public class SubReqControl1 extends ReqControl {

    public static void main(String[] args) {
        SubReqControl1 a = new SubReqControl1();
        String field11 = a.field1;
        String field22 = a.field2;

        ReqControl b = new ReqControl();
        String field33 = b.field1;
        String field44 = b.field2;
    }
}
