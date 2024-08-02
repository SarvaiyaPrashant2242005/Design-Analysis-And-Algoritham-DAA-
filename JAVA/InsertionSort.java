import java.util.*;

public class InsertionSort {

    public static void InsertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args){
        System.out.print("Enter Array elements: ");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }
        InsertionSort(array);
    }
}
