package udemy.iq;

import java.util.HashMap;

public class ItemInCommon {
    public static boolean itemInCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> myHash = new HashMap<>();
        for (int i: arr1) {
            myHash.put(i, true);
            System.out.println("myHash.put(" + i + ", true);");
        }

        for(int j: arr2){
            if(myHash.containsKey(j)){
                System.out.println(myHash);
                return true;
            }
        }
        return false;

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) return true;
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */

    }
}
