package Lab_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Info {
    @GetMapping("info")
    public String greeting(ModelMap map) {
        map.addAttribute("Кафедра", "ИСАП");
        map.addAttribute("Предмет", "ВСРПП");
        map.addAttribute("Преподаватель", "Казаков В.Е.");
        return "info";
    }
}