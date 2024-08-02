import java.util.Scanner;

public class MergeSort {
    public static void MergeSort(int[] array, int si, int ei) {
        if (si >= ei) {
            return;  // base case for recursion
        }

        int mid = si + (ei - si) / 2;
        MergeSort(array, si, mid);
        MergeSort(array, mid + 1, ei);
        merge(array, si, mid, ei);
    }

    public static void merge(int[] array, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left half, if any
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // Copy remaining elements of right half, if any
        while (j <= ei) {
            temp[k++] = array[j++];
        }

        // Copy sorted elements back to the original array
        for (k = 0; k < temp.length; k++) {
            array[si + k] = temp[k];
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

        MergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
