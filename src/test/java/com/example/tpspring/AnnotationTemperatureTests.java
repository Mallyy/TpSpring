//package com.example.tpspring;
//
//import imt.nordeurope.tpSpring.Baey_Leclercq.Annotations.AnnotationTemperatureMain;
//import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureMain;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//@SpringBootTest
//public class AnnotationTemperatureTests {
//    @Test
//    void contextLoads() {
//    }
//    @Autowired
//    AnnotationTemperatureMain Annbean;
//
//    @Test
//    public void should_simple_bean_be_injected(){
//        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
//
//        Assertions.assertNotNull(Annbean.getFrBean());
//        Assertions.assertNotNull(Annbean.getDeBean());
//        Assertions.assertNotNull(Annbean.getEnBean());
//        Assertions.assertNotEquals(Annbean.getDeBean().getHash(), Annbean.getEnBean().getHash()); // hash des beans differents
//        Assertions.assertEquals(Annbean.getDeBean().getServiceHash(), Annbean.getEnBean().getServiceHash()); // hash service bean identiques ( bean partagé )
//    }
//}
