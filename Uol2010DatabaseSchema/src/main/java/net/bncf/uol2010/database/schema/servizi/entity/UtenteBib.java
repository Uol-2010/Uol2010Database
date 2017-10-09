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
@Table(name="utentebib")
public class UtenteBib implements Serializable {

	@Id
	private Integer id;

	private AutorizzazioniBib idAutorizzazioniBib;
	
	private String login;

	private String password;

	private String cognome;

	private String nome;

	private String sesso;

	private String indirizzoIP;
	
	/**
	 * 
	 */
	public UtenteBib() {
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sesso
	 */
	public String getSesso() {
		return sesso;
	}

	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	/**
	 * @return the indirizzoIP
	 */
	public String getIndirizzoIP() {
		return indirizzoIP;
	}

	/**
	 * @param indirizzoIP the indirizzoIP to set
	 */
	public void setIndirizzoIP(String indirizzoIP) {
		this.indirizzoIP = indirizzoIP;
	}
}
