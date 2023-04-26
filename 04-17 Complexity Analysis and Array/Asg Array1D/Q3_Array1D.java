public class Q3_Array1D {
    public static void main(String[] args) {
        int arr[] = {34, 21, 54, 65, 43};
        int temp = 0;
        for(int ar: arr) {
            if(ar>temp) temp =ar;
        }
        System.out.println(temp);
    }
}
