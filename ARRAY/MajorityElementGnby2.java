class MajorityElementGnby2{
    public int majorityElement(int[] nums) {
        //brute approach
       int n=nums.length;
        for(int i=0;i<n;i++){
           int cnt=0;
            for(int j=0;j<n;j++){
              if(nums[j]==nums[i]){
                cnt++;
              }
              if (cnt>n/2){
                return nums[i];
              }
            }
        }
        return -1;
    }
}



// Better approach using HashMap
// int n = nums.length;
//         HashMap<Integer, Integer> mpp = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             int value = mpp.getOrDefault(nums[i], 0);
//             mpp.put(nums[i], value + 1);
//         }
//         for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//             if (it.getValue() > (n / 2)) {
//                 return it.getKey();
//             }
//         }

//         return -1;
//     }


//optimal solution

// int n=nums.length;
//         int cnt=0;
//         int el=0;
//         for(int i=0;i<n;i++){
//             if(cnt==0){
//                 cnt=1;
//                 el=nums[i];
//             }else if (el==nums[i]) cnt++;
//             else cnt--;

//         }
//check majority element is greater than stored or not
//         int  cnt1=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==el) cnt1++;
//         }
//         if(cnt1>(n/2)) return el;
//         return -1;