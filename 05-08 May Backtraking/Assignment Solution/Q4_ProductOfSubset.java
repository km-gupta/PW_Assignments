public class Q4_ProductOfSubset {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 4};
        int target = 16;
        boolean result = subsetProduct(array, target);
        System.out.println("Subset with product equal to target exists? " + result);
    }
    
    public static boolean subsetProduct(int[] array, int target) {
        return subsetProductHelper(array, target, 1, 0);
    }

    private static boolean subsetProductHelper(int[] array, int target, int product, int index) {
        if (target == product) {
            return true;
        } else if (product > target || index == array.length) {
            return false;
        } else {
            for (int i = index; i < array.length; i++) {
                if (subsetProductHelper(array, target, product * array[i], i + 1)) {
                    return true;
                }
            }
            return false;
        }
    }
}



