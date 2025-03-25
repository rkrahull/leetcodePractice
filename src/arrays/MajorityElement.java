package arrays;
/*
TC : O(N)
SC : O(1)
*/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        //moore's voting algorithm
        int element=nums[0];
        int cnt=0;
        for(int val:nums){
            if(cnt==0){
                element=val;
                cnt=1;
            }
            else if(val==element){
                cnt++;
            }else{
                cnt--;
            }
        }
        //verify
        cnt=0;
        for(int val:nums)
        {
            if(val==element)
                cnt++;
        }

        if(cnt>nums.length/2)
            return element;
        return -1;
    }
}
