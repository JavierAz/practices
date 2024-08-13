package udemy.iq;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static Character firstNonRepeatingChar(String str){
        Character result = null;
        HashMap<Character, Integer> myHash = new HashMap<>();
        for(int i: str.toCharArray()){
            if (myHash.containsKey((char) i)){
                myHash.put((char) i, myHash.get((char) i) + 1);
            } else {
                myHash.put((char) i, 1);
            }
        }
        for(int i: str.toCharArray()){
            if (myHash.get((char) i) == 1){
                result = (char) i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args){
        String s = "a green apple";
        System.out.println(FirstNonRepeatingChar.firstNonRepeatingChar(s));
    }
}
