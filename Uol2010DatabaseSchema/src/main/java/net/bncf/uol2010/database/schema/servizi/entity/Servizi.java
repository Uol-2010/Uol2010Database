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
@Table(name="servizi")
public class Servizi implements Serializable {

	@Id
	private String id;

	private String descrizione;
	
	private Integer maxMovimenti;
	
	private Integer durataMovimenti;

	private Integer durataDeposito;

	private Integer maxDepositi;

	private Integer ridisponibilitaMateriale;

	private String email;
	
	private Timestamp dataIns;
	
	private Timestamp dataMod;
	
	private Integer durataRinnovo1;
	
	private Integer durataRinnovo2;
	
	private Integer durataRinnovo3;
	
	private Integer ggDepositi;
	
	private Integer emailChiamate;
	
	private Integer sollecito;
	
	private Integer ggSollecito;
	
	/**
	 * 
	 */
	public Servizi() {
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
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the maxMovimnti
	 */
	public Integer getMaxMovimenti() {
		return maxMovimenti;
	}

	/**
	 * @param maxMovimnti the maxMovimnti to set
	 */
	public void setMaxMovimenti(Integer maxMovimenti) {
		this.maxMovimenti = maxMovimenti;
	}

	/**
	 * @return the durataMovimenti
	 */
	public Integer getDurataMovimenti() {
		return durataMovimenti;
	}

	/**
	 * @param durataMovimenti the durataMovimenti to set
	 */
	public void setDurataMovimenti(Integer durataMovimenti) {
		this.durataMovimenti = durataMovimenti;
	}

	/**
	 * @return the durataDeposito
	 */
	public Integer getDurataDeposito() {
		return durataDeposito;
	}

	/**
	 * @param durataDeposito the durataDeposito to set
	 */
	public void setDurataDeposito(Integer durataDeposito) {
		this.durataDeposito = durataDeposito;
	}

	/**
	 * @return the maxDepositi
	 */
	public Integer getMaxDepositi() {
		return maxDepositi;
	}

	/**
	 * @param maxDepositi the maxDepositi to set
	 */
	public void setMaxDepositi(Integer maxDepositi) {
		this.maxDepositi = maxDepositi;
	}

	/**
	 * @return the ridisponibilitaMateriale
	 */
	public Integer getRidisponibilitaMateriale() {
		return ridisponibilitaMateriale;
	}

	/**
	 * @param ridisponibilitaMateriale the ridisponibilitaMateriale to set
	 */
	public void setRidisponibilitaMateriale(Integer ridisponibilitaMateriale) {
		this.ridisponibilitaMateriale = ridisponibilitaMateriale;
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
	 * @return the durataRinnovo1
	 */
	public Integer getDurataRinnovo1() {
		return durataRinnovo1;
	}

	/**
	 * @param durataRinnovo1 the durataRinnovo1 to set
	 */
	public void setDurataRinnovo1(Integer durataRinnovo1) {
		this.durataRinnovo1 = durataRinnovo1;
	}

	/**
	 * @return the durataRinnovo2
	 */
	public Integer getDurataRinnovo2() {
		return durataRinnovo2;
	}

	/**
	 * @param durataRinnovo2 the durataRinnovo2 to set
	 */
	public void setDurataRinnovo2(Integer durataRinnovo2) {
		this.durataRinnovo2 = durataRinnovo2;
	}

	/**
	 * @return the durataRinnovo3
	 */
	public Integer getDurataRinnovo3() {
		return durataRinnovo3;
	}

	/**
	 * @param durataRinnovo3 the durataRinnovo3 to set
	 */
	public void setDurataRinnovo3(Integer durataRinnovo3) {
		this.durataRinnovo3 = durataRinnovo3;
	}

	/**
	 * @return the ggDepositi
	 */
	public Integer getGgDepositi() {
		return ggDepositi;
	}

	/**
	 * @param ggDepositi the ggDepositi to set
	 */
	public void setGgDepositi(Integer ggDepositi) {
		this.ggDepositi = ggDepositi;
	}

	/**
	 * @return the emailChiamante
	 */
	public Integer getEmailChiamate() {
		return emailChiamate;
	}

	/**
	 * @param emailChiamante the emailChiamante to set
	 */
	public void setEmailChiamate(Integer emailChiamate) {
		this.emailChiamate = emailChiamate;
	}

	/**
	 * @return the sollecito
	 */
	public Integer getSollecito() {
		return sollecito;
	}

	/**
	 * @param sollecito the sollecito to set
	 */
	public void setSollecito(Integer sollecito) {
		this.sollecito = sollecito;
	}

	/**
	 * @return the ggsollecito
	 */
	public Integer getGgSollecito() {
		return ggSollecito;
	}

	/**
	 * @param ggsollecito the ggsollecito to set
	 */
	public void setGgSollecito(Integer ggSollecito) {
		this.ggSollecito = ggSollecito;
	}
}
