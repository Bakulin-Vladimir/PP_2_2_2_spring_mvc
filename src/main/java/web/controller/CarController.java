package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServiceImp serviceImp;

    @Autowired
    public CarController(CarServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }

    @GetMapping()
    public String getCarCount(@RequestParam(value = "count", required = false) String count, Model model) {
        if (count != null) {
            model.addAttribute("Cars", serviceImp.getCarList(Integer.parseInt(count)));
        } else {
            model.addAttribute("Cars", serviceImp.getCarList());
        }
        return "car";
    }
}
