package exception.ex1;



public class NetworkService_V1_1 {

    public void sendMeesage(String data){
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }


}
