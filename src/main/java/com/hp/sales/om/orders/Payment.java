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
 *         &lt;element ref="{http://hp.com/sales/om/orders/}PaymentMean" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}PaymenTerm" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}PaymenTermOther" minOccurs="0"/>
 *         &lt;element name="PaymentDaysDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}CostLocation" minOccurs="0"/>
 *         &lt;element name="ConsolidatedInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicePreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicePreferenceOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoicePrint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeasingContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatusUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicInvoiceOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicAdditionalHardcopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "paymentMean",
    "paymenTerm",
    "paymenTermOther",
    "paymentDaysDue",
    "paymentStatus",
    "paymentStatusDesc",
    "paymentStatusDate",
    "bankID",
    "costLocation",
    "consolidatedInvoice",
    "invoicePreference",
    "invoicePreferenceOther",
    "invoiceDelivery",
    "invoicePrint",
    "invoiceSummary",
    "controlCode",
    "leasingContractNumber",
    "paymentReceivedDate",
    "paymentStatusUser",
    "electronicInvoiceOnly",
    "electronicAdditionalHardcopy"
})
@XmlRootElement(name = "Payment")
public class Payment {

    @XmlElement(name = "PaymentMean")
    protected String paymentMean;
    @XmlElement(name = "PaymenTerm")
    protected String paymenTerm;
    @XmlElement(name = "PaymenTermOther")
    protected String paymenTermOther;
    @XmlElement(name = "PaymentDaysDue")
    protected String paymentDaysDue;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "PaymentStatusDesc")
    protected String paymentStatusDesc;
    @XmlElement(name = "PaymentStatusDate")
    protected String paymentStatusDate;
    @XmlElement(name = "BankID")
    protected String bankID;
    @XmlElement(name = "CostLocation")
    protected String costLocation;
    @XmlElement(name = "ConsolidatedInvoice")
    protected String consolidatedInvoice;
    @XmlElement(name = "InvoicePreference")
    protected String invoicePreference;
    @XmlElement(name = "InvoicePreferenceOther")
    protected String invoicePreferenceOther;
    @XmlElement(name = "InvoiceDelivery")
    protected String invoiceDelivery;
    @XmlElement(name = "InvoicePrint")
    protected String invoicePrint;
    @XmlElement(name = "InvoiceSummary")
    protected String invoiceSummary;
    @XmlElement(name = "ControlCode")
    protected String controlCode;
    @XmlElement(name = "LeasingContractNumber")
    protected String leasingContractNumber;
    @XmlElement(name = "PaymentReceivedDate")
    protected String paymentReceivedDate;
    @XmlElement(name = "PaymentStatusUser")
    protected String paymentStatusUser;
    @XmlElement(name = "ElectronicInvoiceOnly")
    protected String electronicInvoiceOnly;
    @XmlElement(name = "ElectronicAdditionalHardcopy")
    protected String electronicAdditionalHardcopy;

    /**
     * Gets the value of the paymentMean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMean() {
        return paymentMean;
    }

    /**
     * Sets the value of the paymentMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMean(String value) {
        this.paymentMean = value;
    }

    /**
     * Gets the value of the paymenTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenTerm() {
        return paymenTerm;
    }

    /**
     * Sets the value of the paymenTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenTerm(String value) {
        this.paymenTerm = value;
    }

    /**
     * Gets the value of the paymenTermOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenTermOther() {
        return paymenTermOther;
    }

    /**
     * Sets the value of the paymenTermOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenTermOther(String value) {
        this.paymenTermOther = value;
    }

    /**
     * Gets the value of the paymentDaysDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDaysDue() {
        return paymentDaysDue;
    }

    /**
     * Sets the value of the paymentDaysDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDaysDue(String value) {
        this.paymentDaysDue = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusDesc() {
        return paymentStatusDesc;
    }

    /**
     * Sets the value of the paymentStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusDesc(String value) {
        this.paymentStatusDesc = value;
    }

    /**
     * Gets the value of the paymentStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusDate() {
        return paymentStatusDate;
    }

    /**
     * Sets the value of the paymentStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusDate(String value) {
        this.paymentStatusDate = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the costLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostLocation() {
        return costLocation;
    }

    /**
     * Sets the value of the costLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostLocation(String value) {
        this.costLocation = value;
    }

    /**
     * Gets the value of the consolidatedInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidatedInvoice() {
        return consolidatedInvoice;
    }

    /**
     * Sets the value of the consolidatedInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidatedInvoice(String value) {
        this.consolidatedInvoice = value;
    }

    /**
     * Gets the value of the invoicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicePreference() {
        return invoicePreference;
    }

    /**
     * Sets the value of the invoicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicePreference(String value) {
        this.invoicePreference = value;
    }

    /**
     * Gets the value of the invoicePreferenceOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicePreferenceOther() {
        return invoicePreferenceOther;
    }

    /**
     * Sets the value of the invoicePreferenceOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicePreferenceOther(String value) {
        this.invoicePreferenceOther = value;
    }

    /**
     * Gets the value of the invoiceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDelivery() {
        return invoiceDelivery;
    }

    /**
     * Sets the value of the invoiceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDelivery(String value) {
        this.invoiceDelivery = value;
    }

    /**
     * Gets the value of the invoicePrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicePrint() {
        return invoicePrint;
    }

    /**
     * Sets the value of the invoicePrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicePrint(String value) {
        this.invoicePrint = value;
    }

    /**
     * Gets the value of the invoiceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSummary() {
        return invoiceSummary;
    }

    /**
     * Sets the value of the invoiceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSummary(String value) {
        this.invoiceSummary = value;
    }

    /**
     * Gets the value of the controlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlCode() {
        return controlCode;
    }

    /**
     * Sets the value of the controlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlCode(String value) {
        this.controlCode = value;
    }

    /**
     * Gets the value of the leasingContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeasingContractNumber() {
        return leasingContractNumber;
    }

    /**
     * Sets the value of the leasingContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeasingContractNumber(String value) {
        this.leasingContractNumber = value;
    }

    /**
     * Gets the value of the paymentReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReceivedDate() {
        return paymentReceivedDate;
    }

    /**
     * Sets the value of the paymentReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReceivedDate(String value) {
        this.paymentReceivedDate = value;
    }

    /**
     * Gets the value of the paymentStatusUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusUser() {
        return paymentStatusUser;
    }

    /**
     * Sets the value of the paymentStatusUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusUser(String value) {
        this.paymentStatusUser = value;
    }

    /**
     * Gets the value of the electronicInvoiceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicInvoiceOnly() {
        return electronicInvoiceOnly;
    }

    /**
     * Sets the value of the electronicInvoiceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicInvoiceOnly(String value) {
        this.electronicInvoiceOnly = value;
    }

    /**
     * Gets the value of the electronicAdditionalHardcopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicAdditionalHardcopy() {
        return electronicAdditionalHardcopy;
    }

    /**
     * Sets the value of the electronicAdditionalHardcopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAdditionalHardcopy(String value) {
        this.electronicAdditionalHardcopy = value;
    }

}
