import java.util.Scanner;

public class Q5_Array2D {
    private static int[][] takeInputOfAMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimention of a square matrix :");
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        System.out.println("Enter element of square matrix :");
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++) 
                arr[i][j] = sc.nextInt();
        
        return arr;        

    }


    private static void printMidRowCol(int[][] arr) {
        int mid = arr[0].length/2;
        for(int i=0; i<arr.length; i++ ) {
            System.out.print(arr[i][mid]+" ");
        }
        for(int i=0; i<arr.length; i++ ) {
            if (mid == i) continue;
            System.out.print(arr[mid][i]+" ");
        }

    }

    public static void main(String[] args) {
        printMidRowCol(takeInputOfAMatrix());
        
    }



    
}
