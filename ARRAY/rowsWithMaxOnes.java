import java.util.ArrayList;

public class rowsWithMaxOnes {
 public static int lowerBound(int[][]arr)  {
         // code here
        int n = arr.length;
        if (n == 0) {
            return -1;
        }

        int m = arr[0].length;
        if (m == 0) {
            return -1;
        }

        int maxOnesCount = 0;
        int rowIndex = -1;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (arr[row][col] == 1) {
                maxOnesCount = m - col;
                rowIndex = row;
                col--;
            } else {
                row++;
            }
        }
        return rowIndex;
}
}


