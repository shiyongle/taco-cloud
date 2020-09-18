package sla.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Richered
 * @Date: 2020/09/18 11:20
 * @Description:
 **/
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
