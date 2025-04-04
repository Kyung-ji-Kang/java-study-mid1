package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;//지역 변수는 스택 프레임이 좋료되는 순간 함께 제거된다.



        class LoaclPrinter implements  Printer{

            int value = 0 ;

            @Override
            public void print(){

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("value ="+ value);
                System.out.println("localVar ="+ localVar);
                System.out.println("paramVar ="+ paramVar);
                System.out.println("OutInstanceVar ="+ outInstanceVar);
            }

        }

        Printer printer = new LoaclPrinter();
        //printer.print();를 여기서 실행하지 않고 Printer 인스턴스만 실행한다.
        return  printer;
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        Printer printer = localOuter.process(2);

        //Printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println("field = "+ field);
        }
    }
}
