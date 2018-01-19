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
import net.bncf.uol2010.database.schema.servizi.entity.GruppoSegnature;

/**
 * @author massi
 *
 */
public class GruppoSegnatureDAO extends GenericHibernateDAO<GruppoSegnature, Integer> {

	Logger log = Logger.getLogger(GruppoSegnatureDAO.class);

	/**
	 * 
	 */
	public GruppoSegnatureDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<GruppoSegnature> find(String natura, String segnatura, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<GruppoSegnature> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (natura != null && 
					!natura.trim().equals("")) {
				criteria.add(Restrictions.eq("natura", natura.trim().toLowerCase()));
			}
			if (segnatura != null) {
				criteria.add(
						Restrictions.and(
								Restrictions.ge("segnaturaStartKey", segnatura),
								Restrictions.le("segnaturaStopKey", segnatura)
								));
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
