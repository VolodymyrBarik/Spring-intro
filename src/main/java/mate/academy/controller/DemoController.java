package mate.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/index")                                                 //обробляємо запити які приходять на цю урлу
    public String index() {
        return "index";                                                      // повертаємо сторінку index.jsp
    }


//    @GetMapping("/index")
//    public String index(Model model) {
//        model.addAttribute("message", "Hello Spring!");
//        return "index";
//    }
}
