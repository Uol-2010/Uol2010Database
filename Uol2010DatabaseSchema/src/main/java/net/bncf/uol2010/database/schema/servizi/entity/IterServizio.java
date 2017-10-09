/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="iterservizio")
public class IterServizio implements Serializable {

	private Servizi idSevizi;

	private Integer progIter;
	
	private StatoMovimento idStatoMovimenti;
	
	private StatoIter idStoIter;
	
	private CodiceAttivita idAttivita;
	
	private Boolean stampaMovimento;
	
	private Boolean rinnovo;

	/**
	 * 
	 */
	public IterServizio() {
	}

	/**
	 * @return the idSevizi
	 */
	public Servizi getIdSevizi() {
		return idSevizi;
	}

	/**
	 * @param idSevizi the idSevizi to set
	 */
	public void setIdSevizi(Servizi idSevizi) {
		this.idSevizi = idSevizi;
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
	 * @return the idStoIter
	 */
	public StatoIter getIdStoIter() {
		return idStoIter;
	}

	/**
	 * @param idStoIter the idStoIter to set
	 */
	public void setIdStoIter(StatoIter idStoIter) {
		this.idStoIter = idStoIter;
	}

	/**
	 * @return the idAttivita
	 */
	public CodiceAttivita getIdAttivita() {
		return idAttivita;
	}

	/**
	 * @param idAttivita the idAttivita to set
	 */
	public void setIdAttivita(CodiceAttivita idAttivita) {
		this.idAttivita = idAttivita;
	}

	/**
	 * @return the stampaMovimento
	 */
	public Boolean getStampaMovimento() {
		return stampaMovimento;
	}

	/**
	 * @param stampaMovimento the stampaMovimento to set
	 */
	public void setStampaMovimento(Boolean stampaMovimento) {
		this.stampaMovimento = stampaMovimento;
	}

	/**
	 * @return the rinnovo
	 */
	public Boolean getRinnovo() {
		return rinnovo;
	}

	/**
	 * @param rinnovo the rinnovo to set
	 */
	public void setRinnovo(Boolean rinnovo) {
		this.rinnovo = rinnovo;
	}
}
