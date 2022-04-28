package in.ravi.SpringSecurityToSetupJdbcAuthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "<h1>Welcome !!!!</h1>";
    }

    @GetMapping(value = "/user")
    public String user() {
        return "<h1>User !!!!</h1>";
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return "<h1>Admin !!!!</h1>";
    }
}
