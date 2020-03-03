package NormalAlgorithm.constructRectangle;

public class Solution {
    public int[] constructRectangle(int area) {
        double max=Math.floor(Math.sqrt(area));
        int[] ans=new int[2];
        int L=0;
        int W;
        for (W=(int)max;W>0;W--)
        {
            if (area%W==0)
            {
                L=area/W;
                break;
            }
        }
        ans[0]=L;
        ans[1]=W;
        return ans;
    }
}
