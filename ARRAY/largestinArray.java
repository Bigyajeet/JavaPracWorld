import java.util.*;

class largestinArray{
    public static int getLargest(int num[]){
        int largest=Integer.MAX_VALUE;//-infinity

        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println("largest value is"+getLargest(num));
}
}