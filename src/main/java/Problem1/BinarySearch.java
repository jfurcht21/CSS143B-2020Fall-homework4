package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        if(data.length > 1) {
            return binarySearchHelper(data, 0, data.length - 1, target);
        }
        if(data.length == 1 && target == data[0]){
            return 0;
        }
        return -1;
    }

    public static int binarySearchHelper(int[]data, int low, int high, int target){
        if(high >= low && low < data.length) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target) {
                return mid;
            }

            if (data[mid] > target) {
                high = mid - 1;
                return binarySearchHelper(data, low, high, target);
            }

            if (data[mid] < target) {
                low = mid + 1;
                return binarySearchHelper(data, low, high, target);
            }
        }
        return -1;
    }
}
