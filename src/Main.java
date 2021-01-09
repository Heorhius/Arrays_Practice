import java.util.Arrays;

public class Main {

    public static final String NO_MISSING_VALUE_IN_ARRAY = "There is no missing value in array.";

    public static void main(String[] args) {
        //Delete duplicates and sort array (task 3.2)
        int[] array = new int[]{5,8,10,20,1,6,8,5};
        System.out.println(Arrays.toString(array));
        int[] newArray = ArrayOperations.sortArrayWithUniqueValues(array);
        System.out.println(Arrays.toString(newArray));

        //Transpose array (task 3.3)
        int[][] originalArray = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(originalArray));
        int[][] transposedArray = ArrayOperations.transposeArray(originalArray);
        System.out.println(Arrays.deepToString(transposedArray));

        //Return a missing number in array (task 3.5)
        int[] missingValueArray = new int[]{6,2,1,0,8,7,4,3}; //missing value is 5
        int missingValue = ArrayOperations.getMissingNumber(missingValueArray);
        if(missingValue == -1) {
            System.out.println(NO_MISSING_VALUE_IN_ARRAY);
        } else System.out.println(missingValue);
    }
}
