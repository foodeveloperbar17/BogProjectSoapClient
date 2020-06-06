import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import soapserver.ApartmentPriceGetter;

public class ApartmentPriceGetterClient {

    public static ApartmentPriceGetter getWS(){
        JaxWsProxyFactoryBean ws = new JaxWsProxyFactoryBean();

        ws.setServiceClass(ApartmentPriceGetter.class);
        ws.setWsdlURL("http://localhost:8080/BogProject-1/ApartmentPriceGetter?wsdl");

        return (ApartmentPriceGetter) ws.create();
    }
}
