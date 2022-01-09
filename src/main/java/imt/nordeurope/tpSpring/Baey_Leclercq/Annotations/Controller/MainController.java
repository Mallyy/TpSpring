package imt.nordeurope.tpSpring.Baey_Leclercq.Annotations.Controller;

import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import static java.nio.file.Files.setAttribute;

@SpringBootApplication
@Controller
public class MainController {
    public static ApplicationContext applicationContext;

    @Autowired
    TemperatureMain temperatureMain;

    static {
        applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    }


    @RequestMapping(value ={"/temperature"}, method = RequestMethod.GET)
    public String temperature(Model model){
        TemperatureMain bean = applicationContext.getBean(TemperatureMain.class);
        model.addAttribute("temperatureFR", bean.getFrBean().getTemperatureServiceBean().getTemperature("FR"));
        return "temperatures";
    }

}
