public class ans4 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 1};
        int b[] = {3, 3, 3, 4};
        int k = 6;

        boolean value = permutArrays(a, b, k);
        if(value) {
            System.out.println("Yes");
        } else {System.out.println("No");}
    }

    private static boolean permutArrays(int[] a, int[] b, int k) {
        for (int i=0; i<a.length; i++) {
            if( a[i]+ b[i] >= k) {
                return true;
            }
        }
        return false;
    }
    
}
