package Num2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout(5, 7));
		cp.add(new JButton("North"), BorderLayout.NORTH);
		cp.add(new JButton("West"), BorderLayout.WEST);
		cp.add(new JButton("Center"), BorderLayout.CENTER);
		cp.add(new JButton("East"), BorderLayout.EAST);
		cp.add(new JButton("South"), BorderLayout.SOUTH);

		setSize(300, 200);
		setVisible(true);
	}
}
public class JS15012970Q02 extends JFrame{
	public static void main(String[] args) {
		new MyFrame();
	}
}
