package udemy.iq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Anagram {
    public static boolean isAnagram(String word1, String word2){
        if (word1.length() != word2.length()) return false;
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < word1.length(); i++) {
            list1.add(word1.charAt(i));
            list2.add(word2.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }

    public static boolean isAnagram2(String word1, String word2){
        boolean res=false;
        if (word1.length() != word2.length()) return res;

        HashMap<Character, Integer> myHash = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (myHash.containsKey(word1.charAt(i))){
                myHash.put(word1.charAt(i), myHash.get(word1.charAt(i)) + 1);
            } else {
                myHash.put(word1.charAt(i), 1);
            }
        }

        System.out.println(myHash);
        // recorrer el hasmap y restarle 1 a cada valor
        for (int i = 0; i < word2.length(); i++) {
            if (myHash.containsKey(word2.charAt(i))){
                myHash.put(word2.charAt(i), myHash.get(word2.charAt(i)) - 1);
                if (myHash.get(word2.charAt(i)) == 0){
                    myHash.remove(word2.charAt(i));
                }
            }
        }
        System.out.println(myHash);

        return myHash.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "aaabbb";
        String s2 = "abbbab";
        System.out.println(isAnagram2(s1, s2));
    }
}
