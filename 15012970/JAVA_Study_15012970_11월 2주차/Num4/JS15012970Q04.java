package Num4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame{
	private Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, 
			Color.blue, Color.magenta, Color.DARK_GRAY, Color.pink, Color.gray};
	public MyFrame() {
		super("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(1, 10));
		
		Integer idx = 0;
		for(Color c:color)
		{
			JLabel l = new JLabel(idx.toString());
			idx++;
			l.setOpaque(true);
			l.setBackground(c);
			cp.add(l);
		}
		
		setSize(300, 200);
		setVisible(true);
	}
}
public class JS15012970Q04 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
