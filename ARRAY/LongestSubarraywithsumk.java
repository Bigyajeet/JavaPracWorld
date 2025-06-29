
public class LongestSubarraywithsumk {
    //better approach
    public static int getLongestSubarray(int []a, long k) {
        //optimal approach
        int n=a.length;
        int left=0,right=0;
        long sum=a[0];
        int maxLen=0;
        while(right<n){
             while(left<=right && sum>k){
                sum-=a[left];
                left++;
             }
             if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
             }
             right++;
             if(right<n) sum+=a[right];
             }
             return maxLen;
        }
    }

    
//         int n = a.length; // size of the array.

//         Map<Long, Integer> preSumMap = new HashMap<>();
//         long sum = 0;
//         int maxLen = 0;
//         for (int i = 0; i < n; i++) {
//             //calculate the prefix sum till index i:
//             sum += a[i];

//             // if the sum = k, update the maxLen:
//             if (sum == k) {
//                 maxLen = Math.max(maxLen, i + 1);
//             }

//             // calculate the sum of remaining part i.e. x-k:
//             long rem = sum - k;

//             //Calculate the length and update maxLen:
//             if (preSumMap.containsKey(rem)) {
//                 int len = i - preSumMap.get(rem);
//                 maxLen = Math.max(maxLen, len);
//             }

//             //Finally, update the map checking the conditions:
//             if (!preSumMap.containsKey(sum)) {
//                 preSumMap.put(sum, i);
//             }
//         }

//         return maxLen;
//     }

//     public static void main(String[] args) {
//         int[] a = {2, 3, 5, 1, 9};
//         long k = 10;
//         int len = getLongestSubarray(a, k);
//         System.out.println("The length of the longest subarray is: " + len);
//     }
// }



//     //brute approach
//     public int findLength(int[] arr) 
//             {
//                 int len=0;
//                 int n = arr.length;
//                 int[] prefix = new int[n];
//                 for(int i=0;i<n;i++){
//                     for(int j=i;j<n;j++){
//                         int s=0;
//                         for(int k=i;k<=j;k++){
//                             s+=arr[k];
//                             if(s==k) len=Math.max(len,j-i+1);
//                         }
//                     }
//                 }
//                 return len;
// }
// }
