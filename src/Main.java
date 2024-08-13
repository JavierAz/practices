import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(3);

        b.add(2);
        b.add(2);
        b.add(2);
        b.add(3);
        b.add(3);
        b.add(4);

        System.out.println(OracleInterview.interception(a, c));

    }
}