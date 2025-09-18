package Alpha;

public class Merge {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 8, 5, 3, 6, 8, 0, 6, 4 };

        divide(arr, 0, arr.length - 1);
        mergeSort(arr, 0, 0, arr.length - 1);
    }

    static void divide(int[] arr, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;

            divide(arr, start, mid);
            divide(arr, mid + 1, end);

        }

    }

    static void mergeSort(int[] arr, int start, int mid, int end) {
        int[] newArr = new int[arr.length];

        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                newArr[i] = arr[i];
                i++;
            } else {
                newArr[i] = arr[j];
                j++;
            }

        }

        while (i <= mid) {
            newArr[i] = arr[i];
            i++;
        }
        while (j <= end) {
            newArr[i] = arr[j];
            j++;
        }

        for (int k = 0; k < newArr.length; k++) {
            System.out.println(newArr[k]);
        }

    }
}