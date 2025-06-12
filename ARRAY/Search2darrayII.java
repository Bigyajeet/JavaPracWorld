public class Search2darrayII {
    
//     public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {
//         int n = matrix.size();
//         int m = matrix.get(0).size();
//         int row = 0, col = m - 1;

//         //traverse the matrix from (0, m-1):
//         while (row < n && col >= 0) {
//             if (matrix.get(row).get(col) == target) return true;
//             else if (matrix.get(row).get(col) < target) row++;
//             else col--;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//         matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
//         matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
//         matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
//         matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
//         matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

//         boolean result = searchElement(matrix, 8);
//         System.out.println(result ? "true" : "false");
//     }
// }


public class Solution {
    public static boolean searchElement(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Handle empty or invalid matrix
        }

        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        int row = 0, col = m - 1; // Start from the top-right corner

        // Traverse the matrix from (0, m-1):
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++; // Move down if current element is less than target
            } else {
                col--; // Move left if current element is greater than target
            }
        }
        return false; // Target not found
    }
}