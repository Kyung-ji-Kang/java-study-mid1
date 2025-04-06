package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        // 여기에서 Hello의 익명 클래스를 생성하고 hello()를 호출해라.

        class Anonymous implements Hello{

            @Override
            public void hello(){
                System.out.println("Hello.hello");
            }
        }

        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("바로 Hello hello = new Hello() 생성");
                System.out.println("Hello.hello");
            }
        };

        hello.hello();

        //1
        Anonymous anonymous = new Anonymous();
        anonymous.hello();

        //2
        new Anonymous().hello();

        //3 람다
        helo(()->{
            System.out.println("Hello.hello");
        });

    }

    public static void helo (Hello hello){
        System.out.println("람다함수 활용");
        hello.hello();
    }
}
