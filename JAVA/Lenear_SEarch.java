import java.util.*;
public class Lenear_SEarch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of the array : ");
    int n = sc.nextInt();
    int[] array = new int[n];

    System.out.println("Enter elements of an array : ");
    for(int i = 0;i<n;i++){
        array[i] = sc.nextInt();

    }
    System.out.print("Enter the number of elements you want to search in the array : ");
    int key = sc.nextInt();
    boolean Isfound = false;
    for(int i=0;i<n;i++){
        if(array[i]==key){
            System.out.println("Element found at index number " + i);
            Isfound = true;
        }
        
    }   
    if(!Isfound){
        System.out.println("Element not found");
    }
}
}