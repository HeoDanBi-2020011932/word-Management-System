package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WordAdder;
import gui.WordViewer;

public class WordAdderCancelListener implements ActionListener {
	WindowFrame frame;

	public WordAdderCancelListener(WindowFrame frame) {
		this.frame=frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
