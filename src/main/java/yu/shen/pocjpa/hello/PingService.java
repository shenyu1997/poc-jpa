package yu.shen.pocjpa.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PingService {

    @Value("${local.server.port}")
    private int localPort;

    public Ping getPing() {
        Ping ping = new Ping();
        ping.setMessage("ok");
        ping.setLocalPort(localPort);
        return ping;
    }
}
