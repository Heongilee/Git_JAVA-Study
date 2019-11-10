package Num8;
import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame{
	public MyFrame() {
		super("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(new North(), BorderLayout.NORTH);
		cp.add(new Center(), BorderLayout.CENTER);
		cp.add(new South(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
}

class North extends JPanel{
	public North() {
		this.setBackground(Color.gray);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}
class South extends JPanel{
	public South() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 0));
		this.setBackground(Color.yellow);
		add(new JButton("Word Input"));
		add(new JTextField(""));
	}
}
class Center extends JPanel{
	private int x, y;
	
	public int getX() {
		x = (int)(Math.random() * 300);
		return x;
	}
	public int getY() {
		y = (int)(Math.random() * 300);
		return y;
	}
	public Center() {
		this.setLayout(null);
		this.setBackground(Color.white);
		for(int i=0;i<10;i++)
		{
			JLabel l = new JLabel("*");
			l.setForeground(Color.red);
			l.setSize(10, 10);
			l.setLocation(getX(), getY());
			add(l);
		}
	}
}
public class JS15012970Q08 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
