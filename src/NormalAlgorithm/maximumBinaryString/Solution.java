package NormalAlgorithm.maximumBinaryString;
//20.12.26-3
class Solution {
    public String maximumBinaryString(String binary) {
        if(binary.length()<2){
            return binary;
        }
        char[] s=binary.toCharArray();
        int one_index=-1;
        for (int i=0;i<s.length;i++){
            if (s[i]=='1'){
                one_index=i;
            }else {
                break;
            }
        }
        int count=0;
        for (int j=s.length-1;j>one_index;j--){
            if (s[j]=='1'){
                count++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for (int k=0;k<=one_index;k++){
            ans=ans.append('1');
        }
        for (int i=0;i<s.length-one_index-count-2;i++){
            ans=ans.append('1');
        }
        if (count!=0) {
            ans.append('0');
        }
        for (int i=0;i<count;i++){
            ans=ans.append('1');
        }
        if(one_index==-1&&count==0){
            ans=ans.append("0");
        }
        return ans.toString();
    }
}
