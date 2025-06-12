
import java.util.ArrayList;

public class FandlOccurenca_ArrayList {
    public static int lowerbound(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int UpperBound(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    ArrayList<Integer>  find(int arr[], int x) {
        int n = arr.length;
        int lb = lowerbound(arr, x);

        if (lb == -1 || lb == n || arr[lb] != x) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            result.add(-1);
            return result;
        }

        int ub = UpperBound(arr, x);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(lb);
        result.add(ub - 1);
        return result;
    }

}