package NormalAlgorithm.twoSum;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int i=0;
        int j=numbers.length-1;
        int a=numbers[i];
        int b=numbers[j];
        while(true)
        {
            if (a+b==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(a+b>target)
            {
                j=j-1;
                b=numbers[j];
            }
            else
            {
                i=i+1;
                a=numbers[i];
            }
        }
    }
}
