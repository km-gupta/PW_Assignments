import java.util.Scanner;

public class Ans4_SumOfValuesInArray {

    private static int numberOfElement(Scanner sc) {
        System.out.print("Enter Number of element in an Array: ");
        int num = sc.nextInt();
        if(num <= 0) {
            System.out.println("Enter a valid Number!");
            num = numberOfElement(sc);
        }
        return num;
    }

    private static int[] takeInputofAnArray() {
        Scanner sc = new Scanner(System.in);
        int num = numberOfElement(sc);
        int arr[] = new int[num];
        System.out.println("Enter Array Elements");
        for(int i=0; i<num; i++) arr[i] = sc.nextInt();
        return arr;
    }

    private static int sumOfValuesInArray(int[] arr, int idx) {
        //Base Condition
        if(idx == arr.length) return 0;
        //Recurssive call
        return arr[idx]+sumOfValuesInArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = takeInputofAnArray();
        int sum = sumOfValuesInArray(arr, 0);
        System.out.print("Sum of the digits of given array: "+sum);
    }

    
    
}
