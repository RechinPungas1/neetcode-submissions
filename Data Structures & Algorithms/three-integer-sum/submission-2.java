class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> rez = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
                break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int f=i+1, l=nums.length-1;
            while(f<l)
            {
                int sum = nums[i]+nums[f]+nums[l];
                if(sum>0)
                {
                    l--;
                }else if(sum<0){
                    f++;
                }else {
                    rez.add(Arrays.asList(nums[i],nums[f],nums[l]));
                    f++;
                    l--;
                    while(f<l && nums[f]==nums[f-1]){
                        f++;
                    }
                }
            }
        }
        return rez;
    }
}
