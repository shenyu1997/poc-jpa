package yu.shen.pocjpa.configtesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private YuProperties yuProperties;

    @GetMapping("/config")
    public YuProperties getConfig() {
        return yuProperties;
    }
}
