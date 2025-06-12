
import java.util.Collections;



public class inbuiltSort {
public static Integer printArr(Integer arr[])
{
    for(Integer i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    return 1;
}
    public static void main(String args[]){
        Integer arr[]={5,2,8,1,9};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }
}
