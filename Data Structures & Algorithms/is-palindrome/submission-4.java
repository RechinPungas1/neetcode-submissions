class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int i=0, j=c.length-1;
        while(i<j)
        {
            while(Character.isLetterOrDigit(c[i])==false && i<c.length-1)
                i++;
            while(Character.isLetterOrDigit(c[j])==false && j>0)
                j--;
            char a = Character.toLowerCase(c[i]), b = Character.toLowerCase(c[j]);
            if(i==c.length-1 || j == 0)
                return true;
            if(a!=b)
                return false;
            i++;
            j--;
        }
        return true;
    }
}
