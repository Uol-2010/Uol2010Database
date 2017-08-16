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
import net.bncf.uol2010.database.schema.servizi.entity.AutBibModAmm;
import net.bncf.uol2010.database.schema.servizi.entity.AutorizzazioniBib;
import net.bncf.uol2010.database.schema.servizi.entity.ModuliAmministrazione;

/**
 * @author massi
 *
 */
public class AutBibModAmmDAO extends GenericHibernateDAO<AutBibModAmm, String> {

	private Logger  log = Logger.getLogger(AutBibModAmmDAO.class);

	/**
	 * 
	 */
	public AutBibModAmmDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<AutBibModAmm> find(AutorizzazioniBib idAutorizzazioniBib, ModuliAmministrazione idModuliAmministrazione, List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<AutBibModAmm> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idAutorizzazioniBib != null) {
				criteria.add(Restrictions.eq("idAutorizzazioniBib", idAutorizzazioniBib));
			}
			if (idModuliAmministrazione != null) {
				criteria.add(Restrictions.eq("idModuliAmministrazione", idModuliAmministrazione));
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
