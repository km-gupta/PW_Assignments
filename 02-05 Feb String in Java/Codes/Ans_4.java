import java.util.Scanner;

public class Ans_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String st = sc.nextLine();
        count(st);

    }

    private static void count(String st) {
        int consonentCount = 0;
        int vowelsCount =0;
        int specialCharCount = 0;

        for(int i=0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if(ch >=33 && ch <= 47 || ch >=58 && ch <= 64 || ch >=91 && ch <= 96 || ch >=123 && ch <= 126) {
                specialCharCount++;
            } else if(((ch >=65 && ch <= 90) || (ch >=97 && ch <= 122)) &&  ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) ) {
                vowelsCount++;
            } else {
                if ((ch >=65 && ch <= 90) || (ch >=97 && ch <= 122)) {
                    consonentCount++;
                }
            }
        }
        System.out.println("Given string have "+consonentCount+" consonants "+vowelsCount+" vowels "+specialCharCount+" special characters.");
    }
}
