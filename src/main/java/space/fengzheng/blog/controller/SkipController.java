package space.fengzheng.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Tibers on 17/2/22.
 */
@Controller
public class SkipController {

    @GetMapping("")
    public String home() {
        return "index";
    }

}
