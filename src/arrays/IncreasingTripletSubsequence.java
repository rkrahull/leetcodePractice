package arrays;
/*
TC : O(N)
SC : O(1)
*/
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        int i=Integer.MAX_VALUE,j=Integer.MAX_VALUE;
        for(int ind=0;ind<nums.length;ind++){
            if(nums[ind]<=i)
                i=nums[ind];
            else if(nums[ind]<=j)
                j=nums[ind];
            else
                return true;
        }
        return false;
    }
}
