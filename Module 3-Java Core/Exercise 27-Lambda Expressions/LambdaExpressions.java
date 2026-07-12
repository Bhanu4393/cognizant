import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Mithun");
        names.add("Tamil");
        names.add("Sagar");
        names.add("Vijay");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        for (String name : names) {
            System.out.println(name);
        }
    }
}