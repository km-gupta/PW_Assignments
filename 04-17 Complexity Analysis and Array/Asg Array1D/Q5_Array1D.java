public class Q5_Array1D{
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 3, 2, 6, 5};
        int peak = 0;
        for(int i=1; i<arr.length-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]> arr[i+1]) {
                peak = arr[i];
                break;
            }
        }
        System.out.println(peak);
    }
}