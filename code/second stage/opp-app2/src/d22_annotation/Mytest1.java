package d22_annotation;

public @interface Mytest1 {
    String aaa();

    boolean bbb() default true;

    String[] ccc();
}
