//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 12:36:07 PM CEST 
//


package com.megatravel.agentlocalbackend.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipSmestaja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipSmestaja"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTipaSmestaja" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nazivTipaSmestaja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="smestaji" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipSmestaja", propOrder = {
    "idTipaSmestaja",
    "nazivTipaSmestaja",
    "smestaji"
})
public class TipSmestaja {

    private long idTipaSmestaja;
    @XmlElement(required = true)
    private String nazivTipaSmestaja;
    @XmlElement(nillable = true)
    private List<Object> smestaji;

    /**
     * Gets the value of the idTipaSmestaja property.
     * 
     */
    public long getIdTipaSmestaja() {
        return idTipaSmestaja;
    }

    /**
     * Sets the value of the idTipaSmestaja property.
     * 
     */
    public void setIdTipaSmestaja(long value) {
        this.idTipaSmestaja = value;
    }

    /**
     * Gets the value of the nazivTipaSmestaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivTipaSmestaja() {
        return nazivTipaSmestaja;
    }

    /**
     * Sets the value of the nazivTipaSmestaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivTipaSmestaja(String value) {
        this.nazivTipaSmestaja = value;
    }

    /**
     * Gets the value of the smestaji property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smestaji property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmestaji().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSmestaji() {
        if (smestaji == null) {
            smestaji = new ArrayList<Object>();
        }
        return this.smestaji;
    }

}
