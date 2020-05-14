package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.ImplCarsService;

@Controller
@RequestMapping("/")
public class CarsController {
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String selectallcars(Model model){
        model.addAttribute("cars_list", ImplCarsService.getInstance().SelectAllCars());
        return "cars";
    }
}
