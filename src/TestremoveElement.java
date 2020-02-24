public class TestremoveElement {
    public static void main(String[] args)
    {

        int[] num1={3,2,2,3};
        int val1=3;
        System.out.println(TestremoveElement.removeElement(num1,val1));
    }
    public static int removeElement(int[] nums,int val)
    {
        int a=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]!=val)
            {
                nums[a]=nums[i];
                a++;
            }
        }

        return a;
    }
}
