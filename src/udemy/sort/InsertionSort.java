package udemy.sort;

public class InsertionSort {
    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] arg){
        int[] arr = {5, 3, 4, 1, 2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
