import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

@SuppressWarnings("unused")
public class application_main{
	public static void run() {
		long start = System.currentTimeMillis();
		 long end = 0;
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 double width = screenSize.getWidth();
		 double height = screenSize.getHeight();
		 JFrame f= new JFrame();
		 f.setVisible(true);
		 f.setSize((int)width / 2, (int) height / 2);
		 f.setLocation((int)width / 4, (int)height / 4);
		 f.setTitle("D&D Random Effect Generator");
		 Container c = f.getContentPane();
		 c.setBackground(Color.white);
		 f.setResizable(true);
		 double fwidth = f.getWidth();
		 double fheight = f.getHeight();
		 JButton b = new JButton("Generate");
		 JButton closeb = new JButton("Close");
		 b.setVisible(true);
		 JLabel l = new JLabel("Help me", JLabel.CENTER);
		
	   
		 JPanel p = new JPanel();
		 p.add(b);
		 p.add(l);
		 p.add(closeb);
		 b.setSize((int)fwidth / 6, (int) fheight / 8);
		 b.setLocation((int) fwidth / 2, (int) fheight / 3);
		 f.add(p);
		 f.setContentPane(p);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 public static void main(String args[] ){
	 run();
	 
 }
}