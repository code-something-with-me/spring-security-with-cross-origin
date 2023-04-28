package code.with.me;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author andong@xiaomalixing.com
 */
@Controller
@Slf4j
public class MainController {
    @GetMapping("/")
    public String main() {
        return "main";
    }

    @PostMapping("/test")
    @ResponseBody
    public String test() {
        log.info("Test method called");
        return "HELLO";
    }
}
