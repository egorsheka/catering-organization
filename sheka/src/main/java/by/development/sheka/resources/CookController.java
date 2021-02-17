package by.development.sheka.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookController {

    @GetMapping("location")
    public void getLocation(){

    }

    @PutMapping("location")
    public void updateLocation(){

    }

    @GetMapping("timetable")
    public void getWorkingTime(){

    }

    @PutMapping("timetable")
    public void updateWorkingTime(){

    }

    @GetMapping("profile")
    public void getProfile(){

    }

    @PutMapping("profile")
    public void updateProfile(){

    }

}
