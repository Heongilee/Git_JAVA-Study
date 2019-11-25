package Num2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JTextField tf = new JTextField(10);
	private JComboBox cb = new JComboBox();
	public MyFrame() {
		 super("2¹ø ¹®Á¦");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());
		 
		 c.add(tf);
		 c.add(cb);
		 
		 tf.addActionListener(new MyActL());
		 
		 setSize(300, 300);
		 setVisible(true);
	}
	private class MyActL implements ActionListener{
		 @Override
		public void actionPerformed(ActionEvent e) {
			 String word = tf.getText();
			 cb.addItem(word);
			 tf.setText("");
		}
	 }
}
public class JC15012970 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
