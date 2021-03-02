import java.util.Arrays;

public class DynamicArray {

    A[] array = new A[5];
    private static DynamicArray instance = null;

    public static DynamicArray getInstance()  {
        if (instance == null) {
            instance = new DynamicArray();
        }
        return instance;
    }

    public void arrayTesting(){
       addToArray();
       add(new A("mainly"));
       System.out.println(get(3));
       set(3, new A("france"));
    }

    public void addToArray(){
        array[0] = new A("the");
        array[1] = new A("rain");
        array[2] = new A("in");
        array[3] = new A("spain");
        array[4] = new A("falls");
    }

    public void add(A value){
        A[] result = Arrays.copyOf(array, array.length * 2);
        result[result.length - 1] = value;
        array = result;
    }

    public A get(int index){
        return array[index];
    }

    public void set(int index, A value){
        array[index] = value;
        System.out.println(Arrays.toString(array));
    }
}
