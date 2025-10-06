


//Find the length of longest subArray having sum<= K;

//Better Solution 
//Time complexity O(n+n)--->O(2n)

/*public class LongestSubarray {
    public static void main(String[] args) {
        int arr[]={2,5,1,10,10};
        int k=14;
        System.out.println(findLongestSubstring(arr,k));
    }
    public static int findLongestSubstring(int arr[], int k){
         int n=arr.length;
        int left=0;
        int right=0;
        int sum=0;
         int maxLen=0;
        while(right<n){
            sum+=arr[right];

            while(sum>k){
                sum=sum-arr[left];
                left++;
            }
            if(sum<=k){
               maxLen=Math.max(maxLen,right-left+1);
            }

            right++;
        }
        return maxLen;
    }
}*/


//Optimal Solution
//Time complexity  O(n)

public class LongestSubarray {
    public static void main(String[] args) {
        int arr[]={2,5,1,10,10};
        int k=14;
        System.out.println(findLongestSubstring(arr,k));
    }
    public static int findLongestSubstring(int arr[], int k){
         int n=arr.length;
        int left=0;
        int right=0;
        int sum=0;
         int maxLen=0;
        while(right<n){
            sum+=arr[right];

            if(sum>k){
                sum=sum-arr[left];
                left++;
            }
            if(sum<=k){
               maxLen=Math.max(maxLen,right-left+1);
            }

            right++;
        }
        return maxLen;
    }
}

