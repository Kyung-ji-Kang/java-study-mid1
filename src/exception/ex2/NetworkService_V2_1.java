package exception.ex2;

public class NetworkService_V2_1 {

    public void sendMeesage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }


}
