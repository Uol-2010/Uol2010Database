package net.bncf.uol2010.database.schema.servizi.dao;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.Sospensioni;
import net.bncf.uol2010.database.schema.servizi.entity.Utente;

public class SospensioniDAO extends GenericHibernateDAO<Sospensioni, Integer> {

	private Logger log = Logger.getLogger(SospensioniDAO.class);

	public SospensioniDAO() {
	}

	@SuppressWarnings("unchecked")
	public List<Sospensioni> find(Utente idUtente, GregorianCalendar data, String cancellato, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<Sospensioni> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idUtente != null) {
				criteria.add(Restrictions.eq("idUtente", idUtente));
			}
			if (data != null) {
				criteria.add(Restrictions.and(Restrictions.ge("dataIni", new Date(data.getTimeInMillis())),
						Restrictions.le("dataIni", new Date(data.getTimeInMillis()))));
			}
			if (cancellato != null) {
				criteria.add(Restrictions.eq("cancellato", cancellato));
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
