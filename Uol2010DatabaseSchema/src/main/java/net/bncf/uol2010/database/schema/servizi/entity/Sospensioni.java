/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="sospensioni")
public class Sospensioni implements Serializable {

	@Id
	private Integer id;

	private Utente idUtente;
	
	private Servizi idServizi;
	
	private Timestamp dataIni;

	private Timestamp dataFin;

	private String cancellato;

	private String note;
	
	/**
	 * 
	 */
	public Sospensioni() {
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
	 * @return the idìUtente
	 */
	public Utente getIdUtente() {
		return idUtente;
	}

	/**
	 * @param idìUtente the idìUtente to set
	 */
	public void setIdUtente(Utente idUtente) {
		this.idUtente = idUtente;
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
	 * @return the dataIni
	 */
	public Timestamp getDataIni() {
		return dataIni;
	}

	/**
	 * @param dataIni the dataIni to set
	 */
	public void setDataIni(Timestamp dataIni) {
		this.dataIni = dataIni;
	}

	/**
	 * @return the dataFin
	 */
	public Timestamp getDataFin() {
		return dataFin;
	}

	/**
	 * @param dataFin the dataFin to set
	 */
	public void setDataFin(Timestamp dataFin) {
		this.dataFin = dataFin;
	}

	/**
	 * @return the cancellato
	 */
	public String getCancellato() {
		return cancellato;
	}

	/**
	 * @param cancellato the cancellato to set
	 */
	public void setCancellato(String cancellato) {
		this.cancellato = cancellato;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
}
