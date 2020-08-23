package Generics;

public class GenericMethod<T> {

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

    /***
     *
     * @param obj type of X
     * @return obj type of X
     */
    public <X extends String> X getSelf(X obj) {
        return obj;
    }

}
