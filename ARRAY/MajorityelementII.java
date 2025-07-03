import java.util.ArrayList;
import java.util.List;

public class MajorityelementII {
    //brute
     public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ls.size()==0 || ls.get(0)!=nums[i]){
               int cnt=0;
                for(int j=0;j<n;j++){
                   if(nums[j]==nums[i]){
                    cnt++;
                   }
                }
                if(cnt>(n/3))  ls.add(nums[i]);
            }
            if(ls.size()==2)  break;
        }
        return ls;
        
    }
    
}

// better approach using hashmap
//  public List<Integer> majorityElement(int[] nums) {
//         int n=nums.length;
//         List<Integer> ls=new ArrayList<>();
//         HashMap<Integer,Integer>mpp=new HashMap<>();
//         int mini=(int)(n/3)+1;
//         for(int i=0;i<n;i++){
//             int val=mpp.getOrDefault(nums[i],0);
//             mpp.put(nums[i],val+1);
//             if(mpp.get(nums[i])==mini){
//                 ls.add(nums[i]);

//             }
//             if(ls.size()==2) break;
//         }
//         return ls;
//     }
// }
