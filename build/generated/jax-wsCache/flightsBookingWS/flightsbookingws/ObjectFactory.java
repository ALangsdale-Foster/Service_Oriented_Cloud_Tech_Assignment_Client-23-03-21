
package flightsbookingws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the flightsbookingws package. 
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

    private final static QName _GetAvailableFlightsResponse_QNAME = new QName("http://FlightsBookingWS/", "getAvailableFlightsResponse");
    private final static QName _SearchFlightDirectFlightResponse_QNAME = new QName("http://FlightsBookingWS/", "searchFlightDirectFlightResponse");
    private final static QName _BookFlight_QNAME = new QName("http://FlightsBookingWS/", "bookFlight");
    private final static QName _SearchFlightForCity_QNAME = new QName("http://FlightsBookingWS/", "searchFlightForCity");
    private final static QName _SearchFlightForCityResponse_QNAME = new QName("http://FlightsBookingWS/", "searchFlightForCityResponse");
    private final static QName _BookFlightResponse_QNAME = new QName("http://FlightsBookingWS/", "bookFlightResponse");
    private final static QName _SearchFlightCityToCityResponse_QNAME = new QName("http://FlightsBookingWS/", "searchFlightCityToCityResponse");
    private final static QName _SearchFlightToOrFromCityResponse_QNAME = new QName("http://FlightsBookingWS/", "searchFlightToOrFromCityResponse");
    private final static QName _UnmarshallerResponse_QNAME = new QName("http://FlightsBookingWS/", "UnmarshallerResponse");
    private final static QName _SearchFlightCityToCity_QNAME = new QName("http://FlightsBookingWS/", "searchFlightCityToCity");
    private final static QName _GetAvailableFlights_QNAME = new QName("http://FlightsBookingWS/", "getAvailableFlights");
    private final static QName _SearchFlightDirectFlight_QNAME = new QName("http://FlightsBookingWS/", "searchFlightDirectFlight");
    private final static QName _Unmarshaller_QNAME = new QName("http://FlightsBookingWS/", "Unmarshaller");
    private final static QName _SearchFlightToOrFromCity_QNAME = new QName("http://FlightsBookingWS/", "searchFlightToOrFromCity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: flightsbookingws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnmarshallerResponse }
     * 
     */
    public UnmarshallerResponse createUnmarshallerResponse() {
        return new UnmarshallerResponse();
    }

    /**
     * Create an instance of {@link GetAvailableFlightsResponse }
     * 
     */
    public GetAvailableFlightsResponse createGetAvailableFlightsResponse() {
        return new GetAvailableFlightsResponse();
    }

    /**
     * Create an instance of {@link BookFlight }
     * 
     */
    public BookFlight createBookFlight() {
        return new BookFlight();
    }

    /**
     * Create an instance of {@link SearchFlightDirectFlightResponse }
     * 
     */
    public SearchFlightDirectFlightResponse createSearchFlightDirectFlightResponse() {
        return new SearchFlightDirectFlightResponse();
    }

    /**
     * Create an instance of {@link SearchFlightForCity }
     * 
     */
    public SearchFlightForCity createSearchFlightForCity() {
        return new SearchFlightForCity();
    }

    /**
     * Create an instance of {@link SearchFlightForCityResponse }
     * 
     */
    public SearchFlightForCityResponse createSearchFlightForCityResponse() {
        return new SearchFlightForCityResponse();
    }

    /**
     * Create an instance of {@link BookFlightResponse }
     * 
     */
    public BookFlightResponse createBookFlightResponse() {
        return new BookFlightResponse();
    }

    /**
     * Create an instance of {@link SearchFlightCityToCityResponse }
     * 
     */
    public SearchFlightCityToCityResponse createSearchFlightCityToCityResponse() {
        return new SearchFlightCityToCityResponse();
    }

    /**
     * Create an instance of {@link SearchFlightToOrFromCityResponse }
     * 
     */
    public SearchFlightToOrFromCityResponse createSearchFlightToOrFromCityResponse() {
        return new SearchFlightToOrFromCityResponse();
    }

    /**
     * Create an instance of {@link Flights }
     * 
     */
    public Flights createFlights() {
        return new Flights();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link SearchFlightCityToCity }
     * 
     */
    public SearchFlightCityToCity createSearchFlightCityToCity() {
        return new SearchFlightCityToCity();
    }

    /**
     * Create an instance of {@link GetAvailableFlights }
     * 
     */
    public GetAvailableFlights createGetAvailableFlights() {
        return new GetAvailableFlights();
    }

    /**
     * Create an instance of {@link Unmarshaller }
     * 
     */
    public Unmarshaller createUnmarshaller() {
        return new Unmarshaller();
    }

    /**
     * Create an instance of {@link SearchFlightToOrFromCity }
     * 
     */
    public SearchFlightToOrFromCity createSearchFlightToOrFromCity() {
        return new SearchFlightToOrFromCity();
    }

    /**
     * Create an instance of {@link SearchFlightDirectFlight }
     * 
     */
    public SearchFlightDirectFlight createSearchFlightDirectFlight() {
        return new SearchFlightDirectFlight();
    }

    /**
     * Create an instance of {@link FlightPrice }
     * 
     */
    public FlightPrice createFlightPrice() {
        return new FlightPrice();
    }

    /**
     * Create an instance of {@link UnmarshallerResponse.Return }
     * 
     */
    public UnmarshallerResponse.Return createUnmarshallerResponseReturn() {
        return new UnmarshallerResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "getAvailableFlightsResponse")
    public JAXBElement<GetAvailableFlightsResponse> createGetAvailableFlightsResponse(GetAvailableFlightsResponse value) {
        return new JAXBElement<GetAvailableFlightsResponse>(_GetAvailableFlightsResponse_QNAME, GetAvailableFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightDirectFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightDirectFlightResponse")
    public JAXBElement<SearchFlightDirectFlightResponse> createSearchFlightDirectFlightResponse(SearchFlightDirectFlightResponse value) {
        return new JAXBElement<SearchFlightDirectFlightResponse>(_SearchFlightDirectFlightResponse_QNAME, SearchFlightDirectFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "bookFlight")
    public JAXBElement<BookFlight> createBookFlight(BookFlight value) {
        return new JAXBElement<BookFlight>(_BookFlight_QNAME, BookFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightForCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightForCity")
    public JAXBElement<SearchFlightForCity> createSearchFlightForCity(SearchFlightForCity value) {
        return new JAXBElement<SearchFlightForCity>(_SearchFlightForCity_QNAME, SearchFlightForCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightForCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightForCityResponse")
    public JAXBElement<SearchFlightForCityResponse> createSearchFlightForCityResponse(SearchFlightForCityResponse value) {
        return new JAXBElement<SearchFlightForCityResponse>(_SearchFlightForCityResponse_QNAME, SearchFlightForCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "bookFlightResponse")
    public JAXBElement<BookFlightResponse> createBookFlightResponse(BookFlightResponse value) {
        return new JAXBElement<BookFlightResponse>(_BookFlightResponse_QNAME, BookFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightCityToCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightCityToCityResponse")
    public JAXBElement<SearchFlightCityToCityResponse> createSearchFlightCityToCityResponse(SearchFlightCityToCityResponse value) {
        return new JAXBElement<SearchFlightCityToCityResponse>(_SearchFlightCityToCityResponse_QNAME, SearchFlightCityToCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightToOrFromCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightToOrFromCityResponse")
    public JAXBElement<SearchFlightToOrFromCityResponse> createSearchFlightToOrFromCityResponse(SearchFlightToOrFromCityResponse value) {
        return new JAXBElement<SearchFlightToOrFromCityResponse>(_SearchFlightToOrFromCityResponse_QNAME, SearchFlightToOrFromCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmarshallerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "UnmarshallerResponse")
    public JAXBElement<UnmarshallerResponse> createUnmarshallerResponse(UnmarshallerResponse value) {
        return new JAXBElement<UnmarshallerResponse>(_UnmarshallerResponse_QNAME, UnmarshallerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightCityToCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightCityToCity")
    public JAXBElement<SearchFlightCityToCity> createSearchFlightCityToCity(SearchFlightCityToCity value) {
        return new JAXBElement<SearchFlightCityToCity>(_SearchFlightCityToCity_QNAME, SearchFlightCityToCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "getAvailableFlights")
    public JAXBElement<GetAvailableFlights> createGetAvailableFlights(GetAvailableFlights value) {
        return new JAXBElement<GetAvailableFlights>(_GetAvailableFlights_QNAME, GetAvailableFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightDirectFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightDirectFlight")
    public JAXBElement<SearchFlightDirectFlight> createSearchFlightDirectFlight(SearchFlightDirectFlight value) {
        return new JAXBElement<SearchFlightDirectFlight>(_SearchFlightDirectFlight_QNAME, SearchFlightDirectFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unmarshaller }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "Unmarshaller")
    public JAXBElement<Unmarshaller> createUnmarshaller(Unmarshaller value) {
        return new JAXBElement<Unmarshaller>(_Unmarshaller_QNAME, Unmarshaller.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightToOrFromCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FlightsBookingWS/", name = "searchFlightToOrFromCity")
    public JAXBElement<SearchFlightToOrFromCity> createSearchFlightToOrFromCity(SearchFlightToOrFromCity value) {
        return new JAXBElement<SearchFlightToOrFromCity>(_SearchFlightToOrFromCity_QNAME, SearchFlightToOrFromCity.class, null, value);
    }

}
