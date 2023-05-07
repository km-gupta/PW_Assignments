import java.util.Scanner;

public class Ans5_ArmstrongNumber {
    
    private static int takeInputOfANumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num < 1) {
            System.out.println("Your number is not valid! \nPlease Re-Enter");
            return takeInputOfANumber();
        }
        return num;
    }

    private static int numberOfDigits(int num) {
        //Base Case
        if(num < 1) return 0;
        //Recurssive call
        return 1+numberOfDigits(num/10);
    }

    private static int powerOf(int num, int digit) {
        if(digit <= 0) return 1;
        return num*powerOf(num, --digit);
    }

    private static int numberIsArmstrong(int num, int digit) {
        //Base Case
        if(num == 0) return 0;

        //Recurssive Call
        return powerOf(num%10, digit) + numberIsArmstrong(num/10, digit);
    }

    public static void main(String[] args) {
        int num = takeInputOfANumber();
        int n = numberIsArmstrong(num, numberOfDigits(num));
        if(num == n) System.out.println("Given Number is Armstrong Number");
        else System.out.println("Given Number is not a Armstrong Number");
    }

    

    
}
