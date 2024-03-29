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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Product details (e.g. code, description etc.)
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
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ProductDescription" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ProductNumber"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ProductLine" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ProductName" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ProductOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://hp.com/sales/om/orders/}ProductAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProductCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productDescription",
    "productNumber",
    "productLine",
    "productName",
    "productOption",
    "productAttribute",
    "productManufacturer"
})
@XmlRootElement(name = "ProductInformation")
public class ProductInformation {

    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductNumber", required = true)
    protected String productNumber;
    @XmlElement(name = "ProductLine")
    protected String productLine;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductOption")
    protected List<ProductOption> productOption;
    @XmlElement(name = "ProductAttribute")
    protected List<ProductAttribute> productAttribute;
    @XmlElement(name = "ProductManufacturer")
    protected String productManufacturer;
    @XmlAttribute(name = "ProductCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String productCode;

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the value of the productNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNumber(String value) {
        this.productNumber = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOption }
     * 
     * 
     */
    public List<ProductOption> getProductOption() {
        if (productOption == null) {
            productOption = new ArrayList<ProductOption>();
        }
        return this.productOption;
    }

    /**
     * Gets the value of the productAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAttribute }
     * 
     * 
     */
    public List<ProductAttribute> getProductAttribute() {
        if (productAttribute == null) {
            productAttribute = new ArrayList<ProductAttribute>();
        }
        return this.productAttribute;
    }

    /**
     * Gets the value of the productManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductManufacturer() {
        return productManufacturer;
    }

    /**
     * Sets the value of the productManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductManufacturer(String value) {
        this.productManufacturer = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

}
