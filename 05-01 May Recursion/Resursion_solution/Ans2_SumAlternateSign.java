import java.util.Scanner;

public class Ans2_SumAlternateSign {

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

    private static int sumAlternateSign(int num, int sum) {
        //Base Case
        if(num <= 1) {
            return sum+1;
        }
        //Recurrsive call
        if(num%2 != 0) {
            sum = sumAlternateSign(num-1, sum) + num;
        } else {
            sum = sumAlternateSign(num-1, sum) - num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int sum = sumAlternateSign(takeInputOfANumber(), 0);
        System.out.print("Sum of the Natural Number with Alternative Sign: "+sum);
    }
}
