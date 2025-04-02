package lang.string.text;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;

//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]+": "+arr[i].length());
//            sum += arr[i].length();
//        }

        for(String st : arr){
            System.out.println(st+": "+st.length());
            sum += st.length();
        }


        System.out.println("sum = "+sum);


    }
}
