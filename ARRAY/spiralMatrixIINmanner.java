import java.util.ArrayList;
import java.util.List;
//Spirally traversing a matrix


public class spiralMatrixIINmanner {
    public static List<Integer> printSpiral(int[][] mat) {
        
        // Define ans list to store the result.
        List<Integer> ans = new ArrayList<>();
        
        int n = mat.length; // no. of rows
        int m = mat[0].length; // no. of columns
        
        // Initialize the pointers required for traversal.
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        // Loop until all elements are not traversed.
        while (top <= bottom && left <= right) {

            // For moving left to right
            for (int i = left; i <= right; i++)
                ans.add(mat[top][i]);

            top++;

            // For moving top to bottom.
            for (int i = top; i <= bottom; i++)
                ans.add(mat[i][right]);

            right--;

            // For moving right to left.
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(mat[bottom][i]);

                bottom--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(mat[i][left]);

                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}



//arraylist
  // Function to return a list of integers denoting spiral traversal of matrix.
    // public ArrayList<Integer> spirallyTraverse(int mat[][]) {
    //     // code here
    //      List<Integer> ans = new ArrayList<>();
        
    //     int n = mat.length; 
    //     int m = mat[0].length; 
        
    //     int top = 0, left = 0, bottom = n - 1, right = m - 1;
    //     while (top <= bottom && left <= right) {
    //         for (int i = left; i <= right; i++)
    //             ans.add(mat[top][i]);

    //         top++;
    //         for (int i = top; i <= bottom; i++)
    //             ans.add(mat[i][right]);

    //         right--;

            
    //         if (top <= bottom) {
    //             for (int i = right; i >= left; i--)
    //                 ans.add(mat[bottom][i]);

    //             bottom--;
    //         }

        
    //         if (left <= right) {
    //             for (int i = bottom; i >= top; i--)
    //                 ans.add(mat[i][left]);

    //             left++;
    //         }
    //     }
    //     return (ArrayList<Integer>) ans;
    // }
    
        
    

    

