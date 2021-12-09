package com.cache.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello boss";
        Supplier<List<Integer>> supplierList = () -> Arrays.asList(1, 2, 3, 4);
        Supplier<IndianTeam> supplierIndianTeam = () -> new IndianTeam(9, "Shoaib Akthar", 720);
        System.out.println(supplierIndianTeam.get());
        List<Integer> resultList = supplierList.get();
        resultList.forEach(System.out::println);

        List<String> listString = Arrays.asList();
        System.out.println(listString.stream().findAny().orElseGet(supplier));
    }

}
