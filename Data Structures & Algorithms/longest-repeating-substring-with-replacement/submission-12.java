class Solution {
    public int characterReplacement(String s, int k) {
        char[] c = s.toCharArray();
        int l=0, r=0;
        int max=0;
        int maxf=0;
        int[] frq = new int[26];
        while(r<c.length)
        {
            frq[c[r]-'A']++;
            maxf=Math.max(maxf,frq[c[r]-'A']);
            if((r-l+1)-maxf>k){
                frq[c[l]-'A']--;
                l++;
            }
            else
                max=Math.max(r-l+1,max);
            r++;
        }
        return max;
    }
}
