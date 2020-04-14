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
import net.bncf.uol2010.database.schema.servizi.entity.MenuBanco;

/**
 * @author massi
 *
 */
public class MenuBancoDAO extends GenericHibernateDAO<MenuBanco, Integer> {

	private Logger  log = LogManager.getLogger(MenuBancoDAO.class);

	/**
	 * 
	 */
	public MenuBancoDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<MenuBanco> findMenuBancoPadre(MenuBanco idMenuBancoPadre, List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<MenuBanco> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idMenuBancoPadre != null) {
				criteria.add(Restrictions.eq("idMenuBancoPadre", idMenuBancoPadre));
			} else {
				criteria.add(Restrictions.isNull("idMenuBancoPadre"));
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
