public class TestlongestCommonPrefix {
    public static void main(String[] args)
    {
        String[] strs1={"abcd","abce","abef"};
        System.out.println(test1(strs1));

    }
    public static String test1(String[] strs)
    {
        if (strs.length==0)
        {
            return "";
        }
        String ans=strs[0];
        for (int i=0;i<strs.length;i++)
        {
            int j=0;
            for (;j<ans.length()&&j<strs[i].length();j++)
            {
                if (ans.charAt(j)!=strs[i].charAt(j))
                {

                    break;
                }
            }
            ans=ans.substring(0,j);
        }
        return ans;
    }
}
