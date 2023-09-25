package org.java.lessons;

import org.java.lessons.gestore.Concerto;
import org.java.lessons.gestore.Evento;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		/**
		 * Milestone 1 e 2
		 * */
		
//		String userValue = null;
//		while(true)
//		{
//			System.out.print("Inserisci il titolo dell'evento:");
//			String titolo = sc.nextLine();
//			
//			System.out.println("Inserisci la data in questo formato: 'dd-mm-yyyy'");
//			String data = sc.nextLine();
//			
//			System.out.println("Quanti posti sono a disposizione?");
//			int posti = Integer.valueOf(sc.nextLine());
//			
//			try {
//				Evento evento1 = new Evento(titolo, data, posti);
//				
//				System.out.println("Vuoi effettuare prenotazioni? [Y/n]");
//				String choice = sc.nextLine();
//
//				if(choice.toLowerCase().equals("y"))
//				{
//					System.out.println("quanti biglietti vuoi prenotare?");
//					int prenotazioni = Integer.valueOf(sc.nextLine());
//					
//					if(prenotazioni > 0 && prenotazioni <= evento1.getTotPosti())
//					{
//						for(int i = 0; i < prenotazioni; i++)
//						{
//							try {
//								evento1.prenota();
//							}catch(Exception e)
//							{
//								System.err.println(e.getMessage());
//							}
//						}
//					}
//					
//				}
//				
//				System.out.println("Posti prenotati: " + evento1.getPostiPrenotati() + " Posti disponibili: " + evento1.getTotPosti());
//				
//				System.out.println("Vuoi disdire prenotazioni? [Y/n]");
//				String choice2 = sc.nextLine();
//
//				if(choice2.toLowerCase().equals("y"))
//				{
//					System.out.println("quanti biglietti vuoi disdire?");
//					int prenotazioni = Integer.valueOf(sc.nextLine());
//					
//					if(prenotazioni > 0 && prenotazioni <= evento1.getPostiPrenotati())
//					{
//						for(int i = 0; i < prenotazioni; i++)
//						{
//							try {
//								evento1.disdici();
//							}catch(Exception e)
//							{
//								System.err.println(e.getMessage());
//							}
//						}
//					}
//					
//				}
//				
//				System.out.println("Posti prenotati: " + evento1.getPostiPrenotati() + " Posti disponibili: " + evento1.getTotPosti());
//				
//				
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//			
//			System.out.println("Vuoi inserire un altro evento? [Y/n]");
//			String again = sc.nextLine();
//			if(again.equals("n"))
//			{
//				break;
//			}
//			
//			System.out.println("Fine");
//			sc.close();
//		}
		
		/**
		 * Milestone 3
		 */
		
//		try {
//			Concerto c1 = new Concerto("jimmy e i ricordi", "12-12-2024", 50, "13:00", 13.45);
//			System.out.println(c1);
//		} catch (Exception e) {
//		
//			System.err.println(e.getMessage());
//		}
		
		/**
		 * Milestone 4
		 */
	}
}
