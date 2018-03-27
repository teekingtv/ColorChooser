import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tee extends JFrame{

	private JButton b;
	private Color c = (Color.WHITE);
	private JPanel p;
	
	public tee(){
		super("Color Chooser Program");
		p = new JPanel();
		p.setBackground(c);
		
		b = new JButton("Click to choose your color");
		
		b.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						c = JColorChooser.showDialog(null, "Pick your color", c);
						if(c==null)
							c=(Color.WHITE);
						
						p.setBackground(c);
					}	
				}
			);
		add(p, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(450,200);
		setVisible(true);
		
	}
}
