import Generics.ArrayList;
import Generics.GenericMethod;
import Generics.TypeSafety;

public class Main {
    public static void main(String[] args) {
         checkTypeSafety();
        System.out.println(checkGenMeth());
    }

    public static void checkArrayList() {
        ArrayList<String> list = new ArrayList<>(5);
        list.add(0, "Hello");
        list.add(1, "Bello");
        Object[] all = list.getAll();
        for (int i = 0; i < 5; i++) {
            System.out.println(all[i]);
        }
    }

    public static void checkTypeSafety() {
        TypeSafety<Integer> t = new TypeSafety<>(88);
        TypeSafety<String> z = new TypeSafety<>("hello");
        // t=z; wrong
        System.out.println(z.getTypeOfObj());
    }

    public static String  checkGenMeth(){
        var z = new GenericMethod(77);
        var t =6;
        var y= 'c';
        GenericMethod g = new GenericMethod("Hello");
        g.half(64);
        String s = g.getSelf("hello");
        return s;
    }
}
