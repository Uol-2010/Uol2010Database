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
@Table(name="stampantiautorizzazioni")
public class StampantiAutorizzazioni implements Serializable {

	private Stampante idStampante;
	
	private AutorizzazioniUte idAutorizzazioniUtente;

	private Servizi idServizi;
	
	private GruppoSegnature idGruppoSegnature;

	/**
	 * 
	 */
	public StampantiAutorizzazioni() {
	}

	/**
	 * @return the idStampante
	 */
	public Stampante getIdStampante() {
		return idStampante;
	}

	/**
	 * @param idStampante the idStampante to set
	 */
	public void setIdStampante(Stampante idStampante) {
		this.idStampante = idStampante;
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
	 * @return the idGruppoSegnature
	 */
	public GruppoSegnature getIdGruppoSegnature() {
		return idGruppoSegnature;
	}

	/**
	 * @param idGruppoSegnature the idGruppoSegnature to set
	 */
	public void setIdGruppoSegnature(GruppoSegnature idGruppoSegnature) {
		this.idGruppoSegnature = idGruppoSegnature;
	}
}
