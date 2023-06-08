package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ans_3 {
    
    public static void main(String[] args) {
        String result = "No";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Input the element in the array: ");
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> dup = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(dup.containsKey(arr[i])) {
                dup.put(arr[i], dup.get(arr[i]) +1);
            } else {
                dup.put(arr[i], 1);
            }
        }

        for(int i=0; i<n; i++) {
            if(dup.get(arr[i]) > 1) {
                result = "Yes";
                break;
            }
        }
        
        System.out.println(result);
    }
}
