/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="autorzzazionibib")
public class AutorizzazioniBib implements Serializable {

	@Id
	private Integer id;

	private String descrizione;
	
	/**
	 * 
	 */
	public AutorizzazioniBib() {
		// TODO Auto-generated constructor stub
	}

	@Column(name="ID_AUTORIZZAZIONIBIB", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="DESCRIZIONE", nullable=false)
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
