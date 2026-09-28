class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
        {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        String rez = new String(sb.toString());
        return rez;
    }

    public List<String> decode(String str) {
        List<String> rez = new ArrayList<>();
        char[] c = str.toCharArray();
        int i=0;
        while(i<c.length)
        {
            int n=0;
            while(c[i]!='#')
            {
                n = (n*10) + c[i] - '0';
                i++;
            }
            i++;
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++)
            {
                sb.append(c[i]);
                i++;
            }
            rez.add(sb.toString());
        }
        return rez;
    }
}
