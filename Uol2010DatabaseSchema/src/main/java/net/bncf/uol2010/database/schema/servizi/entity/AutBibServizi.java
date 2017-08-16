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
@Table(name="autbib_servizi")
public class AutBibServizi implements Serializable {

	private AutorizzazioniBib idAutorizzazioniBib;

	private Servizi idServizi;

	/**
	 * 
	 */
	public AutBibServizi() {
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

}
