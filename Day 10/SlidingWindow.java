//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

public class SlidingWindow {
    

    public static int longestOnes(int arr[], int k){
        int n=arr.length;
        int left=0;
        int right=0;
        int maxLength=0;
        int zero=0;

        while(right<n){
            if(arr[right]==0){
                zero++;
            }
            if(zero>k){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            if(zero<=k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=3;
        int res=longestOnes(arr,k);
        System.out.println(res);
    }
}
