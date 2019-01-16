package com.example.java;

public class HelloJni {
    public native void sayHello();
    public static void main(String[] args) {
//        String jlp = System.getProperty("java.library.path");
//        System.out.println(jlp);
        System.loadLibrary("HelloJni");
        new HelloJni().sayHello();
    }
}
