import java.awt.*;
import java.awt.event.*;
import java.util.*;
class draw extends Frame
{
draw()
{
setTitle("Drawing different Shapes");
setSize(500,500);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0); 
} 
} );
}
public static void main(String[] args)
{
new draw();
}

 
public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawLine(100,80,350,80);
g.drawRect(140,140,50,100);
g.fillRect(200,140,70,70);
g.drawOval(140,340,100,100);
g.fillOval(300,340,100,100);
g.setColor(Color.red);
g.fillArc(180,500,100,150,10,+60);
g.setColor(Color.green);
int x[]={300,500,380,550,670};
int y[]={550,580,600,680,490};
g.drawPolygon(x,y,5);
}
}
