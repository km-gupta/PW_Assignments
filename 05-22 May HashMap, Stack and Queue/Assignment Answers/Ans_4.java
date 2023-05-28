import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ans_4 {
    
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Input the element in the array: ");
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer, Integer> major = new TreeMap<>();

        for(int i=0; i<n; i++) {
            major.put(arr[i], arr[i]);
        }
        for(Map.Entry<Integer,Integer> et: major.entrySet()) {
            max = et.getValue();
        }
        System.out.println(max);
    }
}
