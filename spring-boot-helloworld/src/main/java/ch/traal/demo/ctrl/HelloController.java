package ch.traal.demo.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  
  /* member variables */
  private Map<String, Object> result = new HashMap<>();

  
  /* constructors */
  
  
  /* methods */
  @RequestMapping("/old/hello")
  public Map<String, Object> hello() {
    result.put("name", "Stephen");
    result.put("city", "San Jose");
    
    return result;
  }
  
}
