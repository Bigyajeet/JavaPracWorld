
// this is a 2 pointer approach

class twosum2_arrayIsSorted{
     public int[] twoSum(int[] numbers, int target) {
        int lfp=0;
        int rigp=numbers.length-1;
        while(lfp<rigp){
            int sum=numbers[lfp]+numbers[rigp];
            if(sum==target){
                return new int[]{lfp+1,rigp+1};
            }else if(sum<target){
                lfp++;
            }else{
                rigp--;
            }
        }
        return new int[]{-1,-1};
    }
}

