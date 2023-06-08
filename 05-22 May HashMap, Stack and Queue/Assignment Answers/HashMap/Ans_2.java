package HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ans_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element of Key-Value pairs");

        int n = sc.nextInt();
        
        Map<String, Integer> st = new TreeMap<>();
        
        System.out.println("Enter the elements of key value");

        for(int i=0; i<n; i++) {
            int key = sc.nextInt();
            String value = sc.nextLine();
            st.put(value, key);
        }

        System.out.println("The value of Map: "+ st);
    }
}
