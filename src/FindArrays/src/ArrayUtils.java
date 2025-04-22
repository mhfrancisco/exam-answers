public class ArrayUtils {
    public static int findSubarrayIndex(int[] mainArray, int[] subArray) {
        // Conditions for checking if the parameters are null and length of the arrays
        // Returns -1 if one of the conditions is true
        if (mainArray == null || subArray == null || subArray.length == 0 || subArray.length > mainArray.length) {
            return -1;
        }

        // Outer for loop determined where the main and sub array should meet
        for (int i = 0; i <= mainArray.length - subArray.length; i++) {
            // By default, match is set to true
            boolean match = true;
            // Inner loop for checking the equality of main array to the sub array
            for (int j = 0; j < subArray.length; j++) {
                // if the compared main array value is not equal then the index will result to -1
                if (mainArray[i + j] != subArray[j]) {
                    match = false;
                    break;
                }
            }
            // If all values of main and sub array matched then return the first index value
            if (match) {
                return i;
            }
        }
        // Immediately return -1 once a match is equal to false
        return -1;
    }
}
