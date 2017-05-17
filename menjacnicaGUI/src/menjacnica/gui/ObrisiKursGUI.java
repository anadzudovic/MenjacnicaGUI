package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textsifra;
	private JTextField textnaziv;
	private JTextField textpr;
	private JTextField textkup;
	private JTextField textsr;
	private JTextField textskr;
	private JCheckBox cb;

	
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getTextsifra());
		contentPane.add(getTextnaziv());
		contentPane.add(getTextpr());
		contentPane.add(getTextkup());
		contentPane.add(getTextsr());
		contentPane.add(getTextskr());
		contentPane.add(getCb());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel.setBounds(45, 28, 80, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setBounds(235, 28, 70, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel(" Prodajni kurs");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_2.setBounds(39, 84, 99, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni kurs\r\n");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_3.setBounds(235, 84, 104, 14);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji kurs\r\n");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_4.setBounds(39, 135, 99, 14);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skraceni naziv");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_5.setBounds(235, 135, 104, 14);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Obrisi");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.spojiIIspisi2();
				}
			});
			btnNewButton.setEnabled(false);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			btnNewButton.setBounds(21, 237, 137, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			btnNewButton_1.setBounds(200, 237, 104, 23);
		}
		return btnNewButton_1;
	}
	private JTextField getTextsifra() {
		if (textsifra == null) {
			textsifra = new JTextField();
			textsifra.setEditable(false);
			textsifra.setBounds(39, 53, 86, 20);
			textsifra.setColumns(10);
		}
		return textsifra;
	}
	private JTextField getTextnaziv() {
		if (textnaziv == null) {
			textnaziv = new JTextField();
			textnaziv.setEditable(false);
			
			textnaziv.setBounds(235, 53, 86, 20);
			textnaziv.setColumns(10);
		}
		return textnaziv;
	}
	private JTextField getTextpr() {
		if (textpr == null) {
			textpr = new JTextField();
			textpr.setEditable(false);
			textpr.setBounds(39, 106, 86, 20);
			textpr.setColumns(10);
		}
		return textpr;
	}
	private JTextField getTextkup() {
		if (textkup == null) {
			textkup = new JTextField();
			textkup.setEditable(false);
			textkup.setBounds(235, 109, 86, 20);
			textkup.setColumns(10);
		}
		return textkup;
	}
	private JTextField getTextsr() {
		if (textsr == null) {
			textsr = new JTextField();
			textsr.setEditable(false);
			
			textsr.setBounds(39, 160, 86, 20);
			textsr.setColumns(10);
		}
		return textsr;
	}
	private JTextField getTextskr() {
		if (textskr == null) {
			textskr = new JTextField();
			textskr.setEditable(false);
			
			textskr.setBounds(235, 160, 86, 20);
			textskr.setColumns(10);
		}
		return textskr;
	}
	private JCheckBox getCb() {
		if (cb == null) {
			cb = new JCheckBox("Zaista obrisi kurs");
			cb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(cb.isSelected()) btnNewButton.setEnabled(true);
					else btnNewButton.setEnabled(false);
				}
			});
			cb.setBounds(21, 207, 148, 23);
		}
		return cb;
	}
	public String  spajanje(){
		String s ="";
		String naziv = textnaziv.getText();
		String sifra = textsifra.getText();
		String skraceniNaziv = textskr.getText();
		double prodajniKurs=0;
		double srednjiKurs=0;
		double kupovniKurs=0;
		//double prodajniKurs= Double.parseDouble(textpr.getText());
		//double srednjiKurs= Double.parseDouble(textsr.getText());
		//double kupovniKurs = Double.parseDouble(textkup.getText());
		s= " Naziv " + naziv+ " Sifra "+sifra+" Skraceni naziv "+skraceniNaziv+" Prodajni kurs "+
		prodajniKurs+ " Kupovni kurs "+ kupovniKurs+" Srednji kurs "+srednjiKurs;
		return s;
	}
}
