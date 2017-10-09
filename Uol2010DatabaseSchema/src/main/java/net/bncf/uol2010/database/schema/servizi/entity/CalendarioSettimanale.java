/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="calendariosettimanale")
public class CalendarioSettimanale implements Serializable {

	private Servizi idServizi;

	private Integer giornoSettimanale;
	
	private Time apertura;

	private Time chiusura;

	/**
	 * 
	 */
	public CalendarioSettimanale() {
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
	 * @return the giornoSettimanale
	 */
	public Integer getGiornoSettimanale() {
		return giornoSettimanale;
	}

	/**
	 * @param giornoSettimanale the giornoSettimanale to set
	 */
	public void setGiornoSettimanale(Integer giornoSettimanale) {
		this.giornoSettimanale = giornoSettimanale;
	}

	/**
	 * @return the apertura
	 */
	public Time getApertura() {
		return apertura;
	}

	/**
	 * @param apertura the apertura to set
	 */
	public void setApertura(Time apertura) {
		this.apertura = apertura;
	}

	/**
	 * @return the chiusura
	 */
	public Time getChiusura() {
		return chiusura;
	}

	/**
	 * @param chiusura the chiusura to set
	 */
	public void setChiusura(Time chiusura) {
		this.chiusura = chiusura;
	}

}
