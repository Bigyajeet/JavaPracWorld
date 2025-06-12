public class shortestpath{

float shortestPath(String S) {
       int x=0,y=0;
       for(int i=0;i<S.length();i++ ){
           char dir=S.charAt(i);
           //south
           if(dir=='S'){
               y--;
           }
           //north
           else if(dir=='N'){
               y++;
           }//west
            else if(dir=='W'){
               x--;
           }
           //East
           else{
               x++;
           }
       }
       int X2=x*x;
       int Y2=y*y;
       return (float)Math.sqrt(X2+Y2);
    }
}





// import java.lang.StringBuilder;

// class Solution {
//     String shortestPath(String S) {
//         int x = 0;
//         int y = 0;

//         for (int i = 0; i < S.length(); i++) {
//             char dir = S.charAt(i);
//             if (dir == 'S') {
//                 y--;
//             } else if (dir == 'N') {
//                 y++;
//             } else if (dir == 'W') {
//                 x--;
//             } else if (dir == 'E') {
//                 x++;
//             }
//         }

//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < x; i++) {
//             result.append('E');
//         }

//         for (int i = 0; i < y; i++) {
//             result.append('N');
//         }

//         for (int i = 0; i > y; i--) {
//             result.append('S');
//         }

//         for (int i = 0; i > x; i--) {
//             result.append('W');
//         }
        
//         return result.toString();
//     }
// }