package imt.nordeurope.tpSpring.Baey_Leclercq;

import static java.lang.System.out;

public class TemperatureBeanImpl implements TemperatureBean{
    String name;
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
