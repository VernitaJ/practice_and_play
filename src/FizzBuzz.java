public class FizzBuzz {
    public static void main(String[] args) {
        int fizz = 3;
        int buzz = 5;
        String output = "";
        for (int i = 1; i < 101; i++){
            if (i%fizz == 0 && i%buzz == 0) output = "Fizzbuzz!";
            else if (i%buzz == 0) output = "Buzz!";
            else if (i%3 == 0) output = "Fizz!";
            else output = String.valueOf(i);
            System.out.println(output);
        }
    }
}
