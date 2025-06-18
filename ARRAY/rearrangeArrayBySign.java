
//bruteforceapproach
class rearrangeArrayBySign{
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
         int pos[]=new int[n/2];
         int neg[]=new int[n/2];
         int posind=0;
        int negind=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[posind++]=nums[i];
            }else{
                neg[negind++]=nums[i];
            }
        }
        
       
        for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
    }
}
//optimal
// public int[] rearrangeArray(int[] nums) {
        // int n=nums.length;
    //      int ans[]=new int[n];
    //      int posind=0;
    //     int negind=1;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]<0){
    //        ans[negind]=nums[i];
    //        negind+=2;
    //         }else{
    //             ans[posind]=nums[i];
    //             posind+=2;
    //         }
    //     }
    
    //     return ans;
    // }
}