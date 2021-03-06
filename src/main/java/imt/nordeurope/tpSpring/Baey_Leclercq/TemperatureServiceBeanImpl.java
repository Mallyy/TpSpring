package imt.nordeurope.tpSpring.Baey_Leclercq;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TemperatureServiceBeanImpl implements TemperatureServiceBean {
    Map<String, Integer> map  = new HashMap<String, Integer>() {{
        put("FR", 15);
        put("DE", 6);
        put("EN", 25);
    }};

    @Override
    public BigDecimal getTemperature(String country) {
        Integer temp = map.get(country);
        map.put(country,map.get(country)+1);
        return BigDecimal.valueOf(temp);
    }
}
