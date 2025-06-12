import java.util.*;
public class BinarySearch {
    public static int binarySearch(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            //comparsion
            int mid=(start+end)/2;
            //key found
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("index key value is :"+binarySearch(num,key));
    }
    
}
