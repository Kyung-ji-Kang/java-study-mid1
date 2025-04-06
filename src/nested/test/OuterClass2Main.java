package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        // 여기에서 InnerClass의 hello() 메서드를 호출해라.
        OuterClass2 class2 = new OuterClass2();

        OuterClass2.InnerClass inerClass =  class2.new InnerClass();
        inerClass.hello();
    }
}
