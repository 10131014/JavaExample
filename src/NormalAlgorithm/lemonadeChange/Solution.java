package NormalAlgorithm.lemonadeChange;
//860. 柠檬水找零
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        //用来统计当前有多少张5元，10元的钞票，以便找零
        int[] change_count=new int[2];
        for(int i=0;i<bills.length;i++){
            //不用找零
            if(bills[i]==5){
                //5元钞票数量+1
                change_count[0]++;
                //收到10元需要找5元
            }else if(bills[i]==10){
                //没有5元钞票，返回false
                if(change_count[0]==0){
                    return false;
                }else{
                    //5元钞票-1,10元钞票+1
                    change_count[0]--;
                    change_count[1]++;
                }
                //收到20元，找零15元
            }else{
                //没有10元钞票,看有没有三张5元的
                if(change_count[1]==0){
                    if(change_count[0]<3){
                        return false;
                    }else{
                        change_count[0]-=3;
                    }
                    //有10元钞票，看有没有一张5元的
                }else{
                    if(change_count[0]==0){
                        return false;
                    }else{
                        change_count[0]--;
                        change_count[1]--;
                    }
                }
            }
        }
        return true;
    }
}
