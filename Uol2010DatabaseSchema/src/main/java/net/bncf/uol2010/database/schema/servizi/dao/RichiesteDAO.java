/**
 * 
 */
package net.bncf.uol2010.database.schema.servizi.dao;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.hibernate.GenericHibernateDAO;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.schema.servizi.entity.Fruibilita;
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

	public List<Richieste> find(StatoMovimento[] statoMovimentos, String inventario, String segnaturaKey,
			Integer annata, List<Order> orders) throws HibernateException, HibernateUtilException {

		return find(null, statoMovimentos, null, inventario,  segnaturaKey, annata, orders);
	}

	public List<Richieste> find(Utente idUtente, StatoMovimento idStatoMovimenti, Servizi[] idServizis,
			List<Order> orders) throws HibernateException, HibernateUtilException {
		StatoMovimento[] idStatoMovimentis = null;
		
		if (idStatoMovimenti != null){
			idStatoMovimentis = new StatoMovimento[1];
			idStatoMovimentis[0] = idStatoMovimenti;
		}
		return find(idUtente, idStatoMovimentis, idServizis, null, null, null, orders);
	}

	@SuppressWarnings("unchecked")
	public List<Richieste> find(Utente idUtente, StatoMovimento[] idStatoMovimentis, Servizi[] idServizis, 
			String inventario, String segnaturaKey, Integer annata,
			List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<Richieste> result = null;

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idUtente != null) {
				criteria.add(Restrictions.eq("idUtente", idUtente));
			}
			if (idStatoMovimentis != null) {
				criteria.add(Restrictions.in("idStatoMovimenti", idStatoMovimentis));
			}
			if (idServizis != null) {
				criteria.add(Restrictions.in("idServizi", idServizis));
			}
			if (inventario != null) {
				criteria.add(Restrictions.eq("inventario", inventario));
			}
			if (segnaturaKey != null) {
				criteria.add(Restrictions.eq("segnaturaKey", segnaturaKey));
			}
			if (annata != null) {
				criteria.add(Restrictions.eq("annata", annata));
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

	public Richieste write(Integer idRichieste, String idUtente, String idStatoMovimenti, String idServizi,
			Integer progIter, String bid, String autore, String titolo, String pubblicazione, String inventario,
			String precInv1, String precInv2, String segnatura, BigInteger annoPeriodico, String natura, Integer annata,
			String fascicoli, String volume, GregorianCalendar dataIniPrev, GregorianCalendar dataFinPrev, GregorianCalendar dataIniEff, 
			String noteUte, String notificaStatoRichiesta, String emailStatoRichiesta, 
			String indirizzoIp, String idFruibilita)
			throws HibernateException, HibernateUtilException {
		UtenteDAO utenteDAO = null;
		StatoMovimentoDAO statoMovimentoDAO = null;
		ServiziDAO serviziDAO = null;
		FruibilitaDAO fruibilitaDAO = null;
		
		utenteDAO = new UtenteDAO();
		statoMovimentoDAO = new StatoMovimentoDAO();
		serviziDAO = new ServiziDAO();
		fruibilitaDAO = new FruibilitaDAO();
		return write(idRichieste, utenteDAO.findById(idUtente), 
				statoMovimentoDAO.findById(idStatoMovimenti), 
				serviziDAO.findById(idServizi),
				progIter, bid, autore, titolo, pubblicazione, inventario,
				precInv1, precInv2, segnatura, 
				(annoPeriodico != null?new Integer(annoPeriodico.intValue()):null), 
				natura, annata,
				fascicoli, volume, new Timestamp(dataIniPrev.getTimeInMillis()) , 
				new Timestamp(dataFinPrev.getTimeInMillis()) , 
				new Timestamp(dataIniEff.getTimeInMillis()) , noteUte, 
				(notificaStatoRichiesta != null?notificaStatoRichiesta.equals("1"):null), 
				emailStatoRichiesta, indirizzoIp, 
				fruibilitaDAO.findById(idFruibilita));
	}

	public Richieste write(Integer idRichieste, Utente idUtente, 
			StatoMovimento idStatoMovimenti, Servizi idServizi,
			Integer progIter, String bid, String autore, String titolo, 
			String pubblicazione, String inventario,
			String precInv1, String precInv2, String segnatura, 
			Integer annoPeriodico, String natura, Integer annata,
			String fascicoli, String volume, Timestamp dataIniPrev, 
			Timestamp dataFinPrev, Timestamp dataIniEff, 
			String noteUte, Boolean notificaStatoRichiesta, String emailStatoRichiesta, String indirizzoIp, Fruibilita idFruibilita)
			throws HibernateException, HibernateUtilException {
		Richieste richieste = null;
		ContatoriDAO contatoriDAO = null;

		try {
			if (idRichieste == null) {
				richieste = new Richieste();
				contatoriDAO = new ContatoriDAO();
				richieste.setId(contatoriDAO.genId("MOV"));
			} else {
				richieste = this.findById(idRichieste);
			}

			richieste.setIdUtente(idUtente);
			richieste.setIdStatoMovimenti(idStatoMovimenti);
			richieste.setIdServizi(idServizi);
			richieste.setProgIter(progIter);
			richieste.setBid(bid);

			if (autore != null && !autore.trim().equals("")) {
				if (autore.length() > 250) {
					autore = autore.substring(0, 250);
				}
				richieste.setAutore(autore);
			}

			if (titolo != null && !titolo.trim().equals("")) {
				if (titolo.length() > 250) {
					titolo = titolo.substring(0, 250);
				}
				richieste.setTitolo(titolo);
			}

			if (pubblicazione != null && !pubblicazione.trim().equals("")) {
				if (pubblicazione.length() > 250) {
					pubblicazione = pubblicazione.substring(0, 250);
				}
				richieste.setPubblicazione(pubblicazione);
			}

			if (inventario != null && !inventario.trim().equals("")) {
				richieste.setInventario(inventario);
				if (precInv1 != null && !precInv1.trim().equals("")) {
					richieste.setPrecInv1(precInv1);
				}
				if (precInv2 != null && !precInv2.trim().equals("")) {
					richieste.setPrecInv2(precInv2);
				}
			}
			richieste.setSegnatura(segnatura);
			if (annoPeriodico != null && annoPeriodico > 0) {
				richieste.setAnnoPeriodico(annoPeriodico);
			}
			richieste.setNatura(natura);

			if (annata != null && annata > 0) {
				richieste.setAnnata(annata);
			}

			if (fascicoli != null && !fascicoli.trim().equals("")) {
				richieste.setFascicoli(fascicoli);
			}

			if (volume != null && !volume.trim().equals("")) {
				richieste.setVolume(volume);
			}

			richieste.setDataIniPrev(dataIniPrev);
			richieste.setDataFinPrev(dataFinPrev);
			richieste.setDataIniEff(dataIniEff);
			if (noteUte != null && !noteUte.trim().equals("")) {
				richieste.setNoteUte(noteUte);
			}
			if (notificaStatoRichiesta != null) {
				richieste.setNotificaStatoRichiesta(notificaStatoRichiesta);
			}
			if (emailStatoRichiesta != null && !emailStatoRichiesta.trim().equals("")) {
				richieste.setEmailStatoRichiesta(emailStatoRichiesta);
			}
			richieste.setIndirizzoIp(indirizzoIp);
			richieste.setIdFruibilita(idFruibilita);

			if (idRichieste == null) {
				this.save(richieste);
			} else {
				this.update(richieste);
			}
		} catch (HibernateException e) {
			throw e;
		} catch (HibernateUtilException e) {
			throw e;
		}
		return richieste;
	}


	public Integer numScaduti(Utente idUtente, StatoMovimento[] statoMovimentos, GregorianCalendar dataFinEff) throws HibernateException, HibernateUtilException {
		Integer ris = null;
		Criteria criteria = null;
		
		try {
			beginTransaction();
			criteria = this.createCriteria();
			
			if (idUtente != null) {
				criteria.add(Restrictions.eq("idUtente", idUtente));
			}
			if (statoMovimentos != null) {
				criteria.add(Restrictions.in("idStatoMovimenti", statoMovimentos));
			}
			if (dataFinEff != null) {
				criteria.add(Restrictions.lt("dataFinEff", dataFinEff));
			}
			
			ris = this.rowCount(criteria);
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
		return ris;
	}
}
