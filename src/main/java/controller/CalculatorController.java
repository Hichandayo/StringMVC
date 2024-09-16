package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("/input")
    public String input() {
        return "calculator";
    }

    // xu ly input
    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String doCalculator(
            @RequestParam("usdAmount") double usdAmount,
            Model model
    ) {
        double vndAmount = usdAmount * 23000;
        model.addAttribute("usdAmount", usdAmount);
        model.addAttribute("vndAmount", vndAmount);
        return "result";
    }
}
