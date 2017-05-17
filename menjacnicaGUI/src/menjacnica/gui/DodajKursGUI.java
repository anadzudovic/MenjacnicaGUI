package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajni;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField sifratxt;
	private JTextField nazivtxt;
	private JTextField prtxt;
	private JTextField kuptxt;
	private JTextField srtxt;
	private JTextField skrtxt;
	private JButton btnDodaj;
	private JButton btnOdustani;

	
	public DodajKursGUI() {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajni());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSifratxt());
		contentPane.add(getNazivtxt());
		contentPane.add(getPrtxt());
		contentPane.add(getKuptxt());
		contentPane.add(getSrtxt());
		contentPane.add(getSkrtxt());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblSifra.setBounds(53, 29, 65, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNaziv.setBounds(277, 29, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
			lblProdajni.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblProdajni.setBounds(53, 84, 110, 14);
		}
		return lblProdajni;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblKupovniKurs.setBounds(277, 84, 91, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblSrednjiKurs.setBounds(53, 145, 91, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblSkraceniNaziv.setBounds(277, 145, 110, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSifratxt() {
		if (sifratxt == null) {
			sifratxt = new JTextField();
			sifratxt.setBounds(53, 53, 110, 20);
			sifratxt.setColumns(10);
		}
		return sifratxt;
	}
	private JTextField getNazivtxt() {
		if (nazivtxt == null) {
			nazivtxt = new JTextField();
			nazivtxt.setBounds(277, 53, 122, 20);
			nazivtxt.setColumns(10);
		}
		return nazivtxt;
	}
	private JTextField getPrtxt() {
		if (prtxt == null) {
			prtxt = new JTextField();
			prtxt.setBounds(53, 109, 110, 20);
			prtxt.setColumns(10);
		}
		return prtxt;
	}
	private JTextField getKuptxt() {
		if (kuptxt == null) {
			kuptxt = new JTextField();
			kuptxt.setBounds(277, 114, 122, 20);
			kuptxt.setColumns(10);
		}
		return kuptxt;
	}
	private JTextField getSrtxt() {
		if (srtxt == null) {
			srtxt = new JTextField();
			srtxt.setBounds(53, 170, 110, 20);
			srtxt.setColumns(10);
		}
		return srtxt;
	}
	private JTextField getSkrtxt() {
		if (skrtxt == null) {
			skrtxt = new JTextField();
			skrtxt.setBounds(277, 170, 122, 20);
			skrtxt.setColumns(10);
		}
		return skrtxt;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.spojiIIspisi();
				}
			});
			btnDodaj.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			btnDodaj.setBounds(40, 224, 123, 23);
			
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			btnOdustani.setBounds(277, 224, 122, 23);
		}
		return btnOdustani;
	}
	public String  spajanje(){
		String s ="";
		String naziv = nazivtxt.getText();
		String sifra = sifratxt.getText();
		String skraceniNaziv = skrtxt.getText();
		double prodajniKurs;
		prodajniKurs = Double.parseDouble(prtxt.getText());
		double srednjiKurs;
		srednjiKurs = Double.parseDouble(srtxt.getText());
		double kupovniKurs = Double.parseDouble(kuptxt.getText());
		s= " Naziv " + naziv+ " Sifra "+sifra+" Skraceni naziv "+skraceniNaziv+" Prodajni kurs "+
		prodajniKurs+ " Kupovni kurs "+ kupovniKurs+" Srednji kurs "+srednjiKurs;
		return s;
	}
}
