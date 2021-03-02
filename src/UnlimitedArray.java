import java.util.Arrays;

public class UnlimitedArray {

    private static UnlimitedArray instance = null;

    public static UnlimitedArray getInstance()  {
        if (instance == null) {
            instance = new UnlimitedArray();
        }
        return instance;
    }

    public A get(A[] arr, int index){
        if (index > arr.length) {
            return null;
        }
        return arr[index];
    }

    public A[] set(A[] arr, int index, A value){
        if (index > arr.length) {
            A[] newArray = Arrays.copyOf(arr, index * 2);
            newArray[index] = value;
            return newArray;
        } else {
            arr[index] = value;
            System.out.println(arr[index] + " successfully added.");
            return arr;
        }
    }
}
