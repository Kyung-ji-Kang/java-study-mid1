package exception.ex1;



public class NetworkService_V1_3 {

    public void sendMeesage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);//추가
        
        String connectResult = client.connect();
        //결과가 성공이 아니다 -> 오류다.
        if(isSuccess(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+ connectResult);
        }else{
            String sendResult = client.send(data);
            if(isSuccess(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: "+ sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("success");
    }


}
