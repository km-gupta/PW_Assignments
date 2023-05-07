import java.util.Scanner;

public class Ans1_SumOfDigits{

    private static int takeInputOfANumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num > 0) return num;
        else {
            System.out.println("Your number is not valid! \nPlease Re-Enter");
            num = takeInputOfANumber();
        }
        return num;
    }

    private static int sumOfDigits(int n) {
        //Base Case
        if(n == 0) return 0;
        else return (n%10) + sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        int n = takeInputOfANumber();
        System.out.print("Sum of the digits of a given number: "+ sumOfDigits(n)); 
    }

    
}