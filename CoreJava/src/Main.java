import Generics.ArrayList;
import Generics.GenericMethod;
import Generics.TypeSafety;
import Generics.WildCardTest;
import Misc.Demo;
import Enum.*;

public class Main {
    public static void main(String[] args) {

        //Demo.test();
        //checkTypeSafety();
        //System.out.println(checkGenMeth());
        //wildCard();
        checkEnum();
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

    public static void wildCard(){
        Integer[] nums1 = {1,2,3,4};
        var ob1 = new WildCardTest<>(nums1);

        Double[] nums2 = {1.2,2.3,4.5};
        var ob2 = new WildCardTest<>(nums2);

        ob1.isAvgSame(ob2);

    }

    public static void checkEnum(){
        //region apple enum
        Apple ap = Apple.Baku;
        System.out.println(ap);
        boolean bo = ap == Apple.Quba;
        Apple[] allApples = Apple.values();
        Apple ap1 = Apple.valueOf("Sheki");
        //endregion

        //region Car Enum
        Car ca = Car.Fiat;
        int price = ca.getPrice();//
        System.out.println(ca);
        System.out.println(price);
        int order = ca.ordinal();
        System.out.println(order);
        int fprice = Car.Ford.getPrice();

        var ka = Car.Kia;
        var foo = ka.compareTo(ca); // compares ordinal
        var bar = ka.equals(ca);

        //endregion
    }
}
