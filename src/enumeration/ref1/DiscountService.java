package enumeration.ref1;



public class DiscountService {

    public int discount(ClassGrade classgrade, int price) {

        return price *  classgrade.getDiscountPercent() / 100;
    }


}
