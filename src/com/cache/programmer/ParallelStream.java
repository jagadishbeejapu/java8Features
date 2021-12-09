package com.cache.programmer;

import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
       // IntStream.range(1, 100).forEach(e-> System.out.print(e ));
        System.out.println();
        end = System.currentTimeMillis();
        //System.out.println(end - start);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");

        start = System.currentTimeMillis();
        IntStream.range(1, 10).parallel().forEach(e-> System.out.println(Thread.currentThread().getName() + " "+e ));
        System.out.println();
        end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
