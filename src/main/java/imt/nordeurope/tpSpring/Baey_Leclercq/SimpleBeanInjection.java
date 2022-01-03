package imt.nordeurope.tpSpring.Baey_Leclercq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class SimpleBeanInjection {
    private SimpleBean simpleBean;

    //@Autowired

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }
    @Inject
    public void setSimpleBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }
}
