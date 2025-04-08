package exception.ex3.exception;




public class NetworkService_V3_1 {

    public void sendMeesage(String data) throws NetworkClientExceptionV3 {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);//추가
        
        try{
            client.connect();
            client.send(data); //throw new RuntimeException("ex")
        } catch (ConnectExceptionV3 e)
        {
            System.out.println("[연결 오류] 주소: "+ e.getAddress()+", 메세지: "+ e.getMessage() );
        } catch (SendExceptionV3 e){
            System.out.println("[전송 오류] 주소: "+ e.getSendData()+", 메세지: "+ e.getMessage() );

        }
        finally{
            client.disconnect();
        }


    }


}
