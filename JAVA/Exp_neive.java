import java.util.*;
public class Exp_neive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        System.out.println("Enter base : " );
        int x = sc.nextInt();
        System.out.println("Enter exponential : " );
        int n = sc.nextInt();
        for(int i= 0;i<n;i++){
            mul = mul * x;
        }
        System.err.println(mul);
    }
}
