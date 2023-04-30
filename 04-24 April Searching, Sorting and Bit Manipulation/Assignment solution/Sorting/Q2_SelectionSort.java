import java.util.Scanner;

public class Q2_SelectionSort {

    
    private static int[] takeArrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int num = sc.nextInt();
        int []arr = new int[num];

        System.out.println("Enter array elements");
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for(int ar: arr) System.out.print(ar+ " ");
    }

    private static int[] selectionSortDesc(int[] arr) {

        for(int i=0; i<arr.length; i++){
            int max_idx = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[max_idx]){
                    max_idx = j;
                }
            }
            if(max_idx != i){
                // swap is required
                int temp = arr[max_idx];
                arr[max_idx] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        printArray(selectionSortDesc(takeArrayInput()));
    }
}
