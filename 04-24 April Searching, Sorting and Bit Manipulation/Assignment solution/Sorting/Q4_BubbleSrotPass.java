import java.util.Scanner;

public class Q4_BubbleSrotPass {
    
    private static int bubbleSortDescPass(int []arr) {
        int pass =0;
        for(int i=0; i<arr.length; i++) {
            boolean swapped = false;
            for (int j=0; j<arr.length-1-i; j++) {
                if(arr[j] < arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    pass++;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return pass;
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


    public static void main(String[] args) {
        System.out.println("Number of pass required "+bubbleSortDescPass(takeArrayInput()));  
    }
}
