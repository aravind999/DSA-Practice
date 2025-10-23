package IteratorsPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args) {
        //ListIterator is an interface
        //Only list type of collection objects can be applicable
        //Legacy classes amd new classes can use it
        // Bi directional --> forward and backward . it can read and write

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ListIterator<Integer> li = al.listIterator();

        // we do 2 methods as usual , to find list and return in
        while (li.hasNext()) {
            System.out.println(li.next());//find list in forward direction
        }
        li.add(56);
        System.out.println("This is just a gap");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        li.remove();
        System.out.println(al);

    }

    }

