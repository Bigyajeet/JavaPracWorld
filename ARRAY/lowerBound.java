public class lowerBound {
    public static int lwbound(int[] nums, int target) {
    int n=nums.length;
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
        
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 3, 4, 5,6,7,8,9,10};
        int target = 5;
        System.out.println("Lower bound of "+target+" is "+lwbound(nums, target));

    }

    
}
