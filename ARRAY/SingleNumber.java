class SingleNumber{
    int sing(int []nums){
    int n = nums.length;

        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
}