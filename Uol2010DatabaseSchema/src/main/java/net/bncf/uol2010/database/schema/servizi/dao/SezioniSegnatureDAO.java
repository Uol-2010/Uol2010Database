/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.SezioniSegnature;

/**
 * @author massi
 *
 */
public class SezioniSegnatureDAO extends GenericHibernateDAO<SezioniSegnature, Integer> {

	Logger log = Logger.getLogger(SezioniSegnatureDAO.class);

	/**
	 * 
	 */
	public SezioniSegnatureDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<SezioniSegnature> find(GregorianCalendar data, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<SezioniSegnature> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (data != null) {
				criteria.add(Restrictions.and(Restrictions.ge("dataIni", new Date(data.getTimeInMillis())),
						Restrictions.le("dataFin", new Date(data.getTimeInMillis()))));
			}
			if (orders != null) {
				for (Order order : orders) {
					criteria.addOrder(order);
				}
			}
			paging(criteria);
			result = criteria.list();
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
