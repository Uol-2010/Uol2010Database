/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name = "cassettiera")
public class Cassettiera implements Serializable {

	private String id;
	private String idCassetto;
	private Utente idUtente;
	private Timestamp dataIngresso;
	private Timestamp dataUscita;

	/**
	 * 
	 */
	public Cassettiera() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the idCassetto
	 */
	public String getIdCassetto() {
		return idCassetto;
	}

	/**
	 * @param idCassetto the idCassetto to set
	 */
	public void setIdCassetto(String idCassetto) {
		this.idCassetto = idCassetto;
	}

	/**
	 * @return the idUtente
	 */
	public Utente getIdUtente() {
		return idUtente;
	}

	/**
	 * @param idUtente the idUtente to set
	 */
	public void setIdUtente(Utente idUtente) {
		this.idUtente = idUtente;
	}

	/**
	 * @return the dataIngresso
	 */
	public Timestamp getDataIngresso() {
		return dataIngresso;
	}

	/**
	 * @param dataIngresso the dataIngresso to set
	 */
	public void setDataIngresso(Timestamp dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	/**
	 * @return the dataUscita
	 */
	public Timestamp getDataUscita() {
		return dataUscita;
	}

	/**
	 * @param dataUscita the dataUscita to set
	 */
	public void setDataUscita(Timestamp dataUscita) {
		this.dataUscita = dataUscita;
	}

}
