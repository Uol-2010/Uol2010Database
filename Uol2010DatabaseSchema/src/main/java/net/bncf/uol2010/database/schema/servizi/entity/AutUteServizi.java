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
@Table(name="autute_servizi")
public class AutUteServizi implements Serializable {

	private AutorizzazioniUte idAutorizzazioniUtente;

	private Servizi idServizi;

	private Boolean rinnovoAutomatico;

	/**
	 * 
	 */
	public AutUteServizi() {
	}

	/**
	 * @return the idAutorizzazioniUte
	 */
	public AutorizzazioniUte getIdAutorizzazioniUtente() {
		return idAutorizzazioniUtente;
	}

	/**
	 * @param idAutorizzazioniUte the idAutorizzazioniUte to set
	 */
	public void setIdAutorizzazioniUtente(AutorizzazioniUte idAutorizzazioniUtente) {
		this.idAutorizzazioniUtente = idAutorizzazioniUtente;
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
	 * @return the rinnovoAutomatico
	 */
	public Boolean getRinnovoAutomatico() {
		return rinnovoAutomatico;
	}

	/**
	 * @param rinnovoAutomatico the rinnovoAutomatico to set
	 */
	public void setRinnovoAutomatico(Boolean rinnovoAutomatico) {
		this.rinnovoAutomatico = rinnovoAutomatico;
	}

}
