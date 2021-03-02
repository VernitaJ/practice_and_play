package Week2StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class PolishReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (sc.hasNext()) {
            String token = sc.next();
            if ("bye".equals(token)) {
                break;
            } else if (".".equals(token)) {
                System.out.println(stack.pop());
            } else if ("+".equals(token)) {
                stack.push(stack.pop() + stack.pop());
            } else if ("-".equals(token)) {
                stack.push(stack.pop() - stack.pop());
            } else if ("*".equals(token)) {
                stack.push(stack.pop() * stack.pop());
            } else {
                try {
                    stack.push(Integer.parseInt(token));
                } catch (Exception e) {
                    stack.clear();
                    e.printStackTrace();
                }
            }
        }
        sc.close();
    }
}
