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
import net.bncf.uol2010.database.schema.servizi.entity.AutUteServizi;
import net.bncf.uol2010.database.schema.servizi.entity.AutorizzazioniUte;

/**
 * @author massi
 *
 */
public class AutUteServiziDAO extends GenericHibernateDAO<AutUteServizi, String> {

	private Logger  log = Logger.getLogger(AutUteServiziDAO.class);

	/**
	 * 
	 */
	public AutUteServiziDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<AutUteServizi> find(AutorizzazioniUte idAutorizzazioniUtente, List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<AutUteServizi> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idAutorizzazioniUtente != null) {
				criteria.add(Restrictions.eq("idAutorizzazioniUtente", idAutorizzazioniUtente));
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
