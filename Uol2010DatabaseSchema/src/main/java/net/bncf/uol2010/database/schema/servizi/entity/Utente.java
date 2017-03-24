/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="utente")
public class Utente implements Serializable {

	@Id
	private String id;

	private AutorizzazioniUte idAutorizzazioniUtente;
	
	private UtenteProfessione idUtenteProfessione;
	
	private UtenteProvenienza idUtenteProvenienza;

	private UtenteCittadinanza idUtenteCittadinanza;

	private UtenteTipoDocumento idUtenteTipoDocumento;

	private String password;

	private Timestamp dataIns;

	private Timestamp dataMod;

	private String cognome;

	private String nome;

	private String sesso;

	private String residenzaIndirizzo;

	private String residenzaCitta;

	private String residenzaCap;

	private String domicilioIndirizzo;

	private String domicilioCitta;

	private String domicilioCap;

	private String telefono;

	private String cellulare;

	private String luogoNascita;

	private Date dataNascita;

	private String numeroDocumento;

	private String autoritaRilascio;

	private String codiceFiscale;

	private String note;

	private String email;

	private String cognomeKey;

	private String nomeKey;

	private Integer limiteTraffico;
	
	/**
	 * 
	 */
	public Utente() {
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
	 * @return the idAutorizzazioniUtente
	 */
	public AutorizzazioniUte getIdAutorizzazioniUtente() {
		return idAutorizzazioniUtente;
	}

	/**
	 * @param idAutorizzazioniUtente the idAutorizzazioniUtente to set
	 */
	public void setIdAutorizzazioniUtente(AutorizzazioniUte idAutorizzazioniUtente) {
		this.idAutorizzazioniUtente = idAutorizzazioniUtente;
	}

	/**
	 * @return the idUtenteProfessione
	 */
	public UtenteProfessione getIdUtenteProfessione() {
		return idUtenteProfessione;
	}

	/**
	 * @param idUtenteProfessione the idUtenteProfessione to set
	 */
	public void setIdUtenteProfessione(UtenteProfessione idUtenteProfessione) {
		this.idUtenteProfessione = idUtenteProfessione;
	}

	/**
	 * @return the idUtenteProvenienza
	 */
	public UtenteProvenienza getIdUtenteProvenienza() {
		return idUtenteProvenienza;
	}

	/**
	 * @param idUtenteProvenienza the idUtenteProvenienza to set
	 */
	public void setIdUtenteProvenienza(UtenteProvenienza idUtenteProvenienza) {
		this.idUtenteProvenienza = idUtenteProvenienza;
	}

	/**
	 * @return the idUtenteCittadinanza
	 */
	public UtenteCittadinanza getIdUtenteCittadinanza() {
		return idUtenteCittadinanza;
	}

	/**
	 * @param idUtenteCittadinanza the idUtenteCittadinanza to set
	 */
	public void setIdUtenteCittadinanza(UtenteCittadinanza idUtenteCittadinanza) {
		this.idUtenteCittadinanza = idUtenteCittadinanza;
	}

	/**
	 * @return the idUtenteTipoDocumento
	 */
	public UtenteTipoDocumento getIdUtenteTipoDocumento() {
		return idUtenteTipoDocumento;
	}

	/**
	 * @param idUtenteTipoDocumento the idUtenteTipoDocumento to set
	 */
	public void setIdUtenteTipoDocumento(UtenteTipoDocumento idUtenteTipoDocumento) {
		this.idUtenteTipoDocumento = idUtenteTipoDocumento;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sesso
	 */
	public String getSesso() {
		return sesso;
	}

	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return the residenzaIndirizzo
	 */
	public String getResidenzaIndirizzo() {
		return residenzaIndirizzo;
	}

	/**
	 * @param residenzaIndirizzo the residenzaIndirizzo to set
	 */
	public void setResidenzaIndirizzo(String residenzaIndirizzo) {
		this.residenzaIndirizzo = residenzaIndirizzo;
	}

	/**
	 * @return the residenzaCitta
	 */
	public String getResidenzaCitta() {
		return residenzaCitta;
	}

	/**
	 * @param residenzaCitta the residenzaCitta to set
	 */
	public void setResidenzaCitta(String residenzaCitta) {
		this.residenzaCitta = residenzaCitta;
	}

	/**
	 * @return the residenzaCap
	 */
	public String getResidenzaCap() {
		return residenzaCap;
	}

	/**
	 * @param residenzaCap the residenzaCap to set
	 */
	public void setResidenzaCap(String residenzaCap) {
		this.residenzaCap = residenzaCap;
	}

	/**
	 * @return the domicilioIndirizzo
	 */
	public String getDomicilioIndirizzo() {
		return domicilioIndirizzo;
	}

	/**
	 * @param domicilioIndirizzo the domicilioIndirizzo to set
	 */
	public void setDomicilioIndirizzo(String domicilioIndirizzo) {
		this.domicilioIndirizzo = domicilioIndirizzo;
	}

	/**
	 * @return the domicilioCitta
	 */
	public String getDomicilioCitta() {
		return domicilioCitta;
	}

	/**
	 * @param domicilioCitta the domicilioCitta to set
	 */
	public void setDomicilioCitta(String domicilioCitta) {
		this.domicilioCitta = domicilioCitta;
	}

	/**
	 * @return the comicilioCap
	 */
	public String getDomicilioCap() {
		return domicilioCap;
	}

	/**
	 * @param comicilioCap the comicilioCap to set
	 */
	public void setDomicilioCap(String domicilioCap) {
		this.domicilioCap = domicilioCap;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the cellulare
	 */
	public String getCellulare() {
		return cellulare;
	}

	/**
	 * @param cellulare the cellulare to set
	 */
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	/**
	 * @return the luogoNascita
	 */
	public String getLuogoNascita() {
		return luogoNascita;
	}

	/**
	 * @param luogoNascita the luogoNascita to set
	 */
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	/**
	 * @return the dataNascita
	 */
	public Date getDataNascita() {
		return dataNascita;
	}

	/**
	 * @param dataNascita the dataNascita to set
	 */
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the autoritaRilascio
	 */
	public String getAutoritaRilascio() {
		return autoritaRilascio;
	}

	/**
	 * @param autoritaRilascio the autoritaRilascio to set
	 */
	public void setAutoritaRilascio(String autoritaRilascio) {
		this.autoritaRilascio = autoritaRilascio;
	}

	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cognomeKey
	 */
	public String getCognomeKey() {
		return cognomeKey;
	}

	/**
	 * @param cognomeKey the cognomeKey to set
	 */
	public void setCognomeKey(String cognomeKey) {
		this.cognomeKey = cognomeKey;
	}

	/**
	 * @return the nomeKey
	 */
	public String getNomeKey() {
		return nomeKey;
	}

	/**
	 * @param nomeKey the nomeKey to set
	 */
	public void setNomeKey(String nomeKey) {
		this.nomeKey = nomeKey;
	}

	/**
	 * @return the limiteTraffico
	 */
	public Integer getLimiteTraffico() {
		return limiteTraffico;
	}

	/**
	 * @param limiteTraffico the limiteTraffico to set
	 */
	public void setLimiteTraffico(Integer limiteTraffico) {
		this.limiteTraffico = limiteTraffico;
	}

}
