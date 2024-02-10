package interceptors.ex2.ctrls;


import interceptors.ex2.ents.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/months")

public class MonthController {

    @GetMapping("/get/month")
    public Month getMonth(@RequestAttribute("month") Month month) {
        return month;
    }

}
