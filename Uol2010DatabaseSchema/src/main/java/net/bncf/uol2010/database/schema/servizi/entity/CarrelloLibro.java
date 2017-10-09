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
@Table(name = "carrellolibro")
public class CarrelloLibro implements Serializable {

	private String id;
	private Carrello idCarrello;
	private String barcode;
	private String bid;
	private String autore;
	private String titolo;
	private String pubblicazione;
	private String descrizioneFisica;
	private Integer annoPeriodico;
	private String collocazione;
	private String invntario;
	private UtenteBib idUtenteBib;
	private Timestamp dataIns;
	private UtenteBib idUtenteBibRiconsegna;
	private Timestamp dataRiconsegna;
	private Integer stato;
	private Timestamp dataBlocco;
	private Timestamp dataSblocco;
	private Richieste idRichiesta;
	private Integer numOpera;

	/**
	 * 
	 */
	public CarrelloLibro() {
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
	 * @return the idUtenteBib
	 */
	public UtenteBib getIdUtenteBib() {
		return idUtenteBib;
	}

	/**
	 * @param idUtenteBib
	 *            the idUtenteBib to set
	 */
	public void setIdUtenteBib(UtenteBib idUtenteBib) {
		this.idUtenteBib = idUtenteBib;
	}

	/**
	 * @return the idUtenteBibRiconsegna
	 */
	public UtenteBib getIdUtenteBibRiconsegna() {
		return idUtenteBibRiconsegna;
	}

	/**
	 * @param idUtenteBibRiconsegna
	 *            the idUtenteBibRiconsegna to set
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
	 * @param dataRiconsegna
	 *            the dataRiconsegna to set
	 */
	public void setDataRiconsegna(Timestamp dataRiconsegna) {
		this.dataRiconsegna = dataRiconsegna;
	}

	/**
	 * @return the stato
	 */
	public Integer getStato() {
		return stato;
	}

	/**
	 * @param stato
	 *            the stato to set
	 */
	public void setStato(Integer stato) {
		this.stato = stato;
	}

	/**
	 * @return the idCarrello
	 */
	public Carrello getIdCarrello() {
		return idCarrello;
	}

	/**
	 * @param idCarrello the idCarrello to set
	 */
	public void setIdCarrello(Carrello idCarrello) {
		this.idCarrello = idCarrello;
	}

	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return the bid
	 */
	public String getBid() {
		return bid;
	}

	/**
	 * @param bid the bid to set
	 */
	public void setBid(String bid) {
		this.bid = bid;
	}

	/**
	 * @return the autore
	 */
	public String getAutore() {
		return autore;
	}

	/**
	 * @param autore the autore to set
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the pubblicazione
	 */
	public String getPubblicazione() {
		return pubblicazione;
	}

	/**
	 * @param pubblicazione the pubblicazione to set
	 */
	public void setPubblicazione(String pubblicazione) {
		this.pubblicazione = pubblicazione;
	}

	/**
	 * @return the descrizioneFisica
	 */
	public String getDescrizioneFisica() {
		return descrizioneFisica;
	}

	/**
	 * @param descrizioneFisica the descrizioneFisica to set
	 */
	public void setDescrizioneFisica(String descrizioneFisica) {
		this.descrizioneFisica = descrizioneFisica;
	}

	/**
	 * @return the annoPeriodico
	 */
	public Integer getAnnoPeriodico() {
		return annoPeriodico;
	}

	/**
	 * @param annoPeriodico the annoPeriodico to set
	 */
	public void setAnnoPeriodico(Integer annoPeriodico) {
		this.annoPeriodico = annoPeriodico;
	}

	/**
	 * @return the collocazione
	 */
	public String getCollocazione() {
		return collocazione;
	}

	/**
	 * @param collocazione the collocazione to set
	 */
	public void setCollocazione(String collocazione) {
		this.collocazione = collocazione;
	}

	/**
	 * @return the invntario
	 */
	public String getInvntario() {
		return invntario;
	}

	/**
	 * @param invntario the invntario to set
	 */
	public void setInvntario(String invntario) {
		this.invntario = invntario;
	}

	/**
	 * @return the dataIns
	 */
	public Timestamp getDataIns() {
		return dataIns;
	}

	/**
	 * @param dataIns the dataIns to set
	 */
	public void setDataIns(Timestamp dataIns) {
		this.dataIns = dataIns;
	}

	/**
	 * @return the dataBlocco
	 */
	public Timestamp getDataBlocco() {
		return dataBlocco;
	}

	/**
	 * @param dataBlocco the dataBlocco to set
	 */
	public void setDataBlocco(Timestamp dataBlocco) {
		this.dataBlocco = dataBlocco;
	}

	/**
	 * @return the dataSblocco
	 */
	public Timestamp getDataSblocco() {
		return dataSblocco;
	}

	/**
	 * @param dataSblocco the dataSblocco to set
	 */
	public void setDataSblocco(Timestamp dataSblocco) {
		this.dataSblocco = dataSblocco;
	}

	/**
	 * @return the idRichiesta
	 */
	public Richieste getIdRichiesta() {
		return idRichiesta;
	}

	/**
	 * @param idRichiesta the idRichiesta to set
	 */
	public void setIdRichiesta(Richieste idRichiesta) {
		this.idRichiesta = idRichiesta;
	}

	/**
	 * @return the numOpera
	 */
	public Integer getNumOpera() {
		return numOpera;
	}

	/**
	 * @param numOpera the numOpera to set
	 */
	public void setNumOpera(Integer numOpera) {
		this.numOpera = numOpera;
	}

}
