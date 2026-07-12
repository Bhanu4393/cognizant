public class PatternMatchingSwitch {

    static void checkType(Object obj) {

        if (obj instanceof Integer) {
            System.out.println("Integer value: " + obj);
        } else if (obj instanceof String) {
            System.out.println("String value: " + obj);
        } else if (obj instanceof Double) {
            System.out.println("Double value: " + obj);
        } else {
            System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {

        checkType(100);
        checkType("Mithun");
        checkType(99.99);
        checkType(true);
    }
}