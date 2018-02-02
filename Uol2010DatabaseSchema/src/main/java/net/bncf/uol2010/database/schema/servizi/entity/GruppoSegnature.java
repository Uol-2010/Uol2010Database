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
@Table(name="grupppsegnature")
public class GruppoSegnature implements Serializable {

	@Id
	private Integer id;

	private Fruibilita idFruibilita;
	
	private Disponibilita idDisponibilita;
	
	private String segnaturaStart;
	
	private String segnaturaStop;
	
	private String segnaturaStartKey;
	
	private String segnaturaStopKey;
	
	private String natura;
	
	private String note;

	/**
	 * 
	 */
	public GruppoSegnature() {
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
	 * @return the idFruibilita
	 */
	public Fruibilita getIdFruibilita() {
		return idFruibilita;
	}

	/**
	 * @param idFruibilita the idFruibilita to set
	 */
	public void setIdFruibilita(Fruibilita idFruibilita) {
		this.idFruibilita = idFruibilita;
	}

	/**
	 * @return the idDidponibilita
	 */
	public Disponibilita getIdDisponibilita() {
		return idDisponibilita;
	}

	/**
	 * @param idDidponibilita the idDidponibilita to set
	 */
	public void setIdDisponibilita(Disponibilita idDisponibilita) {
		this.idDisponibilita = idDisponibilita;
	}

	/**
	 * @return the segnaturaStart
	 */
	public String getSegnaturaStart() {
		return segnaturaStart;
	}

	/**
	 * @param segnaturaStart the segnaturaStart to set
	 */
	public void setSegnaturaStart(String segnaturaStart) {
		this.segnaturaStart = segnaturaStart;
	}

	/**
	 * @return the segnaturaStop
	 */
	public String getSegnaturaStop() {
		return segnaturaStop;
	}

	/**
	 * @param segnaturaStop the segnaturaStop to set
	 */
	public void setSegnaturaStop(String segnaturaStop) {
		this.segnaturaStop = segnaturaStop;
	}

	/**
	 * @return the segnaturaStartKey
	 */
	public String getSegnaturaStartKey() {
		return segnaturaStartKey;
	}

	/**
	 * @param segnaturaStartKey the segnaturaStartKey to set
	 */
	public void setSegnaturaStartKey(String segnaturaStartKey) {
		this.segnaturaStartKey = segnaturaStartKey;
	}

	/**
	 * @return the segnaturaStopKey
	 */
	public String getSegnaturaStopKey() {
		return segnaturaStopKey;
	}

	/**
	 * @param segnaturaStopKey the segnaturaStopKey to set
	 */
	public void setSegnaturaStopKey(String segnaturaStopKey) {
		this.segnaturaStopKey = segnaturaStopKey;
	}

	/**
	 * @return the natura
	 */
	public String getNatura() {
		return natura;
	}

	/**
	 * @param natura the natura to set
	 */
	public void setNatura(String natura) {
		this.natura = natura;
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
