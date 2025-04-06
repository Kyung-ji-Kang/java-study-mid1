package exception.ex1;

public class NetworkClientV1 {

    private final String address;
    private boolean connectError; //연결 실패 에러
    public boolean sendError; // 전송 실패 에러



    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect(){
        if(connectError){
            System.out.println(address + " 서버 연결 실페");
            return "connectError";
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data){
        if(sendError){
            System.out.println(address+ " 서버에 데이터 전송 실패: "+ data);
            return "sendError";
        }
        //전송 성공
        System.out.println(address +" 서버에 데이터 전송: "+ data);
        return  "success";
    }

    public void disconnect(){
        System.out.println(address+ " 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error01")){
            connectError = true;
        }
        if (data.contains("error02")){
            sendError = true;
        }
    }

}
