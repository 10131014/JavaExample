package NormalAlgorithm.calculate;
//LCP 17. 速算机器人
public class Solution {
    public int calculate(String s) {
        int x=1;
        int y=0;
        char[] s1=s.toCharArray();
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='A'){
                x=2*x+y;
            }else{
                y=2*y+x;
            }
        }
        return x+y;
    }
}
