/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="calendariofestivita")
public class CalendarioFestivita implements Serializable {

	private Integer giornoFestivita;

	private Integer meseFestivita;
	
	private String descrizione;

	/**
	 * 
	 */
	public CalendarioFestivita() {
	}

	/**
	 * @return the giornoFestivita
	 */
	public Integer getGiornoFestivita() {
		return giornoFestivita;
	}

	/**
	 * @param giornoFestivita the giornoFestivita to set
	 */
	public void setGiornoFestivita(Integer giornoFestivita) {
		this.giornoFestivita = giornoFestivita;
	}

	/**
	 * @return the meseFestivita
	 */
	public Integer getMeseFestivita() {
		return meseFestivita;
	}

	/**
	 * @param meseFestivita the meseFestivita to set
	 */
	public void setMeseFestivita(Integer meseFestivita) {
		this.meseFestivita = meseFestivita;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
