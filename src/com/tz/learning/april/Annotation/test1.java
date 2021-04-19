package com.tz.learning.april.Annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target(ElementType.TYPE.METHOD)
@Documented
@Inherited
public @interface test1{
    int a();
    int b() default 0;
}

/*public class test1 {
    public static void main(String[] args) {

    }
}*/
