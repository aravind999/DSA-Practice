package IteratorsPractice;
import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        //Iterator is for iterating through new java classes while enumeration is for iterating through legacy classes in java collection
        //Iterators is an interface introduced for iterating all collection objects
        //One directional iterator will not be able to iterate backward but we can remove elements here but cannot add here
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {//Has next will tell you if we have next element it returns a boolean value
            System.out.println(it.next());//next will return it will give the element if that element in the hasnext is present
        it.remove();
        }
        System.out.println(al);
        // Iterator doesnt directly apply in map but when we take keysets and values we can apply iterator to it

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 2);
        hm.put(2, 3);
        hm.put(3, 4);
        hm.keySet().iterator();
        hm.values().iterator();
        hm.entrySet().iterator();


    }



}
