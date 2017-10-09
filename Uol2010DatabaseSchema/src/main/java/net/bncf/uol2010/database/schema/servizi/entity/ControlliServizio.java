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
@Table(name="controlliservizio")
public class ControlliServizio implements Serializable {

	@Id
	private Servizi idServizi;

	private Integer sequenza;

	private Controllo idControllo;
	
	private Boolean bloccante;
	
	private String messaggio;
	
	/**
	 * 
	 */
	public ControlliServizio() {
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
	 * @return the sequenza
	 */
	public Integer getSequenza() {
		return sequenza;
	}

	/**
	 * @param sequenza the sequenza to set
	 */
	public void setSequenza(Integer sequenza) {
		this.sequenza = sequenza;
	}

	/**
	 * @return the idControllo
	 */
	public Controllo getIdControllo() {
		return idControllo;
	}

	/**
	 * @param idControllo the idControllo to set
	 */
	public void setIdControllo(Controllo idControllo) {
		this.idControllo = idControllo;
	}

	/**
	 * @return the bloccante
	 */
	public Boolean getBloccante() {
		return bloccante;
	}

	/**
	 * @param bloccante the bloccante to set
	 */
	public void setBloccante(Boolean bloccante) {
		this.bloccante = bloccante;
	}

	/**
	 * @return the messaggio
	 */
	public String getMessaggio() {
		return messaggio;
	}

	/**
	 * @param messaggio the messaggio to set
	 */
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
}
