package com.cache.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {

    public static List<Employee> getEmployees() {

        return Stream.of(new Employee(1, "BCCI", Arrays.asList("123,456")),
                new Employee(1, "ICC", Arrays.asList("789,111")),
                new Employee(1, "IPL", Arrays.asList("222,333"))
        ).collect(Collectors.toList());


    }


}
