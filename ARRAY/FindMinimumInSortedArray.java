public class FindMinimumInSortedArray {
    public static int findMin(int[] nums) {
        int minimum=Integer.MAX_VALUE;
        int n=nums.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[start]<=nums[mid]){
                minimum=Math.min(minimum,nums[start]);
                start=mid+1;
            }else{
                minimum=Math.min(minimum,nums[mid]);
                end=mid-1;

            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        System.out.print(findMin(nums));

    }
    
}
