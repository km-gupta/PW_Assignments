import java.util.Scanner;

public class Q2_Target {
    private static int[] takeInputOfArray() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    private static int targetInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target to be searched in Array: ");
        int x = sc.nextInt();
        return x;
    }

    private static int searchForTarget(int[] arr, int x) {
        int result = -1;
        for(int i=arr.length-1; i>-1; i--) {
            if(arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int result = searchForTarget(takeInputOfArray(), targetInput());
        if(result == -1) System.out.println("Target not found in an array");
        else System.out.println("Last occurance of the target at the index of "+result);
    }
}
