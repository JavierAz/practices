package udemy.iq;

import java.util.*;

public class RemoveDuplicates {
    public static Set<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> uniqueSet = new HashSet<>(myList);
        return uniqueSet;
    }
//    public static String removeDuplicates(String str){
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (!result.contains(str.substring(i, i + 1))){
//                result += str.substring(i, i + 1);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args){
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);

        System.out.println(removeDuplicates(myList));

        String s = "a green apple";
//        System.out.println(RemoveDuplicates.removeDuplicates(s));
    }
}
