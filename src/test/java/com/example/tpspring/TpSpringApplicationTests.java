package com.example.tpspring;

import imt.nordeurope.tpSpring.Baey_Leclercq.SimpleBean;
import imt.nordeurope.tpSpring.Baey_Leclercq.SimpleBeanInjection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class TpSpringApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void should_simple_bean_be_injected(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        SimpleBeanInjection bean = applicationContext.getBean(SimpleBeanInjection.class);
        Assertions.assertNotNull(bean.getSimpleBean());
    }

}
