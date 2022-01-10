//package imt.nordeurope.tpSpring.Baey_Leclercq.Annotations;
//
//import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureServiceBean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//@Primary
//@Scope(value = "singleton")
//public class AnnotationTemperatureServiceBeanImpl implements TemperatureServiceBean {
//    Map<String, Integer> map  = new HashMap<String, Integer>() {{
//        put("FR", 15);
//        put("DE", 6);
//        put("EN", 25);
//    }};
//
//    @Override
//    public BigDecimal getTemperature(String country) {
//        Integer temp = map.get(country);
//        map.put(country,map.get(country)+1);
//        return BigDecimal.valueOf(temp);
//    }
//}
