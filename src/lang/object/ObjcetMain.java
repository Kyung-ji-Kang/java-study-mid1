package lang.object;

public class ObjcetMain {

    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child();
        child.childMethod();
        child.parentMethod();
        Parent parent = new Parent();

        //toString()은 Object 클래스의 매서드
        String string = child.toString();
        System.out.println(string);
        System.out.println(child.getClass());

    }
}
