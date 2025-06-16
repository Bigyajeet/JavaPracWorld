

// Brute Approach
public class Sort0s1sand2s {
    public void sortColors(int[] nums) {
        int cnt0=0;
        int cnt1=1;
        int cnt2=2;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                cnt0++;
                }
            else if(nums[i]==1){
                cnt1++;
            }
            else {
                cnt2++;

            }
        }
        for(int i=0;i<cnt0;i++) {
            nums[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
             nums[i]=1;
        }
        for(int i=cnt0+cnt1;i<n;i++){
             nums[i]=2;
        }
    }
}
// dutch national flag algorithm

// public void sort012(int[] arr) {
//         // code here
//         int n=arr.length;
//         int low=0, mid=0, high=n-1;
//         while(mid<=high){
//             if(arr[mid]==0){
//                 int temp=arr[low];
//                 arr[low]=arr[mid];
//                 arr[mid]=temp;
//                 low++;
//                 mid++;
//             }
//             else if (arr[mid]==1){
//                 mid++;

//             }
//             else{
//                 int temp=arr[mid];
//                 arr[mid]=arr[high];
//                 arr[high]=temp;
//                 high--;
//             }
//         }
//     }
// }
    