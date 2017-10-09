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
@Table(name="stampantemodello")
public class StampanteModello implements Serializable {

	@Id
	private Integer id;
	
	private String descrizione;

	private String fileModello;
	
	/**
	 * 
	 */
	public StampanteModello() {
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
	 * @return the fileModello
	 */
	public String getFileModello() {
		return fileModello;
	}

	/**
	 * @param fileModello the fileModello to set
	 */
	public void setFileModello(String fileModello) {
		this.fileModello = fileModello;
	}
}
