public class SngleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0]; // first second
        if(nums[n-1]!=nums[n-2]) return nums[n-1]; //second  secondLast
        int start=1,end=n-2;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];  //right && left

            if((mid % 2==1 && nums[mid-1]==nums[mid]) 
            || (mid % 2==0 && nums[mid]==nums[mid+1]) ){ //left not equivalent to right
  
            
            start=mid+1;  //elimination
            }
            else{
                 end=mid-1; //elimination
            }
           
        }

         return -1;
    }
   
    
}
