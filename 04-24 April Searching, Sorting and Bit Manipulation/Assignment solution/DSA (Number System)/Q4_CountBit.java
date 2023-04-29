import java.util.Scanner;

public class Q4_CountBit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int countBit = 0;

        while(num>0) {
            num >>=  1;
            countBit++;
        }
        System.out.println("Number of bits present in an number "+countBit);
    }
}
