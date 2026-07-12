import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            students.put(id, name);
        }

        int searchId = sc.nextInt();

        if (students.containsKey(searchId)) {
            System.out.println(students.get(searchId));
        } else {
            System.out.println("Student not found");
        }

        sc.close();
    }
}