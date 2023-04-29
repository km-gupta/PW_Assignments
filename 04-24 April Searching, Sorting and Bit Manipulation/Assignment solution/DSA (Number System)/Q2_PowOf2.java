import java.util.Scanner;

public class Q2_PowOf2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("Given number is the power of 2");
        else System.out.println("Given number is not the power of 2");      
    }
    
}
