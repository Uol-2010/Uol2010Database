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
@Table(name="autbib_autute")
public class AutBibAutUte implements Serializable {

	@Id
	private AutorizzazioniBib idAutorizzazioniBib;

	@Id
	private AutorizzazioniUte idAutorizzazioniUte;

	/**
	 * 
	 */
	public AutBibAutUte() {
	}

	/**
	 * @return the idAutorizzazioniBib
	 */
	public AutorizzazioniBib getIdAutorizzazioniBib() {
		return idAutorizzazioniBib;
	}

	/**
	 * @param idAutorizzazioniBib the idAutorizzazioniBib to set
	 */
	public void setIdAutorizzazioniBib(AutorizzazioniBib idAutorizzazioniBib) {
		this.idAutorizzazioniBib = idAutorizzazioniBib;
	}

	/**
	 * @return the idAutorizzazioniUte
	 */
	public AutorizzazioniUte getIdAutorizzazioniUte() {
		return idAutorizzazioniUte;
	}

	/**
	 * @param idAutorizzazioniUte the idAutorizzazioniUte to set
	 */
	public void setIdAutorizzazioniUte(AutorizzazioniUte idAutorizzazioniUte) {
		this.idAutorizzazioniUte = idAutorizzazioniUte;
	}

}
