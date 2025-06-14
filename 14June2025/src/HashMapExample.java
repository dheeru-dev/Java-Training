import java.util.*;

public class HashMapExample {
    public static void main(String args[]){
        //Create HashMap object.
        Map hashMap = new HashMap();

        //Add objects to the HashSet.
        hashMap.put(4, "Roxy");
        hashMap.put(2, "Sunil");
        hashMap.put(5, "Sandy");
        hashMap.put(1, "Munish");
        hashMap.put(3, "Pardeep");

        //Print the HashMap object.
        System.out.println("HashMap elements:");
        System.out.println(hashMap);

        //Get iterator
        Set set=hashMap.entrySet();
        Iterator iterator=set.iterator();

        //Print the HashMap elements using iterator.
        System.out.println("HashMap elements using iterator:");
        while(iterator.hasNext()){
            Map.Entry mapEntry=(Map.Entry)iterator.next();
            System.out.println("Key: " + mapEntry.getKey() + ", " +
                    "Value: " + mapEntry.getValue());
        }

        //HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Cherry");

        System.out.println("HashMap (Unordered): " + hashMap);


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");

        System.out.println("TreeMap (Sorted by Key): " + treeMap);
    }
}

/*

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableTest {
        public static void main(String args[]){
               //Create Hashtable object.
               Hashtable hashtable = new Hashtable();

               //Add objects to the Hashtable.
               hashtable.put(2,"Bharat");
               hashtable.put(1,"Richi");
               hashtable.put(5,"Sahdev");
               hashtable.put(3,"Rajesh");
               hashtable.put(4,"Himanshu");

               //Print the Hashtable object.
               System.out.println("Hashtable elements:");
               System.out.println(hashtable);

               //Get iterator
               Set set=hashtable.entrySet();
               Iterator iterator=set.iterator();

               //Print the Hashtable elements using iterator.
               System.out.println("Hashtable elements using iterator:");
               while(iterator.hasNext()){
                  Map.Entry mapEntry=(Map.Entry)iterator.next();
                  System.out.println("Key: " + mapEntry.getKey() +
                      ", " + "Value: " + mapEntry.getValue());
               }
        }
}


*/