package org.java.lessons.gestore;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
	
	private LocalTime ora;
	private BigDecimal prezzo;
	
	private final DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("HH:mm");

	public Concerto(String titolo, String data, int totPosti, String ora, double prezzo) throws Exception {
		super(titolo, data, totPosti);
		
		setOra(ora);
		setPrezzo(prezzo);
	}

	public LocalTime getOra() {
		return ora;
	}

	public void setOra(String ora) {
	 	LocalTime hour = LocalTime.parse(ora, hourFormatter);
		this.ora = hour;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo2) {
		BigDecimal prezzo = new BigDecimal(prezzo2).setScale(2, RoundingMode.HALF_DOWN);
		this.prezzo = prezzo;
	}
	
	public String getFormattedOra()
	{
		return getOra().format(hourFormatter);
	}
	
	public String getPrezzoFormatted()
	{
		return getPrezzo().setScale(2).toPlainString();
	}

	@Override
	public String toString() {
		return "Concerto: " + getDataFormatted() + " ora: " + getOra() + " - " + getTitolo() + " - " + getPrezzoFormatted();
	}
	
	
}
