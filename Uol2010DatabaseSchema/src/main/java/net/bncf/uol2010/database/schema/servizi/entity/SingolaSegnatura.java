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
@Table(name="singolasegnatura")
public class SingolaSegnatura implements Serializable {

	private Integer id;

	private Disponibilita idDisponibilita;

	private String singolaSegnatura;
	
	private Timestamp dataIni;
	
	private Timestamp dataFin;
	
	private String note;
	
	private String singolaSegnaturaKey;

	/**
	 * 
	 */
	public SingolaSegnatura() {
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
	 * @return the singolaSegnatura
	 */
	public String getSingolaSegnatura() {
		return singolaSegnatura;
	}

	/**
	 * @param singolaSegnatura the singolaSegnatura to set
	 */
	public void setSingolaSegnatura(String singolaSegnatura) {
		this.singolaSegnatura = singolaSegnatura;
	}

	/**
	 * @return the singolaSegnaturaKey
	 */
	public String getSingolaSegnaturaKey() {
		return singolaSegnaturaKey;
	}

	/**
	 * @param singolaSegnaturaKey the singolaSegnaturaKey to set
	 */
	public void setSingolaSegnaturaKey(String singolaSegnaturaKey) {
		this.singolaSegnaturaKey = singolaSegnaturaKey;
	}
}
