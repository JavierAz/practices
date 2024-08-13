package udemy.sort;

public class SelectionSort {
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] arg){
        int[] arr = {5, 3, 4, 1, 2};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
