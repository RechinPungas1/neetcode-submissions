class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }
        int longest=0;
        for(int n : set)
        {
            if(set.contains(n-1)==false)
            {
                int lng = 1;
                while(set.contains(n+lng))
                    lng++;
                longest = Math.max(lng,longest);
            }
        }
        return longest;
    }
}
