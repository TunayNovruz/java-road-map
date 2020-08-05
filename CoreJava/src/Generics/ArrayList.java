package Generics;

public class ArrayList<TYPE> {
    private final Object[] localArray;

    public ArrayList(int size) {
        localArray = new Object[size];
    }

    public TYPE add(int i, TYPE obj) {
        localArray[i] = obj;
        return obj;
    }

    public Object[] getAll(){
        return localArray;
    }
}
