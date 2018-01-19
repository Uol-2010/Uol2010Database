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
import net.bncf.uol2010.database.schema.servizi.entity.ControlliServizio;
import net.bncf.uol2010.database.schema.servizi.entity.Servizi;

/**
 * @author massi
 *
 */
public class ControlliServizioDAO extends GenericHibernateDAO<ControlliServizio, Integer> {

	Logger log = Logger.getLogger(ControlliServizioDAO.class);

	/**
	 * 
	 */
	public ControlliServizioDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<ControlliServizio> find(Servizi idServizi, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<ControlliServizio> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idServizi != null) {
				criteria.add(Restrictions.eq("idServizi", idServizi));
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
