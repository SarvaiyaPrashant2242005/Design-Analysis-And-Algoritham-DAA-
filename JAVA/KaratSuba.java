
public class KaratSuba {

    public static int getSize(long num) {
        return num == 0 ? 1 : (int) Math.log10(num) + 1;
    }

    public static long karatsuba(long num1, long num2) {

        if (num1 < 10 || num2 < 10) {
            return num1 * num2;
        }

        int length = Math.max(getSize(num1), getSize(num2));
        int half = length / 2 + length % 2;

        long powerOf10 = (long) Math.pow(10, half);
        long powerOf102x = powerOf10 * powerOf10;

        long a = num1 / powerOf10;
        long b = num1 % powerOf10;
        long c = num2 / powerOf10;
        long d = num2 % powerOf10;

        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long ab_cd = karatsuba(a + b, c + d);

        long ans = ac * powerOf102x + (ab_cd - ac - bd) * powerOf10 + bd;

        return ans;
    }

    public static void main(String[] args) {
        long x = 587458745;
        long y = 857854785;
        long ans = karatsuba(x, y);
        System.out.println(ans); // Expected result is 838102050
    }
}