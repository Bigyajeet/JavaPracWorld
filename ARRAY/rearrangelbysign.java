/*You are given an array of size N. Rearrange the given array in-place such that all the negative numbers occur before all non-negative numbers.
(Maintain the order of all -ve and non-negative numbers as given in the original array).

Example 1:

Input:
N = 4
Arr[] = {-3, 3, -2, 2}
Output:
-3 -2 3 2
Explanation:
In the given array, negative numbers
are -3, -2 and non-negative numbers are 3, 2. */
import java.util.ArrayList;
public class rearrangelbysign {
    public void Rearrange(int a[], int n) {
        int[] ans = new int[n];

        int negIdx = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                ans[negIdx++] = a[i];
            }
        }

        int posIdx = negIdx;

        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                ans[posIdx++] = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            a[i] = ans[i];
        }
    }
}