import java.util.Arrays;

public class ans5 {
    private static boolean checkIntervalIntersection(int[][] intervals) {
        if (intervals.length <= 1) {
            return false;
        }
    
        int n = intervals.length;
    
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];
    
        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }
    
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
    
        for (int i = 1; i < n; i++) {
            if (startTimes[i] <= endTimes[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {7, 9}, {4, 6}, {10, 13}};
        boolean value = checkIntervalIntersection(arr);
        System.out.println(value);
    }
}
