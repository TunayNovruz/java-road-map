package Generics;

public class GenericMethod {

    /**
     * Generic constructors
     * */
    public <T> GenericMethod(T obj) {
        System.out.println(obj.getClass().getSimpleName());
    }

    /**
     * Generic Methods
     * */
    public <T extends Number> void half(T obj) {
        Double res = obj.doubleValue() / 2;
        System.out.println(res);
    }

    public <X extends String> X getSelf(X obj) {
        return obj;
    }
}
