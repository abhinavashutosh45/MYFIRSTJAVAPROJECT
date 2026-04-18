package com.company;

// A functional interface in java is an interface that contains
// exactly one abstract method.
@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class cwh_108_java_annotations {
    @SuppressWarnings("deprecation")
    static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5,6);


    }
}
