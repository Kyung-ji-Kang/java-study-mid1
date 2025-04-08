package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.NetworkClientExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    private boolean connectError; //연결 실패 에러
    public boolean sendError; // 전송 실패 에러

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")){
            sendError = true;
        }
    }


    public NetworkClientV4(String address) {
        this.address = address;
    }


    public void connect() {
        if(connectError){
            throw new ConnectExceptionV4(address,address + " 서버 연결 실페");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data)   {
        if(sendError){
            throw new SendExceptionV4(address+ " 서버에 데이터 전송 실패: ", data);
            // 중간에 다른 에러가 발생했다 가정
            // throw new RuntimeException("Run_time_error");
        }
        //전송 성공
        System.out.println(address +" 서버에 데이터 전송: "+ data);
    }

    public void disconnect(){
        System.out.println(address+ " 서버 연결 해제");
    }



}
