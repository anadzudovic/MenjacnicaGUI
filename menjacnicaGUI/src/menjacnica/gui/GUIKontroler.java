

package menjacnica.gui;
import java.awt.EventQueue;
import java.io.File;
import java.security.cert.PKIXRevocationChecker.Option;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import menjacnica.gui.*;
import menjacnica.gui.MenjacnicaGUI;

public class GUIKontroler {
	private static MenjacnicaGUI menjacnicaGUI;
	private static DodajKursGUI dodajKursGUI;
	private static ObrisiKursGUI obrisiKursGUI;
	private static IzvrsiZamenuGUI izvrsiZamenuGUI;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnicaGUI= new MenjacnicaGUI();
					menjacnicaGUI.setVisible(true);
					menjacnicaGUI.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void otvoriProzorZaDodavanjeKursa(){
		dodajKursGUI = new DodajKursGUI();
		dodajKursGUI.setVisible(true);
		dodajKursGUI.setLocationRelativeTo(menjacnicaGUI);
		
		}
	public static void otvoriProzorZaBrisanjeKursa(){
		obrisiKursGUI = new ObrisiKursGUI();
		obrisiKursGUI.setVisible(true);
		obrisiKursGUI.setLocationRelativeTo(menjacnicaGUI);
		
		}
	public static void otvoriProzorZaZamenu(){
		izvrsiZamenuGUI = new IzvrsiZamenuGUI();
		izvrsiZamenuGUI.setVisible(true);
		izvrsiZamenuGUI.setLocationRelativeTo(menjacnicaGUI);
		
		}
	public static void spojiIIspisi(){
		String s =dodajKursGUI.spajanje();
		dodajKursGUI.dispose();
		menjacnicaGUI.ispisi(s);
		
		
	}
	public static void spojiIIspisi2(){
		String s =obrisiKursGUI.spajanje();
		obrisiKursGUI.dispose();
		menjacnicaGUI.ispisi(s);
		
		
	}
	public static void samoIspis(String p){
		menjacnicaGUI.ispisi(p);
	}
	public static String izaberiFajl(){
		 		String fajl = null;
		 		try {
		 			JFileChooser fc = new JFileChooser();
		 			int odgovor = fc.showOpenDialog(menjacnicaGUI);
		 			if(odgovor == JFileChooser.APPROVE_OPTION){
		 				File file = fc.getSelectedFile();
		 				fajl = file.getAbsolutePath();
		 			}
		 		} catch (Exception e) {
		 			JOptionPane.showMessageDialog(menjacnicaGUI, e.getMessage(), "Doslo je do greske, pokusajte ponovo",
		 			JOptionPane.ERROR_MESSAGE);
		 		}
		 		
		 		return fajl;
		 		
		 	}
	public static String sacuvajFajl(){
 		String fajl = null;
 		try {
 			JFileChooser fc = new JFileChooser();
 			int odgovor = fc.showSaveDialog(menjacnicaGUI);
 			if(odgovor == JFileChooser.APPROVE_OPTION){
 				File file = fc.getSelectedFile();
 				fajl = file.getAbsolutePath();
 			}
 		} catch (Exception e) {
 			JOptionPane.showMessageDialog(menjacnicaGUI, e.getMessage(), "Doslo je do greske, pokusajte ponovo",
 			JOptionPane.ERROR_MESSAGE);
 		}
 		
 		return fajl;
 		
 	}
	public static void ugasiAplikaciju(){
		 		int odgovor = JOptionPane.showConfirmDialog(menjacnicaGUI, "Da li zelite da ugasite aplikaciju", "Gasenje", JOptionPane.YES_NO_CANCEL_OPTION);
		 		if(odgovor == JOptionPane.YES_OPTION)
		 			System.exit(0);
		 	}
	public static void prikazPodatakaOAutoru(){
		String poruka = "Ime i prezime autora: anadzudovic, grad: Beograd, zemlja:Srbija";
		JOptionPane.showMessageDialog(menjacnicaGUI.getContentPane(), poruka, "Podaci o autoru",2);
	}
	
	

}
