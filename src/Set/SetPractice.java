package Set;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        //Set is a Data structure which only stores unique data or elements. It doesnt allow duplicates
        //Hashset is a class that implements Set
        //Hashset internally uses Hashmap and Hashmap internally uses Array of nodes(key,value)
        //Hashset doesn't follow insertion order
        //Set<Integer> set = new HashSet<>();--> we can also write this way
        //Hashset internally should store key and value as per its principle (key,value).
        //How ever in this scenario we are only using integers here , what way it stores?
        //--> it stills these data that we added below as KEYS , because in hashset it stores these data into key and creates a dummy object refferring to that key.
        //Data Retrieval is done by using iterators or for each loop
        // WHy does Java uses hashmap?-->usually hashmap,treemap,LinkedHashmap keys are unique
        HashSet<Integer> hs = new HashSet<>();
        hs.add(65);
        hs.add(2);
        hs.add(85);
        hs.add(5);
        hs.add(10);
        hs.add(5);
        hs.add(85);
        System.out.println(hs);
        hs.remove(85);// we are not passing index , we are passing data, because indexing is a complex thing in Sets because it using hashing
        System.out.println(hs);
        System.out.println(hs.contains(85));
        //HashMap<Integer, String> hm = new HashMap<>();
        for (Integer in : hs) {
            System.out.println(in);
        }

        System.out.println("From here its going to be LinkedHashset");
        //implementation is same for all the Set classes
        //LinkedHashset implements HashSet and HashSet Implements Set
        //LinkedHashset will maintain the insertion Order since its internal implimentation is linkedHashmap
        //LinkedHashset--> LinkedHashMap--> Link of Nodes(Key,Value)
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(65);
        lhs.add(2);
        lhs.add(85);
        lhs.add(5);
        lhs.add(10);
        lhs.add(5);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());

        System.out.println("From here its going to be TreeSet");
        //TreeSet --> TreeMap--> Binary Tree
        //TreeSet is used to insert elements in Sorted Order . By default it takes Ascending order
        //TreeSet implements NavigableSet. NavigableSet Intefrace extends SortedSet Interface. SortedSet extends Set interface
        //All operations are same in Tree however it has more additional operations.
        //TreeSet can Retrieve Lowest and Highest elements
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(65);
        ts.add(2);
        ts.add(85);
        ts.add(5);
        ts.add(10);
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.last());// gives the highest element in the set
        System.out.println(ts.first());//gives the highest element in the set
       // System.out.println(ts.pollFirst());// removes lowest element
       // System.out.println(ts.pollLast());//removes highest element
        System.out.println(ts);
       // System.out.println(ts.subSet(5,65).remove(10));// gives the elements with in this range
        System.out.println(ts.descendingSet());// To Reverse the set
        System.out.println(ts);
// Overview
        //Set is a Data structure that stores unique elements
        // It doesnt have duplicates
        // it has internal implimentation of Map
        //All the inserted values in the Set are stored as keys in Map and values are dummy since it impliments HashMap
        //Hashset default capacity is 16, defualt capacity is 0
        // Set has 3 implementations HS,LHS,TS.Hashset and LinkedHashset allows null values but TreeSet doesnt allow it
        // there is no Synchronisation
    }


}
