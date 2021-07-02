package NormalAlgorithm.jump;
//45.跳跃游戏II
public class Solution {
    //贪心算法，找下一跳可以跳的最远的那个位置
    //例如[3,4,1,1,1,1,1]，位置为0时，可以跳到[4,1,1],但是[4,1,1]这三个位置跳的最远的位置下标为[5,3,4]
    //所以选择跳到3那个位置
    public int jump(int[] nums) {
        int l=nums.length;
        //特例
        if(l==1){return 0;}
        int[] canjump=new int[l];
        //记录每个位置的下一跳最远的位置
        for (int i=0;i<l;i++){
            canjump[i]=nums[i]+i;
        }
        int ans=0;
        int idx=0;
        while (idx<l){
            ans++;
            //能跳到终点就返回
            if(canjump[idx]>=l-1){
                break;
            }
            int temp=idx;
            int find_max=0;
            for (int i=idx;i<=canjump[temp];i++){
                //取下一跳可以跳到最远的那个位置
                if (find_max<=canjump[i]){
                    find_max=canjump[i];
                    idx=i;
                }
            }
        }
        return ans;
    }
}
