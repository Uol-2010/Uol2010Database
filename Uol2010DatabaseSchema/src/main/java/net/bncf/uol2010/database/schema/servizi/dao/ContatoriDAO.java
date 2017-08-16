package net.bncf.uol2010.database.schema.servizi.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.Contatori;

public class ContatoriDAO extends GenericHibernateDAO<Contatori, String> {

	private Logger log = Logger.getLogger(ContatoriDAO.class);

	public ContatoriDAO() {
	}

	public Integer genId(String code) throws HibernateException, HibernateUtilException {
		Contatori contatori = null;
		Integer result = null;

		try {
			contatori= this.findById(code);
			
			if (contatori != null){
				result = contatori.getUltimoVal()+1;
				contatori.setUltimoVal(result);
				this.update(contatori);
			} else {
				result = 1;
				contatori  = new Contatori();
				contatori.setId(code);
				contatori.setUltimoVal(result);
				this.save(contatori);
			}
		} catch (HibernateException e) {
			throw e;
		} catch (HibernateUtilException e) {
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new HibernateUtilException(e.getMessage(), e);
		}
		return result;
	}

}
