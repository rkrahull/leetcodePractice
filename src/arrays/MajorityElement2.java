package arrays;
class MajorityElement2 {
    //TC : O(NlogN)
    //SC : O(N)
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp=new TreeMap<>();
        for(int val : nums)
            mp.put(val, mp.getOrDefault(val,0)+1);

        int k=nums.length/3;
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer, Integer> pair : mp.entrySet()){
            if(pair.getValue()>k)
                ans.add(pair.getKey());
        }
        return ans;

    }

    //TC : O(NlogN)
    //SC : O(1)
    public List<Integer> majorityElementN(int[] nums) {
        if(nums.length==1)
            return new ArrayList<>(Arrays.asList(nums[0]));
        Arrays.sort(nums);
        int k=nums.length/3;
        List<Integer> ans=new ArrayList<>();
        int i=0,j=1,c=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                c++;
            }
            else{
                if(c>k)
                    ans.add(nums[i]);
                c=1;
                i=j;
            }
            j++;
        }
        if(c>k)
            ans.add(nums[j-1]);
        return ans;
    }
}