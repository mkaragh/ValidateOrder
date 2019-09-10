//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 02:39:05 PM IST 
//


package com.hp.sales.om.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}TransportMode"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}TransportModeOther" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}TransportMean" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}TransportMeanOther" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Carrier"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}CarrierOther" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}TransportContractNumber" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}TransportInstructions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transportMode",
    "transportModeOther",
    "transportMean",
    "transportMeanOther",
    "carrier",
    "carrierOther",
    "transportContractNumber",
    "transportInstructions"
})
@XmlRootElement(name = "Transport")
public class Transport {

    @XmlElement(name = "TransportMode", required = true)
    protected String transportMode;
    @XmlElement(name = "TransportModeOther")
    protected String transportModeOther;
    @XmlElement(name = "TransportMean")
    protected String transportMean;
    @XmlElement(name = "TransportMeanOther")
    protected String transportMeanOther;
    @XmlElement(name = "Carrier", required = true)
    protected String carrier;
    @XmlElement(name = "CarrierOther")
    protected String carrierOther;
    @XmlElement(name = "TransportContractNumber")
    protected String transportContractNumber;
    @XmlElement(name = "TransportInstructions")
    protected String transportInstructions;

    /**
     * Gets the value of the transportMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMode(String value) {
        this.transportMode = value;
    }

    /**
     * Gets the value of the transportModeOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeOther() {
        return transportModeOther;
    }

    /**
     * Sets the value of the transportModeOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeOther(String value) {
        this.transportModeOther = value;
    }

    /**
     * Gets the value of the transportMean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMean() {
        return transportMean;
    }

    /**
     * Sets the value of the transportMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMean(String value) {
        this.transportMean = value;
    }

    /**
     * Gets the value of the transportMeanOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeanOther() {
        return transportMeanOther;
    }

    /**
     * Sets the value of the transportMeanOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeanOther(String value) {
        this.transportMeanOther = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierOther() {
        return carrierOther;
    }

    /**
     * Sets the value of the carrierOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierOther(String value) {
        this.carrierOther = value;
    }

    /**
     * Gets the value of the transportContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportContractNumber() {
        return transportContractNumber;
    }

    /**
     * Sets the value of the transportContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportContractNumber(String value) {
        this.transportContractNumber = value;
    }

    /**
     * Gets the value of the transportInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportInstructions() {
        return transportInstructions;
    }

    /**
     * Sets the value of the transportInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportInstructions(String value) {
        this.transportInstructions = value;
    }

}