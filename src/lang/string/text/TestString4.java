package lang.string.text;

public class TestString4 {

    public static void main(String[] args) {
            String str = "hello.txt";
            String filename;
            String extName ;

            filename = str.substring(0,5);
            extName = str.substring(5,str.length());
        System.out.println("filename = "+filename);
        System.out.println("extName = "+extName);
    }
}
