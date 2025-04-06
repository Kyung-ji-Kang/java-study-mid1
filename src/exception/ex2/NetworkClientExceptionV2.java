package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{

    private String erroCode;

    public NetworkClientExceptionV2(String erroCode, String message) {
        super(message);
        this.erroCode = erroCode;
    }

    public String getErroCode() {
        return erroCode;
    }
}
