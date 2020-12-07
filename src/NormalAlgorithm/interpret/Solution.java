package NormalAlgorithm.interpret;
//1678. 设计Goal解析器
public class Solution {
    public String interpret(String command) {
        char[] command2=command.toCharArray();
        StringBuilder ans=new StringBuilder();
        int p=0;
        while(p<command2.length-1){
            if(command2[p]=='G'){
                ans=ans.append("G");
                p+=1;
            }else if(command2[p+1]==')'){
                ans=ans.append("o");
                p+=2;
            }else{
                ans=ans.append("al");
                p+=4;
            }
        }
        if(p==command2.length-1&&command2[p]=='G'){
            ans=ans.append("G");
        }
        return ans.toString();
    }
}
