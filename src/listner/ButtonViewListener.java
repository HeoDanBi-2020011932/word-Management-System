package listner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.WordViewer;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		WordViewer viewer = frame.getWordviewer(); //JFrame�� ��ӹ��� �� �´�
		frame.setupPanel(viewer); 
	}

}
