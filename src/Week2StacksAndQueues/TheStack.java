package Week2StacksAndQueues;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    TheStack(int size){
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }


    public void push(String input){
        if(topOfStack +1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("sorry, it's full");
        System.out.println("PUSH " + input + " was added to the stack.");
    }

    public String pop() {
        if(topOfStack >=0){
            System.out.println("POP" + stackArray[topOfStack] + " was removed from stack.");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        } else {
            System.out.println("Sorry, stack is empty");
            return "-1";
        }
    }

    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");
        for(int i = 0; i < tempString.length; i++){
            push(tempString[i]);
        }
    }

    public void popAll(){
        for (int i = topOfStack; i >= 0; i--){
            pop();
        }
    }

    public String peek(){
        System.out.println("PEEK " + stackArray[topOfStack] + " is at the top");
        return  stackArray[topOfStack];
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(10);
        theStack.push("it");
        theStack.push("was");
        theStack.peek();
        theStack.pop();
        theStack.push("the");
        theStack.push("best");
        theStack.peek();
        theStack.pop();
        theStack.push("of");
        theStack.push("times");
        theStack.pop();
        theStack.pop();
        theStack.push("it");
        theStack.push("was");
        theStack.pop();
        theStack.push("the");
        theStack.pop();
    }
}
