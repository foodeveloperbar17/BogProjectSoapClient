
package soapserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetApartmentPrice_QNAME = new QName("http://soapServer/", "getApartmentPrice");
    private final static QName _GetApartmentPriceResponse_QNAME = new QName("http://soapServer/", "getApartmentPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetApartmentPrice }
     * 
     */
    public GetApartmentPrice createGetApartmentPrice() {
        return new GetApartmentPrice();
    }

    /**
     * Create an instance of {@link GetApartmentPriceResponse }
     * 
     */
    public GetApartmentPriceResponse createGetApartmentPriceResponse() {
        return new GetApartmentPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApartmentPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetApartmentPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapServer/", name = "getApartmentPrice")
    public JAXBElement<GetApartmentPrice> createGetApartmentPrice(GetApartmentPrice value) {
        return new JAXBElement<GetApartmentPrice>(_GetApartmentPrice_QNAME, GetApartmentPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApartmentPriceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetApartmentPriceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapServer/", name = "getApartmentPriceResponse")
    public JAXBElement<GetApartmentPriceResponse> createGetApartmentPriceResponse(GetApartmentPriceResponse value) {
        return new JAXBElement<GetApartmentPriceResponse>(_GetApartmentPriceResponse_QNAME, GetApartmentPriceResponse.class, null, value);
    }

}
