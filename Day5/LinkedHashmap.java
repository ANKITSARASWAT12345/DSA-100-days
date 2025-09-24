package Day5;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class LinkedHashmap {
      public static void main(String[] args) {
        HashMap<String, Integer> mp=new HashMap<>();
        mp.put("apple", 2);
        mp.put("orange", 3);
        mp.put("Mango",1);

        for(Map.Entry<String, Integer>entry:mp.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
           System.out.println();
        LinkedHashMap<String, Integer> mp1=new LinkedHashMap<>();
         mp1.put("apple", 2);
        mp1.put("orange", 3);
        mp1.put("Mango", 1);
        
        for(Map.Entry<String, Integer>entry:mp1.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }  
      }
}
