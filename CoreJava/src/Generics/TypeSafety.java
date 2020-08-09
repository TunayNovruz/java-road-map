package Generics;

public class TypeSafety<T> {
    T obj;

    public TypeSafety(T o) {
        obj = o;

    }

    public String getTypeOfObj() {
        return obj.getClass().getName();
    }
}
