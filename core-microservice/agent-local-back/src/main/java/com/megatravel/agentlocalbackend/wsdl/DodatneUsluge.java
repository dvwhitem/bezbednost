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
 * <p>Java class for DodatneUsluge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DodatneUsluge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idDodatneUsluge" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nazivDodatneUsluge" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listaSmestaja" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DodatneUsluge", propOrder = {
    "idDodatneUsluge",
    "nazivDodatneUsluge",
    "listaSmestaja"
})
public class DodatneUsluge {

    private long idDodatneUsluge;
    @XmlElement(required = true)
    private String nazivDodatneUsluge;
    @XmlElement(required = true)
    private List<Object> listaSmestaja;

    /**
     * Gets the value of the idDodatneUsluge property.
     * 
     */
    public long getIdDodatneUsluge() {
        return idDodatneUsluge;
    }

    /**
     * Sets the value of the idDodatneUsluge property.
     * 
     */
    public void setIdDodatneUsluge(long value) {
        this.idDodatneUsluge = value;
    }

    /**
     * Gets the value of the nazivDodatneUsluge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivDodatneUsluge() {
        return nazivDodatneUsluge;
    }

    /**
     * Sets the value of the nazivDodatneUsluge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivDodatneUsluge(String value) {
        this.nazivDodatneUsluge = value;
    }

    /**
     * Gets the value of the listaSmestaja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaSmestaja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaSmestaja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getListaSmestaja() {
        if (listaSmestaja == null) {
            listaSmestaja = new ArrayList<Object>();
        }
        return this.listaSmestaja;
    }

}
