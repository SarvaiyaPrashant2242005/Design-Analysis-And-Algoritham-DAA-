
import java.util.Scanner;


public class Zerooneknapsack{
    public static int knapsack(int[] weight,int values[],int W){
        int n = weight.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(i==0 || w==0)
                     dp[i][w]=0;
                else if(weight[i-1]<=w)
                        dp[i][w]=Math.max(values[i-1]+dp[i-1][w-weight[i-1]],dp[i-1][w]);
                else
                     dp[i][w]=dp[i-1][w];
                }
                }
                return dp[n][W];
    }
    public static void main(String[] args) {
        int[] weight = new int[5];
        int[] values = new int[5];
        int W = 5;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter weight of 5 products");
        for(int i=0;i<5;i++)
        {

            weight[i]=sc.nextInt();
           
            }
            System.out.print("enter values of 5 products");
            for(int i=0;i<5;i++)
        {
            values[i]=sc.nextInt();}
            System.out.println("Maximum profit from given values is " + knapsack(weight,values,W));
    }
}