import java.util.Scanner;
import static java.lang.Math.max;
public class DTdizengzixulie {
    public static void main(String[] args)
    {
        System.out.println("输入序列的长度");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("输入序列");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("输入的序列为：");
        for (int i=0;i<n;i++)
        {

            System.out.print(arr[i]+" ");
        }
    }
    private static int solu(int[] arr)
        {
            int dp[]=new int[arr.length];
            return 0;

        }

}
