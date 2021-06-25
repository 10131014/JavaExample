package NormalAlgorithm.CQueue;
//2个栈实现队列
import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }
    public int deleteHead() {
        if (stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
