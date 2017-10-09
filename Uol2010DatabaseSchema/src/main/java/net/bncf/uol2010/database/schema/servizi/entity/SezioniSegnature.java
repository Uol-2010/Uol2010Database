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
@Table(name="sezionisegnature")
public class SezioniSegnature implements Serializable {

	private Integer id;

	private Disponibilita idDisponibilita;

	private String sezioniSegnature;
	
	private Timestamp dataIni;
	
	private Timestamp dataFin;
	
	private String note;
	
	private String sezioniSegnatureKey;

	/**
	 * 
	 */
	public SezioniSegnature() {
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
	 * @return the idDisponibilita
	 */
	public Disponibilita getIdDisponibilita() {
		return idDisponibilita;
	}

	/**
	 * @param idDisponibilita the idDisponibilita to set
	 */
	public void setIdDisponibilita(Disponibilita idDisponibilita) {
		this.idDisponibilita = idDisponibilita;
	}

	/**
	 * @return the sezioniSegnature
	 */
	public String getSezioniSegnature() {
		return sezioniSegnature;
	}

	/**
	 * @param sezioniSegnature the sezioniSegnature to set
	 */
	public void setSezioniSegnature(String sezioniSegnature) {
		this.sezioniSegnature = sezioniSegnature;
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
	 * @return the sezioniSegnatureKey
	 */
	public String getSezioniSegnatureKey() {
		return sezioniSegnatureKey;
	}

	/**
	 * @param sezioniSegnatureKey the sezioniSegnatureKey to set
	 */
	public void setSezioniSegnatureKey(String sezioniSegnatureKey) {
		this.sezioniSegnatureKey = sezioniSegnatureKey;
	}
}
