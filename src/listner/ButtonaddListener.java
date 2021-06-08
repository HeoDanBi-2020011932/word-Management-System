package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WordAdder;
import gui.WordViewer;

public class ButtonaddListener implements ActionListener {
	WindowFrame frame;

	public ButtonaddListener(WindowFrame frame) {
		this.frame=frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		WordAdder adder = frame.getWordadder(); //JFrame을 상속받은 뷰어가 온다
		frame.setupPanel(adder); 
	}

}
