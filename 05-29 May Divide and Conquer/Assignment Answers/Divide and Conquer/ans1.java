class ans1{

    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 7, 5, 9, 10};
        sortArr(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int ar: arr) {
            System.out.print(ar+" ");
        }
    }

    private static void sortArr(int[] arr) {
        int temp = 0;
        int count = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1] && count == 0) {
                temp = i-1;
                count++;
                continue;
            }
            if(arr[i] < arr[i-1] && count ==1) {
                int tem = arr[i];
                arr[i] = arr[temp];
                arr[temp] = tem;
                break;
            }
        }
    }
}