package de.gaffa.spring.boot.as;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${de.gaffa.spring.boot.as.service.version:N/A}")
    private String version;

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String getVersion() {
        return version;
    }
}
