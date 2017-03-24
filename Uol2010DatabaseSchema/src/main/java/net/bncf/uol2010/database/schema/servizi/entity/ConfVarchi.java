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
@Table(name="confvarchi")
public class ConfVarchi implements Serializable {

	@Id
	private Integer id;
	
	private String descr;
	
	private String idVarco;

	private String idLettore;

	private Integer flgUtPre;

	private Integer flgTeSca;

	private Integer flgTeSos;

	private Integer flgUtNonPre;

	private Integer flgUtPres;

	private Integer flgLibPre;

	private String listaServizi;

	private String msgUtPre;

	private String msgTeSca;

	private String msgTeSos;

	private String msgUtNonPre;

	private String msgUtPres;

	private String msgLibPre;

	private String tipoVarco;
	
	/**
	 * 
	 */
	public ConfVarchi() {
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
	 * @return the descr
	 */
	public String getDescr() {
		return descr;
	}

	/**
	 * @param descr the descr to set
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}

	/**
	 * @return the idVarco
	 */
	public String getIdVarco() {
		return idVarco;
	}

	/**
	 * @param idVarco the idVarco to set
	 */
	public void setIdVarco(String idVarco) {
		this.idVarco = idVarco;
	}

	/**
	 * @return the idLettore
	 */
	public String getIdLettore() {
		return idLettore;
	}

	/**
	 * @param idLettore the idLettore to set
	 */
	public void setIdLettore(String idLettore) {
		this.idLettore = idLettore;
	}

	/**
	 * @return the flgUtPre
	 */
	public Integer getFlgUtPre() {
		return flgUtPre;
	}

	/**
	 * @param flgUtPre the flgUtPre to set
	 */
	public void setFlgUtPre(Integer flgUtPre) {
		this.flgUtPre = flgUtPre;
	}

	/**
	 * @return the flgTeSca
	 */
	public Integer getFlgTeSca() {
		return flgTeSca;
	}

	/**
	 * @param flgTeSca the flgTeSca to set
	 */
	public void setFlgTeSca(Integer flgTeSca) {
		this.flgTeSca = flgTeSca;
	}

	/**
	 * @return the flgTeSos
	 */
	public Integer getFlgTeSos() {
		return flgTeSos;
	}

	/**
	 * @param flgTeSos the flgTeSos to set
	 */
	public void setFlgTeSos(Integer flgTeSos) {
		this.flgTeSos = flgTeSos;
	}

	/**
	 * @return the flgUtNonPre
	 */
	public Integer getFlgUtNonPre() {
		return flgUtNonPre;
	}

	/**
	 * @param flgUtNonPre the flgUtNonPre to set
	 */
	public void setFlgUtNonPre(Integer flgUtNonPre) {
		this.flgUtNonPre = flgUtNonPre;
	}

	/**
	 * @return the flgUtPres
	 */
	public Integer getFlgUtPres() {
		return flgUtPres;
	}

	/**
	 * @param flgUtPres the flgUtPres to set
	 */
	public void setFlgUtPres(Integer flgUtPres) {
		this.flgUtPres = flgUtPres;
	}

	/**
	 * @return the flgLibPre
	 */
	public Integer getFlgLibPre() {
		return flgLibPre;
	}

	/**
	 * @param flgLibPre the flgLibPre to set
	 */
	public void setFlgLibPre(Integer flgLibPre) {
		this.flgLibPre = flgLibPre;
	}

	/**
	 * @return the listaServizi
	 */
	public String getListaServizi() {
		return listaServizi;
	}

	/**
	 * @param listaServizi the listaServizi to set
	 */
	public void setListaServizi(String listaServizi) {
		this.listaServizi = listaServizi;
	}

	/**
	 * @return the msgUtPre
	 */
	public String getMsgUtPre() {
		return msgUtPre;
	}

	/**
	 * @param msgUtPre the msgUtPre to set
	 */
	public void setMsgUtPre(String msgUtPre) {
		this.msgUtPre = msgUtPre;
	}

	/**
	 * @return the msgTeSca
	 */
	public String getMsgTeSca() {
		return msgTeSca;
	}

	/**
	 * @param msgTeSca the msgTeSca to set
	 */
	public void setMsgTeSca(String msgTeSca) {
		this.msgTeSca = msgTeSca;
	}

	/**
	 * @return the msgTeSos
	 */
	public String getMsgTeSos() {
		return msgTeSos;
	}

	/**
	 * @param msgTeSos the msgTeSos to set
	 */
	public void setMsgTeSos(String msgTeSos) {
		this.msgTeSos = msgTeSos;
	}

	/**
	 * @return the msgUtNonPre
	 */
	public String getMsgUtNonPre() {
		return msgUtNonPre;
	}

	/**
	 * @param msgUtNonPre the msgUtNonPre to set
	 */
	public void setMsgUtNonPre(String msgUtNonPre) {
		this.msgUtNonPre = msgUtNonPre;
	}

	/**
	 * @return the msgUtPres
	 */
	public String getMsgUtPres() {
		return msgUtPres;
	}

	/**
	 * @param msgUtPres the msgUtPres to set
	 */
	public void setMsgUtPres(String msgUtPres) {
		this.msgUtPres = msgUtPres;
	}

	/**
	 * @return the msgLibPre
	 */
	public String getMsgLibPre() {
		return msgLibPre;
	}

	/**
	 * @param msgLibPre the msgLibPre to set
	 */
	public void setMsgLibPre(String msgLibPre) {
		this.msgLibPre = msgLibPre;
	}

	/**
	 * @return the tipoVarco
	 */
	public String getTipoVarco() {
		return tipoVarco;
	}

	/**
	 * @param tipoVarco the tipoVarco to set
	 */
	public void setTipoVarco(String tipoVarco) {
		this.tipoVarco = tipoVarco;
	}
}
