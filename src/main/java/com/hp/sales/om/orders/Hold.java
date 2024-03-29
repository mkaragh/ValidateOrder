//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 02:39:05 PM IST 
//


package com.hp.sales.om.orders;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="HoldCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HoldStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}HoldConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}HoldGroupLocation" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}HoldLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}HoldParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}AuditLog" minOccurs="0"/>
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
    "holdCode",
    "holdStatus",
    "holdConfiguration",
    "holdGroupLocation",
    "holdLocation",
    "holdParameter",
    "auditLog"
})
@XmlRootElement(name = "Hold")
public class Hold {

    @XmlElement(name = "HoldCode", required = true)
    protected String holdCode;
    @XmlElement(name = "HoldStatus")
    protected String holdStatus;
    @XmlElement(name = "HoldConfiguration")
    protected List<HoldConfiguration> holdConfiguration;
    @XmlElement(name = "HoldGroupLocation")
    protected HoldGroupLocation holdGroupLocation;
    @XmlElement(name = "HoldLocation")
    protected List<HoldLocation> holdLocation;
    @XmlElement(name = "HoldParameter")
    protected List<HoldParameter> holdParameter;
    @XmlElement(name = "AuditLog")
    protected AuditLog auditLog;

    /**
     * Gets the value of the holdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldCode() {
        return holdCode;
    }

    /**
     * Sets the value of the holdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldCode(String value) {
        this.holdCode = value;
    }

    /**
     * Gets the value of the holdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldStatus() {
        return holdStatus;
    }

    /**
     * Sets the value of the holdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldStatus(String value) {
        this.holdStatus = value;
    }

    /**
     * Gets the value of the holdConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldConfiguration }
     * 
     * 
     */
    public List<HoldConfiguration> getHoldConfiguration() {
        if (holdConfiguration == null) {
            holdConfiguration = new ArrayList<HoldConfiguration>();
        }
        return this.holdConfiguration;
    }

    /**
     * Gets the value of the holdGroupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link HoldGroupLocation }
     *     
     */
    public HoldGroupLocation getHoldGroupLocation() {
        return holdGroupLocation;
    }

    /**
     * Sets the value of the holdGroupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldGroupLocation }
     *     
     */
    public void setHoldGroupLocation(HoldGroupLocation value) {
        this.holdGroupLocation = value;
    }

    /**
     * Gets the value of the holdLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldLocation }
     * 
     * 
     */
    public List<HoldLocation> getHoldLocation() {
        if (holdLocation == null) {
            holdLocation = new ArrayList<HoldLocation>();
        }
        return this.holdLocation;
    }

    /**
     * Gets the value of the holdParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldParameter }
     * 
     * 
     */
    public List<HoldParameter> getHoldParameter() {
        if (holdParameter == null) {
            holdParameter = new ArrayList<HoldParameter>();
        }
        return this.holdParameter;
    }

    /**
     * Gets the value of the auditLog property.
     * 
     * @return
     *     possible object is
     *     {@link AuditLog }
     *     
     */
    public AuditLog getAuditLog() {
        return auditLog;
    }

    /**
     * Sets the value of the auditLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditLog }
     *     
     */
    public void setAuditLog(AuditLog value) {
        this.auditLog = value;
    }

}
