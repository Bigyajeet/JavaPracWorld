import java.util.*;
public class leftRotateByOnePlace {
public void rotate(int[]nums,int k){
int n=nums.length;
k%=n;
reverse(nums,0,n-1);
reverse(nums,0,k-1);
reverse(nums,k,n-1);
}
private void reverse(int[]nums,int start,int end){
while(start<end){
int temp=nums[start];
nums[start]=nums[end];
nums[end]=temp;
start++;
end--;
}
}
}



// import java.util.Arrays;

// class GfG {
//     static void rotate(int[] arr) {
//         // store the last element in a variable
//         int lastElement = arr[arr.length - 1];

//         // assign every value by its predecessor
//         for (int i = arr.length - 1; i > 0; i--) {
//             arr[i] = arr[i - 1];
//         }

//         // first element will be assigned by last element
//         arr[0] = lastElement;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         rotate(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }