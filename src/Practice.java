public class Practice {
    public static void main(String[] args) {
        ex7(5);
    }

    static int ex7(int n) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < n; i++)
            sum += 1;
        System.out.println(sum);
        if (n > 0)
            number += ex7(n-1);
        System.out.println(number);
        return sum;
    }
}
