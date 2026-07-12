import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Student {

    public void displayDetails() {
        System.out.println("Student Details");
    }
}

public class ReflectionExample {

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("Student");

            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {

                System.out.println("Method Name: " + method.getName());

                Parameter[] parameters = method.getParameters();

                System.out.println("Number of Parameters: " + parameters.length);
            }

            Object obj = cls.getDeclaredConstructor().newInstance();

            Method method = cls.getDeclaredMethod("displayDetails");

            method.invoke(obj);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
