package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import modelTabele.TableModel;

import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane pane;
	private JPanel panel_1;
	private JButton dodaj;
	private JButton obrisi;
	private JTextArea textArea;
	private JButton zamena;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiZamenu;
	private JMenuBar menuBar_1;
     public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/exchange.png")));
		setVisible(true);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent we)
		    { 
		        GUIKontroler.ugasiAplikaciju();
		    }
		});
		
		setBounds(100, 100, 657, 361);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPane(), BorderLayout.SOUTH);
		contentPane.add(getPanel_1(), BorderLayout.EAST);
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setAutoscrolls(true);
			scrollPane.setViewportView(getTable());
			scrollPane.setColumnHeaderView(getMenuBar_1_1());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setColumnSelectionAllowed(true);
			table.setCellSelectionEnabled(true);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Kupovni", "Srednji", "Prodajni", "Naziv"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			addPopup(table, getPopupMenu_1());
		}
		return table;
	}
	private JScrollPane getPane() {
		if (pane == null) {
			pane = new JScrollPane();
			pane.setAutoscrolls(true);
			pane.setPreferredSize(new Dimension(25, 50));
			pane.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "STATUS:", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pane.setLayout(null);
			pane.add(getTextArea());
			
		}
		return pane;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(125, 10));
			panel_1.setLayout(null);
			panel_1.add(getDodaj());
			panel_1.add(getObrisi());
			panel_1.add(getZamena());
		}
		return panel_1;
	}
	private JButton getDodaj() {
		if (dodaj == null) {
			dodaj = new JButton("Dodaj kurs");
			dodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					 GUIKontroler.otvoriProzorZaDodavanjeKursa();
						
					
					
				}
			});
			dodaj.setBounds(5, 5, 120, 23);
		}
		return dodaj;
	}
	private JButton getObrisi() {
		if (obrisi == null) {
			obrisi = new JButton("Obrisi kurs");
			obrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.otvoriProzorZaBrisanjeKursa();
				}
			});
			obrisi.setBounds(5, 39, 120, 23);
		}
		return obrisi;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(10, 16, 458, 23);
			textArea.setPreferredSize(new Dimension(52, 20));
		}
		return textArea;
	}
	private JButton getZamena() {
		if (zamena == null) {
			zamena = new JButton("Izvrsi zamenu");
			zamena.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.otvoriProzorZaZamenu();
				}
			});
			zamena.setBounds(5, 73, 120, 23);
		}
		return zamena;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/office-material.png")));
			mnNewMenu.add(getMntmOpen());
			mnNewMenu.add(getMntmSave());
			mnNewMenu.add(getMntmExit());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String putanja = GUIKontroler.izaberiFajl();
					textArea.setText(textArea.getText()+ "\n" +"Ucitan fajl: " +putanja);
					
					
				}
			});
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/safebox.png")));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String putanja = GUIKontroler.sacuvajFajl();
					textArea.setText(textArea.getText()+"\n"+ "Sacuvan fajl:"+ putanja);
				}
			});
			
			
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/diskette.png")));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.ugasiAplikaciju();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
			mntmExit.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/door.png")));
		}
		return mntmExit;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/lifesaver.png")));
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikazPodatakaOAutoru();
				}
			});
			mntmAbout.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/icons/question.png")));
		}
		return mntmAbout;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JPopupMenu getPopupMenu_1() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.setVisible(true);
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
		}
		return popupMenu;
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.otvoriProzorZaDodavanjeKursa();
				}
			});
			mntmDodajKurs.setSelected(true);
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.otvoriProzorZaBrisanjeKursa();
				}
			});
			mntmObrisiKurs.setSelected(true);
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
			mntmIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.otvoriProzorZaZamenu();
				}
			});
			mntmIzvrsiZamenu.setSelected(true);
		}
		return mntmIzvrsiZamenu;
	}
	private JMenuBar getMenuBar_1_1() {
		if (menuBar_1 == null) {
			menuBar_1 = new JMenuBar();
		}
		return menuBar_1;
	}
	public void ispisi(String porukica){
		textArea.setText(textArea.getText()+"\n"+ porukica);
	}
}
