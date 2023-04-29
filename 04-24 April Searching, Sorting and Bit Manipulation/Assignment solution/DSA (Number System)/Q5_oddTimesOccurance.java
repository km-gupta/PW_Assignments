
public class Q5_oddTimesOccurance {
    
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        
        for(int i=0; i<arr.length; i++) {
            int count = 1;
            if(arr[i] > -1) {
                for(int j =i+1; j<arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
                if (count%2 != 0) {
                    System.out.println("The odd occuring elemnet is "+arr[i]);
                    break;
                }
            } else continue;
        }
    }
}
