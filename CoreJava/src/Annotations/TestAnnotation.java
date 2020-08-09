package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {

    public static void main(String[] args) {
//        checkMyAnnotation();
        checkMyMarker();
    }


    public static void checkMyAnnotation() {
        var t = new TestAnnotation();
        Class<?> c = t.getClass();
        try {
            Method m = c.getMethod("showUser");
            MyAnnotation ann = m.getAnnotation(MyAnnotation.class);
            System.out.println(ann.num());
            // Spring RequestMap / router bele ishleyir yeqin ki

        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
    }

    public static void checkMyMarker() {
        var t = new TestAnnotation();
        try {
            Class<?> c = t.getClass();
            Method m = c.getMethod("marker");
            Annotation[] anns = m.getAnnotations();
            for (Annotation ann : anns) {
                System.out.println(ann);
            }

            var boo = m.isAnnotationPresent(MyMarker.class);
            System.out.println(boo);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @MyAnnotation(str = "any text")
    public void showUser() {
        this.getClass().getName();// reflection
    }

    @MyAnnotation
    @MyMarker
    public void marker() {
        // do something
    }

    @MySingle("Jon")
    @MySingle(value = "Jon", age = 200)
    public void single(){
        //do something
    }
}
