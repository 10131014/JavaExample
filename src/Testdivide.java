public class Testdivide {
    public static void main(String[] args)
    {
        int x=130;
        int y=-3;
        System.out.print(Testdivide.divide(x,y));

    }
    public static int divide(int dividend,int dividsor)
    {
        int ans=1;
        if (Math.abs(dividend)<Math.abs(dividsor))
        {
            ans=0;
        }
        else
        {
            int yushu=Math.abs(dividend)-Math.abs(dividsor);
            while (yushu>=Math.abs(dividsor))
            {
                ans=ans+1;
                yushu=yushu-Math.abs(dividsor);

            }
        }
        if ((dividend>0&&dividsor>0)||(dividend<0&&dividsor<0))
        {
            ans=ans;
        }
        else
        {
            ans=-ans;
        }
        return ans;


    }
}
