import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Guessing {
    Scanner input = new Scanner(System.in);
    int low = 0;
    int high = 10000;
    int guess = (high-low)/2;
    int[] arr = arrayBuilder();

    public boolean search(){
        return search(arr, arr[0], arr[arr.length-1]);
    }

    public boolean search(int[] a, int number, int one){
        int lo =  number;
        int hi = one;
        int middle = (lo+hi)/2;
        int reply = getInt("Is your number " + a[middle] + "?" + "\n" + "1. Yes!!" + "\n" + "2. Lower" + "\n" + "3. Higher");
        if (lo > hi) {
            return false;
        }
        if (reply == 2) {
            return  search(a,lo,middle-1);
        }
        if (reply == 3) {
            return  search(a, middle+1, hi);
        }
        if (reply == 1) {
            System.out.println("Yay!");
            return true;
        }
        return false;
    }

    public int getInt(String str) {
        int userInput = 0;
        boolean complianceCheck = false;
        while (!complianceCheck) {
            System.out.println(str);
            try {
                userInput = input.nextInt();
                complianceCheck = true;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input provided. Please type a number.");
            }
            input.nextLine();
        }
        return userInput;
    }

    public int[] arrayBuilder(){
        int arr[] = new int[10000];
        for (int i = 0; i < 10000; i++){
            arr[i] = i;
        }
        return arr;
    }

    private int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void binarySearchHigher(int arr[], int guess){
        low = guess;
    }


    public void binarySearchLower(int arr[], int guess){
        high = guess;
    }
}
