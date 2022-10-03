package onjava.chapter.one.demo1.core.subcore;

import onjava.chapter.one.demo1.core.ReqControl;

public class SubReqControl3 extends ReqControl {
    public static void main(String[] args) {
        SubReqControl3 a = new SubReqControl3();
        String field11 = a.field1;
        String field22 = a.field2;

        ReqControl b = new ReqControl();
        String field33 = b.field1;
        String field44 = b.field2;
    }
}
