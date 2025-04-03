package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = Integer.valueOf(10); //new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = "+ newInteger);
        System.out.println("integerObj = "+ integerObj);
        System.out.println("longObj = "+ longObj);
        System.out.println("doubleObj = "+ doubleObj);

        System.out.println("비교");
        System.out.println(" == : "+(newInteger == integerObj));
        System.out.println("equals : "+(newInteger.equals(integerObj)));

    }


}
