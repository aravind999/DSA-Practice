package ArrayList;

import java.util.*;

public class ALPractice {
    public static void main(String[] args) {
        //Array list has default size of 10 and incriment capacity of 50%
        String [] array = new String[] {"Aravind","Ball","cat","Dog","Fan","God"};
        String [] array22 = new String[] {"A","B","C","D","F","G"};

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


    }
}
