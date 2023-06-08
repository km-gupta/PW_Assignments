public class ans3 {
    static void segregatePositiveNegative(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
    
        while (mid <= high) {
            if (arr[mid] < 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > 0) {
                mid++;
            } else { // arr[mid] == 0
                mid++;
            }
        }
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {19, -20, 7, -4, -13, 11, -5, 3};
        segregatePositiveNegative(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int ar: arr) {
            System.out.println(ar);
        }
    }
}
