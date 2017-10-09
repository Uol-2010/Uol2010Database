/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author massi
 *
 */
@Entity
@SuppressWarnings("serial")
@Table(name="trafficowirelesscomplessivo")
public class TrafficoWirelessComplessivo implements Serializable {

	private Utente idUtente;

	private Timestamp data;

	private Long AcctInputOctets;

	private Long AcctOutputOctets;

	private Long AcctInputPackets;

	private Long AcctOutputPackets;

	private Long AcctSessionTime;

	/**
	 * 
	 */
	public TrafficoWirelessComplessivo() {
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
	public Timestamp getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Timestamp data) {
		this.data = data;
	}

	/**
	 * @return the acctInputOctets
	 */
	public Long getAcctInputOctets() {
		return AcctInputOctets;
	}

	/**
	 * @param acctInputOctets the acctInputOctets to set
	 */
	public void setAcctInputOctets(Long acctInputOctets) {
		AcctInputOctets = acctInputOctets;
	}

	/**
	 * @return the acctOutputOctets
	 */
	public Long getAcctOutputOctets() {
		return AcctOutputOctets;
	}

	/**
	 * @param acctOutputOctets the acctOutputOctets to set
	 */
	public void setAcctOutputOctets(Long acctOutputOctets) {
		AcctOutputOctets = acctOutputOctets;
	}

	/**
	 * @return the acctInputPackets
	 */
	public Long getAcctInputPackets() {
		return AcctInputPackets;
	}

	/**
	 * @param acctInputPackets the acctInputPackets to set
	 */
	public void setAcctInputPackets(Long acctInputPackets) {
		AcctInputPackets = acctInputPackets;
	}

	/**
	 * @return the acctOutputPackets
	 */
	public Long getAcctOutputPackets() {
		return AcctOutputPackets;
	}

	/**
	 * @param acctOutputPackets the acctOutputPackets to set
	 */
	public void setAcctOutputPackets(Long acctOutputPackets) {
		AcctOutputPackets = acctOutputPackets;
	}

	/**
	 * @return the acctSessionTime
	 */
	public Long getAcctSessionTime() {
		return AcctSessionTime;
	}

	/**
	 * @param acctSessionTime the acctSessionTime to set
	 */
	public void setAcctSessionTime(Long acctSessionTime) {
		AcctSessionTime = acctSessionTime;
	}

}
