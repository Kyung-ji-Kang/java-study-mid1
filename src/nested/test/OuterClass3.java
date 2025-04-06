package nested.test;

public class OuterClass3 {
    public void myMethod() {
        // 여기에 지역 클래스 LocalClass를 구현하고 hello() 메서드를 호출해라.

        class myMethod{


            public void hello(){
                System.out.println(" LocalClass.hello");
                System.out.println(getClass());
            }
        }

        myMethod myMethod = new myMethod();
        myMethod.hello();
    }
}
