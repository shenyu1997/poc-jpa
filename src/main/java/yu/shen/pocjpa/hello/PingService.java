package yu.shen.pocjpa.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class PingService {

    @Value("${local.server.port}")
    private int localPort;

    @Autowired
    private DataSource dataSource;


    public Ping getPing() {
        Ping ping = new Ping();
        ping.setMessage(dataSource.getClass().getName());
        ping.setLocalPort(localPort);
        return ping;
    }
}
