package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JTextField;

import Manager.WordManager;
import exception.WordFormatException;
import word.English;
import word.WordInput;
import word.Wordkind;

public class WordAdderListener implements ActionListener {
	JTextField fieldword;
	JTextField fieldmean;
	JTextField fieldclass;
	JTextField fieldpronun;
	WordManager wordManager;
	
	public WordAdderListener(JTextField fieldword,JTextField fieldmean,JTextField fieldclass,JTextField fieldpronun,WordManager wordManager) {
		this.fieldword=fieldword;
		this.fieldmean=fieldmean;
		this.fieldclass=fieldclass;
		this.fieldpronun=fieldpronun;
		this.wordManager=wordManager;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldpronun.getText());
		
		WordInput word = new English(Wordkind.English);
		try {
			word.setMemorzied_word(fieldword.getText());
			word.setWordclass(fieldclass.getText());
			word.setMean(fieldmean.getText());
			wordManager.Addword(word);
			putObject(wordManager,"wordManager.ser");
			word.printInfo();
			} catch (WordFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(WordManager wordManager,String filename) {
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			wordManager =(WordManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

}
