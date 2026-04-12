package com.company;

import java.util.HashSet;

public class cwh_95_set {
    static void main(String[] args) {
        HashSet<Integer> myHashset = new HashSet<>(6,0.5f);
        myHashset.add(6);
        myHashset.add(8);
        myHashset.add(3);
        myHashset.add(11);
        myHashset.add(11);
        System.out.println(myHashset);
    }
}
