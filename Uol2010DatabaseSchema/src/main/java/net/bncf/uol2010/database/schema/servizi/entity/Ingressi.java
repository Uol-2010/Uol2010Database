/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="ingressi")
public class Ingressi implements Serializable {

	@Id
	private Integer id;

	private Utente idUtente;
	
	private Date data;
	
	private Time oraIng;

	private Time oraUsc;
	
	/**
	 * 
	 */
	public Ingressi() {
	}

	@Column(name="ID_INGRESSI", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the idUtente
	 */
	public Utente getIdUtente() {
		return idUtente;
	}

	/**
	 * @param idUtente the idUtente to set
	 */
	public void setIdUtente(Utente idUtente) {
		this.idUtente = idUtente;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the oraIng
	 */
	public Time getOraIng() {
		return oraIng;
	}

	/**
	 * @param oraIng the oraIng to set
	 */
	public void setOraIng(Time oraIng) {
		this.oraIng = oraIng;
	}

	/**
	 * @return the oraUsc
	 */
	public Time getOraUsc() {
		return oraUsc;
	}

	/**
	 * @param oraUsc the oraUsc to set
	 */
	public void setOraUsc(Time oraUsc) {
		this.oraUsc = oraUsc;
	}

}
