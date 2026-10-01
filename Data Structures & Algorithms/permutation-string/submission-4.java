class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[] n = new int[26];
        for(char c : c1)
            n[c-'a']++;
        if(c1.length>c2.length)
            return false;
        int j;
        int[] frq = new int[26];
        for(j=0; j<c1.length; j++)
        {
            frq[c2[j]-'a']++;
        }
        for(int i=0; j<c2.length; j++)
        {
            if(Arrays.equals(n,frq))
                return true;
            frq[c2[j]-'a']++;
            frq[c2[i]-'a']--;
            i++;
        }
        if(Arrays.equals(n,frq))
                return true;
        return false;
    }
}
