package Num8;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyFrame extends JFrame{
	private Vector <ImageIcon> images = new Vector<ImageIcon>();
	private MyRadioPanel P_img = new MyRadioPanel();
	private JLabel L_img = new JLabel();
	public MyFrame() {
		super("15012970 / ¿Ã«Â±‚");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		loadImages("images");
		c.add(P_img, BorderLayout.NORTH);
		c.add(L_img, BorderLayout.CENTER);
		L_img.setIcon(images.get(0));
		
		L_img.addMouseListener(new MyMouL(0));
		
		
		setSize(500, 500);
		setVisible(true);
	}
	public class MyMouL extends MouseAdapter{
		private int idx;
		public MyMouL(int start_idx) {
			idx = start_idx;
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			if(P_img.isLeft())
			{
				idx++;
				idx %= images.size();
				L_img.setIcon(images.get(idx));
			}
			else
			{
				idx--;
				if(idx == -1) idx = images.size() - 1;
				
				L_img.setIcon(images.get(idx));
			}
		}
	}
	public void loadImages(String path)
	{
		File file = new File(path);
		File[] files = file.listFiles();
		for(File f:files)
		{
			if(f.isFile()){
				ImageIcon img = new ImageIcon(f.getPath());
				images.add(img);
			}
		}
	}
	private class MyRadioPanel extends JPanel{
		private JRadioButton Left = new JRadioButton();
		private JRadioButton Right = new JRadioButton();
		private ButtonGroup g = new ButtonGroup();
		public MyRadioPanel() {
			Left.setText("left");
			Right.setText("right");
			g.add(Left);
			g.add(Right);
			
			this.add(Left);
			this.add(Right);
			
			Left.setSelected(true);
		}
		public boolean isLeft() {
			return Left.isSelected();
		}
		public boolean isRight() {
			return Right.isSelected();
		}
	}
}
public class JC15012970 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
