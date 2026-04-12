package com.company;

public class cwh_96_date {
    static void main(String[] args) {
        // This is counted since 1 January 1970
        // System.currentTimeMillis() returns no of milli-seconds passed
        System.out.println(System.currentTimeMillis()/1000/3600/24 + " days");
        System.out.println(System.currentTimeMillis()/1000/3600/24/7 + " weeks");
        System.out.println(System.currentTimeMillis()/1000/3600/24/30 +" months");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365 + " years");
    }
}
