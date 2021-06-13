package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Manager.WordManager;
import word.Word;
import word.WordInput;

public class WordViewer extends JPanel{
	WindowFrame frame;
	WordManager wordManager;

	public WordManager getWordManager() {
		return wordManager;
	}

	public void setWordManager(WordManager wordManager) {
		this.wordManager = wordManager;
//		this.removeAll();
//		DefaultTableModel model = new DefaultTableModel();
//		model.addColumn("Word");
//		model.addColumn("Class");
//		model.addColumn("Mean");
//		model.addColumn("Pronunciation");
//		
//		for(int i =0;i<wordManager.size();i++) {
//			Vector row = new Vector();
//			WordInput w =wordManager.get(i);
//			row.add(w.getMemorzied_word());
//			row.add(w.getWordclass());
//			row.add(w.getMean());
//			model.addRow(row);
//		}
//		
//		JTable table =new JTable(model);
//		JScrollPane sp = new JScrollPane(table);
//		this.add(sp);
	}

	public WordViewer(WindowFrame frame,WordManager wordManager) {
		this.frame=frame;
		this.wordManager=wordManager;
		
		System.out.println("***"+wordManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Word");
		model.addColumn("Class");
		model.addColumn("Mean");
		model.addColumn("Pronunciation");
		
		for(int i =0;i<wordManager.size();i++) {
			Vector row = new Vector();
			WordInput w =wordManager.get(i);
			row.add(w.getMemorzied_word());
			row.add(w.getWordclass());
			row.add(w.getMean());
			model.addRow(row);
		}
		JTable table =new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
	}
}
