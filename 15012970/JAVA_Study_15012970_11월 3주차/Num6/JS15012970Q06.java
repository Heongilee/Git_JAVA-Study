package Num6;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


class MyFrame extends JFrame{
	private JLabel la = new JLabel("C");
	public MyFrame() {
		setTitle("클릭 연습 용 프로그램");
		this.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la.setSize(10, 10);
		la.setLocation(100, 100);
		la.addMouseListener(new MyMouL());
		
		this.add(la);	
		
		setSize(500, 500);
		setVisible(true);
		la.requestFocus();
	}
	private class MyMouL extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			int x = (int)(Math.random() * 500);
			int y = (int)(Math.random() * 500);
			la.setLocation(x, y);
		}
	}
}
public class JS15012970Q06 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
