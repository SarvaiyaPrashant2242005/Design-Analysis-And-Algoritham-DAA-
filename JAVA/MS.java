public class MS {
    public static void mergeSort(int[] array, int left,int right){
        if(array.length == 1){
            return;
        }

        int mid = left + (right - left)/2;
        mergeSort(array, left, mid);
        mergeSort(array , mid+1, right);
        merge(array, left, mid, right);

    }
    public static void merge(int[] array, int left, int mid, int right){
            int i,j,k=0;
            
    }
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2};
        mergeSort(array,0,4);
    }
}
