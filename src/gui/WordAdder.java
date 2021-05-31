package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class WordAdder extends JFrame {
	public WordAdder() {
		JPanel panel= new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelword= new JLabel("Word: ",JLabel.TRAILING);
		JTextField fieldword = new JTextField(10);
		labelword.setLabelFor(fieldword);
		panel.add(labelword);
		panel.add(fieldword);
		
		JLabel labelmean= new JLabel("Mean: ",JLabel.TRAILING);
		JTextField fieldmean = new JTextField(10);
		labelword.setLabelFor(fieldmean);
		panel.add(labelmean);
		panel.add(fieldmean);
		
		JLabel labelclass= new JLabel("Class: ",JLabel.TRAILING);
		JTextField fieldclass = new JTextField(10);
		labelclass.setLabelFor(fieldclass);
		panel.add(labelclass);
		panel.add(fieldclass);
		
		JLabel labelpronun= new JLabel("Pronunciation: ",JLabel.TRAILING);
		JTextField fieldpronun = new JTextField(10);
		labelpronun.setLabelFor(fieldpronun);
		panel.add(labelpronun);
		panel.add(fieldpronun);
		
		SpringUtilities.makeCompactGrid(panel,4,2,6,6,6,6);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
}
