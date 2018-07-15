package yu.shen.pocjpa.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping("/ping")
    public Ping ping() {
        return pingService.getPing();
    }
}
