
package invoicing.billgate.billzone;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InvoicingService", targetNamespace = "http://Billzone.Billgate.Invoicing", wsdlLocation = "https://sandbox.billzone.eu/billgate?wsdl")
public class InvoicingService
    extends Service
{

    private final static URL INVOICINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException INVOICINGSERVICE_EXCEPTION;
    private final static QName INVOICINGSERVICE_QNAME = new QName("http://Billzone.Billgate.Invoicing", "InvoicingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sandbox.billzone.eu/billgate?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INVOICINGSERVICE_WSDL_LOCATION = url;
        INVOICINGSERVICE_EXCEPTION = e;
    }

    public InvoicingService() {
        super(__getWsdlLocation(), INVOICINGSERVICE_QNAME);
    }

    public InvoicingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INVOICINGSERVICE_QNAME, features);
    }

    public InvoicingService(URL wsdlLocation) {
        super(wsdlLocation, INVOICINGSERVICE_QNAME);
    }

    public InvoicingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INVOICINGSERVICE_QNAME, features);
    }

    public InvoicingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InvoicingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IInvoicing
     */
    @WebEndpoint(name = "BillgateInvoicingServiceHttpEndpoint")
    public IInvoicing getBillgateInvoicingServiceHttpEndpoint() {
        return super.getPort(new QName("http://Billzone.Billgate.Invoicing", "BillgateInvoicingServiceHttpEndpoint"), IInvoicing.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IInvoicing
     */
    @WebEndpoint(name = "BillgateInvoicingServiceHttpEndpoint")
    public IInvoicing getBillgateInvoicingServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://Billzone.Billgate.Invoicing", "BillgateInvoicingServiceHttpEndpoint"), IInvoicing.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INVOICINGSERVICE_EXCEPTION!= null) {
            throw INVOICINGSERVICE_EXCEPTION;
        }
        return INVOICINGSERVICE_WSDL_LOCATION;
    }

}
