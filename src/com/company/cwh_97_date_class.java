package com.company;

import java.util.Date;

public class cwh_97_date_class {
    static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate()); // -- deprecated
        System.out.println(date.getYear()); // -- deprecated
        System.out.println(date.getMonth());// -- deprecated
        System.out.println(date.getDay());// -- deprecated
        System.out.println(date.getHours());// -- deprecated
        System.out.println(date.getMinutes());// -- deprecated
        System.out.println(date.getSeconds());// -- deprecated
        
    }
}
