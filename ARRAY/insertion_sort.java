 
 class insertion_sort{
 public static void insertionSort(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            
            while(prev>=0 && arr[prev]>curr)
        {
            arr[prev+1]=arr[prev];
            prev--;
        }
         arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={3,7,5,2};
        System.out.print(insertionSort(arr));

    }
}