public class UpperBound{
    public static int UpBound(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        int ans = n; // Initialize to n, as the upper bound could be the end of the array
        while (start <= end) {
            int mid = (start + end) / 2; // To prevent integer overflow
            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 3, 4, 5,6,7,8,9,10};
        int target = 5;
        System.out.println(UpBound(nums,target));
      

    }

}