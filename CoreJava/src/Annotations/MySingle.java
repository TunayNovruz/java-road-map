package Annotations;

import java.lang.annotation.Repeatable;

@Repeatable(MyRepeatedAnnos.class)
public @interface MySingle {
    String value() default "demo";
    int age() default 200;
}
