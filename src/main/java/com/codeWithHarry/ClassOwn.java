package com.codeWithHarry;

class Employee {
    int id;
    String name;
    int sal;
    public void printDetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }
    public void getSalary() {
        System.out.println("My salary is " +sal + " $");
    }
}

public class ClassOwn {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 777;
        emp1.name = "Harry";
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        emp1.printDetails();
        emp1.sal = 8000;
        emp1.getSalary();

        Employee emp2 = new Employee();
        emp2.id = 888;
        emp2.name = "Gary";
        System.out.println(emp2.id);
        System.out.println(emp2.name);
        emp2.printDetails();
        emp2.sal = 9000;
        emp2.getSalary();

    }
}
