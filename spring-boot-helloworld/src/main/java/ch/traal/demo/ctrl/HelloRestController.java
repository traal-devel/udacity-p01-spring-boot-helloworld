package ch.traal.demo.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloRestController {
  
  
  /* member variables */
  private Map<String, Object> result = new HashMap<>();

  
  /* constructors */
  
  
  /* methods */
  @RequestMapping("/hello")
  @ResponseBody
  public Map<String, Object> hello() {
    result.put("name", "Stephen");
    result.put("city", "San Jose");
    
    return result;
  }
  
}
