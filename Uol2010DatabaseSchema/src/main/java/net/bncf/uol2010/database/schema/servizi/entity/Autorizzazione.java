/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="autorizzazione")
public class Autorizzazione implements Serializable {

	@Id
	private Integer id;

	private Utente idUtente;

	private Servizi idServizi;

	private Date dataIni;

	private Date dataFin;

	private String note;

	private String cancellato;

	private Date data;

	/**
	 * 
	 */
	public Autorizzazione() {
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
	public Date getDataIni() {
		return dataIni;
	}

	/**
	 * @param dataIni the dataIni to set
	 */
	public void setDataIni(Date dataIni) {
		this.dataIni = dataIni;
	}

	/**
	 * @return the dataFin
	 */
	public Date getDataFin() {
		return dataFin;
	}

	/**
	 * @param dataFin the dataFin to set
	 */
	public void setDataFin(Date dataFin) {
		this.dataFin = dataFin;
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
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

}
