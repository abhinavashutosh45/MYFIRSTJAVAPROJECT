package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh_102_ps {
    static void main(String[] args) {

        // Practice Problem -- 01
        // Create an ArrayList and store names of 10 students inside it--
        // --Print it using a for-each loop.
        ArrayList ar =  new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o : ar){
            System.out.println(o);
        }

        // Practice Problem -- 02
        // Use the Date class in java to print time in the 21:47:02 format
        Date d = new Date();
        System.out.println(d.getHours() + ":"  + d.getMinutes() + ":" + d.getSeconds());

        // Practice Problem -- 03
        // Repeat 2 using Calendar class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // Practice Problem -- 04
        // Repeat 2 using the java.time API
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m:s a");
        String formattedDate = localDateTime.format(formatter);
        System.out.println(formattedDate);

        // Practice Problem -- 05
        // Create a Set in java. Try to store duplicate elements inside--
        // -- this set and verify that only one instance is stored.
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(44);
        s.add(55);
        s.add(66);
        s.add(77);
        s.add(55);
        System.out.println(s);




    }
}
