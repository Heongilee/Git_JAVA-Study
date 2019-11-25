package Num6;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JSlider sd = new JSlider(0, 100);
	private JTextArea text = new JTextArea("");
	public MyFrame() {
		super("6¹ø ¹®Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(text, BorderLayout.CENTER);
		text.addKeyListener(new MyKeyL());
		
		c.add(sd, BorderLayout.SOUTH);
		sd.addChangeListener(new MySliderL());
		sd.setValue(0);
		
		setSize(300, 300);
		setVisible(true);
	}
	private class MyKeyL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			int keyCode = e.getKeyCode();
			int size = text.getText().length();
			if(keyCode == KeyEvent.VK_BACK_SPACE)
			{
				if(sd.getValue() != 0) sd.setValue(sd.getValue() - 1);
			}
			else 
			{
				if(size > 100)
				{
					String tmp = text.getText();
					text.setText(tmp.substring(0, size-1));
				}
				else
				{
					sd.setValue(sd.getValue() + 1);
					
				}
			}
		}
	}
	private class MySliderL implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
		}
	}
}
public class JC15012970 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
