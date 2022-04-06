package week12;

public class TestValue {
    public static void main(String[] args) {
        Value value=new Value(4);
        System.out.println(value.getValue());
        System.out.println(value.wasModified());
        System.out.println(value);

        System.out.println("--------------------------");

        Value value1=new Value();
        value1.setValue(5);
        System.out.println(value1.wasModified());
        System.out.println(value1.getValue());
        System.out.println(value1);

        System.out.println("--------------------------");

        System.out.println(value.wasModified);
        System.out.println(value.wasConstructor);
        System.out.println(value1.wasModified);
        System.out.println(value1.wasConstructor);

        System.out.println("--------------------------");

        Value value2=new Value();
        System.out.println(value2);
        System.out.println(value2.getValue());

    }
}
