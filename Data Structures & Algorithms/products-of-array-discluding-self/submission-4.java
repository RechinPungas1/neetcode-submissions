class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rez = new int[nums.length];
        Arrays.fill(rez,1);
        for(int i=1; i<nums.length; i++)
            rez[i]=nums[i-1]*rez[i-1];
        int p=nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--)
             {rez[i]=rez[i]*p;
             p*=nums[i];
             }
        return rez;
    }
}  
