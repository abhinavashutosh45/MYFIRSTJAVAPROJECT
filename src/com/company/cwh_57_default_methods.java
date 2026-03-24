package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }
    @Override
    public void recordVideo() {
        System.out.println("Taking snap");
    }

//    @Override
//    public void record4KVideo() {
//       // MyCamera.super.record4KVideo();
//        System.out.println("Taking snap and recording in 4k...");
//    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Parashar", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class cwh_57_default_methods {
    static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();
        mySmartPhone.record4KVideo();
        // mySmartPhone.greet(); --> Throws an error!
        String[] ar = mySmartPhone.getNetworks();
        for(String s: ar){
            System.out.println(s);
        }

    }
}
