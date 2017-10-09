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
@Table(name="servizifruibilita")
public class ServiziFruibilita implements Serializable {

	private Servizi idServizi;

	private Fruibilita idFruibilita;
	
	/**
	 * 
	 */
	public ServiziFruibilita() {
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
	 * @return the idFruibilita
	 */
	public Fruibilita getIdFruibilita() {
		return idFruibilita;
	}

	/**
	 * @param idFruibilita the idFruibilita to set
	 */
	public void setIdFruibilita(Fruibilita idFruibilita) {
		this.idFruibilita = idFruibilita;
	}
}
