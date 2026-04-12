package com.company;

import java.util.*;


public class cwh_91_arraylist {
    static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
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
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(15));
        System.out.println(l1.lastIndexOf(6));
        //System.out.println(l1.remove(1));
        //System.out.println(l1.removeLast());
        //l1.clear();
        l1.set(0,5);

/*
        l1.add(0,1); //Inserts the specified element at the specified position in this list.
        l1.addAll(0,l2); //Inserts all of the elements in the specified collection into this list, starting at the specified position.
        l1.addFirst(4);//Adds an element as the first element of this collection (optional operation).
        l1.addLast(5);//Adds an element as the last element of this collection (optional operation).
        l1.clear();//Removes all of the elements from this list.
        l1.clone();//Returns a shallow copy of this ArrayList instance.
        l1.contains(4);//Returns true if this list contains the specified element.
        l1.ensureCapacity(5);//Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
        l1.forEach(System.out::println);//Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
        l1.get(5);//Returns the element at the specified position in this list.
        l1.getFirst();//Gets the first element of this collection.
        l1.getLast();//Gets the last element of this collection.
        l1.indexOf(0);//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        l1.isEmpty();//Returns true if this list contains no elements.
        l1.iterator();//Returns an iterator over the elements in this list in proper sequence.
        l1.lastIndexOf(0);//Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        l1.listIterator();//Returns a list iterator over the elements in this list (in proper sequence).
        l1.listIterator(5);//Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
        l1.remove(5);//Removes the element at the specified position in this list.
        //l1.remove(Object o);//Removes the first occurrence of the specified element from this list, if it is present.
        l1.removeAll(Collections.EMPTY_LIST);//Removes from this list all of its elements that are contained in the specified collection.
        l1.removeFirst();//Removes and returns the first element of this collection (optional operation).
        //l1.removeIf(Predicate<? super E> filter);//Removes all of the elements of this collection that satisfy the given predicate (optional operation).
        l1.removeLast();//Removes and returns the last element of this collection (optional operation).
        //l1.removeRange(int fromIndex, int toIndex);//(It is protected)//Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
        l1.retainAll(Collections.EMPTY_LIST);//Retains only the elements in this list that are contained in the specified collection.
        l1.set(5,7);//Replaces the element at the specified position in this list with the specified element.
        l1.size();//Returns the number of elements in this list.
        l1.spliterator();//Creates a late-binding and fail-fast Spliterator over the elements in this list.
        l1.subList(4,6);//Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        l1.toArray();//Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        l1.toArray(new Integer[0]);//Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
        l1.trimToSize();//Trims the capacity of this ArrayList instance to be the list's current size.
        // (https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/ArrayList.html) -->> GO TO THIS WEBSITE FOR DOCUMENTATION READING IN DETAIL ON ORACLE WEBSITE
        */
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
