import java.util.Scanner;

public class Q3_Array2D {
    private static int[][] takeInputOfAMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimention of a square matrix :");
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        System.out.println("Enter element of square matrix :");
        for(int i=0; i<arr.length; i++) for(int j=0; j<arr[0].length; j++) arr[i][j] = sc.nextInt();
        return arr;        
    }

    private static void printBothDiagonal(int arr[][]) {
        System.out.print("Both diagonal elements are: ");
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                if(i == j || j == arr[i].length-1-i) {
                    System.out.print(arr[i][j]+"  ");
                }
            }
                
        }
    }


    public static void main(String[] args) {
        printBothDiagonal(takeInputOfAMatrix());
    }
}
