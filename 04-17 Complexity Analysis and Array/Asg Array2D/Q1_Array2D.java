import java.util.Scanner;

public class Q1_Array2D{

    static int positiveNumbers(int[][] arr) {
        int count=0;
        for(int ar[]: arr) {
            for(int a: ar) {
                if (a>0) count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the m :");
        int m = sc.nextInt();
        System.out.println("Enter the n :");
        int n = sc.nextInt();

        int [][]arr = new int[m][n];

        System.out.println("Enter the m*n matrix :");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(positiveNumbers(arr));
        //System.out.println(negativeNumbers(arr));
        
    }

    
}