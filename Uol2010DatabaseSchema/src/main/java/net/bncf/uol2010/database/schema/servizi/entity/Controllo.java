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
@Table(name="controlliservizio")
public class Controllo implements Serializable {

	@Id
	private Integer id;

	private String descrizione;

	private String classe;
	
	private String tipoControllo;
	
	/**
	 * 
	 */
	public Controllo() {
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}

	/**
	 * @return the tipoControllo
	 */
	public String getTipoControllo() {
		return tipoControllo;
	}

	/**
	 * @param tipoControllo the tipoControllo to set
	 */
	public void setTipoControllo(String tipoControllo) {
		this.tipoControllo = tipoControllo;
	}
}
