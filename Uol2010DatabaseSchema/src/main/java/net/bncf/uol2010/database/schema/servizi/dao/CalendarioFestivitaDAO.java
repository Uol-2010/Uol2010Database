/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.CalendarioFestivita;

/**
 * @author massi
 *
 */
public class CalendarioFestivitaDAO extends GenericHibernateDAO<CalendarioFestivita, String> {

	private Logger  log = Logger.getLogger(CalendarioFestivitaDAO.class);

	/**
	 * 
	 */
	public CalendarioFestivitaDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<CalendarioFestivita> find(Integer giornoFestivita, 
			Integer meseFestivita, List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<CalendarioFestivita> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (giornoFestivita != null) {
				criteria.add(Restrictions.eq("giornoFestivita", giornoFestivita));
			}
			if (meseFestivita != null) {
				criteria.add(Restrictions.eq("meseFestivita", meseFestivita));
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
