package onjava.chapter.one.demo1.core;

/**
 * 访问控制-protected、default-成员
 * private protected public default（主要针对protected、default）
 * 访问修饰符        访问      继承
 * public           所有      可以
 * private          类自身     N
 * protected        继承子类   可以
 * <package access> 同包内     N
 */
public class ReqControl {
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    protected String field1;

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    String field2;
}
