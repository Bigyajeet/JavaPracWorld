
public class LongestSubarraywithsumk {
    //brute approach
    public int findLength(int[] arr) 
            {
                int len=0;
                int n = arr.length;
                int[] prefix = new int[n];
                for(int i=0;i<n;i++){
                    for(int j=i;j<n;j++){
                        int s=0;
                        for(int k=i;k<=j;k++){
                            s+=arr[k];
                            if(s==k) len=Math.max(len,j-i+1);
                        }
                    }
                }
                return len;
}
}
