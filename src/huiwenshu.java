public class huiwenshu {
    public static void main(String[] args)
    {
        int y=-121;

        System.out.println(huiwenshu.isPalindrome(y));

    }
    public static boolean isPalindrome(int x)
    {
        int pop;
        int a=0;
        int b=x;
        boolean res=false;
        while (x!=0) {
            pop = x %10;
            x=x/10;
            a = a * 10 + pop;
        }
        if (b==a)
        {
            res=true;
        }
        else if (b!=a)
        {
            res=false;
        }
        if (b<0)
        {
            res=false;

        }
        return res;
    }
}
