package Alpha;

public class Duplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 3, 3 };
        int[] newArr = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }

        }

        arr[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }
}