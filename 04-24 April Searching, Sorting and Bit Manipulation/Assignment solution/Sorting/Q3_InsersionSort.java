import java.util.Scanner;

public class Q3_InsersionSort {

    private static void printArray(int[] arr) {
        for(int ar: arr) System.out.print(ar+ " ");
    }

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

    private static int[] insersionSortDesc(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j] > arr[j-1]){
                // swap between arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;       
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        printArray(insersionSortDesc(takeArrayInput()));
    } 
}
