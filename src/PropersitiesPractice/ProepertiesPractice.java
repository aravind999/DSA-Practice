package PropersitiesPractice;
import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.*;


public class ProepertiesPractice {
    public static void main(String[] args) throws IOException {
        //In order to handle any file property file, text fike or anyhting we need to create an instance .
        // In order to add or handle properties in java , java provides a collection called Properties it is a class.
        //we can use almost all hashmap methods here since properties is extending a hashtable interface
        File file = new File("dbConfig.properties");

        if(!file.exists())
            file.createNewFile();
            System.out.println(file.exists());
            Properties prop = new Properties();// we need to create an instance of the class to use it
        //we can also use FileReaders and writers to do the same operations as below
        //FileReader fis = new FileReader(file);
        FileInputStream fis = new FileInputStream(file);//this is another way of reading a file, by giving input in input stream and passing the file we want to read
        prop.load(fis);
            prop.setProperty("url","192.168.25.78");
            prop.remove("url");
        System.out.println(prop);
        // in order to write operations  in any file we use writers or output streams
        //here instead of FileOutputStream we can use FileWriter fos = new FileWriter(file); to do the same operations as below
           FileOutputStream fos = new FileOutputStream(file);
           // prop.setProperty("url","localhost");//Set property will create a property in the give file output stream
           // prop.setProperty("username","DSAPractice");
          //  prop.setProperty("password","DSA123");
          prop.store(fos,"New Property file is created by me to use manully");// .store is function we use to save the data in the fos file
        //we have methods to read a property file like we can read set of keys or values  , and also if there is no property that we are looking  we can look for default property file

////        Set<String> keys =   prop.stringPropertyNames();//will return keyset
//         Set<Object> keys = prop.keySet();
//        System.out.println(prop.values());//.values() will give use collections of values . these are basically collections of objects not keys
//            System.out.println(keys);
//        System.out.println(prop.getProperty("Machinename","AravindDefualtvalue"));//if there is no key or value  present in the file that corresponds to the key that we trying to access we can give a default value as such instead of giving null. if its present it will give its value if not it will give the defeault value that we passed
//        System.out.println(prop.getProperty("http","This is a defualt value "));
//        System.out.println(prop);
//        //in order to iterate through all of them
//        for(Object key : prop.keySet()) {
//            System.out.println(key+">>>>"+prop.getProperty((String)key));
//        }
//        Set<Map.Entry<Object,Object>> data = prop.entrySet();
//        System.out.println("from down here its map entryset");
//        for(Map.Entry<Object,Object> entry : data) {
//            System.out.println(entry.getKey()+">>>>"+entry.getValue());// this returns key,value pairs directly from map class . since Entry is a key value pair class
//        }


    }

}
