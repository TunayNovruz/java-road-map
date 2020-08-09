package Wrappers;

public class TypeWrapper {

    public void test() {
        int x = 0; // primitive
        Integer y = 7; // object
        x = y; //auto-unbox
        int x_ = 6;
        y = x_;//autoboxing
        byte b = y.byteValue();
        Character ch = 'h';
        Boolean boo = true;


    }
}
