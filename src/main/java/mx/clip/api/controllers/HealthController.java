package mx.clip.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> Get()
    {
        HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");

        return new ResponseEntity<>(new Object[] { "API is healthy" }, headers, HttpStatus.OK);
    }
}
