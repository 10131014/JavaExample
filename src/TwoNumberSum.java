public class TwoNumberSum {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[]{1, 5, 10, 11};
        int target1=21;
        TwoNumberSum.twoSum(arr1,target1);
    }




        public static void twoSum(int[] nums,int target)
        {

            for (int i = 0; i <nums.length; i++) {
                for (int j = i+1; j <nums.length; j++) {
                    int c = nums[i] + nums[j];
                    if (c == target) {
                        System.out.println(i);
                        System.out.println(j);

                    }
                }
            }

        }

}
