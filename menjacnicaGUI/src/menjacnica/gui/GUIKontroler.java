

package menjacnica.gui;
import java.awt.EventQueue;
import java.io.File;
import java.security.cert.PKIXRevocationChecker.Option;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import menjacnica.gui.MenjacnicaGUI;

public class GUIKontroler {
	private static MenjacnicaGUI menjacnicaGUI;
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
	public static String izaberiFajl(){
		 		String fajl = "";
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
 		String fajl = "";
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
