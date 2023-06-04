public class ans1 {
    
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 2, 1};
        int n = arr.length;
        int k = 4;

       
        int result = selectionProcedure(arr, 0, n-1, n-k);
        System.out.println("The kth smallest element in an array is: "+result);
    }

    private static int selectionProcedure(int[] arr, int l, int h, int k) {
        //Dividing the problem into subproblem
        int m = pratition(arr, l, h);
        
        if(m == k) {
            return arr[m];
        }
        if(m<k) {
            // traverse towards right side of an array
            return selectionProcedure(arr, m+1, h, k);
        } else {
            // traverse towards left side of an array
            return selectionProcedure(arr, l, m, k);
        }
    }

    private static int pratition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;

        for(int j=l+1; j<=h; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[l] = arr[i];
        arr[i] = pivot;
        return i;
    }
}
