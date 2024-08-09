public class Exp_dnc {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = power(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(5, 2));
    }
}
