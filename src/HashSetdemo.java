
import java.util.HashSet;
import java.util.Random;

public class HashSetdemo {

        public static void main(String[] args) {
// TODO Auto-generated method stub

String[] str = new String[100];
HashSet<String> hs = new HashSet<>();
HashSet<String> hs1 = new HashSet<>();
for(String s:str){
s = getRandomString(2);
System.out.print(s+" ");
if(!hs.add(s)){
hs1.add(s);
}
}
System.out.println("\n"+"重复的字符串有 "+hs1.size()+"种");
System.out.println("他们分别是： ");
for(String s:hs1){
System.out.print(" "+s);
}

}
public static String getRandomString(int length){
String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
Random random=new Random();
StringBuffer sb=new StringBuffer();
for(int i=0;i<length;i++){
int number=random.nextInt(62);
sb.append(str.charAt(number));
}
return sb.toString();
}
}