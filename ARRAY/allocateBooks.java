public class allocateBooks{
    public static int countStudents(int[] arr, int pages) {
        int n = arr.length;
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            return -1;
        }

        int low = 0;
        if (n > 0) {
            low = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > low) {
                    low = arr[i];
                }
            }
        }

        int high = 0;
        for (int page : arr) {
            high += page;
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(arr, mid);
            if (students <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    } 

}