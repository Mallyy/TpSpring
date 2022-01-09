package imt.nordeurope.tpSpring.Baey_Leclercq;

public interface TemperatureBean {
    String getName();
    void setName(String name);
    void printTemperature();
    void setTemperatureServiceBean(TemperatureServiceBean temperatureServiceBean);
    int getHash ();
    int getServiceHash ();
    TemperatureServiceBean getTemperatureServiceBean();

}
