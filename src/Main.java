import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5,8,10,20,1,6,8,5};
        System.out.println(Arrays.toString(array));

        int[] newArray = ArrayOperations.sortArrayWithUniqueValues(array);
        System.out.println(Arrays.toString(newArray));
    }
}
