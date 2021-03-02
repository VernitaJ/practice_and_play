package Week2StacksAndQueues;

import java.util.Arrays;

public class TheQueue {

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    TheQueue(int size){
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input){
        if(numberOfItems + 1 <= queueSize){
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT - " + input + " was added");
        } else {
            System.out.println("Sorry queue is full");
        }
    }

    public void priorityInsert(String input){
        int i;
        if (numberOfItems == 0){
            insert(input);
        } else {
            for (i = numberOfItems-1 ; i >= 0; i--){
                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
                    queueArray[i+1] = queueArray[i];
                } else break;
            }
            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public void remove(){
        if(numberOfItems > 0){
            System.out.println("REMOVE " + queueArray[front] + " was removed");
            queueArray[front] = "-1";
            front++;
            numberOfItems++;
        } else{
            System.out.println("Sorry, the queue is empty");
        }
    }

    public void peek(){
        System.out.println("The first element is " + queueArray[front]);
    }

    public static void main(String[] args) {
        TheQueue theQueue = new TheQueue(10);
        theQueue.priorityInsert("10");
        theQueue.priorityInsert("9");
        theQueue.priorityInsert("7");
        theQueue.peek();
        theQueue.remove();
        theQueue.priorityInsert("14");
        theQueue.peek();
    }
}
