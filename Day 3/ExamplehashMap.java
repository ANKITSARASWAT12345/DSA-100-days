import java.util.*;

public class ExamplehashMap {
   
    
    public static void main(String[] args) {
        HashMap<Integer, String> mp=new HashMap<>();

        mp.put(101,"ankit");
        mp.put(102,"shivang");
        mp.put(103,"Vansh");

        System.out.println(mp.get(101));

        System.out.println(mp);

        Set<Integer>  keys=mp.keySet();

        for(int i:keys){
            System.out.println(mp.get(i));
        }

        //iterate the loop using Entry set 

        Set<Map.Entry<Integer,String>> entries=mp.entrySet();


        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }


        for(Map.Entry<Integer, String> e:mp.entrySet()){
            e.setValue(e.getValue().toUpperCase());
        }
         for(Map.Entry<Integer, String> e:mp.entrySet()){
            System.out.println(e.getValue());
        }
        
    }
}
