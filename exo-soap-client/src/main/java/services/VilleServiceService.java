
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VilleServiceService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/exo-soap/ville?wsdl")
public class VilleServiceService
    extends Service
{

    private final static URL VILLESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException VILLESERVICESERVICE_EXCEPTION;
    private final static QName VILLESERVICESERVICE_QNAME = new QName("http://services/", "VilleServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/exo-soap/ville?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VILLESERVICESERVICE_WSDL_LOCATION = url;
        VILLESERVICESERVICE_EXCEPTION = e;
    }

    public VilleServiceService() {
        super(__getWsdlLocation(), VILLESERVICESERVICE_QNAME);
    }

    public VilleServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VILLESERVICESERVICE_QNAME, features);
    }

    public VilleServiceService(URL wsdlLocation) {
        super(wsdlLocation, VILLESERVICESERVICE_QNAME);
    }

    public VilleServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VILLESERVICESERVICE_QNAME, features);
    }

    public VilleServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VilleServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Villeservice
     */
    @WebEndpoint(name = "villeservicePort")
    public Villeservice getVilleservicePort() {
        return super.getPort(new QName("http://services/", "villeservicePort"), Villeservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Villeservice
     */
    @WebEndpoint(name = "villeservicePort")
    public Villeservice getVilleservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "villeservicePort"), Villeservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VILLESERVICESERVICE_EXCEPTION!= null) {
            throw VILLESERVICESERVICE_EXCEPTION;
        }
        return VILLESERVICESERVICE_WSDL_LOCATION;
    }

}
