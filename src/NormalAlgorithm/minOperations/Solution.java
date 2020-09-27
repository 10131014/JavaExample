package NormalAlgorithm.minOperations;

//5523. 文件夹操作日志收集器
public class Solution {
    public int minOperations(String[] logs) {
        int minstep = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].charAt(0) != '.') {
                minstep++;
            } else if (logs[i].charAt(0) == '.' && logs[i].charAt(1) == '.') {
                minstep--;
                if (minstep < 0) {
                    minstep = 0;
                }
            }
        }
        return minstep;
    }
}
