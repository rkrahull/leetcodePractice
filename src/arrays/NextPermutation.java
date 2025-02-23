package arrays;

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }

        if(ind==-1){
            reverse(0,nums);
            return;
        }

        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                swap(i,ind,nums);
                break;
            }
        }

        reverse(ind+1,nums);
        return;
    }

    public void reverse(int ind, int[] nums){
        int i=ind,j=nums.length-1;
        while(i<j){
            int tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
            i++;
            j--;
        }
        return;
    }

    public void swap(int i, int j, int[] nums){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
        return;
    }
}
//TC : O(N)
//SC : O(1)
