//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.12 at 12:36:07 PM CEST 
//


package com.megatravel.agentlocalbackend.wsdl;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="samostalnaRezervacijaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="smestajId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="odDatuma" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="doDatuma" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "samostalnaRezervacijaId",
    "smestajId",
    "odDatuma",
    "doDatuma",
    "timestamp"
})
@XmlRootElement(name = "Samostalna_rezervacija")
public class SamostalnaRezervacija {

    private Long samostalnaRezervacijaId;
    private Long smestajId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    private Date odDatuma;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    private Date doDatuma;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    private Date timestamp;

    /**
     * Gets the value of the samostalnaRezervacijaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSamostalnaRezervacijaId() {
        return samostalnaRezervacijaId;
    }

    /**
     * Sets the value of the samostalnaRezervacijaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSamostalnaRezervacijaId(Long value) {
        this.samostalnaRezervacijaId = value;
    }

    /**
     * Gets the value of the smestajId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSmestajId() {
        return smestajId;
    }

    /**
     * Sets the value of the smestajId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSmestajId(Long value) {
        this.smestajId = value;
    }

    /**
     * Gets the value of the odDatuma property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOdDatuma() {
        return odDatuma;
    }

    /**
     * Sets the value of the odDatuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOdDatuma(Date value) {
        this.odDatuma = value;
    }

    /**
     * Gets the value of the doDatuma property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDoDatuma() {
        return doDatuma;
    }

    /**
     * Sets the value of the doDatuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDoDatuma(Date value) {
        this.doDatuma = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setTimestamp(Date value) {
        this.timestamp = value;
    }

}
