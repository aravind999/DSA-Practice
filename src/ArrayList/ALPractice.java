package ArrayList;

import java.util.*;

public class ALPractice {
    public static void main(String[] args) {
        //Array list has default size of 10 and incriment capacity of 50%
        String [] array = new String[] {"Aravind","Ball","cat","Dog","Fan","God"};
       String [] array22 = new String[] {"A","B","C","D","F","G"};
       ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,2,2,2,2,3,2));
        List<Integer> Sarray2 = Collections.synchronizedList(array2);

        // Integer [] array2 = new Integer[] {1,2,2,2,2,3,2};
               int target = 2;
        int count = 0;
        for(int i = 0; i < Sarray2.size(); i++) {
            if(Sarray2.get(i) == target) {
                count++;
            }

        }
        System.out.println("The occurance of the target is :"+count);
       // System.out.println(Arrays.toString(array2));
       ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(array));
        System.out.println(al1.size());
        //arrey list default size remains zero 0 right after we initialize its object however it turns to 10 once we add elements to its array
        // we cannot get capacity in arraylist the way we did in vector
        al1.add("Aravind");
        al1.add("Alex");
        al1.add("Alex");
        al1.add("Aravind");
        al1.add(null);
        System.out.println(al1.contains("Aravind"));
        al1.add(0,"koyyala");
        System.out.println(al1.get(3));
        System.out.println("Before adding array2"+al1);
        al1.addAll(Arrays.asList(array22));
        System.out.println(al1);
        al1.removeAll(Arrays.asList(array22));
        System.out.println(al1.size());
        Collections.synchronizedList(al1);

        // this provides synchronisation for arraylist ,
        // since by default its asynchronised can do multiple tasks
        //Vector is legacy class , arraylist is latest class
        //

//Q) default capacity of ArrayList// A) 10
//Q) what is the initial capacity of ArrayList // A) 1
// Q) does it allow duplicates //A) yes
        //Q) does it all null values //A) yes
        //Q) does it maintin insertion order //A) yes
        //Q) does it maintain sorted order //A) no
        //Q)does it offer random acess to the elemts //A) yes
        //Q) is it synchronise //A) yes
        //Q) what is good at it //A)when there are multiple threaded coded , and there is exponetitial growth in data



    }
}
