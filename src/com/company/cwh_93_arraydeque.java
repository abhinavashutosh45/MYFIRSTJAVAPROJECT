package com.company;

import java.util.ArrayDeque;

public class cwh_93_arraydeque {
    static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(10);
        ad1.addFirst(13);
        ad1.offerFirst(11);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        /*
                 Throws exception            Special Value
     Insert      addFirst(e)                 offerFirst(e) ----->
     Remove      removeFirst()               pollFirst()     ----->>    First Element(Head)
     Examine     getFirst()                  peekFirst     ----->

     Insert      addLast(e)                  offerLast(e) ----->
     Remove      removeLast()                pollLast()     ----->>    Last Element(Tail)
     Examine     getLast()                   peekLast()   ----->
     
         */


    }
}
