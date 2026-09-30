class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int most=0;
        while(i<j)
        {
            int surf = Math.min(heights[i],heights[j])*(j-i);
            most = Math.max(most,surf);
            if(heights[i]>heights[j])
                j--;
            else{
                i++;
            }
        }
        return most;
    }
}
