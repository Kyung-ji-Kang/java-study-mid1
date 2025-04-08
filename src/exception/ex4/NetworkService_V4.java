package exception.ex4;



public class NetworkService_V4 {

    public void sendMeesage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);//추가
        
        try{
            client.connect();
            client.send(data); //throw new RuntimeException("ex")
        }
        finally{
            client.disconnect();
        }


    }


}
