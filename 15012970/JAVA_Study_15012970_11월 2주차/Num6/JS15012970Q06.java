package Num6;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	private int x, y;
	public int getX() {
		x = (int)(Math.random() * 200) + 50;
		return x;
	}
	public int getY() {
		y = (int)(Math.random() * 200) + 50;
		return y;
	}
	public MyFrame() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(null);
		
		for(int i=0;i<20;i++)
		{
			JLabel la = new JLabel();
			la.setBackground(Color.blue);
			la.setSize(10, 10);
			la.setLocation(getX(), getY());
			la.setOpaque(true);
			
			cp.add(la);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
}
public class JS15012970Q06 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
