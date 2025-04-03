package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {

    public int discount(ClassGrade classgrade, int price) {

        int discountPercent = 0;

        if(classgrade ==ClassGrade.BASIC){
            discountPercent = 10;
        } else if (classgrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classgrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        }
        else{
            System.out.println("할일X");
        }


        return price * discountPercent / 100;
    }


}
