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
@Table(name="stampante")
public class Stampante implements Serializable {

	@Id
	private Integer id;

	private StampanteColore idStampanteColore;
	
	private StampanteModello idStampanteModello;
	
	private String descrizione;

	private String codaStampante;
	
	/**
	 * 
	 */
	public Stampante() {
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
	 * @return the idStampanteColore
	 */
	public StampanteColore getIdStampanteColore() {
		return idStampanteColore;
	}

	/**
	 * @param idStampanteColore the idStampanteColore to set
	 */
	public void setIdStampanteColore(StampanteColore idStampanteColore) {
		this.idStampanteColore = idStampanteColore;
	}

	/**
	 * @return the idStampanteModello
	 */
	public StampanteModello getIdStampanteModello() {
		return idStampanteModello;
	}

	/**
	 * @param idStampanteModello the idStampanteModello to set
	 */
	public void setIdStampanteModello(StampanteModello idStampanteModello) {
		this.idStampanteModello = idStampanteModello;
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
	 * @return the codaStampante
	 */
	public String getCodaStampante() {
		return codaStampante;
	}

	/**
	 * @param codaStampante the codaStampante to set
	 */
	public void setCodaStampante(String codaStampante) {
		this.codaStampante = codaStampante;
	}
}
