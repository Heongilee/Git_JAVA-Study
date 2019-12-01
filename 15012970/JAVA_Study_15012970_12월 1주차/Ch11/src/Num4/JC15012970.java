package Num4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JTextField balance = new JTextField(10);
	private String[] Money_str = {"오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
	private int[] money = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private JLabel la = new JLabel();
	private JTextField[] tf = new JTextField[Money_str.length];
	private JButton btn = new JButton("계산");
	private JCheckBox[] cbx = new JCheckBox[money.length - 1];
	public MyFrame() {
		super("4번 문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.pink);
		
		la = new JLabel("금액");
		la.setSize(40, 20);
		la.setLocation(30, 20);
		c.add(la);
		
		balance.setSize(100, 20);
		balance.setLocation(70, 20);
		c.add(balance);
		
		btn.setSize(70, 20);
		btn.setLocation(180, 20);
		btn.addActionListener(new MyActL());
		c.add(btn);
		
		for(int i=0;i<Money_str.length;i++)
		{
			la = new JLabel(Money_str[i]);
			la.setSize(50, 20);
			la.setLocation(50, 50+(i * 20));
			c.add(la);
			
			tf[i] = new JTextField(30);
			tf[i].setSize(70, 20);
			tf[i].setLocation(120, 50+(i * 20));
			c.add(tf[i]);
		}
		for(int i=0;i<cbx.length;i++)
		{
			cbx[i] = new JCheckBox();
			cbx[i].setBackground(Color.pink);
			cbx[i].setSize(20, 20);
			cbx[i].setLocation(210, 50 + (i * 20));
			c.add(cbx[i]);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	private class MyActL implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String input = balance.getText();
			
			int budget = Integer.parseInt(input);
			int m;
			
			//budget /= money[i];
			//budget %= money[i];
			for (int i = 0; i < money.length - 1; i++) {
				if(cbx[i].isSelected())
				{
					tf[i].setText(Integer.toString(budget / money[i]));
					budget %= money[i];
				}
				else
				{
					tf[i].setText("0");
				}
			}
			tf[7].setText(Integer.toString(budget));
		}
	}
}
public class JC15012970 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
