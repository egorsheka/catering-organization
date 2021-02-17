package by.development.sheka.resources;

import by.development.sheka.data.dto.UserDto;
import by.development.sheka.data.dto.UserOrderInfoDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hi")
    public UserDto method(){
        return new UserDto("Egor");
    }

    @PostMapping("/auth")
    public UserDto auth(){
        return new UserDto("Egor");
    }

    @GetMapping
    public UserOrderInfoDto getUserOrderInfo(@RequestParam String userId){
        return new UserOrderInfoDto();
    }


}
