import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
	Label one;
	TextField player;
	Label two;
	TextField position;
	Button sub;
	MyFrame(String str)
	{
		super(str);
		one=new Label("Player");
		two=new Label("Position");
		player=new TextField(5);
		position=new TextField(5);
		sub=new Button("submit");
		this.setLayout(new FlowLayout());
		this.add(one);
		this.add(player);
		this.add(two);
		this.add(position);
		this.add(sub);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawOval(50,75,30,30);
		g.drawOval(100,75,30,30);
		g.drawOval(150,75,30,30);
		g.drawOval(200,75,30,30);
		g.drawOval(250,75,30,30);
		g.drawOval(300,75,30,30);
		g.drawOval(50,125,30,30);
		g.drawOval(100,125,30,30);
		g.drawOval(150,125,30,30);
		g.drawOval(200,125,30,30);
		g.drawOval(250,125,30,30);
		g.drawOval(300,125,30,30);
		g.drawOval(50,175,30,30);
		g.drawOval(100,175,30,30);
		g.drawOval(150,175,30,30);
		g.drawOval(200,175,30,30);
		g.drawOval(250,175,30,30);
		g.drawOval(300,175,30,30);
		g.drawOval(50,225,30,30);
		g.drawOval(100,225,30,30);
		g.drawOval(150,225,30,30);
		g.drawOval(200,225,30,30);
		g.drawOval(250,225,30,30);
		g.drawOval(300,225,30,30);
		g.drawOval(50,275,30,30);
		g.drawOval(100,275,30,30);
		g.drawOval(150,275,30,30);
		g.drawOval(200,275,30,30);
		g.drawOval(250,275,30,30);
		g.drawOval(300,275,30,30);
		//g.drawString("hello");
	}
}


class Main
{
	public static void main(String args[])throws Exception
	{
		MyFrame m_f=new MyFrame("Game of colors");
		m_f.setSize(400,400);
		m_f.setVisible(true);
	}
}