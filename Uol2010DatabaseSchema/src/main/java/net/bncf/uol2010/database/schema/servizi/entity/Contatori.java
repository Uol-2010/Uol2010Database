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
@Table(name="contatori")
public class Contatori implements Serializable {

	@Id
	private String id;

	private Integer ultimoVal;

	/**
	 * 
	 */
	public Contatori() {
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
	 * @return the ultimoVal
	 */
	public Integer getUltimoVal() {
		return ultimoVal;
	}

	/**
	 * @param ultimoVal the ultimoVal to set
	 */
	public void setUltimoVal(Integer ultimoVal) {
		this.ultimoVal = ultimoVal;
	}
}
