package com.company;

class MyMainEmployee {
    private int id;
    private String name;

    // A setter is not strictly needed if a constructor is used to initialize all necessary fields.

    // Constructors can be overloaded
    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String name,int id) {
        this.name = name;
        this.id = id;
    }

    public MyMainEmployee(String name){
        id = 1;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class cwh_42_constructors {
    static void main(String[] args) {
       // MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry",45);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName()) ;
    }
}
