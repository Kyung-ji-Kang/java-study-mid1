package exception.ex4;



public class NetworkServiceV5 {

    public void sendMeesage(String data) throws Exception {
        String address = "http://example.com";
        
        try (NetworkClientV5 client = new NetworkClientV5(address))
        {
            client.initError(data);//추가`
            client.connect();
            client.send(data); //throw new RuntimeException("ex")
        } catch (Exception e){
            System.out.println("[예외 확인]: "+ e.getMessage());
            throw e;

        }


    }


}
