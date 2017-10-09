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
@Table(name="iterserviziolegami")
public class IterServizioLegami implements Serializable {

	private Servizi idSevizi;

	private Integer progIterPar;

	private Integer progIterArr;
	
	private GestioneChiamate idGestioneChiamate;
	
	private GestioneDeposito idGestioneDeposito;
	
	private String tipoServizio;

	/**
	 * 
	 */
	public IterServizioLegami() {
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
	 * @return the progIterPar
	 */
	public Integer getProgIterPar() {
		return progIterPar;
	}

	/**
	 * @param progIterPar the progIterPar to set
	 */
	public void setProgIterPar(Integer progIterPar) {
		this.progIterPar = progIterPar;
	}

	/**
	 * @return the progIterArr
	 */
	public Integer getProgIterArr() {
		return progIterArr;
	}

	/**
	 * @param progIterArr the progIterArr to set
	 */
	public void setProgIterArr(Integer progIterArr) {
		this.progIterArr = progIterArr;
	}

	/**
	 * @return the idGestioneChiamate
	 */
	public GestioneChiamate getIdGestioneChiamate() {
		return idGestioneChiamate;
	}

	/**
	 * @param idGestioneChiamate the idGestioneChiamate to set
	 */
	public void setIdGestioneChiamate(GestioneChiamate idGestioneChiamate) {
		this.idGestioneChiamate = idGestioneChiamate;
	}

	/**
	 * @return the idGestioneDeposito
	 */
	public GestioneDeposito getIdGestioneDeposito() {
		return idGestioneDeposito;
	}

	/**
	 * @param idGestioneDeposito the idGestioneDeposito to set
	 */
	public void setIdGestioneDeposito(GestioneDeposito idGestioneDeposito) {
		this.idGestioneDeposito = idGestioneDeposito;
	}

	/**
	 * @return the tipoServizio
	 */
	public String getTipoServizio() {
		return tipoServizio;
	}

	/**
	 * @param tipoServizio the tipoServizio to set
	 */
	public void setTipoServizio(String tipoServizio) {
		this.tipoServizio = tipoServizio;
	}
}
