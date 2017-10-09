/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="calendarioeccezioni")
public class CalendarioEccezioni implements Serializable {

	private Servizi idServizi;

	private Date giorno;
	
	private Time orarioApertura;

	private Time orarioChiusura;

	/**
	 * 
	 */
	public CalendarioEccezioni() {
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
	 * @return the giorno
	 */
	public Date getGiorno() {
		return giorno;
	}

	/**
	 * @param giorno the giorno to set
	 */
	public void setGiorno(Date giorno) {
		this.giorno = giorno;
	}

	/**
	 * @return the orarioApertura
	 */
	public Time getOrarioApertura() {
		return orarioApertura;
	}

	/**
	 * @param orarioApertura the orarioApertura to set
	 */
	public void setOrarioApertura(Time orarioApertura) {
		this.orarioApertura = orarioApertura;
	}

	/**
	 * @return the orarioChiusura
	 */
	public Time getOrarioChiusura() {
		return orarioChiusura;
	}

	/**
	 * @param orarioChiusura the orarioChiusura to set
	 */
	public void setOrarioChiusura(Time orarioChiusura) {
		this.orarioChiusura = orarioChiusura;
	}

}
