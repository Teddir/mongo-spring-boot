package t.learn.crud.mongo_spring_boot.router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import t.learn.crud.mongo_spring_boot.model.User;

@RestController
public class UserRouter {
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "Teddi") String name) {
        var nm = new User("Teddi",12);
        return "<h1>wadidaw saha 1" + nm.username + " " + nm.age + "</h1>";
    }

}
