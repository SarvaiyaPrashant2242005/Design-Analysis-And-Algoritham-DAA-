import java.util.*;
public class BubbleSort {
    public static void BubbleSort(int[] array){
        for(int i=0; i<array.length-1;i++){
            for(int j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    }
                }
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Length of an array : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        BubbleSort(a);
    }
}
