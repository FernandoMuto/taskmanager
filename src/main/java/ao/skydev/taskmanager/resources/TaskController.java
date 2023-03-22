package ao.skydev.taskmanager.resources;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    @GetMapping("/")
    public String index(Model model){

     logger.info("The page was loaded...");

        return "/home/index";
    }
}
