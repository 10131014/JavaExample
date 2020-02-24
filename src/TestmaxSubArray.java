public class TestmaxSubArray {
    public static void main(String[] args)
    {
        int[] nums1={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(TestmaxSubArray.maxSubArray(nums1));

    }
    public static int maxSubArray(int[] nums)
    {
        int maxsum=nums[0];
        int sum=0;
        for (int i=1;i<=nums.length;i++)
        {
            for (int j=0;j<=nums.length-i;j++)
            {
                for (int k=j;k<j+i;k++)
                {
                    sum=sum+nums[k];
                }
                if (maxsum<=sum)
                {
                    maxsum=sum;
                }
                sum=0;
            }
        }
        return maxsum;
    }
}
