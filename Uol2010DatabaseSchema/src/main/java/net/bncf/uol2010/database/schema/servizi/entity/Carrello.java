/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="carrello")
public class Carrello implements Serializable {

	private String id;

	private UtenteBib idUtenteBib;

	private Timestamp dataCreazione;

	private Timestamp dataChiusura;

	private UtenteBib idUtenteBibRiconsegna;

	private Timestamp dataRiconsegna;

	private Timestamp dataChiusuraRiconsegna;

	private Integer stato;

	private Timestamp dataPubblicazione;

	private Date dataInvio;

	private Integer progInvio;

	/**
	 * 
	 */
	public Carrello() {
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
	 * @return the idUtenteBib
	 */
	public UtenteBib getIdUtenteBib() {
		return idUtenteBib;
	}

	/**
	 * @param idUtenteBib the idUtenteBib to set
	 */
	public void setIdUtenteBib(UtenteBib idUtenteBib) {
		this.idUtenteBib = idUtenteBib;
	}

	/**
	 * @return the dataCreazione
	 */
	public Timestamp getDataCreazione() {
		return dataCreazione;
	}

	/**
	 * @param dataCreazione the dataCreazione to set
	 */
	public void setDataCreazione(Timestamp dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	/**
	 * @return the dataChiusura
	 */
	public Timestamp getDataChiusura() {
		return dataChiusura;
	}

	/**
	 * @param dataChiusura the dataChiusura to set
	 */
	public void setDataChiusura(Timestamp dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	/**
	 * @return the idUtenteBibRiconsegna
	 */
	public UtenteBib getIdUtenteBibRiconsegna() {
		return idUtenteBibRiconsegna;
	}

	/**
	 * @param idUtenteBibRiconsegna the idUtenteBibRiconsegna to set
	 */
	public void setIdUtenteBibRiconsegna(UtenteBib idUtenteBibRiconsegna) {
		this.idUtenteBibRiconsegna = idUtenteBibRiconsegna;
	}

	/**
	 * @return the dataRiconsegna
	 */
	public Timestamp getDataRiconsegna() {
		return dataRiconsegna;
	}

	/**
	 * @param dataRiconsegna the dataRiconsegna to set
	 */
	public void setDataRiconsegna(Timestamp dataRiconsegna) {
		this.dataRiconsegna = dataRiconsegna;
	}

	/**
	 * @return the dataChiusuraRiconsegna
	 */
	public Timestamp getDataChiusuraRiconsegna() {
		return dataChiusuraRiconsegna;
	}

	/**
	 * @param dataChiusuraRiconsegna the dataChiusuraRiconsegna to set
	 */
	public void setDataChiusuraRiconsegna(Timestamp dataChiusuraRiconsegna) {
		this.dataChiusuraRiconsegna = dataChiusuraRiconsegna;
	}

	/**
	 * @return the stato
	 */
	public Integer getStato() {
		return stato;
	}

	/**
	 * @param stato the stato to set
	 */
	public void setStato(Integer stato) {
		this.stato = stato;
	}

	/**
	 * @return the dataPubblicazione
	 */
	public Timestamp getDataPubblicazione() {
		return dataPubblicazione;
	}

	/**
	 * @param dataPubblicazione the dataPubblicazione to set
	 */
	public void setDataPubblicazione(Timestamp dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}

	/**
	 * @return the dataInvio
	 */
	public Date getDataInvio() {
		return dataInvio;
	}

	/**
	 * @param dataInvio the dataInvio to set
	 */
	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	/**
	 * @return the progInvio
	 */
	public Integer getProgInvio() {
		return progInvio;
	}

	/**
	 * @param progInvio the progInvio to set
	 */
	public void setProgInvio(Integer progInvio) {
		this.progInvio = progInvio;
	}

}
