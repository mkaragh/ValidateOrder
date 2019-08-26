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
 * root element of Order 
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
 *         &lt;element ref="{http://hp.com/sales/om/orders/}OrderHeader"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Currency"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Instructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Hold" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}DateInfo" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}DocumentReference" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}CustomerReference" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Identifier" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Payment" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}CardInfo" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Discount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}OrderItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}OrderSummary" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}PriceDescriptor" minOccurs="0"/>
 *         &lt;element name="PriceDescriptorCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceDescriptorTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Tax" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}Transport" minOccurs="0"/>
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
    "orderHeader",
    "currency",
    "instructions",
    "hold",
    "dateInfo",
    "documentReference",
    "customerReference",
    "identifier",
    "payment",
    "cardInfo",
    "discount",
    "orderItem",
    "orderSummary",
    "priceDescriptor",
    "priceDescriptorCountry",
    "priceDescriptorTerm",
    "tax",
    "transport"
})
@XmlRootElement(name = "PurchaseOrder")
public class PurchaseOrder {

    @XmlElement(name = "OrderHeader", required = true)
    protected OrderHeader orderHeader;
    @XmlElement(name = "Currency", required = true)
    protected Currency currency;
    @XmlElement(name = "Instructions")
    protected List<Instructions> instructions;
    @XmlElement(name = "Hold")
    protected List<Hold> hold;
    @XmlElement(name = "DateInfo", required = true)
    protected List<DateInfo> dateInfo;
    @XmlElement(name = "DocumentReference", required = true)
    protected List<DocumentReference> documentReference;
    @XmlElement(name = "CustomerReference", required = true)
    protected List<CustomerReference> customerReference;
    @XmlElement(name = "Identifier")
    protected Identifier identifier;
    @XmlElement(name = "Payment")
    protected Payment payment;
    @XmlElement(name = "CardInfo")
    protected CardInfo cardInfo;
    @XmlElement(name = "Discount")
    protected List<Discount> discount;
    @XmlElement(name = "OrderItem", required = true)
    protected List<OrderItem> orderItem;
    @XmlElement(name = "OrderSummary")
    protected OrderSummary orderSummary;
    @XmlElement(name = "PriceDescriptor")
    protected String priceDescriptor;
    @XmlElement(name = "PriceDescriptorCountry")
    protected String priceDescriptorCountry;
    @XmlElement(name = "PriceDescriptorTerm")
    protected String priceDescriptorTerm;
    @XmlElement(name = "Tax")
    protected Tax tax;
    @XmlElement(name = "Transport")
    protected Transport transport;

    /**
     * Gets the value of the orderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHeader }
     *     
     */
    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    /**
     * Sets the value of the orderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHeader }
     *     
     */
    public void setOrderHeader(OrderHeader value) {
        this.orderHeader = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the hold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hold }
     * 
     * 
     */
    public List<Hold> getHold() {
        if (hold == null) {
            hold = new ArrayList<Hold>();
        }
        return this.hold;
    }

    /**
     * Gets the value of the dateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateInfo }
     * 
     * 
     */
    public List<DateInfo> getDateInfo() {
        if (dateInfo == null) {
            dateInfo = new ArrayList<DateInfo>();
        }
        return this.dateInfo;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReference }
     * 
     * 
     */
    public List<DocumentReference> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReference>();
        }
        return this.documentReference;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference }
     * 
     * 
     */
    public List<CustomerReference> getCustomerReference() {
        if (customerReference == null) {
            customerReference = new ArrayList<CustomerReference>();
        }
        return this.customerReference;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfo }
     *     
     */
    public CardInfo getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfo }
     *     
     */
    public void setCardInfo(CardInfo value) {
        this.cardInfo = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discount }
     * 
     * 
     */
    public List<Discount> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<Discount>();
        }
        return this.discount;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItem }
     * 
     * 
     */
    public List<OrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItem>();
        }
        return this.orderItem;
    }

    /**
     * Gets the value of the orderSummary property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSummary }
     *     
     */
    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    /**
     * Sets the value of the orderSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSummary }
     *     
     */
    public void setOrderSummary(OrderSummary value) {
        this.orderSummary = value;
    }

    /**
     * Gets the value of the priceDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDescriptor() {
        return priceDescriptor;
    }

    /**
     * Sets the value of the priceDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDescriptor(String value) {
        this.priceDescriptor = value;
    }

    /**
     * Gets the value of the priceDescriptorCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDescriptorCountry() {
        return priceDescriptorCountry;
    }

    /**
     * Sets the value of the priceDescriptorCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDescriptorCountry(String value) {
        this.priceDescriptorCountry = value;
    }

    /**
     * Gets the value of the priceDescriptorTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDescriptorTerm() {
        return priceDescriptorTerm;
    }

    /**
     * Sets the value of the priceDescriptorTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDescriptorTerm(String value) {
        this.priceDescriptorTerm = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTransport(Transport value) {
        this.transport = value;
    }

}