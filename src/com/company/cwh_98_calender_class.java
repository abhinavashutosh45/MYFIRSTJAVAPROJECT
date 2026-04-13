package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98_calender_class {
    static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH));
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.MILLISECOND));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());



    }
}
