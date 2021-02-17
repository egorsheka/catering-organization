package by.development.sheka.resources;


import by.development.sheka.data.dto.menu.MenuFilterDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("menus")
    public void getAllMenu(){

    }

    @GetMapping("menus")
    public void getMenuByStandardFilter(@RequestParam MenuFilterDto filter){

    }

    @GetMapping("menu/{id}")
    public void getMenu(@PathVariable String id){

    }

    @GetMapping("cook/menus")
    public void getCookMenus(){
    }

    @PostMapping("menu/{id}")
    public void createMenu(@PathVariable String id){

    }

    @PutMapping("menu/{id}")
    public void updateMenu(@PathVariable String id){

    }

    @DeleteMapping("menu/{id}")
    public void deleteMenu(@PathVariable String id) {

    }
}
