package net.bncf.uol2010.database.schema.servizi.dao;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.Ingressi;
import net.bncf.uol2010.database.schema.servizi.entity.Utente;

public class IngressiDAO extends GenericHibernateDAO<Ingressi, Integer> {

	private Logger log = LogManager.getLogger(IngressiDAO.class);

	public IngressiDAO() {
	}

	public Ingressi findPresenti(String idUtente) throws HibernateException, HibernateUtilException {
		UtenteDAO utenteDAO = null;
		Ingressi ingressi = null;
		Criteria criteria = null;
		GregorianCalendar gc = null;
		Utente utente = null;

		try {
			
			utenteDAO = new UtenteDAO();
			utente = utenteDAO.findById(idUtente);
			beginTransaction();

			criteria = this.createCriteria();

			criteria.add(Restrictions.eq("idUtente", utente));

			gc = new  GregorianCalendar();
			criteria.add(Restrictions.eq("data", new Date(gc.getTimeInMillis())));

			criteria.add(Restrictions.isNull("oraUsc"));
			ingressi = (Ingressi) criteria.uniqueResult();
			commitTransaction();
		} catch (HibernateException e) {
			rollbackTransaction();
			log.error(e.getMessage(), e);
			throw e;
		} catch (HibernateUtilException e) {
			rollbackTransaction();
			log.error(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			rollbackTransaction();
			log.error(e.getMessage(), e);
			throw new HibernateUtilException(e.getMessage(), e);
		}

		return ingressi;
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> viewIngressi(Date data) throws HibernateException, HibernateUtilException{
		List<Object[]> result = null;
		Criteria criteria = null;
		ProjectionList projList = null;

		try {
			beginTransaction();

			criteria = getSession().createCriteria(Ingressi.class, "ingressi");
//			criteria = this.createCriteria();
			
			criteria.createAlias("ingressi.idUtente", "utente");
			criteria.createAlias("utente.idAutorizzazioniUtente", "autorizzazioniute");
			
			criteria.add(Restrictions.eq("ingressi.data", data));
			criteria.add(Restrictions.isNull("ingressi.oraUsc"));

			projList = Projections.projectionList();
			projList.add(Projections.groupProperty("autorizzazioniute.descrizione"));
			projList.add(Projections.count("autorizzazioniute.descrizione"));
			
			criteria.setProjection(projList);
			
			result = criteria.list();
			commitTransaction();
		} catch (HibernateException e) {
			rollbackTransaction();
			log.error(e.getMessage(), e);
			throw e;
		} catch (HibernateUtilException e) {
			rollbackTransaction();
			log.error(e.getMessage(), e);
			throw e;
		} catch (Exception e) {
			rollbackTransaction();
			log.error(e.getMessage(), e);
			throw new HibernateUtilException(e.getMessage(), e);
		}
		return result;
	}
}
