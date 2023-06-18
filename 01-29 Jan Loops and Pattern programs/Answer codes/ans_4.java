public class ans_4 {
    public static void main(String[] args) {
        int row = 9;
        int col = 70;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                //Condition for P
                if(j<row) {
                    if(i==row*0 || j==row*0 || i==row/2  || (j==(row-1) && i<row/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                
                if(j==row*1) {
                    System.out.print("  ");
                }

                //Condition for W
                if(j>row*1 && j<row*2+2) {
                    if(j==row*1+1 || j==row*2+1 || (i+j==row*2+1 && i>row/2) || (i==j-(row*1+1) && i>row/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==row*2+2) {
                    System.out.print("    ");
                }

                //Condition for S
                if(j>row*2+2 && j<row*3+4) {
                    if(i==0 || j==row*2+3 && i<row/2 || i==row/2 || j==row*3+3 && i>row/2 ||  i==row-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==row*3+4) {
                    System.out.print("  ");
                }

                //Condition for K
                if(j>row*3+4 && j<row*3+row/2+7) {
                    if(j==row*3+5 || i+j==row*3+row/2+6 && i<row/2 || i==j-(row*3+2) && i>=row/2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==row*3+row/2+7) {
                    System.out.print("  ");
                }

                //Condition for I
                if(j>row*3+row/2+7 && j<row*4+row/2+9) {
                    if(i==0 || j==row*3+row+7 || i==row-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==row*4+row/2+9) {
                    System.out.print("  ");
                }

                //Condition for L
                if(j>row*4+row/2+9 && j<row*5+row/2+11) {
                    if(j==row*4+row/2+10 || i==row-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                if(j==row*5+row/2+11) {
                    System.out.print("  ");
                }

                //Condition for L
                if(j>row*5+row/2+11 && j<row*6+row/2+13) {
                    if(j==row*5+row/2+12 || i==row-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                
                
            }
            System.out.println();
        }
        
    }
}
