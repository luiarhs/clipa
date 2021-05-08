package mx.clip.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Async
@RestController
@RequestMapping("/api/v1/health")
public class HealthController {
    
    Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/")
    public String Get() {
        return "API is healthy";
    }
}
