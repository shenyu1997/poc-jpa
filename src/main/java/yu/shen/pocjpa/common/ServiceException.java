package yu.shen.pocjpa.common;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by sheyu on 7/16/2018.
 */
public class ServiceException extends RuntimeException {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
    }
}
