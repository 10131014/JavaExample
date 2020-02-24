public class TestmaxSubArray2 {
    public static void main(String[] args)
    {
        int[] nums1={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(TestmaxSubArray2.maxSubArray2(nums1));

    }
    public static int maxSubArray2(int[] nums)
    {
        int maxsum=nums[0];
        int sum=0;
        for (int i=0;i<nums.length;i++)
        {
           if (sum>0)
           {
               sum=sum+nums[i];
           }
           else
           {
               sum=nums[i];
           }
           maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}

