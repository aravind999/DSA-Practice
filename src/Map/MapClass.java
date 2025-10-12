package Map;

import java.awt.image.ImageProducer;
import java.util.*;

public class MapClass {
    public static void main(String[] args) {
    //Creation of Map

    Map<Integer , String> map1 = new Hashtable<>(); // we can HashMap<>(),TreeMap<>(),LinkedHashMap<>() all these have a the same methodologies and functions and operation there is no difference in these .
    map1.put(50321 , "DesMoines");
    map1.put(50325 , "Clive");
    map1.put(50021 , "Ankeny");
    //Creation of Set of keys
    Set<Integer> keys = map1.keySet();
    //Retreival of keys
    for(Integer key : keys) {
        System.out.println(key);
    }


    // Retrieval of Values
        Collection<String> values = map1.values();
    for(String value : values) {
        System.out.println(value);
    }
        System.out.println(map1.get(50321));
        System.out.println("this  is to retrieve all the values using set of keys in a loop");
        for(Integer key : keys) {
            System.out.println(key+ ">>>>>"+map1.get(key));
        }
        map1.remove(50321);
        // map1.replace() we can also use this to replace
        System.out.println(map1);
        System.out.println(map1.containsKey(500010));
        System.out.println(map1.containsKey(50325));
        System.out.println(map1.containsValue("Clive"));
        map1.putIfAbsent(50325,"Urbandale");
        System.out.println(map1);
        //map1.clear(); to clear the whole map
         // we can also retrieve the key value pair by using entryset()

       Set<Map.Entry<Integer ,String>> entries = map1.entrySet();

       for(Map.Entry<Integer , String> entry : entries) {
           Integer key = entry.getKey();
           String value = entry.getValue();
           System.out.println(key+">>>>>>"+value);
       }
    }


    //for printing all the values that corresponds to the keys we need to iterate through it first and then print using get method
}
/*
Major Operations of the Map
1. Creation of Map
2. Addition of elements into the map
3. Retrieval of keys from the map
4. Retrieval of the values from the map
5. Deletions of the elements from the map
6.Verification of Keys in the mao
7.Verification of values in the map
8.Updation og elements in the map

 */