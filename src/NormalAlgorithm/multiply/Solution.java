package NormalAlgorithm.multiply;

public class Solution {
    public String multiply(String num1, String num2) {
        char[] num1_char=num1.toCharArray();
        char[] num2_char=num2.toCharArray();
        StringBuilder ans=new StringBuilder();
        for (int i=num2_char.length-1;i>=0;i--){
            ans=add(ans,mul(num1_char,num2_char[i],num2_char.length-1-i));
        }
        while(ans.length()>1&&ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.toString();
    }
    public StringBuilder mul(char[] n1,char n2,int i){
        int c=0;
        StringBuilder res=new StringBuilder();
        for (int j=n1.length-1;j>=0;j--){
            res.append((char)(((n1[j]-'0')*(n2-'0')+c)%10+'0'));
            c=((n1[j]-'0')*(n2-'0')+c)/10;
        }
        if (c!=0){
            res.append((char)(c+'0'));
        }
        res.reverse();
        for (int k=0;k<i;k++){
            res.append('0');
        }
        return res;
    }
    public StringBuilder add(StringBuilder s1,StringBuilder s2){
        int l1=s1.length();
        int l2=s2.length();
        if (l1>l2){
            s2.reverse();
            for (int ii=0;ii<l1-l2;ii++){
                s2.append('0');
            }
            s2.reverse();
        }else if (l1<l2){
            s1.reverse();
            for (int ii=0;ii<l2-l1;ii++){
                s1.append('0');
            }
            s1.reverse();
        }
        StringBuilder res1=new StringBuilder();
        int c1=0;
        for (int i=s1.length()-1;i>=0;i--){
            res1.append((char)((s1.charAt(i)-'0'+s2.charAt(i)-'0'+c1)%10+'0'));
            c1=(s1.charAt(i)-'0'+s2.charAt(i)-'0'+c1)/10;
        }
        if (c1!=0){
            res1.append((char)(c1+'0'));
        }
        res1.reverse();
        return res1;
    }
}
