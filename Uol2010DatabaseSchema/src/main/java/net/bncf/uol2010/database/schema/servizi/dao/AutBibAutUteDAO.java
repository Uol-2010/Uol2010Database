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
import net.bncf.uol2010.database.schema.servizi.entity.AutBibAutUte;
import net.bncf.uol2010.database.schema.servizi.entity.AutorizzazioniBib;
import net.bncf.uol2010.database.schema.servizi.entity.AutorizzazioniUte;

/**
 * @author massi
 *
 */
public class AutBibAutUteDAO extends GenericHibernateDAO<AutBibAutUte, String> {

	private Logger  log = Logger.getLogger(AutBibAutUteDAO.class);

	/**
	 * 
	 */
	public AutBibAutUteDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<AutBibAutUte> find(AutorizzazioniBib idAutorizzazioniBib, AutorizzazioniUte idAutorizzazioniUte, List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<AutBibAutUte> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idAutorizzazioniBib != null) {
				criteria.add(Restrictions.eq("idAutorizzazioniBib", idAutorizzazioniBib));
			}
			if (idAutorizzazioniUte != null) {
				criteria.add(Restrictions.eq("idAutorizzazioniUte", idAutorizzazioniUte));
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
