package by.development.sheka.resources;

import by.development.sheka.data.dto.OrderDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @PostMapping
    public void makeOrder(@RequestParam OrderDto order){

    }

    @GetMapping
    public void getOrder(@RequestParam String orderId){

    }

    @GetMapping
    public void getOrders(){

    }

}
