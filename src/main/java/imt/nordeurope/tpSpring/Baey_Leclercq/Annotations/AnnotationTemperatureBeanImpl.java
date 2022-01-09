package imt.nordeurope.tpSpring.Baey_Leclercq.Annotations;

import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureBean;
import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(value = "prototype")
public class AnnotationTemperatureBeanImpl implements TemperatureBean {
    String name;

    @Autowired
    TemperatureServiceBean temperatureServiceBean;

    public TemperatureServiceBean getTemperatureServiceBean() {
        return temperatureServiceBean;
    }

    public void setTemperatureServiceBean(TemperatureServiceBean temperatureServiceBean) {
        this.temperatureServiceBean = temperatureServiceBean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printTemperature()
    {
        System.out.println("temperature");

        System.out.println(temperatureServiceBean.getTemperature(this.name));
    }
    public int getServiceHash (){
        return this.temperatureServiceBean.hashCode();
    }

    @Override
    public int getHash() {
        return this.hashCode();
    }
}
