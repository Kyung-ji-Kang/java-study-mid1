package enumeration.ref3;

public class EnumRefMain3_3 {

    public static void main(String[] args) {
        int price  = 10_000;

        Grade[] grades = Grade.values();

        for(Grade gr: grades){
            printDiscount(gr,price);
        }

    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " +
                grade.discount(price));
    }
}
