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
 *         &lt;element ref="{http://hp.com/sales/om/orders/}message"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}to"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}from"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ServiceHeader" minOccurs="0"/>
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
    "message",
    "to",
    "from",
    "serviceHeader"
})
@XmlRootElement(name = "delivery")
public class Delivery {

    @XmlElement(required = true)
    protected Message message;
    @XmlElement(required = true)
    protected To to;
    @XmlElement(required = true)
    protected From from;
    @XmlElement(name = "ServiceHeader")
    protected ServiceHeader serviceHeader;

    /**
     * Contains message identifiers and when this message was sent
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
    }

    /**
     * Routing meta data for destination
     * 
     * @return
     *     possible object is
     *     {@link To }
     *     
     */
    public To getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link To }
     *     
     */
    public void setTo(To value) {
        this.to = value;
    }

    /**
     * Routing meta data describing the source
     * 
     * @return
     *     possible object is
     *     {@link From }
     *     
     */
    public From getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link From }
     *     
     */
    public void setFrom(From value) {
        this.from = value;
    }

    /**
     * Use if you need a copy of the B2B Services Gateway wrapper meta data
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getServiceHeader() {
        return serviceHeader;
    }

    /**
     * Sets the value of the serviceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setServiceHeader(ServiceHeader value) {
        this.serviceHeader = value;
    }

}