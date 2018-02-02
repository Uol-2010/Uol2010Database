package net.bncf.uol2010.database.schema.servizi.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import mx.randalf.converter.text.ConvertText;
import mx.randalf.hibernate.exception.HibernateUtilException;
import net.bncf.uol2010.database.navigator.Navigator;
import net.bncf.uol2010.database.schema.servizi.entity.AutorizzazioniUte;
import net.bncf.uol2010.database.schema.servizi.entity.Utente;
import net.bncf.uol2010.database.schema.servizi.entity.UtenteCittadinanza;
import net.bncf.uol2010.database.schema.servizi.entity.UtenteProfessione;
import net.bncf.uol2010.database.schema.servizi.entity.UtenteProvenienza;
import net.bncf.uol2010.database.schema.servizi.entity.UtenteTipoDocumento;

public class UtenteDAO extends Navigator<Utente, String> {

	private Logger log = Logger.getLogger(UtenteDAO.class);

	public UtenteDAO() {
		super(null, null);
	}

	public UtenteDAO(Integer pagIniVisual, Integer pagAttVisual) {
		super(pagIniVisual, pagAttVisual);
	}

	@SuppressWarnings("unchecked")
	public List<Utente> find(String idUtente, String cognome, String nome, String email,
			List<Order> orders) throws HibernateException, HibernateUtilException {
		Criteria criteria = null;
		List<Utente> result = null;
		DecimalFormat df7 = new DecimalFormat("0000000");

		try {
			beginTransaction();
			criteria = this.createCriteria();
			if (idUtente != null) {
				idUtente = idUtente.toUpperCase().replace("CFU", "");
				idUtente = idUtente.replace("CF", "");
				idUtente = idUtente.trim();
				criteria.add(Restrictions.eq("id", " CF" + df7.format(new Integer(idUtente))));
			}
			if (cognome != null) {
				criteria.add(Restrictions.eq("cognome", cognome));
			}
			if (nome != null) {
				criteria.add(Restrictions.eq("nome", nome));
			}
			if (email != null) {
				criteria.add(Restrictions.eq("email", email));
			}
			paging(criteria);
			if (orders != null) {
				for (Order order : orders) {
					criteria.addOrder(order);
				}
			}
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

	public Utente write(String idUtente, AutorizzazioniUte idAutorizzazioniUtente,
			UtenteProfessione idUtenteProfessione, UtenteProvenienza idUtenteProvenienza,
			UtenteCittadinanza idUtenteCittadinanza, UtenteTipoDocumento idUtenteTipoDocumento, String cognome,
			String nome, String sesso, String residenzaIndirizzo, String residenzaCitta, String residenzaCap,
			String domicilioIndirizzo, String domicilioCitta, String domicilioCap, String telefono, String cellulare,
			String luogoNascita, Date dataNascita, String numeroDocumento, String autoritaRilascio,
			String codiceFiscale, String note, String email, Integer limiteTraffico)
			throws HibernateException, HibernateUtilException {
		Utente utente = null;
		ContatoriDAO contatoriDAO = null;
		DecimalFormat df7 = new DecimalFormat("0000000");
		GregorianCalendar gc = new GregorianCalendar();

		try {
			if (idUtente == null || idUtente.trim().equals("") || idUtente.trim().equals("0")) {
				utente = new Utente();

				contatoriDAO = new ContatoriDAO();
				utente.setId(" CF" + df7.format(contatoriDAO.genId("UTE")));
				utente.setDataIns(new Timestamp(gc.getTimeInMillis()));
				utente.setPassword(genMD5Key("welcome"));
			} else {
				utente = this.findById(idUtente);
			}

			utente.setIdAutorizzazioniUtente(idAutorizzazioniUtente);
			utente.setIdUtenteProfessione(idUtenteProfessione);
			utente.setIdUtenteProvenienza(idUtenteProvenienza);
			utente.setIdUtenteCittadinanza(idUtenteCittadinanza);
			utente.setIdUtenteTipoDocumento(idUtenteTipoDocumento);
			utente.setDataMod(new Timestamp(gc.getTimeInMillis()));
			utente.setCognome(cognome);
			utente.setNome(nome);
			utente.setSesso(sesso);
			utente.setResidenzaIndirizzo(residenzaIndirizzo);
			utente.setResidenzaCitta(residenzaCitta);
			utente.setResidenzaCap(residenzaCap);
			utente.setDomicilioIndirizzo(domicilioIndirizzo);
			utente.setDomicilioCitta(domicilioCitta);
			utente.setDomicilioCap(domicilioCap);
			utente.setTelefono(telefono);
			utente.setCellulare(cellulare);
			utente.setLuogoNascita(luogoNascita);
			utente.setDataNascita(dataNascita);
			utente.setNumeroDocumento(numeroDocumento);
			utente.setAutoritaRilascio(autoritaRilascio);
			utente.setCodiceFiscale(codiceFiscale);
			utente.setNote(note);
			utente.setEmail(email);
			utente.setCognomeKey(ConvertText.conveVar(cognome).trim());
			utente.setNomeKey(ConvertText.conveVar(nome).trim());
			utente.setLimiteTraffico(limiteTraffico);

			if (idUtente == null || idUtente.trim().equals("") || idUtente.trim().equals("0")) {
				this.save(utente);
			} else {
				this.update(utente);
			}
		} catch (HibernateException e) {
			throw e;
		} catch (HibernateUtilException e) {
			throw e;
		}

		return utente;
	}

}
