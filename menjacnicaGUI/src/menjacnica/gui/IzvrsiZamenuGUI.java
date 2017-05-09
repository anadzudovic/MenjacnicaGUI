package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JTextField textFieldi;
	private JRadioButton rdbtnKupovna;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public IzvrsiZamenuGUI() {
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getComboBox());
		contentPane.add(getTextFieldi());
		contentPane.add(getRdbtnKupovna());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getSlider());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setBounds(34, 35, 81, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Prodajni kurs");
			lblNewLabel_1.setBounds(277, 35, 97, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Valuta");
			lblNewLabel_2.setBounds(168, 35, 46, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Vrsta transakcija");
			lblNewLabel_3.setBounds(277, 104, 97, 14);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Iznos");
			lblNewLabel_4.setBounds(37, 104, 46, 14);
		}
		return lblNewLabel_4;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(34, 60, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(277, 60, 86, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(167, 60, 70, 20);
		}
		return comboBox;
	}
	private JTextField getTextFieldi() {
		if (textFieldi == null) {
			textFieldi = new JTextField();
			textFieldi.setBounds(34, 129, 86, 20);
			textFieldi.setColumns(10);
		}
		return textFieldi;
	}
	private JRadioButton getRdbtnKupovna() {
		if (rdbtnKupovna == null) {
			rdbtnKupovna = new JRadioButton("Kupovna");
			buttonGroup.add(rdbtnKupovna);
			rdbtnKupovna.setBounds(277, 125, 109, 23);
		}
		return rdbtnKupovna;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodajna");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(277, 151, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent arg0) {
					int iznos = slider.getValue();
					textFieldi.setText(""+iznos);
				}
			});
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setBounds(45, 184, 317, 51);
		}
		return slider;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Izvrsi zamenu");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String t ;
					if(rdbtnProdaja.isSelected()) t = "prodaja";
					else t= "kupovina";
					String p = "Naziv valute: " + comboBox.getSelectedItem() + " Iznos: " + textFieldi.getText()+" Transakcija: " + t;
					dispose();
					GUIKontroler.samoIspis(p);
					
					
				}
			});
			btnNewButton.setBounds(34, 268, 126, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(247, 268, 116, 23);
		}
		return btnNewButton_1;
	}
}
