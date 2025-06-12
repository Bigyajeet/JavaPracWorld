public class SearchInRotatedArray2 {
public static boolean Search(int[] arr, int k) {
    // code here
     int start=0,end=arr.length-1;
        while(start<=end){
            int mid= start + (end - start) / 2;
            if(arr[mid]==k) return true;
                if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                    start=start+1;
                    end=end-1;
                    continue;
                }
                
            
            if(arr[start]<=arr[mid]){
                if(arr[start]<=k && k<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
                else{
                    if(arr[mid]<=k && k<=arr[end]){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }

            }
            return false;
          
}
public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,0,2};
        int k=0;
        System.out.print(Search(arr,k));
    }
}
