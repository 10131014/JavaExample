package NormalAlgorithm.MinStack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MinStack {
    private PriorityQueue queue;
    private Deque stack;
    public MinStack() {
        queue=new PriorityQueue();
        stack=new LinkedList();
    }

    public void push(int x) {
        stack.offerLast(x);
        queue.add(x);
    }

    public void pop() {
        queue.remove(stack.pollLast());
    }

    public int top() {
        return (int)stack.peekLast();
    }

    public int getMin() {
        return (int) queue.peek();
    }
}
