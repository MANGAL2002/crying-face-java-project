import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Crying extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
int x=1;

public void init(){

b2=new Button("top");

b2.setBounds(1000,100,80,60);

add(b2);
b2.addActionListener(this);
b1=new Button("down");

b1.setBounds(500,600,80,70);

add(b1);
b1.addActionListener(this);


b3=new Button("Left");

b3.setBounds(1000,100,80,60);

add(b3);
b3.addActionListener(this);


b4=new Button("Right");

b4.setBounds(1000,100,80,60);

add(b4);
b4.addActionListener(this);

}
public void paint(Graphics g)
{

   
if(x==0)
{
    super.paint(g);

   g.setColor(Color.yellow);
		g.fillOval(0,0,300,300);
		
		//eye
		g.setColor(Color.white);
		g.fillOval(180,90,60,60);
		g.fillOval(60,90,60,60);
		
		g.setColor(Color.black);
		g.drawLine(150,170,150,120);
		g.drawArc(60,200,180,90,0,180);	
		
		g.setColor(Color.blue); 
		g.fillOval(200, 150, 25, 25);
		g.fillOval(80, 150, 25, 25);
}
if(x==1)
{
    super.paint(g);

   g.setColor(Color.yellow);
		g.fillOval(0,0,300,300);
		
		//eye
		g.setColor(Color.white);
		g.fillOval(180,90,60,60);
		g.fillOval(60,90,60,60);
		
		g.setColor(Color.black);
		g.drawLine(150,170,150,120);
		g.drawArc(60,200,180,90,0,180);	
		
		g.setColor(Color.blue); 
		g.fillOval(200, 150, 25, 25);
		g.fillOval(80, 150, 25, 25);
}
if(x==2)
{
    super.paint(g);

   g.setColor(Color.yellow);
		g.fillOval(0,0,300,300);
		
		//eye
		g.setColor(Color.white);
		g.fillOval(180,90,60,60);
		g.fillOval(60,90,60,60);
		
		g.setColor(Color.black);
		g.drawLine(150,170,150,120);
		g.drawArc(60,200,180,90,0,180);	
		
		g.setColor(Color.blue); 
		g.fillOval(200, 150, 25, 25);
		g.fillOval(80, 150, 25, 25);
}
if(x==3)
{
    super.paint(g);

   g.setColor(Color.yellow);
		g.fillOval(0,0,300,300);
		
		//eye
		g.setColor(Color.white);
		g.fillOval(180,90,60,60);
		g.fillOval(60,90,60,60);
		
		g.setColor(Color.black);
		g.drawLine(150,170,150,120);
		g.drawArc(60,200,180,90,0,180);	
		
		g.setColor(Color.blue); 
		g.fillOval(200, 150, 25, 25);
		g.fillOval(80, 150, 25, 25);
}



}



    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
      x=0;
        repaint();
        }
        if(e.getSource()==b2){
        x=1;

        repaint();
        }
if(e.getSource()==b3){
        x=2;
        repaint();
}
if(e.getSource()==b4){
        x=3;
        repaint();
        
        }

}
}