package enumeration.test.http;

public enum HttpStatus {

    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SEREVER_ERROR(500,"Internal Server Error");

    private final int code ;
    private final String message ;


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

//    public static HttpStatus FindByCode(int httpCodeInput){
//        if(httpCodeInput==200){return OK;}
//        else if (httpCodeInput==400){return BAD_REQUEST;}
//        else if (httpCodeInput==404){return NOT_FOUND;}
//        else if (httpCodeInput==500){return INTERNAL_SEREVER_ERROR;}
//        return  null;
//    }

    public static HttpStatus FindByCode(int httpCodeInput){
        for(HttpStatus htp : values()){
            if(httpCodeInput == htp.getCode()){
                return htp;
            }
        }
        return null;
    }

    public boolean isSuccess (){
        if(code>=200&& code<=299){
            return true;
        }
        return false;

    }
}
