public class diagonal_sum {
    public int diagonalSum(int[][] mat) { //O(n)
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //pd
            sum+=mat[i][i];
            //sd
            if(i!=mat.length-1-i)
            sum+=mat[i][mat.length-i-1];
        }
        return sum;
        
    }
    
}
//normal approach (O(n^2))

// for(int i=0;i<matrix.length;i++){
//   for(int j=0;j<matrix[0].length;j++){
//  if(i==j){
//     sum+=matrix[i][j];
//   }else if(i+j==matrix.length-1){
//   sum+=matrix[i][j];
//   }
//   }
// }                     
