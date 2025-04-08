package exception.ex2;



public class NetworkService_V2_5 {

    public void sendMeesage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);//추가
        
        try{
            client.connect();
            client.send(data); //throw new RuntimeException("ex")
        }
        catch(NetworkClientExceptionV2 e)
        {
            System.out.println("[오류] 코드 : "+ e.getErroCode()+", 메세지: "+ e.getMessage());
        }
        finally{
            client.disconnect();
        }


    }


}
