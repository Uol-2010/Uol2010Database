/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.Controllo;

/**
 * @author massi
 *
 */
public class ControlloDAO extends GenericHibernateDAO<Controllo, Integer> {

	private Logger log = LogManager.getLogger(ControlloDAO.class);

	/**
	 * 
	 */
	public ControlloDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Controllo> find(String tipoControllo, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<Controllo> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (tipoControllo != null) {
				criteria.add(Restrictions.eq("tipoControllo", tipoControllo));
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
