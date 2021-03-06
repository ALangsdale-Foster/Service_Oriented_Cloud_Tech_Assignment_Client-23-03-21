
package modulewebservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CurrencyConversionWS", targetNamespace = "http://ModuleWebServices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyConversionWS {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "GetConversionRate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetConversionRate", targetNamespace = "http://ModuleWebServices/", className = "modulewebservices.GetConversionRate")
    @ResponseWrapper(localName = "GetConversionRateResponse", targetNamespace = "http://ModuleWebServices/", className = "modulewebservices.GetConversionRateResponse")
    @Action(input = "http://ModuleWebServices/CurrencyConversionWS/GetConversionRateRequest", output = "http://ModuleWebServices/CurrencyConversionWS/GetConversionRateResponse")
    public double getConversionRate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "GetCurrencyCodes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetCurrencyCodes", targetNamespace = "http://ModuleWebServices/", className = "modulewebservices.GetCurrencyCodes")
    @ResponseWrapper(localName = "GetCurrencyCodesResponse", targetNamespace = "http://ModuleWebServices/", className = "modulewebservices.GetCurrencyCodesResponse")
    @Action(input = "http://ModuleWebServices/CurrencyConversionWS/GetCurrencyCodesRequest", output = "http://ModuleWebServices/CurrencyConversionWS/GetCurrencyCodesResponse")
    public List<String> getCurrencyCodes();

}
