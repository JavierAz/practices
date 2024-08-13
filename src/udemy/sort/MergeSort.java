package udemy.sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                result[index] = arr1[i];
                index++;
                i++;
            } else{
                result[index] = arr2[j];
                index++;
                j++;
            }
        }
        while (i < arr1.length){
            result[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length){
            result[index] = arr2[j];
            index++;
            j++;
        }
        return result;
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }


    public static void main(String[] arg){
        //corre en O(n log n)
        //divide y venceras
        //space complexity O(n)
        int[] arr1 = {20, 10, 11, 7, 9};
        int[] sorted = mergeSort(arr1);
        System.out.println("\nOriginal Array: " + Arrays.toString(arr1));
        System.out.println("\nSorted Array: " + Arrays.toString(sorted));
    }
}
