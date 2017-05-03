package modelTabele;


import java.util.*;
import kursevi.Valuta;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private final String[] kolone = new String[] { "Sifra", "Skraceni naziv","Kupovni", "Srednji", "Prodajni", "Naziv" };
	private List<Valuta> valute = new LinkedList<Valuta> ();
	public TableModel(){
		
	}
	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return valute.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Valuta v = valute.get(rowIndex);
				switch (columnIndex) {
				case 0:
					return v.getSifra();
				case 1:
					return v.getSkraceniNaziv();
				case 2:
					return v.getKupovniKurs();
				case 3:
					return v.getSrednjiKurs();
				case 4:
					return v.getProdajniKurs();
				case 5:
					return v.getNaziv();
				default:
					return "Greska";
				}
	}
	@Override
		public String getColumnName(int column) {
			return kolone[column];
		}
	
		public void ubaciSveValute(List<Valuta> valute) {
			this.valute = valute;
			fireTableDataChanged();
		}
	
		public Valuta vratiValutu(int index) {
			return valute.get(index);
		}
}
