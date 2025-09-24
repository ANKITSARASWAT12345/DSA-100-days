package Day6;



//Set

/*Set interface is used to store a unique collection of unique elements.

common classes that implements Set:

HashSet  ---- Fast and Order
LinkedHashSet --- Order by insertion
TreeSet  -- Sorted set
*/


import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("ankit");
        st.add("tarun");
        st.add("shivang");
        st.add("dhruv");
        st.add("shivang");

        System.out.println(st);
        System.out.println(st.contains("ankit"));
        System.out.println(st.size());
        
    }
}
