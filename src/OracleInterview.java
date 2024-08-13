import java.util.*;

public class OracleInterview {
    public static Set<Integer> interception(List<Integer> a, List<Integer> b) {
        Set<Integer> elements = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        if (a.isEmpty() || b.isEmpty()) {
            return result;
        } else {
            // elements.addAll(a);
            for (int i = 0; i < a.size(); i++) {
                elements.add(a.get(i));
            }

            for (int i = 0; i < b.size(); i++) {
                if (elements.contains(b.get(i))) {
                    result.add(b.get(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3,3,3,3, 4, 5, 6, 7, 8, 9);
        List<Integer> b = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17);
        System.out.println(interception(a, b));
    }
}
