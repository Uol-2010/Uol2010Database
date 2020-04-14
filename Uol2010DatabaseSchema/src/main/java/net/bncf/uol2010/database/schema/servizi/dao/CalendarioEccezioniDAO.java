/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.CalendarioEccezioni;
import net.bncf.uol2010.database.schema.servizi.entity.Servizi;

/**
 * @author massi
 *
 */
public class CalendarioEccezioniDAO extends GenericHibernateDAO<CalendarioEccezioni, String> {

	private Logger  log = LogManager.getLogger(CalendarioEccezioniDAO.class);

	/**
	 * 
	 */
	public CalendarioEccezioniDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<CalendarioEccezioni> find(Servizi idServizi, Date giorno, 
			List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<CalendarioEccezioni> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idServizi != null) {
				criteria.add(Restrictions.eq("idServizi", idServizi));
			}
			if (giorno != null) {
				criteria.add(Restrictions.eq("giorno", giorno));
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
