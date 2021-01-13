import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;
import java.awt.*;
@SuppressWarnings("unused")
public class application_main{
 public static void main(String args[] ){
	 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 double width = screenSize.getWidth();
	 double height = screenSize.getHeight();
	 JFrame frame = new JFrame("D&D Random effect Generator");
	 frame.setSize((int)width / 4, (int) height / 4);
	 frame.setLocation((int)width / 4, (int)height / 4);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 JPanel panel = new JPanel();
	 frame.add(panel);
	 panel.setLayout(null);
	 JLabel label1 = new JLabel("Hit Generate to generate");
	 label1.setBounds(150, 0, 250, 20);
	 panel.add(label1);
	 JButton button = new JButton("Generate");
	 button.setBounds(150, 30, 150, 30);
	 JLabel label2 = new JLabel(generator.run());
	 label2.setBounds(25, 0, 3500, 250);
	 panel.add(label2);
	 button.addActionListener(new ActionListener() {
		 @Override
         public void actionPerformed(ActionEvent e) {
		 label2.setText(generator.run());
		 }
	 });
	panel.add(button);
	 
	 frame.setVisible(true);
	 
 }
}