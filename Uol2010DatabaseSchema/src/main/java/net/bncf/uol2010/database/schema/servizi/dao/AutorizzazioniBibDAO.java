/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.AutorizzazioniBib;

/**
 * @author massi
 *
 */
public class AutorizzazioniBibDAO extends GenericHibernateDAO<AutorizzazioniBib, String> {

	private Logger log = Logger.getLogger(AutorizzazioniBibDAO.class);

	/**
	 * 
	 */
	public AutorizzazioniBibDAO() {
	}

	public AutorizzazioniBib findByDesc(String descrizione) throws HibernateException, HibernateUtilException{
		Criteria criteria = null;
		AutorizzazioniBib result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (descrizione != null) {
				criteria.add(Restrictions.eq("descrizione", descrizione));
			}
			paging(criteria);
			result = (AutorizzazioniBib) criteria.uniqueResult();
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
