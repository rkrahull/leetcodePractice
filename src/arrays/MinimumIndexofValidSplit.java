package arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
TC : O(N)
SC : O(N)
*/
public class MinimumIndexofValidSplit {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
        Map<Integer, Integer> mp1=new HashMap<>();
        Map<Integer, Integer> mp2=new HashMap<>();
        for(int val:nums){
            mp2.put(val,mp2.getOrDefault(val,0)+1);
        }

        for(int i=0;i<n;i++){
            int num=nums.get(i);
            mp2.put(num,mp2.get(num)-1);
            mp1.put(num,mp1.getOrDefault(num,0)+1);

            if(mp1.get(num)*2 > (i+1) && mp2.get(num)*2 > (n-i-1))
                return i;
        }
        return -1;
    }
}
