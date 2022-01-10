package imt.nordeurope.tpSpring.Baey_Leclercq;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import static java.lang.System.out;


public class TemperatureMain {
    public TemperatureBean deBean;
    public TemperatureBean enBean;
    public TemperatureBean frBean;

    public TemperatureBean getDeBean() {
        return deBean;
    }

    public void setDeBean(TemperatureBean deBean) {
        this.deBean = deBean;
    }

    public TemperatureBean getEnBean() {
        return enBean;
    }

    public void setEnBean(TemperatureBean enBean) {
        this.enBean = enBean;
    }

    public TemperatureBean getFrBean() {
        return frBean;
    }

    public void setFrBean(TemperatureBean frBean) {
        this.frBean = frBean;
    }
    public void printTemperatures(){
        for (int i =0; i<2; i++){
            deBean.printTemperature();
            frBean.printTemperature();
            enBean.printTemperature();
        }
    }

    @PostConstruct
    void postConstruction() {
        deBean.setName("DE");
        frBean.setName("FR");
        enBean.setName("EN");
    }
//    System.out


}

