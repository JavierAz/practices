package udemy.iq;

import java.util.HashSet;
import java.util.Set;

public class UniqueChars {
    public static boolean hasUniqueChars(String string){
        Set<Character> result = new HashSet<>();

        for(char i: string.toCharArray()){
            if (result.contains(i)){
                return false;
            } else {
                result.add(i);
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s = "a green apple";
        String s2 = "hola";
        System.out.println(UniqueChars.hasUniqueChars(s2));
    }
}
