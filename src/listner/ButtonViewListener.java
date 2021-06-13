package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;

import Manager.WordManager;
import gui.WindowFrame;
import gui.WordViewer;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		WordViewer wordviewer =frame.getWordviewer();
		WordManager wordManager = getObject("wordManager.ser");
		wordviewer.setWordManager(wordManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(wordviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static WordManager getObject(String filename) {
		WordManager wordManager =null;
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(wordManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return wordManager;
	}
}
