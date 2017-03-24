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
@Table(name="richieste")
public class Richieste implements Serializable {

	@Id
	private Integer id;

	private Utente idUtente;
	
	private StatoMovimento idStatoMovimenti;
	
	private Servizi idServizi;

	private Integer progIter;

	private Fruibilita idFruibilita;

	private Timestamp dataIns;

	private Timestamp dataMod;

	private String bid;

	private String autore;

	private String titolo;

	private String pubblicazione;

	private String inventario;

	private String precInv1;

	private String precInv2;

	private String segnatura;

	private String segnaturaKey;

	private Integer annoPeriodico;

	private String natura;

	private Integer annata;

	private String fascicoli;

	private Timestamp dataIniPrev;

	private Timestamp dataFinPrev;

	private Timestamp dataIniEff;

	private Timestamp dataFinEff;

	private String noteUte;

	private String noteBib;

	private Boolean notificaStatoRichiesta;

	private Boolean emailStatoRichiesta;

	private Integer numRinnovi;

	private String indirizzoIp;

	private String volume;

	/**
	 * 
	 */
	public Richieste() {
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
	 * @return the idStatoMovimenti
	 */
	public StatoMovimento getIdStatoMovimenti() {
		return idStatoMovimenti;
	}

	/**
	 * @param idStatoMovimenti the idStatoMovimenti to set
	 */
	public void setIdStatoMovimenti(StatoMovimento idStatoMovimenti) {
		this.idStatoMovimenti = idStatoMovimenti;
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
	 * @return the progIter
	 */
	public Integer getProgIter() {
		return progIter;
	}

	/**
	 * @param progIter the progIter to set
	 */
	public void setProgIter(Integer progIter) {
		this.progIter = progIter;
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
	 * @return the dataMod
	 */
	public Timestamp getDataMod() {
		return dataMod;
	}

	/**
	 * @param dataMod the dataMod to set
	 */
	public void setDataMod(Timestamp dataMod) {
		this.dataMod = dataMod;
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
	 * @return the inventario
	 */
	public String getInventario() {
		return inventario;
	}

	/**
	 * @param inventario the inventario to set
	 */
	public void setInventario(String inventario) {
		this.inventario = inventario;
	}

	/**
	 * @return the precInv1
	 */
	public String getPrecInv1() {
		return precInv1;
	}

	/**
	 * @param precInv1 the precInv1 to set
	 */
	public void setPrecInv1(String precInv1) {
		this.precInv1 = precInv1;
	}

	/**
	 * @return the precInv2
	 */
	public String getPrecInv2() {
		return precInv2;
	}

	/**
	 * @param precInv2 the precInv2 to set
	 */
	public void setPrecInv2(String precInv2) {
		this.precInv2 = precInv2;
	}

	/**
	 * @return the segnatura
	 */
	public String getSegnatura() {
		return segnatura;
	}

	/**
	 * @param segnatura the segnatura to set
	 */
	public void setSegnatura(String segnatura) {
		this.segnatura = segnatura;
	}

	/**
	 * @return the segnaturaKey
	 */
	public String getSegnaturaKey() {
		return segnaturaKey;
	}

	/**
	 * @param segnaturaKey the segnaturaKey to set
	 */
	public void setSegnaturaKey(String segnaturaKey) {
		this.segnaturaKey = segnaturaKey;
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
	 * @return the annata
	 */
	public Integer getAnnata() {
		return annata;
	}

	/**
	 * @param annata the annata to set
	 */
	public void setAnnata(Integer annata) {
		this.annata = annata;
	}

	/**
	 * @return the fascicoli
	 */
	public String getFascicoli() {
		return fascicoli;
	}

	/**
	 * @param fascicoli the fascicoli to set
	 */
	public void setFascicoli(String fascicoli) {
		this.fascicoli = fascicoli;
	}

	/**
	 * @return the dataIniPrev
	 */
	public Timestamp getDataIniPrev() {
		return dataIniPrev;
	}

	/**
	 * @param dataIniPrev the dataIniPrev to set
	 */
	public void setDataIniPrev(Timestamp dataIniPrev) {
		this.dataIniPrev = dataIniPrev;
	}

	/**
	 * @return the dataFinPrev
	 */
	public Timestamp getDataFinPrev() {
		return dataFinPrev;
	}

	/**
	 * @param dataFinPrev the dataFinPrev to set
	 */
	public void setDataFinPrev(Timestamp dataFinPrev) {
		this.dataFinPrev = dataFinPrev;
	}

	/**
	 * @return the dataIniEff
	 */
	public Timestamp getDataIniEff() {
		return dataIniEff;
	}

	/**
	 * @param dataIniEff the dataIniEff to set
	 */
	public void setDataIniEff(Timestamp dataIniEff) {
		this.dataIniEff = dataIniEff;
	}

	/**
	 * @return the dataFinEff
	 */
	public Timestamp getDataFinEff() {
		return dataFinEff;
	}

	/**
	 * @param dataFinEff the dataFinEff to set
	 */
	public void setDataFinEff(Timestamp dataFinEff) {
		this.dataFinEff = dataFinEff;
	}

	/**
	 * @return the noteUte
	 */
	public String getNoteUte() {
		return noteUte;
	}

	/**
	 * @param noteUte the noteUte to set
	 */
	public void setNoteUte(String noteUte) {
		this.noteUte = noteUte;
	}

	/**
	 * @return the noteBib
	 */
	public String getNoteBib() {
		return noteBib;
	}

	/**
	 * @param noteBib the noteBib to set
	 */
	public void setNoteBib(String noteBib) {
		this.noteBib = noteBib;
	}

	/**
	 * @return the notificaStatoRichiesta
	 */
	public Boolean getNotificaStatoRichiesta() {
		return notificaStatoRichiesta;
	}

	/**
	 * @param notificaStatoRichiesta the notificaStatoRichiesta to set
	 */
	public void setNotificaStatoRichiesta(Boolean notificaStatoRichiesta) {
		this.notificaStatoRichiesta = notificaStatoRichiesta;
	}

	/**
	 * @return the emailStatoRichiesta
	 */
	public Boolean getEmailStatoRichiesta() {
		return emailStatoRichiesta;
	}

	/**
	 * @param emailStatoRichiesta the emailStatoRichiesta to set
	 */
	public void setEmailStatoRichiesta(Boolean emailStatoRichiesta) {
		this.emailStatoRichiesta = emailStatoRichiesta;
	}

	/**
	 * @return the numRinnovi
	 */
	public Integer getNumRinnovi() {
		return numRinnovi;
	}

	/**
	 * @param numRinnovi the numRinnovi to set
	 */
	public void setNumRinnovi(Integer numRinnovi) {
		this.numRinnovi = numRinnovi;
	}

	/**
	 * @return the indirizzoIp
	 */
	public String getIndirizzoIp() {
		return indirizzoIp;
	}

	/**
	 * @param indirizzoIp the indirizzoIp to set
	 */
	public void setIndirizzoIp(String indirizzoIp) {
		this.indirizzoIp = indirizzoIp;
	}

	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

}
