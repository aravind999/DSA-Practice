package ArrayList;

import java.io.ObjectStreamException;
import java.lang.reflect.Array;
import java.util.*;

public class VPractice {
    public static void main(String[] args) {
        Object [] array = new Object[] {10,20,30,40};


        // incriment capacity for vector is 100%
        //when we create a vector object the deafult size goes to 10 and starts increamenting based on 100%
        // since here we directly initiated with in the vector aa an array the capacity will default be as whatever the lengt of the array is
        // For iteration of the arrays or vectors we mostly use for each loops
        //Generics were introduced in java during java 1.5 which basically separates what kind of objects or data types it stores with in it ,
        // it basically contains <> these brackets and data type specified in between those ex vector<String> v1 = new vector();
        // Here one more important thing to notice is that it doesnt store or cant take premitive data types because they are not reference data types ,
        // only classes are references types or objects are reference types not the premitive types
        Vector<Integer> v1 = new Vector<Integer>();
        // its a rule we need to have angle brackets in generics to specify what data type we are using <> on the left side , it was also ,mandotory on the right side to
        // but not any more bcz of developer requests , now its optional
        System.out.println(v1);
         v1.add(1);
         v1.add(22);
         v1.add(null);
         v1.add(null);
         v1.add(1);

        System.out.println(v1);
        for(int i = 0;i<v1.size();i++){
            Integer sum = v1.get(i);
        }

//        v1.removeAll(v2);
//        v2.add("ramesh");
//        v2.add("surresh");
//         Vector v3 = new Vector();
//         v3.add("surresh");
//         v3.add("ramesh");
//
//        System.out.println("before adding "+v2);
//
//      System.out.println(v1.containsAll(v2));
//        System.out.println(v2.containsAll(v3));
//        System.out.println(v2.get(0));
//        v2.set(0,"Aravind");
//        System.out.println(v2);
//        System.out.println(v2.get(0));
//        System.out.println(v2.lastIndexOf("Aravind"));
//        System.out.println(v2.lastElement());
//        System.out.println(v1.isEmpty());
//        Object[] arr = v1.toArray();
//        System.out.println(Arrays.toString(arr));
//
//
//          // we want to update v1 vector with v2 elements , so we iterate thorugh v2 in a for loop and using .get method we add them to v1
//
//Q) default capacity of vector// A) 10
//Q) what is the initial capacity of vectore // A) 1
// Q) does it allow duplicates //A) yes
        //Q) does it all null values //A) yes
        //Q) does it maintin insertion order //A) yes
        //Q) does it maintain sorted order //A) no
        //Q)does it offer random acess to the elemts //A) yes
        //Q) is it synchronise //A) yes
        //Q) what is good at it //A)when there are multiple threaded coded , and there is exponetitial growth in data


    }
}
