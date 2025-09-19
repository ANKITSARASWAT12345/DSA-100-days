//Linked List in Array (Cycle Detection in Array representation of a Linked List)

public class LikedListCycleinArray {
     public static void main(String[] args) {
        int arr[]={1, 2, -1, 4, 5, 2};
        System.out.println(circularLoopArray(arr, 3));
     }

     public static boolean circularLoopArray(int arr[], int start ){
       

       int slow = start;
        int fast = start;

        while (slow != -1 && fast != -1 && arr[fast] != -1) {
            slow = arr[slow];           // move 1 step
            fast = arr[arr[fast]];      // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false;

}
}
