package org.java.lessons.gestore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ProgrammaEventi {
	private String titolo;
	private List<Evento> eventi;
	public ProgrammaEventi(String titolo, List<Evento> concerti) {
		
		setEventi(concerti);
		setTitolo(titolo);
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public List<Evento> getEventi() {
		return eventi;
	}
	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	public void addEvento(Evento evento)
	{
		getEventi().add(evento);
	}
	
	public int getNumeroEventi()
	{
		return getEventi().size();
	}
	
	public void resetEventi()
	{
		getEventi().clear();
	}
	
	public List<Evento> searchByDate(String data)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dt = LocalDate.parse(data, formatter);		

		List<Evento> listaFiltrata = new ArrayList<Evento>();
		
		for(Evento ev : getEventi())
		{
			if(ev.getDataEvento().isEqual(dt))
			{
				listaFiltrata.add(ev);
			}
		}
		
		
		return listaFiltrata;
	}
	
	public String getListaOrdinata()
	{
		String list = getTitolo() + "\n--------------\n";
		
		List<Evento> listaOrdinata = getEventi();
		Collections.sort(listaOrdinata, (ev1, ev2) -> ev1.getDataEvento().compareTo(ev2.getDataEvento()));
		
		for(Evento ev : listaOrdinata)
		{
			list += " - " + ev.getDataFormatted() + " - " + ev.getTitolo() + "\n";
		}
		
		return list;
	}
}
