package Num4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	private String text = "Love Java";
	private JLabel la = new JLabel(text.toString());
	public MyFrame() {
		setTitle("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(la);
		addKeyListener(new MyKeyL());
		
		setSize(400, 200);
		setVisible(true);
		la.requestFocus();
	}
	private class MyKeyL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_LEFT:
				//System.out.println("case 접근");
				la.setText(text);
				text = text.substring(1) + text.substring(0, 1);
				break;
			default:
				break;
			}
		}
	}
}
public class JS15012970Q04 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
