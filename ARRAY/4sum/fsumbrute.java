
import java.util.Arrays;
import java.util.Collection;

public class fsumbrute {
    public static List<List<Integer>> fourSum(int [] nums,int target){
        int n=nums.length;
        Set<List<Integer>> set =new HashSet<>();
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                    long sum=(long) nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
    }
    List<List<Integer>> ans=new ArrayList<>(set);
    return ans;
}
}

