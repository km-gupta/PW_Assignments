public class ans3 {
    public static void main(String[] args) {
        int n=16;
        byte count =0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i ==0 || j==0 || i==(n-1) || j==(n-1) || j<=(n-1)/2-count || j>=(n-1)/2+count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
