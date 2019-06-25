//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.11 at 02:01:01 PM CEST 
//


package io.xws.adminservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Komentar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idKomentara;
	
	@NotNull
    private Long idSmestaja;
	
	@NotNull
    private Long idRezervacije;
	
	@NotNull
    private Long idKorisnika;
	
	@NotNull
    private String komentar;
	
	@NotNull
    private Date timestamp;
	
	@NotNull
    private StatusKomentara status;
    
    public Komentar() {	}

	public StatusKomentara getStatus() {
		return status;
	}

	public void setStatus(StatusKomentara status) {
		this.status = status;
	}

	public Date getTimestamp() {
		return timestamp;
	}
	
	

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
     * Gets the value of the idKomentara property.
     * 
     */
    public Long getIdKomentara() {
        return idKomentara;
    }

    /**
     * Gets the value of the idSmestaja property.
     * 
     */
    public Long getIdSmestaja() {
        return idSmestaja;
    }
    
    /**
     * Gets the value of the idRezervacije property.
     * 
     */
    public Long getIdRezervacije() {
        return idRezervacije;
    }

    /**
     * Gets the value of the idKorisnika property.
     * 
     */
    public Long getIdKorisnika() {
        return idKorisnika;
    }

    /**
     * Gets the value of the komentar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKomentar() {
        return komentar;
    }

    /**
     * Sets the value of the komentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKomentar(String value) {
        this.komentar = value;
        this.timestamp = new Date(System.currentTimeMillis());
    }

}
