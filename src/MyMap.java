import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public void findMostRepeatedLetter(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(Character letter: str.toCharArray()){
            if (map.containsKey(letter)){
                Integer count = map.get(letter);

            } else {
                map.put(letter, 1);
            }
        }
    }
}
