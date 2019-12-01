package Num8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JRadioButton rbtn1 = new JRadioButton("L");
	private JRadioButton rbtn2 = new JRadioButton("R");
	private ButtonGroup g = new ButtonGroup();
	private ImageIcon[] img = new ImageIcon[2];
	private JLabel img_label = new JLabel();
	public MyFrame() {
		super("8¹ø ¹®Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		img[0] = new ImageIcon("images/Django.png");
		img[1] = new ImageIcon("images/Python-Logo.png");
		
		g.add(rbtn1);
		g.add(rbtn2);
		
		c.add(rbtn1);
		c.add(rbtn2);
		c.add(img_label, BorderLayout.CENTER);
		rbtn1.addItemListener(new L());
		rbtn2.addItemListener(new L());
		
		setSize(500, 500);
		setVisible(true);
	}
	private class L implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(rbtn1.isSelected())
				img_label.setIcon(img[0]);
			else
				img_label.setIcon(img[1]);
		}
	}
}
public class JC15012970 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
