public class FirstandlastOccurenceInSortedArray {

    public int lowerbound(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public int UpperBound(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        int ans = n; 
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public int[] firstAndLastOccurence(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerbound(nums, target);

        if (lb == -1 || lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        int ub = UpperBound(nums, target);

        return new int[]{lb, ub - 1};
    }
}
//     // Example usage (not part of the Solution class, but for testing)
//     public static void main(String[] args) {
//         FirstandlastOccurenceInSortedArray sol = new FirstandlastOccurenceInSortedArray();
//         int[] nums = {5, 7, 7, 8, 8, 10};
//         int target = 8;
//         int[] result = sol.firstAndLastOccurence(nums, target);
//         System.out.println("First and last occurrence of " + target + ": [" + result[0] + ", " + result[1] + "]"); // Output: [3, 4]

//         int[] nums2 = {5, 7, 7, 8, 8, 10};
//         int target2 = 6;
//         int[] result2 = sol.firstAndLastOccurence(nums2, target2);
//         System.out.println("First and last occurrence of " + target2 + ": [" + result2[0] + ", " + result2[1] + "]"); // Output: [-1, -1]

//         int[] nums3 = {};
//         int target3 = 0;
//         int[] result3 = sol.firstAndLastOccurence(nums3, target3);
//         System.out.println("First and last occurrence of " + target3 + ": [" + result3[0] + ", " + result3[1] + "]"); // Output: [-1, -1]
//     }
// }