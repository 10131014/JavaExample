public class TestsearchInsert {
    public static void main(String[] args)
    {

        int[] a={1,2,3,5,6};
        int b=1;
        System.out.println(searchInsert(a,b));

    }
    public static int searchInsert(int[] nums, int target)
    {

        for (int i=0;i<nums.length;i++)
        {
            if (target==nums[i])
            {
                return i;
            }
        }
        int j=0;
        for (;j<nums.length;j++)
        {
            if (target<nums[j])
            {
                return j;
            }
        }
        return j;
    }
}
