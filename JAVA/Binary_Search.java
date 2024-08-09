import java.util.Scanner;

public class Binary_Search {
    public static int Binary_Search(int[] arr, int l, int r, int key) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                // Search in the left half
                return Binary_Search(arr, l, mid - 1, key);
            } else {
                // Search in the right half
                return Binary_Search(arr, mid + 1, r, key);
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter elements of the array (sorted order): ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        int result = Binary_Search(array, 0, n - 1, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
