public class Exp_devide_and_concure_on {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        else if(n%2==0){
            return power(x,n/2)*power(x,n/2);
        }
        else{
            return power(x, n/2)*power(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    
}
