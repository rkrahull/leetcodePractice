package arrays;
class MaximumAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }

        sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            min=Math.min(sum,min);
            if(sum>0){
                sum=0;
            }
        }
        return Math.max(max,Math.abs(min));
    }
}
//TC : O(N)
//SC : O(1)
