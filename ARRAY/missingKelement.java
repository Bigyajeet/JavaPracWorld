public class missingKelement {

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start<= end) {
            int mid = (start + end) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k + end + 1;
    }
    
}


        
    