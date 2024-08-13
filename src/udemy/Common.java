package udemy;

import java.util.HashMap;

public class Common {
    public static boolean itemInCommon(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : arr1) {
            map.put(i, true);
        }

        for (int i : arr2) {
            if (map.get(i) != null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 7, 8, 9, 10};
        System.out.println(itemInCommon(arr1, arr2));
    }
}
