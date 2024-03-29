package karn.cloud.karnclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LuckyWordController {

  @Value("${lucky-word}")
  private String luckyWord;

  @GetMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
}