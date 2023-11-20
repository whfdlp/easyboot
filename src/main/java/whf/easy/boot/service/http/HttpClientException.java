package whf.easy.boot.service.http;

/**
 * @ClassName HttpClientException
 * @Description TODO
 * @Author whf
 * @Date 2023/11/20 23:44
 * @Version 1.0
 */
public class HttpClientException extends RuntimeException{

    public HttpClientException() {
        super();
    }

    public HttpClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpClientException(String message) {
        super(message);
    }

    public HttpClientException(String message, Object... objects) {
        super(convertMessage(message,objects));
    }

    public HttpClientException(Throwable cause) {
        super(cause);
    }

    public static String convertMessage(String message,Object... objects) {
        if (message.indexOf("{}")>0){
            String s = message.replaceAll("\\{\\}", "%s");
            String format = null;
            try {
                format = String.format(s, objects);
            } catch (Exception e) {
                return message;
            }
            return format;
        }else {
            return message;
        }
    }
}
