package exception.ex2;



public class NetworkService_V2_2 {

    public void sendMeesage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가
        
        try{
            client.connect();
        }catch(NetworkClientExceptionV2 e)
        {
            System.out.println("[오류] 코드 : "+ e.getErroCode()+", 메세지: "+ e.getMessage());
            return;
        }

        try{
            client.send(data);
        }catch(NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드 : "+e.getMessage()+", 메세지: "+e.getMessage());
            return;
        }
        client.disconnect();
    }



}
