import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yinhao on 17/8/4.
 */

@RestController
@EnableAutoConfiguration
@Configuration
public class Application {

    @RequestMapping("/")
    public String home(){
        System.out.println("welcome");
        return "hello world";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
