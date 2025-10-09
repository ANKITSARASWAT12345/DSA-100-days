


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
*/


//Maximum Points You Can Obtain from Cards
/*There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
*/



class LongestSubarray {

    public static void main(String[] args) {
        int cardPoints[] = {1,2,3,4,5,6,1}; 
        int k = 1;
        System.out.println("Maximum score obtained"+maxScore(cardPoints, k));

    }
    public static int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        int a=0;

        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        maxSum=leftSum;
        
        int endIndex=cardPoints.length-1;

        for(int i= k-1;i>=0;i--){
            leftSum=leftSum-cardPoints[i];
             rightSum+=cardPoints[endIndex];
             endIndex--;
             maxSum=Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}

