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
@Table(name="autbib_modamm")
public class AutBibModAmm implements Serializable {

	private AutorizzazioniBib idAutorizzazioniBib;

	private ModuliAmministrazione idModuliAmministrazione;

	/**
	 * 
	 */
	public AutBibModAmm() {
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
	 * @return the idModuliAmministrazione
	 */
	public ModuliAmministrazione getIdModuliAmministrazione() {
		return idModuliAmministrazione;
	}

	/**
	 * @param idModuliAmministrazione the idModuliAmministrazione to set
	 */
	public void setIdModuliAmministrazione(ModuliAmministrazione idModuliAmministrazione) {
		this.idModuliAmministrazione = idModuliAmministrazione;
	}

}
