package NormalAlgorithm.countStudents;

import java.util.ArrayList;
import java.util.List;

//20.12.26-1
public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> list=new ArrayList<>();
        int[] count=new int[2];
        for (int i=0;i<students.length;i++){
            count[students[i]]++;
            list.add(students[i]);
        }
        int p=0;
        int index=0;
        while (p<sandwiches.length&&count[sandwiches[p]]>0){
            if (list.get(index)==sandwiches[p]){
                list.remove(index);
                count[sandwiches[p]]--;
                p++;
            }else {
                list.add(list.get(index));
                list.remove(index);
            }
        }
        return list.size();
    }
}
