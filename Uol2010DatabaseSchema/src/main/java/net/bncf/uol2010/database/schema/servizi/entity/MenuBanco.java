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
@Table(name="menubanco")
public class MenuBanco implements Serializable {

	@Id
	private Integer id;

	private ModuliAmministrazione idModuliAmministrazione;
	
	private MenuBanco idMenuBancoPadre;
	
	private Integer ordine;
	
	private String titolo;

	/**
	 * 
	 */
	public MenuBanco() {
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

	/**
	 * @return the idMenuBancoPadre
	 */
	public MenuBanco getIdMenuBancoPadre() {
		return idMenuBancoPadre;
	}

	/**
	 * @param idMenuBancoPadre the idMenuBancoPadre to set
	 */
	public void setIdMenuBancoPadre(MenuBanco idMenuBancoPadre) {
		this.idMenuBancoPadre = idMenuBancoPadre;
	}

	/**
	 * @return the ordine
	 */
	public Integer getOrdine() {
		return ordine;
	}

	/**
	 * @param ordine the ordine to set
	 */
	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}
