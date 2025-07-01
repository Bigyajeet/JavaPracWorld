public class CountSubarraySumequalsk {
    
    // brute approach
     public int countSubarrays(int arr[], int k) {
        // code here
          int n = arr.length; 
        int cnt = 0; 

        for (int i = 0 ; i < n; i++) { 
            for (int j = i; j < n; j++) { 

                
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];

                
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    
    }
}

//better approach added
//   int n = arr.length; 
//         int cnt = 0; 

//         for (int i = 0 ; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) { 
//                     sum += arr[j];
                
//                 if (sum == k)
//                     cnt++;
//             }
//         }
//         return cnt;
    
//     }
// }

//optimal
//  public int subarraySum(int[] nums, int k) {
//       int n = nums.length;  
//    Map<Integer, Integer> mpp = new HashMap<>();
//         int preSum = 0, cnt = 0;

//         mpp.put(0, 1); 
//         for (int i = 0; i < n; i++) {
           
//             preSum += nums[i];

   
//             int remove = preSum - k;

       
//             cnt += mpp.getOrDefault(remove, 0);

       
//             mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
//         }
//         return cnt;
//     }
// }