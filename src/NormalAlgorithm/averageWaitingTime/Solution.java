package NormalAlgorithm.averageWaitingTime;
//20.12.26-2
public class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time=customers[0][0]+customers[0][1];
        double wait_time=customers[0][1];
        for (int i=1;i<customers.length;i++){
            if (time>=customers[i][0]) {
                time = time + customers[i][1];
                wait_time = wait_time + time - customers[i][0];
            }else {
                time=customers[i][0]+customers[i][1];
                wait_time=wait_time+customers[i][1];
            }
        }
        return wait_time/customers.length;
    }
}
