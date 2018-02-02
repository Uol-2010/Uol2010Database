package net.bncf.uol2010.database.schema.servizi.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.UtenteBib;

public class UtenteBibDAO extends GenericHibernateDAO<UtenteBib, Integer> {

	private Logger log = Logger.getLogger(UtenteBibDAO.class);

	public UtenteBibDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<UtenteBib> findByLogin(String login) throws HibernateException, HibernateUtilException{
		Criteria criteria = null;
		List<UtenteBib> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (login != null) {
				criteria.add(Restrictions.eq("login", login));
			}
			paging(criteria);
			result =  criteria.list();
			commitTransaction();
		} catch (HibernateException e) {
			rollbackTransaction();
			throw e;
		} catch (HibernateUtilException e) {
			rollbackTransaction();
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			rollbackTransaction();
			throw new HibernateUtilException(e.getMessage(), e);
		}
		return result;
	}

}
