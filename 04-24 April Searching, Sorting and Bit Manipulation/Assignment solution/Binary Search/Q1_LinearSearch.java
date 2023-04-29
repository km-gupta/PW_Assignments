import java.util.Scanner;

public class Q1_LinearSearch{

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

    private static int elementInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched in Array: ");
        int x = sc.nextInt();
        return x;
    }

    private static int searchForElement(int[] arr, int x) {
        int result = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = searchForElement(takeInputOfArray(), elementInput());
        if(result == -1) System.out.println("Element not found in array");
        else System.out.println("Element present at the index of "+result);
    }

    

    
}