//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 02:39:05 PM IST 
//


package com.hp.sales.om.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Header Details
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}BusinessDesc" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}BusinessID" minOccurs="0"/>
 *         &lt;element name="ProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoToMarketMotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AMERICAS"/>
 *               &lt;enumeration value="AP"/>
 *               &lt;enumeration value="EMEA"/>
 *               &lt;enumeration value="WW"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalOrderSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "businessDesc",
    "businessID",
    "programType",
    "orderingMethod",
    "orderReason",
    "goToMarketMotion",
    "region",
    "sourceSystem",
    "messageType",
    "originalOrderSource"
})
@XmlRootElement(name = "OrderHeader")
public class OrderHeader {

    @XmlElement(name = "BusinessDesc")
    protected String businessDesc;
    @XmlElement(name = "BusinessID")
    protected String businessID;
    @XmlElement(name = "ProgramType")
    protected String programType;
    @XmlElement(name = "OrderingMethod")
    protected String orderingMethod;
    @XmlElement(name = "OrderReason")
    protected String orderReason;
    @XmlElement(name = "GoToMarketMotion")
    protected String goToMarketMotion;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "SourceSystem")
    protected String sourceSystem;
    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElement(name = "OriginalOrderSource")
    protected String originalOrderSource;
    @XmlAttribute(name = "OrderType", required = true)
    protected String orderType;

    /**
     * Gets the value of the businessDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDesc() {
        return businessDesc;
    }

    /**
     * Sets the value of the businessDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDesc(String value) {
        this.businessDesc = value;
    }

    /**
     * Gets the value of the businessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessID() {
        return businessID;
    }

    /**
     * Sets the value of the businessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessID(String value) {
        this.businessID = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramType(String value) {
        this.programType = value;
    }

    /**
     * Gets the value of the orderingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderingMethod() {
        return orderingMethod;
    }

    /**
     * Sets the value of the orderingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderingMethod(String value) {
        this.orderingMethod = value;
    }

    /**
     * Gets the value of the orderReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReason() {
        return orderReason;
    }

    /**
     * Sets the value of the orderReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReason(String value) {
        this.orderReason = value;
    }

    /**
     * Gets the value of the goToMarketMotion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoToMarketMotion() {
        return goToMarketMotion;
    }

    /**
     * Sets the value of the goToMarketMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoToMarketMotion(String value) {
        this.goToMarketMotion = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the originalOrderSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalOrderSource() {
        return originalOrderSource;
    }

    /**
     * Sets the value of the originalOrderSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalOrderSource(String value) {
        this.originalOrderSource = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

}
