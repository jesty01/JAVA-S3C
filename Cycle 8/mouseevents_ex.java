import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
 class mouseevents_ex extends Frame implements MouseListener{  
	static JLabel l;  
	mouseevents_ex()
	{  
		 
	}  
	public void mouseClicked(MouseEvent e) {  
		l.setText("Mouse Clicked");  
	}  
	public void mouseEntered(MouseEvent e) {  
		l.setText("Mouse Entered");  
	}  
	public void mouseExited(MouseEvent e) {  
		l.setText("Mouse Exited");  
	}  
	public void mousePressed(MouseEvent e) {  
		l.setText("Mouse Pressed");  
	}  
	public void mouseReleased(MouseEvent e) {  
		l.setText("Mouse Released");  
	}  
	public static void main(String[] args) {  
		JFrame f = new JFrame("Mouse Events ");
		f.setSize(400,400);  
		mouseevents_ex m = new mouseevents_ex();
		f.addMouseListener(m);
		JPanel p = new JPanel();
		l = new JLabel();
		p.add(l);
		f.add(p);
		f.setVisible(true); 
	}  
}
