/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="fruibilita")
public class Fruibilita implements Serializable {

	@Id
	private String id;

	private String descrizione;

	/**
	 * 
	 */
	public Fruibilita() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
