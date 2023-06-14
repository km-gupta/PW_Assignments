public class Ans_7 {
    public static void main(String[] args) {
        String input = "Hello";

        boolean hasUniqueCharacters = checkUniqueCharacters(input);

        if (hasUniqueCharacters) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }

    private static boolean checkUniqueCharacters(String input) {
        boolean[] visited = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (visited[ch]) {
                return false;
            }
            visited[ch] = true;
        }

        return true;
    }
}
