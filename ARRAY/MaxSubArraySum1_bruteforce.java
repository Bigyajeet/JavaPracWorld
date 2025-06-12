
public class MaxSubArraySum1_bruteforce {
    public static void maxSubarraySum(int num[]){

    
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i;j<num.length;j++){
            int end=j;
            currSum=0;
            for(int k=start;k<=end;k++){
                //print subarraysum
                currSum+=num[k];
        }
        System.err.println("currsum is"+currSum);
        if(maxSum<currSum){
            maxSum=currSum;
        }
    }
    
    }
    System.out.println("maxsum:-"+maxSum);
}
    

public static void main(String args[]){
    int num[]={1,-2,6,-1,3};
    maxSubarraySum(num);
}
    }
