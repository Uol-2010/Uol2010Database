package net.bncf.uol2010.database.navigator;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Vector;

import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.log4j.Logger;

import mx.randalf.converter.text.ConvertToURI;
import mx.randalf.converter.text.ConvertToUTF8;
import mx.randalf.hibernate.GenericHibernateDAO;

public class Navigator<T, ID extends Serializable> extends GenericHibernateDAO<T, ID> {

	/**
	 * Questa variabile viene utilizzata per eseguire lo log delle applicazioni
	 */
	private static Logger log = Logger.getLogger(Navigator.class);

	/**
	 * Questa Variabile viene utilizzata per indicare la posizione delle
	 * immagini per il navigatore
	 */
	private String pathImgNav = ".\\images\\";

	/**
	 * In questa variabile vengono indicati il numero di record da visualizzate
	 * per ogni pagina
	 */
	private int numRecVisual = 10;

	/**
	 * In quesa variabile viene indicato il numero di pagine da visualizzare
	 * alla volta
	 */
	private int numPagVisual = 10;

	/**
	 * In questa variabile vengono indicati il numero totale dei record da
	 * visualizzare
	 */
	private int recTot = 0;

	/**
	 * In questa variabile viene indicato il numero del record di partenza della
	 * pagia da visualizzare
	 */
	private int recIni = 0;

	/**
	 * In questa variabile viene indicato il numero del record di fine della
	 * pagina da visualizzare
	 */
	private int recFin = 0;

	/**
	 * In questa variabile viene indicato il numero delle pagine totale da
	 * visualizzare
	 */
	private int pagTot = 0;

	/**
	 * In questa variabile viene indicato il numero della pagina attuale
	 * visualizzata
	 */
	private int pagAttVisual = 1;

	/**
	 * In questa variabile viene indicato il numero della pagini di inizio da
	 * visualizzare nel navigatore
	 */
	private int pagIniVisual = 1;

	/**
	 * In questa variabile viene indicato il numero della pagini di fine da
	 * visualizzare nel navigatore
	 */
	private int pagFinVisual = 0;
//
//	public Navigator(Map<Object, Object> map) {
//		super();
//		if (map.get("pagIni") != null) {
//			if (((String[]) map.get("pagIni"))[0] != null) {
//				this.pagIniVisual = Integer.parseInt(((String[]) map
//						.get("pagIni"))[0]);
//			}
//		}
//		if (map.get("pagNum") != null) {
//			if (((String[]) map.get("pagNum"))[0] != null) {
//				this.pagAttVisual = Integer.parseInt(((String[]) map
//						.get("pagNum"))[0]);
//			}
//		}
//	}

	public Navigator(Integer pagIniVisual, Integer pagAttVisual) {
		super();
		if (pagIniVisual != null){
			this.pagIniVisual = pagIniVisual;
		}
		if (pagAttVisual != null){
			this.pagAttVisual = pagAttVisual;
		}
	}

	/**
	 * Questo metodo viene utilizzato per calcolare il record di inizio, fine e
	 * il numero di pagine totali e fine
	 *
	 */
	protected void calcNum(int recTot) {
		try {
			this.recTot = recTot;
			if (numRecVisual > 0 && numPagVisual > 0) {

				recIni = ((pagAttVisual - 1) * numRecVisual) + 1;
				recFin = recIni + numRecVisual - 1;
				if (recFin > recTot) {
					recFin = recTot;
				}
				pagTot = recTot / numRecVisual;
				if ((pagTot * numRecVisual) < recTot) {
					pagTot++;
				}
				pagFinVisual = (pagIniVisual + numPagVisual) - 1;
				if (pagFinVisual > pagTot) {
					pagFinVisual = pagTot;
				}
			}
		} catch (ArithmeticException exc) {
			log.error(exc.getMessage(), exc);
		}
	}

	/**
	 * Questo metodo disegna i bottoni della navigazione
	 *
	 *
	 */
	protected String viewNavigatore(Hashtable<String, Object> campi) {
		String ris = "";
		String myHiddenField = "";
		// String myQueryString = "";

		myHiddenField = getHidden(campi);
		// myQueryString = getQueryString(campi);

		ris += "<table border=0 cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"margin: 0px;padding: 0px;\">\n";
		ris += "<TR>\n";
		ris += "<TD class=\"testo\" width=\"27\" nowrap valign=\"top\">\n";
		ris += "Pagine:\n";
		ris += "</TD>\n";

		for (int x = pagIniVisual; x <= pagFinVisual; x++) {
			if (x == pagAttVisual) {
				ris += "<TD class=\"testo\" width=\"5\" nowrap valign=\"top\">\n";
				ris += "<B>&nbsp;";
				ris += Integer.toString(x);
				ris += "</B>\n";
				ris += "</TD>\n";
			} else {
				ris += "<form Method=\"POST\" action=\"\">\n";
				ris += "<input type=\"Hidden\" name=\"pagNum\" value=\""
						+ Integer.toString(x) + "\"/>";
				ris += "<input type=\"Hidden\" name=\"pagIni\" value=\""
						+ Integer.toString(pagIniVisual) + "\"/>";
				ris += myHiddenField;
				ris += "<TD class=\"testo\" width=\"5\" nowrap valign=\"top\">\n";
				ris += "<Input type=submit name=\"m1\" value=\""
						+ Integer.toString(x) + "\" class=button2/>\n";
				ris += "</TD>\n";
				ris += "</form>\n";
			}

		}
		ris += "<TD class=\"testo\" width=\"10\" valign=\"top\"><B>/</B></TD>";
		ris += "<Form Method=\"POST\" action=\"\">\n";
		ris += "<input type=\"Hidden\" name=\"pagNum\" value=\""
				+ Integer.toString(pagTot) + "\">";
		ris += "<input type=\"Hidden\" name=\"pagIni\" value=\""
				+ Integer.toString(pagTot) + "\">";
		ris += myHiddenField;
		ris += "<TD class=\"testo\" width=\"10\" nowrap valign=\"top\">\n";
		ris += "<B>";
		ris += "<Input type=submit name=\"m1\" value=\""
				+ Integer.toString(pagTot) + "\" class=button2>\n";
		ris += "</B>";
		ris += "</TD>\n";
		ris += "</Form>\n";
		// ris +="</B></TD>";
		if (pagIniVisual > 1) {
			ris += "<Form Method=\"POST\" action=\"\">\n";
			ris += "<input type=\"Hidden\" name=\"pagNum\" value=\""
					+ ((pagIniVisual - numPagVisual < 1) ? "1" : Integer
							.toString(pagIniVisual - numPagVisual)) + "\">\n";
			ris += "<input type=\"Hidden\" name=\"pagIni\" value=\""
					+ ((pagIniVisual - numPagVisual < 1) ? "1" : Integer
							.toString(pagIniVisual - numPagVisual)) + "\">\n";
			ris += myHiddenField;
			ris += "<TD width=\"10\" nowrap valign=\"top\">";
			ris += "<input type=\"image\" src=\""
					+ pathImgNav
					+ "indietro.gif\" border=\"0\" width=\"14\" height=\"14\" align=\"middle\" alt=\"indietro\" title=\"indietro\">\n";
			ris += "</TD>\n";
			ris += "</form>\n";
		} else {
			ris += "<TD width=\"10\" nowrap valign=\"top\">";
			ris += "<Img src=\""
					+ pathImgNav
					+ "indietro.gif\" border=\"0\" width=\"14\" height=\"14\" align=\"middle\" alt=\"indietro\" title=\"indietro\">";
			ris += "</TD>\n";
		}

		if (pagFinVisual < pagTot) {
			ris += "<Form Method=\"POST\" action=\"\">\n";
			ris += "<input type=\"Hidden\" name=\"pagNum\" value=\""
					+ (pagFinVisual + 1) + "\">\n";
			ris += "<input type=\"Hidden\" name=\"pagIni\" value=\""
					+ (pagFinVisual + 1) + "\">\n";
			ris += myHiddenField;
			ris += "<TD width=\"10\" nowrap valign=\"top\">";
			ris += "<input type=\"image\" src=\""
					+ pathImgNav
					+ "avanti.gif\" border=\"0\" width=\"14\" height=\"14\" align=\"middle\" alt=\"avanti\" title=\"avanti\">\n";
			ris += "</form>\n";
			ris += "</TD>";
		} else {
			ris += "<TD width=\"10\" nowrap valign=\"top\">";
			ris += "<Img src=\""
					+ pathImgNav
					+ "avanti.gif\" border=\"0\" width=\"14\" height=\"14\" align=\"middle\" alt=\"avanti\" title=\"avanti\">";
			ris += "</TD>";
		}

		ris += "<TD class=\"testo\" align='right' valign=\"top\">record visualizzati&nbsp;<B>"
				+ recIni + "-" + recFin + "/" + recTot + "</B></TD>";
		ris += "</TR>";
		ris += "</Table>";

		return ris;
	}

	/**
	 * Questo metodo disegna i bottoni della navigazione
	 *
	 *
	 */
	protected MessageElement viewNavigatore(Hashtable<String, Object> campi,
			Hashtable<String, Object> campiOri, ConvertToUTF8 convert,
			ConvertToURI convertURI, String modulo,
			String azione) {
		MessageElement navigatore = null;
		MessageElement pagine = null;
		ArrayList<MessageElement> nodes = new ArrayList<MessageElement>();
		Vector<String> keyAttr = null;
		Vector<String> valueAttr = null;
		Vector<String> obbAttr = null;

		try {
			navigatore = new MessageElement();
			navigatore.setName("navigatore");

			navigatore.addChildElement(getXml(campi, campiOri, convert,
					convertURI, modulo, azione));

			pagine = new MessageElement();
			pagine.setName("pagine");
			for (int x = pagIniVisual; x <= pagFinVisual; x++) {
				if (x == pagAttVisual)
					convert.addChildElement(pagine, nodes, "pagina", x, true);
				else {
					keyAttr = new Vector<String>();
					valueAttr = new Vector<String>();
					obbAttr = new Vector<String>();

					keyAttr.add("pagNum");
					valueAttr.add(Integer.toString(x));
					obbAttr.add("true");

					keyAttr.add("pagIni");
					valueAttr.add(Integer.toString(pagIniVisual));
					obbAttr.add("true");

					convert.addChildElement(pagine, nodes, "pagina",
							Integer.toString(x), keyAttr, valueAttr, true,
							obbAttr);
				}

			}
			navigatore.addChildElement(pagine);

			convert.addChildElement(navigatore, nodes, "pagineTot", pagTot,
					true);

			if (pagIniVisual > 1)
				convert.addChildElement(
						navigatore,
						nodes,
						"pagIni",
						((pagIniVisual - numPagVisual < 1) ? "1" : Integer
								.toString(pagIniVisual - numPagVisual)), true);

			if (pagFinVisual < pagTot)
				convert.addChildElement(navigatore, nodes, "pagFin",
						(pagFinVisual + 1), true);

			convert.addChildElement(navigatore, nodes, "recIni", recIni, true);
			convert.addChildElement(navigatore, nodes, "recFin", recFin, true);
			convert.addChildElement(navigatore, nodes, "recTot", recTot, true);
		} catch (SOAPException e) {
			log.error(e.getMessage(),e);
		}

		return navigatore;
	}

	/**
	 * Questo metodo viene uitilizzato per indicare il numero di paggine che
	 * devono essere visualizzate alla volta
	 *
	 * @param i
	 */
	protected void setNumPagVisual(int i) {
		numPagVisual = i;
	}

	/**
	 * Questo metodo viene utilizzato per indicare il numero di record che
	 * devono essere visualizzate alla volta
	 *
	 * @param i
	 */
	protected void setNumRecVisual(int i) {
		numRecVisual = i;
	}

	/**
	 * Tramite questo metodo viene valorizzato il contenuto della variabile
	 * pathImgNav che indica la path dove si trovano le imamgini per il
	 * navigatore (Default: .\images\)
	 *
	 * @param string
	 */
	protected void setPathImgNav(String string) {
		pathImgNav = string;
	}

	/**
	 * Questo metodo serve per l'estrazione dei dati necessati per il navigatore
	 * nel formato QueryString
	 *
	 */
	public String getQueryString(Hashtable<String, Object> campi) {
		String ris = "";
		String key = "";
		Object column = null;
		GregorianCalendar gc = null;

		for (Enumeration<String> e = campi.keys(); e.hasMoreElements();) {
			key = (String) e.nextElement();
			column = (Object) campi.get(key);
			if (column != null) {
				if (!ris.endsWith("&"))
					ris += ris.equals("") ? "" : "&";
				if (column.getClass().getName()
						.equals("java.lang.Integer"))
					ris += addQueryString(key,
							((Integer) column).intValue());
				else if (column.getClass().getName()
						.equals("java.lang.String"))
					ris += addQueryString(key, (String) column);
				else if (column.getClass().getName()
						.equals("java.util.GregorianCalendar")
						|| column.getClass().getName()
								.equals("java.sql.Timestamp")) {
					if (column.getClass().getName()
							.equals("java.util.GregorianCalendar"))
						gc = (GregorianCalendar) column;
					else {
						gc = new GregorianCalendar();
						gc.setTimeInMillis(((Timestamp) column)
								.getTime());
					}
					ris += addQueryString(key + "GG",
							gc.get(Calendar.DAY_OF_MONTH));
					ris += addQueryString(key + "MM",
							(gc.get(Calendar.MONTH) + 1));
					ris += addQueryString(key + "AA", gc.get(Calendar.YEAR));
				}
			}
		}
		return ris;

	}

	/**
	 * Questo metodo viene utilizzato per aggiungere una voce nella QueryString
	 *
	 * @param name
	 *            Nome del campo
	 * @param value
	 *            Valore del campo
	 * @return Nuovo Valore
	 */
	private String addQueryString(String name, int value) {
		String ris = "";
		ris = value == 0 ? "" : name + "=" + value;
		return ris;
	}

	/**
	 * Questo metodo viene utilizzato per aggiungere una voce nella QueryString
	 *
	 * @param name
	 *            Nome del campo
	 * @param value
	 *            Valore del campo
	 * @return Nuovo Valore
	 */
	private String addQueryString(String name, String value) {
		String ris = "";
		ris = value.equals("") ? "" : name + "=" + value;
		return ris;
	}

	/**
	 * Questo metodo serve per l'estrazione dei dati necessati per il navigatore
	 * nel formato Form HIDDEN
	 *
	 */
	private MessageElement getXml(Hashtable<String, Object> campi, Hashtable<String, Object> campiOri,
			ConvertToUTF8 convert,
			ConvertToURI convertURI, String modulo,
			String azione) {
		MessageElement campiXml = null;
		ArrayList<MessageElement> nodes = new ArrayList<MessageElement>();
		String key = "";
		Object column = null;
		GregorianCalendar gc = null;

		try {
			campiXml = new MessageElement();
			campiXml.setName("campi");
			convert.addChildElement(campiXml, nodes, "campo", modulo, "key",
					"modulo", true, true);
			convert.addChildElement(campiXml, nodes, "campo", azione, "key",
					"azione", true, true);
			for (Enumeration<String> e = campiOri.keys(); e.hasMoreElements();) {
				key = (String) e.nextElement();
				column = (Object) campi.get(key.toLowerCase());
				if (column != null) {
					if (column.getClass().getName()
							.equals(Integer.class.getName()))
						convert.addChildElement(campiXml, nodes, "campo",
								Integer.toString(((Integer) column)
										.intValue()), "key", key, true, true);
					else if (column.getClass().getName()
							.equals(String.class.getName()))
						convert.addChildElement(campiXml, nodes, "campo",
								(String) column, "key", key, true,
								true);
					else if (column.getClass().getName()
							.equals(GregorianCalendar.class.getName())) {
						gc = (GregorianCalendar) column;
						convert.addChildElement(
								campiXml,
								nodes,
								"campo",
								Integer.toString(gc.get(Calendar.DAY_OF_MONTH)),
								"key", key + "GG", true, true);
						convert.addChildElement(campiXml, nodes, "campo",
								Integer.toString(gc.get(Calendar.MONTH) + 1),
								"key", key + "MM", true, true);
						convert.addChildElement(campiXml, nodes, "campo",
								Integer.toString(gc.get(Calendar.YEAR)), "key",
								key + "AA", true, true);
					} else if (column.getClass().getName()
							.equals(Timestamp.class.getName())) {
						gc = new GregorianCalendar();
						gc.setTimeInMillis(((Timestamp) column)
								.getTime());
						convert.addChildElement(
								campiXml,
								nodes,
								"campo",
								Integer.toString(gc.get(Calendar.DAY_OF_MONTH)),
								"key", key + "GG", true, true);
						convert.addChildElement(campiXml, nodes, "campo",
								Integer.toString(gc.get(Calendar.MONTH) + 1),
								"key", key + "MM", true, true);
						convert.addChildElement(campiXml, nodes, "campo",
								Integer.toString(gc.get(Calendar.YEAR)), "key",
								key + "AA", true, true);
					}
				}
			}
		} catch (SOAPException e) {
			log.error(e.getMessage(), e);
		}
		return campiXml;
	}

	/**
	 * Questo metodo serve per l'estrazione dei dati necessati per il navigatore
	 * nel formato Form HIDDEN
	 *
	 */
	private String getHidden(Hashtable<String, Object> campi) {
		String ris = "";
		String key = "";
		Object column = null;
		GregorianCalendar gc = null;

		for (Enumeration<String> e = campi.keys(); e.hasMoreElements();) {
			key = (String) e.nextElement();
			column = (Object) campi.get(key);
			if (column != null) {
				if (column.getClass().getName()
						.equals("java.lang.Integer"))
					ris += addHidden(key,
							((Integer) column).intValue());
				else if (column.getClass().getName()
						.equals("java.lang.String"))
					ris += addHidden(key, (String) column);
				else if (column.getClass().getName()
						.equals("java.util.GregorianCalendar")) {
					gc = (GregorianCalendar) column;
					ris += addHidden(key + "GG", gc.get(Calendar.DAY_OF_MONTH));
					ris += addHidden(key + "MM", (gc.get(Calendar.MONTH) + 1));
					ris += addHidden(key + "AA", gc.get(Calendar.YEAR));
				} else if (column.getClass().getName()
						.equals("java.sql.Timestamp")) {
					gc = new GregorianCalendar();
					gc.setTimeInMillis(((Timestamp) column)
							.getTime());
					ris += addHidden(key + "GG", gc.get(Calendar.DAY_OF_MONTH));
					ris += addHidden(key + "MM", (gc.get(Calendar.MONTH) + 1));
					ris += addHidden(key + "AA", gc.get(Calendar.YEAR));
				}
			}
		}
		return ris;
	}

	/**
	 * Questo metodo viene utilizzato per aggiungere una voce nella Hidden
	 *
	 * @param name
	 *            Nome del campo
	 * @param value
	 *            Valore del campo
	 * @return Nuovo Valore
	 */
	private String addHidden(String name, int value) {
		String ris = "";
		ris = value == 0 ? "" : "<input type=\"Hidden\" name=\"" + name
				+ "\" value=\"" + value + "\"/>";
		return ris;
	}

	/**
	 * Questo metodo viene utilizzato per aggiungere una voce nella Hidden
	 *
	 * @param name
	 *            Nome del campo
	 * @param value
	 *            Valore del campo
	 * @return Nuovo Valore
	 */
	private String addHidden(String name, String value) {
		String ris = "";
		ris = value.equals("") ? "" : "<input type=\"Hidden\" name=\"" + name
				+ "\" value=\"" + value + "\"/>";
		return ris;
	}

	/**
	 * Questo metodo viene utilizzato per visualizzare il numero del record di
	 * fine della visualizzazione
	 *
	 */
	public int getRecFin() {
		return recFin;
	}

	/**
	 * Questo metodo viene utilizzato per visualizzare il numero di record di
	 * partenza della visualizzazione
	 *
	 */
	public int getRecIni() {
		return recIni;
	}

	/**
	 * @param pagAttVisual
	 *            the pagAttVisual to set
	 */
	public void setPagAttVisual(int pagAttVisual) {
		this.pagAttVisual = pagAttVisual;
	}

	/**
	 * @return the pagIniVisual
	 */
	public int getPagIniVisual() {
		return pagIniVisual;
	}

	/**
	 * @return the pagFinVisual
	 */
	public int getPagFinVisual() {
		return pagFinVisual;
	}

	/**
	 * @return the pagAttVisual
	 */
	public int getPagAttVisual() {
		return pagAttVisual;
	}

	/**
	 * @return the pagTot
	 */
	public int getPagTot() {
		return pagTot;
	}

	/**
	 * @return the numPagVisual
	 */
	public int getNumPagVisual() {
		return numPagVisual;
	}
}
