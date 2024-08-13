package udemy.sort;

import java.util.Arrays;

public class QuickSort {
    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static int pivot(int[] arr, int start, int end) {
        int swapIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[start]) {
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }

        swap(arr, start, swapIndex);
        return swapIndex;
    }

    public static void quickSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(arr, left, right);
            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    public static void main(String[] arg) {
        //corre en O(n log n)
        //divide y venceras
        //space complexity O(log n)
        //worst case O(n^2) si el pivot es el minimo o maximo
        int[] arr = {4, 6, 1, 7, 3, 2, 5};
        quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
