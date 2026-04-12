package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linkedlist {
    static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(15));
        System.out.println(l1.lastIndexOf(6));
        //System.out.println(l1.remove(1));
        //System.out.println(l1.removeLast());
        //l1.clear();
        l1.set(0,5);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
