public class Q4_Array1D {
    public static void main(String[] args) {
        int arr[] = {34, 21, 54, 65, 43};
        int largest=0;
        int secLargest=0;
        for(int ar: arr) {
            if(ar>secLargest) {
                secLargest =ar;
                if(ar>largest) {
                    secLargest = largest;
                    largest = ar;
                }

            }
            
        }
        System.out.println(secLargest);
    }
}
