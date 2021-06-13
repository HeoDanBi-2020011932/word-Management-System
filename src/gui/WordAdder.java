package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Manager.WordManager;
import listner.WordAdderCancelListener;
import listner.WordAdderListener;

public class WordAdder extends JPanel {
	WindowFrame frame;
		WordManager wordManager;
 
	public WordAdder(WindowFrame frame,WordManager wordManager) {
		this.frame=frame;
		this.wordManager=wordManager;
		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new WordAdderListener(fieldword,fieldmean,fieldclass,fieldpronun,wordManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new WordAdderCancelListener(frame)); //단어 정보를 모두 wordAdderListener가 들고 있어야함


		panel.add(labelpronun);
		panel.add(fieldpronun);
		

		panel.add(saveButton);
		panel.add(cancelButton);

		
		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
