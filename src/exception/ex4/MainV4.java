package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {

        //NetworkService_V4 networkservice = new NetworkService_V4();
        NetworkServiceV5 networkservice = new NetworkServiceV5();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("전송할 문자: ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            try{
                networkservice.sendMeesage(input);
            }catch(Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다.");

    }


    private static void exceptionHandler(Exception e){
        //공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수없는 문제가 발생했습니다");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);
        //e.printStackTrace(); // System.err에 스택 트레이스 출력

        //필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터: "+sendEx.getSendData());
        }
    }
}
