class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] rez = new int[2];
        int i=0, j=numbers.length-1;
        while(numbers[i]+numbers[j]!=target)
        {
            int sum = numbers[i]+numbers[j];
            if(sum>target)
                j--;
            else if(sum<target)
                i++; 
        }
        rez[0]=i+1;
        rez[1]=j+1;
        return rez;
    }
}
