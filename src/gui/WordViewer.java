package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WordViewer extends JFrame{
	public WordViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Word");
		model.addColumn("Mean");
		model.addColumn("Class");
		model.addColumn("Pronunciation");
		
		JTable table =new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
