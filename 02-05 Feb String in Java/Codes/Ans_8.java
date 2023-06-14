public class Ans_8 {
    public static void main(String[] args) {
        String input = "Hello, World!";

        char maxOccurringChar = findMaxOccurringCharacter(input);

        System.out.println("Maximum occurring character: " + maxOccurringChar);
    }

    private static char findMaxOccurringCharacter(String input) {
        int[] count = new int[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch]++;
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (count[i] > maxCount) {
                maxChar = (char) i;
                maxCount = count[i];
            }
        }

        return maxChar;
    }
}
