package ao.skydev.taskmanager.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("/")
    public String index(Model model){

        System.out.println("Carregando a página");

        return "/home/index";
    }
}
