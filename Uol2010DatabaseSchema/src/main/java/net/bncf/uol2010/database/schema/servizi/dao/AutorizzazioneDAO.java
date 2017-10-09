/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.Autorizzazione;
import net.bncf.uol2010.database.schema.servizi.entity.Servizi;
import net.bncf.uol2010.database.schema.servizi.entity.Utente;

/**
 * @author massi
 *
 */
public class AutorizzazioneDAO extends GenericHibernateDAO<Autorizzazione, Integer> {

	private Logger log = Logger.getLogger(AutorizzazioneDAO.class);

	/**
	 * 
	 */
	public AutorizzazioneDAO() {
	}

	public List<Autorizzazione> find(Utente idUtente, GregorianCalendar data, String cancellato, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		return find(idUtente, null, data, cancellato, orders);
	}

	@SuppressWarnings("unchecked")
	public List<Autorizzazione> find(Utente idUtente, Servizi idServizi, GregorianCalendar data, String cancellato, List<Order> orders)
			throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<Autorizzazione> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idUtente != null) {
				criteria.add(Restrictions.eq("idUtente", idUtente));
			}
			if (idServizi != null) {
				criteria.add(Restrictions.eq("idServizi", idServizi));
			}
			if (data != null) {
				criteria.add(Restrictions.and(Restrictions.ge("dataIni", new Date(data.getTimeInMillis())),
						Restrictions.le("dataFin", new Date(data.getTimeInMillis()))));
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

	public void write(Integer idAutorizzazione, Utente idUtente,
			Servizi idServizi, Date dataIni, Date dataFin, String note, String cancellato)
			throws HibernateException, HibernateUtilException {
		Autorizzazione autorizzazione = null;
		ContatoriDAO contatoriDAO = null;

		try {
			if (idAutorizzazione == null) {
				autorizzazione = new Autorizzazione();
				contatoriDAO = new ContatoriDAO();
				autorizzazione.setId(contatoriDAO.genId("Autorizzazione"));
			} else {
				autorizzazione = this.findById(idAutorizzazione);
			}

			autorizzazione.setIdUtente(idUtente);
			autorizzazione.setIdServizi(idServizi);
			autorizzazione.setDataIni(dataIni);
			autorizzazione.setDataFin(dataFin);
			if (note != null){
				autorizzazione.setNote(note);
			}
			autorizzazione.setCancellato(cancellato);

			if (idAutorizzazione == null) {
				this.save(autorizzazione);
			} else {
				this.update(autorizzazione);
			}
		} catch (HibernateException e) {
			throw e;
		} catch (HibernateUtilException e) {
			throw e;
		}
	}

}
