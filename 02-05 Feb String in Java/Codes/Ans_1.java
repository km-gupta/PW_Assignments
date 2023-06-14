class Ans_1 {
    public static void main(String[] args) {
        String st = "abcddbcda";
        System.out.println(duplicateFromString(st));
    }

    private static String duplicateFromString(String st) {
        StringBuilder str = new StringBuilder();
        boolean[] visited = new boolean[256];

        for(int i=0; i<st.length(); i++) {
            char ch =  st.charAt(i);
            if(!visited[ch]) {
                str.append(ch);
                visited[ch] = true;
            }
        }
        return str.toString();
    }
}