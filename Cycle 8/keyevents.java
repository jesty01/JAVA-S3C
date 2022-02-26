import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
 class keyevents extends KeyAdapter{  
	static JLabel l; 
	public void keyPressed(KeyEvent e) {  
		l.setText("Key is pressed");  
	}  
	public void keyReleased(KeyEvent e) {  
		l.setText("Released a key");  
	}  
	public void keyTyped(KeyEvent e) {  
		l.setText("Typed a key");  
	}  
	public static void main(String[] args) {  
		JFrame f = new JFrame("Key Events Example");
		f.setSize(300,300);  
		keyevents k = new keyevents();
		f.addKeyListener(k);
		JPanel p = new JPanel();
		l = new JLabel();
		p.add(l);
		f.add(p);
		f.setVisible(true); 
	}  
}  
