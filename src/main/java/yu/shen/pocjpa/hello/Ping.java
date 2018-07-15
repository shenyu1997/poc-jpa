package yu.shen.pocjpa.hello;

import org.springframework.beans.factory.annotation.Value;

public class Ping {
    private String message;

    private int localPort;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }
}
