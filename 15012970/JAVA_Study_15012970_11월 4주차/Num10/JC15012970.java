package Num10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	private JLabel[] Labels = new JLabel[10];
	private int current_order = 0;
	public MyFrame() {
		super("¹®Á¦ 10¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<10;i++)
		{
			Labels[i] = new JLabel(Integer.toString(i));
			Labels[i].setSize(10, 10);
			int x = (int)(Math.random() * 440);
			int y = (int)(Math.random() * 440);
			Labels[i].setLocation(x, y);
			Labels[i].setForeground(Color.magenta);
			
			Labels[i].addMouseListener(new MyMouL());
			c.add(Labels[i]);
		}
		
		setSize(500, 500);
		setVisible(true);
	}
	private class MyMouL extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			JLabel event = (JLabel)e.getSource();
			
			if(event.getText().equals(Integer.toString(current_order)) == true)
			{
				event.setVisible(false);
				current_order++;
				if(current_order / 10 >= 1)
				{
					for(int i=0;i<10;i++)
					{
						Labels[i].setVisible(true);
					}
				}
				current_order %= 10;
			}
		}
	}
}
public class JC15012970 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
