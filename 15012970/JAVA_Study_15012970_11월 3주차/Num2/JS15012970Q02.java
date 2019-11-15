package Num2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	private Container c;
	public MyFrame() {
		setTitle("µå·¡±ë µ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.green);
		
		c.addMouseMotionListener(new MML());
		c.addMouseListener(new ML());
		
		setSize(500, 300);
		setVisible(true);
	}
	private class MML extends MouseMotionAdapter{
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			c.setBackground(Color.yellow);
		}
		
	}
	private class ML extends MouseAdapter{
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			c.setBackground(Color.green);
		}
	}
}

public class JS15012970Q02 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
