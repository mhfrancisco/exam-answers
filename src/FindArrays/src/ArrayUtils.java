public class ArrayUtils {
    public static int findSubarrayIndex(int[] mainArray, int[] subArray) {
        if (mainArray == null || subArray == null || subArray.length == 0 || subArray.length > mainArray.length) {
            return -1;
        }

        for (int i = 0; i <= mainArray.length - subArray.length; i++) {
            boolean match = true;
            for (int j = 0; j < subArray.length; j++) {
                if (mainArray[i + j] != subArray[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }
}
