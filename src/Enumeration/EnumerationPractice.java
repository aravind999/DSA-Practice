package Enumeration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import java.util.stream.Gatherer;
//  Vector, Stack, Hashtable, and Properties --> all of these are le
//This iterotors are another way of accessing elements .
// these are read only forward directional iterator
public class EnumerationPractice {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();// we can use all the other collection interfaces from legacy classes
        Enumeration<String> e = v.elements();
        v.add("aravind");
        v.add("Aplle ");
        v.add("mango");

        // e.hasMoreElements(); we use these two methods to iterate through enumeration
        //e.nextElement(); these elements tells us if there is any next element in the collection by iterating through these collections
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        //we can use Hashtable iteration using enumeration
        Hashtable <String,Integer> ht = new Hashtable<>();
        ht.put("Aravind", 1);
        ht.put("Aplle", 2);
        ht.put("mango", 3);

       Enumeration<Integer> en = ht.elements();
       while (en.hasMoreElements()) {
           System.out.println(en.nextElement());
       }
       ht.elements().asIterator();
        Properties prop = new Properties();
       prop.setProperty("url","localhost:8080");
       prop.setProperty("user","root");
       prop.setProperty("password","123456");

       Enumeration<Object> enu = prop.elements();
       while (enu.hasMoreElements()) {
           System.out.println(enu.nextElement());
       }


     }
}
