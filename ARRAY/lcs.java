public class lcs {
    //brute
    public static boolean linearSearch(int []a, int num) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=1;

        for(int i=0;i<n;i++){
            int x=nums[i];
            int cnt=1;
        while(linearSearch(nums,x+1)==true){
            x+=1;
            cnt+=1;
        }
        longest=Math.max(longest,cnt);
        }
        return longest;
        
    }
}

//better



// import java.util.*;

// public class tUf {
//     public static int longestSuccessiveElements(int []a) {
//         int n = a.length;
//         if (n == 0) return 0;

//         //sort the array:
//         Arrays.sort(a);
//         int lastSmaller = Integer.MIN_VALUE;
//         int cnt = 0;
//         int longest = 1;

//         //find longest sequence:
//         for (int i = 0; i < n; i++) {
//             if (a[i] - 1 == lastSmaller) {
//                 //a[i] is the next element of the
//                 //current sequence.
//                 cnt += 1;
//                 lastSmaller = a[i];
//             } else if (a[i] != lastSmaller) {
//                 cnt = 1;
//                 lastSmaller = a[i];
//             }
//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int[] a = {100, 200, 1, 2, 3, 4};
//         int ans = longestSuccessiveElements(a);
//         System.out.println("The longest consecutive sequence is " + ans);
//     }
// }



