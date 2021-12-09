package com.cache.programmer;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDAO.getEmployees();
        List<String> employeeNames = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(employeeNames);
        List<List<String>> phoneNumbersList = employees.stream()
                .map(e -> e.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbersList);
        List<String> flatNumbers = employees.stream()
                .flatMap(e -> e.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(flatNumbers);

    }
}
