package com.company;

interface DemoAno{
    void meth1();
    void meth2();
}
@FunctionalInterface
interface DemoAno2{
    void meth3(int a);
}

//class AbhiFunc implements DemoAno2{
//    @Override
//    public void meth3(){
//        System.out.println("This is method3");
//    }
//}


//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1(){
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2(){
//        System.out.println("I am meth2");
//    }
//}

public class cwh_109_lambda {
    static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();
//        obj.meth2();

        // Anonymous Class
     /*   DemoAno obj = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        obj.meth1();
        obj.meth2();
      */

        //Lambda Expressions(In java we cannot use a lambda expression without a functional interface.)
//        DemoAno2 obj2 = new AbhiFunc();
//        obj2.meth3();
        DemoAno2 obj2 = (a)->{System.out.println("I am method 3 from this lambda "  + a );};
        obj2.meth3(6);
    }
}
