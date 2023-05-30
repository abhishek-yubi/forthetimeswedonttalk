package in.forthetimeswedonttalk.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {
  @GetMapping("/")
  public String healthcheck() {
    return "Health is good";
  }
}
