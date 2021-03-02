import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        start();
        DynamicArray array = DynamicArray.getInstance();
        array.arrayTesting();
        Guessing guessing = new Guessing();
        guessing.search();
    }

    public static void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Word to check?");
        String userInput = input.nextLine();
        System.out.println(isPalindrome(userInput));
        input.close();
    }

    public static boolean isPalindrome(String string){
        char ch[]=string.toCharArray();
        String newString="";
        for(int i=0;i<ch.length;i++){
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')){
                newString+=ch[i];
            }
        }
        StringBuilder sb=new StringBuilder(newString);
        sb.reverse();
        if (newString.equalsIgnoreCase(sb.toString())){
            return true;
        } else return false;
    }
}
