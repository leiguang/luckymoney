package xin.leiguang.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController()
@RequestMapping("/hello")
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${maxMoney}")
//    private BigDecimal maxMoney;
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitConfig limitConfig;

//    @GetMapping({"/hello", "/hi"})
//    @GetMapping("/say/{id}")
//    public String say(@PathVariable("id") Integer id) {
////        return "说明：" + limitConfig.getDescription();
//        return "id:" + id;
//    }
    @GetMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id:" + id;
    }
}
