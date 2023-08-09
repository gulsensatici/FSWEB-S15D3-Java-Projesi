package com.workintech.maps.main;

import com.workintech.maps.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "yaren", "sadak"));
        employees.add(new Employee(1 , "gulsen", "satici"));
        employees.add(new Employee(2,"duru","ceylan"));
        employees.add(new Employee(2, "hasan", "durmaz"));
        employees.add(new Employee(3, "gülnaz", "baycu"));
        employees.add(new Employee(3, "aysel", "satıcı"));
        //System.out.println(employees);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if( employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
            }else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        System.out.println(removedEmployees);

        //employees.removeAll(removedEmployees);
        //System.out.println(employees);
    }
}