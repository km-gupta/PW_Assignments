import java.util.Scanner;

public class Q3_OddOrEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num == (num >> 1) << 1) {
            System.out.println("Number is even");
        }
        else System.out.println("Number is odd");
    }
}
