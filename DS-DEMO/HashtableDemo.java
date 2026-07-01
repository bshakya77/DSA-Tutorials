/******************************************/
// Author: Bijay Shakya
// Search Algorithm: HashTable

import java.util.Hashtable;

/******************************************/
public class HashtableDemo {
    
    //Description:
    //Hashtable is synchronized version of HashMap.
    //It is an array of buckets that stores key/value pairt in hash table.
    //We specify an object that is used as a key, and the value we want to associate to that key Hashtable<K,V>.
    //hashCode() is used to determine which bucket the key/value pair should map. Returns non-negative integer.
    //There would be collision if the objects have same hashcode.
    //To resolve collisions, hash table uses array of lists or linked list (Chaining).
    //Hashing: Uses division method to find the key in the table to determine. key.hashCode() % capacity = remainder --> index in the table.

    //Average complexity -> O(1)
    //Worst case complexity -> O(n)

    //Advantages:
    //Thread safe --> multiple threads can access it simultaneously without data corruption.
    //Simple to implement.
    //Faster insertion, look up, and deletion of key/value pairs.
    //Works best with large dataset.

    //Disadvantages:
    //Limited functionality
    //Poor performance and obselete

    //Applications:
    //Used for indexing and searching large volumes of data.
    //Used in cryptography to create digital signatures, validate data, and guarantee data integrity.
    //Used for implementing database indexes for faster access of data.

    //Load Factor:
    //It is a measure of how full the hashtable is. 
    //Load factor = no of elements / no of buckets
    //lower load factor means fewer entries per bucket so the lookup is faster but not memory efficient.
    //higher load factor means many entries per bucket so it is memory efficient but look up time will increase.
    //We can set the load factor (0.75) to resize the hashtable if it exceeds the threshold value. It is called rehashing.

    //bucket:
    //an indexed storage location for one or more entries.
    public static void main(String[] args) {

        //For Integer key
        // Hashtable<Integer, String> table = new Hashtable<>(10);
        
        // table.put(100, "SpongeBob");
        // table.put(123, "Patrick");
        // table.put(321, "Sandy");
        // table.put(555, "Squidward");
        // table.put(777, "Gary");
        
        // //table.remove(777);

        // for(Integer key: table.keySet()){
        //     System.out.println(key.hashCode() % 10 + "\t" + key + "\t" +  table.get(key));
        // }

        //For String Key
        Hashtable<String, String> tableString = new Hashtable<>(10);
        
        tableString.put("100", "SpongeBob");
        tableString.put("123", "Patrick");
        tableString.put("321", "Sandy");
        tableString.put("555", "Squidward");
        tableString.put("777", "Gary");
        
        //table.remove(777);

        for(String key: tableString.keySet()){
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" +  tableString.get(key));
        }
    }
}
