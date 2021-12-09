package com.cache.programmer;

public class Test  {


    Test() {
        super();
        System.out.println("vodhu babu");

    }

    static {
        System.out.println("static lo vunna abbayi");
    }

    {
        System.out.println("idhi ippudu");
    }

    static  void hello(){
        System.out.println("idha leka adha");
    }

    public static void main(String[] args) {

        Test t = new Test();
        Test t1 = new Test();

    }

    {
        System.out.println("amma baboi");
    }
}

class Demo {
    Demo() {
        System.out.println("iib");
    }

    {
        System.out.println("parent class");
    }

    {
        System.out.println("sdgdfdf");
    }

    static {
        System.out.println("goram babai");
    }

    static void hello() {
        System.out.println("what the hell");
    }
}
