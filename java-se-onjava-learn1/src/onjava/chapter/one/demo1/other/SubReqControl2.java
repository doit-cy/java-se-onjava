package onjava.chapter.one.demo1.other;

import onjava.chapter.one.demo1.core.ReqControl;
//import onjava.chapter.one.demo1.core.ReqControl2;

/**
 * 其他包结构下，可以继承到: 默认修饰
 * 其他包结构下, 可以访问到：
 */
public class SubReqControl2 extends ReqControl {
    public static void main(String[] args) {
        SubReqControl2 a = new SubReqControl2();
        String field11 = a.field1;
//        String field22 = a.field2;

        ReqControl b = new ReqControl();
//        String field33 = b.field1;
//        String field44 = b.field2;
    }
}
