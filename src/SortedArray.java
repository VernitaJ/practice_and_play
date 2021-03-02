import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 20, 32};
        int[] intArray2 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 19, 33};

        combineAndPrint(intArray, intArray2);
    }

    static void combineAndPrint(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array2.length && j < array2.length){
            if (array1[i] < array2[j]){
                newArray[k] = array1[i];
                i++;
                k++;
            } else if (array1[i] > array2[j]){
                newArray[k] = array2[j];
                j++;
                k++;
            }
        }

        while (i < array1.length) {
            newArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            newArray[k++] = array2[j++];
        }

        Arrays.stream(newArray).forEach(System.out::println);
    }

}
