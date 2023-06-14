import java.util.Scanner;

public class Ans_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String st = sc.nextLine();
        boolean flag = checkPalindrome(st);
        if (flag) {
            System.out.println("Is Palindrom");
        } else {
            System.out.println("Is not palindrome");
        }
    }

    private static boolean checkPalindrome(String st) {
        for(int i=0; i<st.length()/2; i++) {
            if(st.charAt(i) != st.charAt(st.length()-i-1)) {
               return false;
            }
        }
        return true;
    }


}
