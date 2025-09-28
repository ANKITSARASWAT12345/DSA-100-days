 
 //Rotate an array by d place to left

/*public class Demo {
    public static void main(String[] args) {
        
        // code here
        int arr[]={1, -2, -3, 4, 5, 6, 7};
        int d=2;
        int n=arr.length;
        if(d==0 || d==n){
            return;// no rotation is required
        }
        
        d=d%n;  //it handles cases when  d>n
        
        rotateArr(arr, 0, d-1);
        
        rotateArr(arr,d, n-1);
        rotateArr(arr, 0, n-1);

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    
    private static void rotateArr(int arr[], int start, int end){
        
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}*/


/*You are given an integer n. You need to convert all zeroes of n to 5.

Examples:

Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.*/



class Demo {

   public static void main(String[] args) {
    int n=1004;
    System.out.println(convertfive(n));
   }



    public static int convertfive(int n) {
       
        
        
        if(n==0){
            return 5;
        }
        int result=0;
        int place =1;
        
        while(n>0){
            int digit=n%10;
            
            if(digit==0){
                digit=5;
            }
            result+=digit*place;
            place=place*10;
            n/=10;
        }
        return result;
    }
}
