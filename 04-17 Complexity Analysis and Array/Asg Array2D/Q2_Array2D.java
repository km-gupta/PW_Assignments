import java.util.Scanner;

public class Q2_Array2D {
    private static int[][] takeInputOfAMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimention of a square matrix :");
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        System.out.println("Enter element of square matrix :");
        for(int i=0; i<arr[0].length; i++)
            for(int j=0; j<arr.length; j++) 
                arr[i][j] = sc.nextInt();
        
        return arr;        

    }

    private static void printUpperDiagonal(int arr[][]) {
        for(int i=0; i<arr[0].length-1; i++)
            for(int j=0; j<arr.length-1-i; j++)
                System.out.print(arr[i][j]+" ");
    }


    public static void main(String[] args) {
        printUpperDiagonal(takeInputOfAMatrix());
    }


    

    
}
