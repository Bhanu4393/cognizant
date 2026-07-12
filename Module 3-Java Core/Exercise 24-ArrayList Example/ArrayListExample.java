import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();

        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            String name = sc.nextLine();
            studentNames.add(name);
        }

        for (String name : studentNames) {
            System.out.println(name);
        }

        sc.close();
    }
}