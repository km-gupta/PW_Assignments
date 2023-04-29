import java.util.Scanner;

public class Q3_count1s {
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

    private static int countOnes(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOnes(takeInputOfArray())); 
    }

    
    
}
