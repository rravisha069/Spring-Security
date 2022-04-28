package in.ravi.springsecuritysample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "<h1>Welcome to Spring Security Sample!!!</h1>";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user() {
        return "<h1>User</h1>";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "<h1>Admin</h1>";
    }
}
