public class SmallestinArray {
public static int getSmallest(int[] num) {
       int smallest = Integer.MAX_VALUE;//+infinity
 
       for(int i= 0; i < num.length; i++) {
          if (smallest > num[i]) {
             smallest=num[i];
          }
       }
 
       return smallest;
    }
 
    public static void main(String[] args) {
       int[] num = {1, 2, 6, 3, 5};
       System.out.println("smallest is" + getSmallest(num));
    }
 }
 
    