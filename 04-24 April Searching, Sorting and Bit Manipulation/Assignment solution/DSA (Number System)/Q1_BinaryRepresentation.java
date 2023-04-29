import java.util.Scanner;

public class Q1_BinaryRepresentation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int binary = 0;
        int temp = 1;
        
        while(num>0) {
            binary += temp*(num%2);
            temp *=10;
            num /= 2;

        }
        System.out.println(binary);
    }
}