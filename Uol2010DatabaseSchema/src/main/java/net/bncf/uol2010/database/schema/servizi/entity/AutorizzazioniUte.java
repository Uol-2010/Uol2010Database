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
@Table(name="autorizzazioniute")
public class AutorizzazioniUte implements Serializable {

	@Id
	private String id;

	private String  descrizione;
	
	private Integer autorizzazioneDef;
	
	/**
	 * 
	 */
	public AutorizzazioniUte() {
	}

	public String getId() {
		return id;
	}

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

	/**
	 * @return the autorizzazioneDef
	 */
	public Integer getAutorizzazioneDef() {
		return autorizzazioneDef;
	}

	/**
	 * @param autorizzazioneDef the autorizzazioneDef to set
	 */
	public void setAutorizzazioneDef(Integer autorizzazioneDef) {
		this.autorizzazioneDef = autorizzazioneDef;
	}

}
