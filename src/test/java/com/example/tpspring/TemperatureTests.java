package com.example.tpspring;

import imt.nordeurope.tpSpring.Baey_Leclercq.SimpleBeanInjection;
import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureBean;
import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class TemperatureTests {
    @Test
    void contextLoads() {
    }
    @Test
    public void should_simple_bean_be_injected(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        TemperatureMain bean = applicationContext.getBean(TemperatureMain.class);
        Assertions.assertNotNull(bean.getFrBean());
        Assertions.assertNotNull(bean.getDeBean());
        Assertions.assertNotNull(bean.getEnBean());
        Assertions.assertNotEquals(bean.getDeBean().getHash(), bean.getEnBean().getHash()); // hash des beans differents
        Assertions.assertEquals(bean.getDeBean().getServiceHash(), bean.getEnBean().getServiceHash()); // hash service bean identiques ( bean partagé )
    }
}
