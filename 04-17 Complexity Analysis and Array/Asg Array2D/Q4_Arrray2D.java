import java.util.Scanner;

public class Q4_Arrray2D {
    private static int[][] takeInputOfAMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimentions of a matrix");
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        System.out.println("Enter element of square matrix :");
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++) 
                arr[i][j] = sc.nextInt();
        
        return arr;        

    }

    private static void findLargestElement(int[][] arr) {
        int larg = 0; 
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(larg < arr[i][j]) larg = arr[i][j];
            }
        }
        System.out.print("Largest element of 2D array :"+larg);

    }

    public static void main(String[] args) {
        findLargestElement(takeInputOfAMatrix());
    }

    
}
