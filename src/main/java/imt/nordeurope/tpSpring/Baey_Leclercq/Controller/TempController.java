package imt.nordeurope.tpSpring.Baey_Leclercq.Controller;

import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureMain;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import static java.nio.file.Files.setAttribute;


@Controller
//@RequestMapping("/test")
public class TempController {
    public static ApplicationContext applicationContext;

//    @Autowired
//    TemperatureMain temperatureMain;

    static {
        applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    }


    @RequestMapping(path ={"/"}, method = RequestMethod.GET)
    public String temperature(Model model){
        TemperatureMain bean = applicationContext.getBean(TemperatureMain.class);
        model.addAttribute("temperatureFR", bean.getFrBean().getTemperatureServiceBean().getTemperature("FR"));
        return "temperatures";
    }

}
