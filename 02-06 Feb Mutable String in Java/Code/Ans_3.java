
public class Ans_3 {
    public static void main(String[] args) {
        String st = "Think Twice";
        String[] nst = st.split(" ");
        StringBuilder str = new StringBuilder();

        for(String word : nst) {
            StringBuilder revWord = new StringBuilder(word);
            revWord.reverse();
            str.append(revWord).append(" ");
        }
        str.trimToSize();
    
        System.out.println(str);
    }
}
