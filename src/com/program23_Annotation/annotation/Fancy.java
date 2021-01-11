package com.program23_Annotation.annotation;

//. ANNOTATION

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
//. ElementType.TYPE can be use in Class, Interface (including annotation type),
// ~enum and record declaration.
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

  String name();
  String[] tags() default {};

}
