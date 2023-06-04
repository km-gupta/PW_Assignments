public class ans2 {
    static void segregatePositiveNegative(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int i = 0;
    
        while (i <= right) {
            if (arr[i] < 0) {
                swap(arr, i, left);
                left++;
                i++;
            } else if (arr[i] > 0) {
                swap(arr, i, right);
                right--;
            } else {
                i++;
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
