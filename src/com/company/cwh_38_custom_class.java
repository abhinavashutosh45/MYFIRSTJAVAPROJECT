package com.company;

class Employee1 {
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My Id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}
public class cwh_38_custom_class {
    static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1(); // Instantiating a new Employee1 Object
        Employee1 john= new Employee1(); // Instantiating a new Employee1 Object

        // Setting attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        //System.out.println(harry.id);
        //System.out.println(harry.name);
    }
}
