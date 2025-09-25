package Day4;
import java.util.*;


/*public class Example2hashMap {
    public static void main(String[] args) {
        HashMap<Person,String> mp=new HashMap<>();
        Person p1=new Person("Ashwini", 101);
        Person p2=new Person("Tarak", 103);
        Person p3=new Person("Bhide", 102);

        mp.put(p3,"Teacher" );
        mp.put(p2,"Writter");
        mp.put(p1, "Developer");

        System.out.println(mp.get(102));

    }
}


class Person{
    String name;
    int id;

    public Person(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;


    }

    public int getId(){
        return id;
    }
}*/


//subarray sum equals to K




/*class Person{
    public static void main(String[] args) {
          int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2)); 
    }

    public static int subarraySum(int nums[], int sum){
        int curr_sum=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0, 1);
      int count=0;

        for(int num:nums){
            curr_sum+=num;

            if(mp.containsKey(curr_sum-sum)){
                count+=mp.get(curr_sum-sum);
            }
            mp.put(curr_sum, mp.getOrDefault(curr_sum, 0)+1);
        }
        return count;
    }
}*/


class Person{
    public static void main(String[] args) {
          int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 1)); 
    }

    public static int subarraySum(int nums[], int sum){
        int curr_sum=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0, 1);
      int count=0;

        for(int num:nums){
            curr_sum+=num;

            if(mp.containsKey(curr_sum-sum)){
                count+=mp.get(curr_sum-sum);
            }
            mp.put(curr_sum, mp.getOrDefault(curr_sum, 0)+1);
        }
        return count;
    }
}