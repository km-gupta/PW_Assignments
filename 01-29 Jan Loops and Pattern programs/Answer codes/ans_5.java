public class ans_5 {
    public static void main(String[] args) {
        int row = 10;
        int col = 70;

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                //Condition for K
                if(j<row/2+2) {
                    if(j==row*0 || i+j==row*0+row/2+1 && i<row/2 || j==i-(row/2-1) && i>=row/2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==row/2+2) {
                    if(i==row-1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                //Condition for M
                if(j>row/2+2 && j<3*row/2+4) {
                    if(j==row/2+3 || i==j-(row/2+3) && i<=row/2 || i+j==3*row/2+3 && i<=row/2 || j==3*row/2+3) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==3*row/2+4) {
                    if(i==row-1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
