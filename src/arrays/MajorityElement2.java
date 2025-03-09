package arrays;
//TC : O(NlogN)
//SC : O(N)
class MajorityElement2 {
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
}