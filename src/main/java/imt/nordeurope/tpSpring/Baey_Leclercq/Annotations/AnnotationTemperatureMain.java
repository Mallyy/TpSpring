//package imt.nordeurope.tpSpring.Baey_Leclercq.Annotations;
//
//import imt.nordeurope.tpSpring.Baey_Leclercq.TemperatureBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.inject.Qualifier;
//
//@Component
//public class AnnotationTemperatureMain {
//
//    //@Qualifier("annotationTemperatureBeanImpl")
//    @Autowired
//    private TemperatureBean deBean;
//
//    //@Qualifier("annotationTemperatureBeanImpl")
//    @Autowired
//    private TemperatureBean enBean;
//
//    //@Qualifier("annotationTemperatureBeanImpl")
//    @Autowired
//    private TemperatureBean frBean;
//
//    public TemperatureBean getDeBean() {
//        return deBean;
//    }
//
//    public void setDeBean(TemperatureBean deBean) {
//        this.deBean = deBean;
//    }
//
//    public TemperatureBean getEnBean() {
//        return enBean;
//    }
//
//    public void setEnBean(TemperatureBean enBean) {
//        this.enBean = enBean;
//    }
//
//    public TemperatureBean getFrBean() {
//        return frBean;
//    }
//
//    public void setFrBean(TemperatureBean frBean) {
//        this.frBean = frBean;
//    }
//    public void printTemperatures(){
//        for (int i =0; i<2; i++){
//            deBean.printTemperature();
//            frBean.printTemperature();
//            enBean.printTemperature();
//        }
//    }
//
//    @PostConstruct
//    void postConstruction() {
//        deBean.setName("DE");
//        frBean.setName("FR");
//        enBean.setName("EN");
//    }
////    System.out
//
//
//}
//
