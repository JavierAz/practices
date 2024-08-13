package udemy.iq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] list) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> myHash = new HashMap<>();
        for (int i: list){
            if (myHash.containsKey(i)){
                myHash.put(i, myHash.get(i) + 1);
            } else {
                myHash.put(i, 1);
            }
        }

        for (int i: myHash.keySet()){
            if (myHash.get(i) > 1){
                result.add(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }
}
