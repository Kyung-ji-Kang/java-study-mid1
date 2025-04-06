package exception.ex0;


import java.util.Scanner;

public class MainV0 {


    public static void main(String[] args) {
        NetworkServiceV0 networksErvice = new NetworkServiceV0();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            networksErvice.sendMeesage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다.");
    }
}
