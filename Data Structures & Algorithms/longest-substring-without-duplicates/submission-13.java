class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int rez=0;
        int i=0;
        for(int j=0; j<c.length; j++)
        {
            while(set.contains(c[j]))
            {
                set.remove(c[i]);
                i++;
            }
            set.add(c[j]);
            rez = Math.max(rez, j-i+1);
        }
        return rez;
    }
}
