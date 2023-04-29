import java.util.Scanner;

public class Q4_NumberOfElement {

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

    private static int targetNumbers(int[] arr, int target) {
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) count++;
        }

        return count;

    }
    
    public static void main(String[] args) {
        int []arr = takeInputOfArray();
        int target = targetInput();
        int count = targetNumbers(arr,target);
        System.out.println("Target "+target+" occurs "+count+" times");
    }

    
}
