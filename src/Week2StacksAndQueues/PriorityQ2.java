package Week2StacksAndQueues;

import java.util.PriorityQueue;
import java.util.Stack;

class PriorityQ2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = empty();
        add(queue, 1);
        add(queue, 4);
        add(queue, 9);
        add(queue, 3);
        add(queue,7);
        System.out.println(queue);
        System.out.println("2nd smallest element is : " + findSecondSmallest(queue));
        System.out.println(queue);
        deleteSecondSmallest(queue);
        System.out.println(queue);
    }

    static PriorityQueue<Integer> empty(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        return queue;
    }

    static PriorityQueue<Integer> add(PriorityQueue<Integer> queue, int toAdd){
        queue.add(toAdd);
        return queue;
    }

    static int findSecondSmallest(PriorityQueue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        stack.add(queue.remove());
        stack.add(queue.remove());

        int found = stack.peek();
        add(queue, stack.pop());
        add(queue, stack.pop());

        return found;
    }

    static int deleteSecondSmallest(PriorityQueue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        stack.add(queue.remove());
        queue.remove();

        add(queue, stack.pop());

        return 0;
    }


}