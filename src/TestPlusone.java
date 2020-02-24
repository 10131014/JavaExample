public class TestPlusone {
    public static void main(String[] args)
    {
        int[] ceshi={9,9};
        System.out.print(TestPlusone.Plusone(ceshi));

    }
    public static int[] Plusone(int[] digits)
    {
        int[] digits2=new int[digits.length];
        int[] yichu=new int[digits.length+1];
        int[] ans=new int[digits.length+1];
        for(int m=0;m<digits.length;m++)
        {
            digits2[m]=digits[m];
        }


        int flag=0;
        if (digits[digits.length-1]<9)
        {

            digits[digits.length-1]=digits[digits.length-1]+1;
            ans=digits;
        }
        else if(digits[digits.length-1]==9&&digits.length==1)
        {

            ans[digits.length]=0;
            ans[digits.length-1]=1;
        }
        else
        {

            for (int i=digits2.length-1;i>=0;i--)
            {

                if (digits2[i]>=9&&i>0)
                {
                    digits[i]=0;
                    digits[i-1]=digits[i-1]+1;
                }
                else if(digits2[i]==9&&i==0)
                {
                    digits[i]=0;
                    yichu[0]=1;
                    for(int j=0;j<digits.length;j++)
                    {
                        yichu[j+1]=digits[j];
                    }
                    flag=1;
                }
                else
                {
                    break;
                }
            }
            if(flag==1)
            {

                ans=yichu;
            }
            else if(flag==0)
            {

                ans=digits;
            }
        }
        return ans;
    }
}
