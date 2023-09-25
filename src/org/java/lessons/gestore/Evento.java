package org.java.lessons.gestore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
	private String titolo;
	private LocalDate dataEvento;
	private int totPosti;
	private int postiPrenotati = 0;
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public Evento(String titolo, String data, int totPosti) throws Exception {
		setTitolo(titolo);
		setData(data);
		setTotPosti(totPosti);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setData(String data) throws Exception {
		
		LocalDate dt = LocalDate.parse(data, formatter);
		
		if(dt.isBefore(LocalDate.now()))
		{
			throw new Exception("La data inserita non può essere nel passato");
		}
		this.dataEvento = dt;
	}

	public int getTotPosti() {
		return totPosti;
	}

	private void setTotPosti(int totPosti) throws Exception {
		
		if(totPosti <= 0)
		{
			throw new Exception("Deve esserci almeno un posto disponibile");
		}
		this.totPosti = totPosti;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	private void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
	public void prenota() throws Exception
	{
		if(getDataEvento().isBefore(LocalDate.now()))
		{
			throw new Exception("Evento non più disponibile");
		}
		
		if(getPostiPrenotati() == getTotPosti())
		{
			throw new Exception("Posti esauriti");
		}
		
		setPostiPrenotati(getPostiPrenotati() + 1);
		
	}
	
	public void disdici() throws Exception
	{
		if(getDataEvento().isBefore(LocalDate.now()))
		{
			throw new Exception("Evento non più disponibile");
		}
		
		if(getPostiPrenotati() == 0)
		{
			throw new Exception("Non ci sono prenotazioni");
		}
		
		setPostiPrenotati(getPostiPrenotati() - 1);
		
	}

	@Override
	public String toString() {
		
		
		return "Data: " + getDataEvento().format(formatter) + " - Titolo: " + getTitolo();
	}
	
	
}
