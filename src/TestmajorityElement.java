public class TestmajorityElement {
    public static void main(String[] args)
    {

        int[] shuzu1={1,2,2,3,5,4,1,1,1,1,1};
        System.out.print(TestmajorityElement.majorityElement(shuzu1));
    }
    public static int majorityElement(int[] nums)
    {
        int count;
        int ans=0;
        for (int i=0;i<nums.length;i++)
        {
            count=0;
            for (int j=0;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count = count + 1;
                }
            }
            if (count>nums.length/2)
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}
