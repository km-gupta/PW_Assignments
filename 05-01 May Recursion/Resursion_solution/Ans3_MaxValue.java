import java.util.Scanner;

public class Ans3_MaxValue {

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

    private static int findMaxValue(int[] arr, int maxIdx, int curentIdx) {
        //Base Condition
        if(curentIdx >= arr.length) return maxIdx;

        //Recursive Call
        if(arr[maxIdx] < arr[curentIdx]) maxIdx = findMaxValue(arr, curentIdx, curentIdx+1);
        else maxIdx = findMaxValue(arr, maxIdx, curentIdx+1);
        return maxIdx;
    }    
    
    public static void main(String[] args) {
        int arr[] =takeInputofAnArray();
        int idx = findMaxValue(arr, 0, 1);
        System.out.print("Max Value of the given Array: "+arr[idx]);
    }

    
}
