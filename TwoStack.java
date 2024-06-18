import java.util.*;
import java.util.Stack;

import static sun.util.locale.LocaleUtils.isEmpty;

public class TwoStack {
    public  static void main(String[] args) {
        QueueWithTwoStacks q = new QueueWithTwoStacks();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.peek());

    }
    static class QueueWithTwoStacks {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public QueueWithTwoStacks() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }
        public void enqueue(int item){
            stack1.push(item);
        }
        public int dequeue(){
            if(isEmpty())
                throw new IllegalStateException("queue is empty");
            if(stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();



        }
        public int peek(){
            if (isEmpty())
                throw new IllegalStateException("Queue is empty");

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }
        boolean isEmpty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }
        public int size(){
           return stack1.size() + stack2.size();
        }


    }
}
