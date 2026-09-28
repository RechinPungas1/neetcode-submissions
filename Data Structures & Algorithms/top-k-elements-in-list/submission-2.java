class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> tot = new HashMap<>();
       List<Integer>[] frq = new ArrayList[nums.length+1];
       int[] rez = new int[k];
       for(int num : nums)
       {
            tot.put(num, tot.getOrDefault(num, 0)+1);
       }
       for(int key : tot.keySet())
       {
            int fre = tot.get(key);
            if(frq[fre]==null)
                frq[fre] = new ArrayList<>();
            frq[fre].add(key);
       }
       int i=0;
       for(int l=frq.length-1; l>=0; l--)
       {
            if(frq[l]==null)
                continue;
            for(int j=0; j<frq[l].size(); j++)
            {
                rez[i++]=frq[l].get(j);
                if(i==k)
                    return rez;
            }
       }
       return rez;
    }
}
