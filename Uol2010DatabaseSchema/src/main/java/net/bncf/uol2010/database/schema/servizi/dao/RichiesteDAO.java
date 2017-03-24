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
import net.bncf.uol2010.database.schema.servizi.entity.Richieste;
import net.bncf.uol2010.database.schema.servizi.entity.Servizi;
import net.bncf.uol2010.database.schema.servizi.entity.StatoMovimento;
import net.bncf.uol2010.database.schema.servizi.entity.Utente;

/**
 * @author massi
 *
 */
public class RichiesteDAO extends GenericHibernateDAO<Richieste, Integer> {

	private Logger log = Logger.getLogger(RichiesteDAO.class);

	/**
	 * 
	 */
	public RichiesteDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Richieste> find(Utente idUtente, StatoMovimento idStatoMovimenti, Servizi[] idServizi,
			List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<Richieste> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idUtente != null) {
				criteria.add(Restrictions.eq("idUtente", idUtente));
			}
			if (idStatoMovimenti != null) {
				criteria.add(Restrictions.eq("idStatoMovimenti", idStatoMovimenti));
			}
			if (idServizi != null) {
				criteria.add(Restrictions.in("idServizi", idServizi));
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
