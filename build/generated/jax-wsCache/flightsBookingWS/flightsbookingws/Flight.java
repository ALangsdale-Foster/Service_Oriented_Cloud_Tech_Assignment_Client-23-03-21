
package flightsbookingws;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightPrice" type="{http://FlightsBookingWS/}FlightPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="originCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightAirline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connectionsNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="availableSeats" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flight", propOrder = {
    "flightPrice",
    "originCity",
    "destinationCity",
    "flightAirline",
    "connectionsNumber",
    "availableSeats"
})
public class Flight {

    @XmlElement(nillable = true)
    protected List<FlightPrice> flightPrice;
    @XmlElement(required = true)
    protected String originCity;
    @XmlElement(required = true)
    protected String destinationCity;
    @XmlElement(required = true)
    protected String flightAirline;
    @XmlElement(required = true)
    protected BigInteger connectionsNumber;
    @XmlElement(required = true)
    protected BigInteger availableSeats;

    /**
     * Gets the value of the flightPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightPrice }
     * 
     * 
     */
    public List<FlightPrice> getFlightPrice() {
        if (flightPrice == null) {
            flightPrice = new ArrayList<FlightPrice>();
        }
        return this.flightPrice;
    }

    /**
     * Gets the value of the originCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * Sets the value of the originCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCity(String value) {
        this.originCity = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * Gets the value of the flightAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightAirline() {
        return flightAirline;
    }

    /**
     * Sets the value of the flightAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightAirline(String value) {
        this.flightAirline = value;
    }

    /**
     * Gets the value of the connectionsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectionsNumber() {
        return connectionsNumber;
    }

    /**
     * Sets the value of the connectionsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectionsNumber(BigInteger value) {
        this.connectionsNumber = value;
    }

    /**
     * Gets the value of the availableSeats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the value of the availableSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableSeats(BigInteger value) {
        this.availableSeats = value;
    }

}
