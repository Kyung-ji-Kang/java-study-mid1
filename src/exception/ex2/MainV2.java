package exception.ex2;


import java.util.Scanner;

public class MainV2 {


    public static void main(String[] args) throws NetworkClientExceptionV2{
        //NetworkService_V1_1 networksErvice = new NetworkService_V1_1();
        //NetworkService_V1_2 networksErvice = new NetworkService_V1_2();
        //NetworkService_V2_1 networksErvice = new NetworkService_V2_1();
        //NetworkService_V2_4 networksErvice = new NetworkService_V2_4();
        NetworkService_V2_5 networksErvice = new NetworkService_V2_5();

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
