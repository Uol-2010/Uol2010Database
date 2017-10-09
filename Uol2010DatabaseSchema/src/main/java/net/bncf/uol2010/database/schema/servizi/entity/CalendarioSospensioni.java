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
@Table(name="calendariosospensioni")
public class CalendarioSospensioni implements Serializable {

	private Servizi idServizi;

	private Integer giornoInizio;

	private Integer giornoFine;

	private Integer mese;

	private String descrizione;

	/**
	 * 
	 */
	public CalendarioSospensioni() {
	}

	/**
	 * @return the idServizi
	 */
	public Servizi getIdServizi() {
		return idServizi;
	}

	/**
	 * @param idServizi the idServizi to set
	 */
	public void setIdServizi(Servizi idServizi) {
		this.idServizi = idServizi;
	}

	/**
	 * @return the giornoInizio
	 */
	public Integer getGiornoInizio() {
		return giornoInizio;
	}

	/**
	 * @param giornoInizio the giornoInizio to set
	 */
	public void setGiornoInizio(Integer giornoInizio) {
		this.giornoInizio = giornoInizio;
	}

	/**
	 * @return the giornoFine
	 */
	public Integer getGiornoFine() {
		return giornoFine;
	}

	/**
	 * @param giornoFine the giornoFine to set
	 */
	public void setGiornoFine(Integer giornoFine) {
		this.giornoFine = giornoFine;
	}

	/**
	 * @return the mese
	 */
	public Integer getMese() {
		return mese;
	}

	/**
	 * @param mese the mese to set
	 */
	public void setMese(Integer mese) {
		this.mese = mese;
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
