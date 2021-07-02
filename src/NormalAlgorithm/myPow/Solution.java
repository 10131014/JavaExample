package NormalAlgorithm.myPow;
//50. Pow(x,n)
//二分算法
public class Solution {
    public double myPow(double x, int n) {
        long times=(long) n;
        times=Math.abs(times);
        double ans=1;
        while (times>0){
            double temp=x;
            long do_times=2;
            while (times>=do_times){
                temp=temp*temp;
                do_times=2*do_times;
            }
            ans=ans*temp;
            times=times-do_times/2;
        }
        if (n>0) {
            return ans;
        }else {
            return 1/ans;
        }
    }
}
