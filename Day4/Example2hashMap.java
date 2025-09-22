package Day4;
import java.util.*;
public class Example2hashMap {
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
}