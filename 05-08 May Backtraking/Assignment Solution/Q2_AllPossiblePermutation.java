public class Q2_AllPossiblePermutation {
    private static int[] swap(int[] arr, int l, int i) {
        int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;

            return arr;
    }
    
    private static void printArr(int[] arr) {
        for (int a : arr) System.out.print(a+" ");
        System.out.println();
    }
    private static void permute(int[] arr, int l, int r) {
        //Base Case
        if (l == r) {
            printArr(arr);
        }

        for(int i = l; i <= r; i++)
            {
                swap(arr, l, i);
                //Recurrsive Call
                permute(arr, l+1, r);

                //backtracking
                swap(arr, l, i);
            }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        permute(arr, 0, arr.length-1);
    }
}
