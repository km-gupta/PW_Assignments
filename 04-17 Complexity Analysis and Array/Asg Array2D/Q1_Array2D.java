import java.util.Scanner;

public class Q1_Array2D{

    private static int positiveNumbers(int[][] arr) {
        int count=0;
        for(int ar[]: arr) {
            for(int a: ar) {
                if (a>0) count++;
            }
        }
        return count;
    }

    
    private static int negativeNumbers(int[][] arr) {
        int count=0;
        for(int ar[]: arr) {
            for(int a: ar) {
                if (a<0) count++;
            }
        }
        return count;
    }


    private static int evenNumbers(int[][] arr) {
        int count=0;
        for(int ar[]: arr) {
            for(int a: ar) {
                if (a%2 == 0) count++;
            }
        }
        return count;
    }


    private static int zeroNumbers(int[][] arr) {
        int count=0;
        for(int ar[]: arr) {
            for(int a: ar) {
                if (a == 0) count++;
            }
        }
        return count;
    }


    private static int oddNumbers(int[][] arr) {
        int count=0;
        for(int ar[]: arr) {
            for(int a: ar) {
                if (a%2 != 0) count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the m :");
        int m = scan.nextInt();
        System.out.println("Enter the n :");
        int n = scan.nextInt();

        int [][]arr = new int[m][n];

        System.out.println("Enter the m*n matrix :");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Number of positive numbers :"+positiveNumbers(arr));
        System.out.println("Number of negative numbers :"+negativeNumbers(arr));
        System.out.println("Number of odd numbers :"+oddNumbers(arr));
        System.out.println("Number of even numbers :"+evenNumbers(arr));
        System.out.println("Number of zero numbers :"+zeroNumbers(arr));

        
    }
    

    

    
}