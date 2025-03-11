package slidingWindow;
class MaxConsecutiveOnes3 {
    //TC : O(N*N)
    //SC : O(1)
    public static int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0)
                    zero++;
                if(zero<=k){
                    maxLength=Math.max(maxLength, j-i+1);
                }
                else
                    break;
            }
        }
        return maxLength;
    }

    //TC : O(2N)
    //SC : O(1)
    public int longestOnesN(int[] nums, int k) {
        int n=nums.length;
        int maxLength=0;
        int l=0,r=0,zero=0;
        while(r<n){
            if(nums[r]==0)
                zero++;
            while(zero>k){
                if(nums[l]==0)
                    zero--;
                l++;
            }
            if(zero<=k){
                maxLength=Math.max(r-l+1, maxLength);
            }
            r++;
        }
        return maxLength;
    }
}
