package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Ans_1 {
    
    public static void main(String[] args) {
        
        Map<Integer, String> st = new TreeMap<Integer, String>();
        st.put(5, "Rahul");
        st.put(7, "Lakshman");
        st.put(1, "Ram");
        st.put(4, "Krrish");
        st.put(2, "Lakshay");

        System.out.println(st);
    }
}