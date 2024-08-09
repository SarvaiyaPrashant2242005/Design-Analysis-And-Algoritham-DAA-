import java.util.Scanner;

public class QuickSort {
    public static int partition(int left, int right,int[] arr){
        int pivot = arr[right];
        int high = right;
        while(true){
            while(left<right && arr[left]<pivot){
                left++;
            }
            while(left<right && arr[right]>pivot){
                right--;
            }
            if(left >= right){
                break;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return left;
    }
    public static void QuickSort(int arr[], int low,int high){
        if(low < high){
            int pivot = partition(low, high, arr);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);
        }
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
    
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        QuickSort(array, 0, array.length - 1);

        System.out.println("Quick Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
