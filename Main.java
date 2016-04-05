import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
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
		sub.addActionListener(this);
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
		g.drawOval(50,75,30,30);	//1
		g.drawOval(100,75,30,30);	//2
		g.drawOval(150,75,30,30);	//3
		g.drawOval(200,75,30,30);	//4
		g.drawOval(250,75,30,30);	//5
		g.drawOval(300,75,30,30);	//6
		g.drawOval(50,125,30,30);	//7
		g.drawOval(100,125,30,30);	//8
		g.drawOval(150,125,30,30);	//9
		g.drawOval(200,125,30,30);	//10
		g.drawOval(250,125,30,30);	//11
		g.drawOval(300,125,30,30);	//12
		g.drawOval(50,175,30,30);	//13
		g.drawOval(100,175,30,30);	//14
		g.drawOval(150,175,30,30);	//15
		g.drawOval(200,175,30,30);	//16
		g.drawOval(250,175,30,30);	//17
		g.drawOval(300,175,30,30);	//18
		g.drawOval(50,225,30,30);	//19
		g.drawOval(100,225,30,30);	//20
		g.drawOval(150,225,30,30);	//21
		g.drawOval(200,225,30,30);	//22
		g.drawOval(250,225,30,30);	//23
		g.drawOval(300,225,30,30);	//24
		g.drawOval(50,275,30,30);	//25
		g.drawOval(100,275,30,30);	//26
		g.drawOval(150,275,30,30);	//27
		g.drawOval(200,275,30,30);	//28
		g.drawOval(250,275,30,30);	//29
		g.drawOval(300,275,30,30);	//30
		//g.drawString("hello");
	}
	public void actionPerformed(ActionEvent e)
	{
		Graphics g=this.getGraphics();
		if(e.getSource()==sub)
		{
			String ex= player.getText();
			g.drawString(ex,350,325);
			if(ex.equalsIgnoreCase("one"))
			{
				String posi=position.getText();
				g.setColor(Color.red);
				if(posi.equals("1"))
				{
					g.fillOval(50,75,30,30);
				}
				else if(posi.equals("2"))
				{
					g.fillOval(100,75,30,30);
				}
				else if(posi.equals("3"))
				{
					g.fillOval(150,75,30,30);
				}
				else if(posi.equals("4"))
				{
					g.fillOval(200,75,30,30);
				}
				else if(posi.equals("5"))
				{
					g.fillOval(250,75,30,30);
				}
				else if(posi.equals("6"))
				{
					g.fillOval(300,75,30,30);
				}
				else if(posi.equals("7"))
				{
					g.fillOval(50,125,30,30);
				}
				else if(posi.equals("8"))
				{
					g.fillOval(100,125,30,30);
				}
				else if(posi.equals("9"))
				{
					g.fillOval(150,125,30,30);
				}
				else if(posi.equals("10"))
				{
					g.fillOval(200,125,30,30);
				}
				else if(posi.equals("11"))
				{
					g.fillOval(250,125,30,30);
				}
				else if(posi.equals("12"))
				{
					g.fillOval(300,125,30,30);
				}
				else if(posi.equals("13"))
				{
					g.fillOval(50,175,30,30);
				}
				else if(posi.equals("14"))
				{
					g.fillOval(100,175,30,30);
				}
				else if(posi.equals("15"))
				{
					g.fillOval(150,175,30,30);
				}
				else if(posi.equals("16"))
				{
					g.fillOval(200,175,30,30);
				}
				else if(posi.equals("17"))
				{
					g.fillOval(250,175,30,30);
				}
				else if(posi.equals("18"))
				{
					g.fillOval(300,175,30,30);
				}
				else if(posi.equals("19"))
				{
					g.fillOval(50,225,30,30);
				}
				else if(posi.equals("20"))
				{
					g.fillOval(100,225,30,30);
				}
				else if(posi.equals("21"))
				{
					g.fillOval(150,225,30,30);
				}
				else if(posi.equals("22"))
				{
					g.fillOval(200,225,30,30);
				}
				else if(posi.equals("23"))
				{
					g.fillOval(250,225,30,30);
				}
				else if(posi.equals("24"))
				{
					g.fillOval(300,225,30,30);
				}
				else if(posi.equals("25"))
				{
					g.fillOval(50,275,30,30);
				}
				else if(posi.equals("26"))
				{
					g.fillOval(100,275,30,30);
				}
				else if(posi.equals("27"))
				{
					g.fillOval(150,275,30,30);
				}
				else if(posi.equals("28"))
				{
					g.fillOval(200,275,30,30);
				}
				else if(posi.equals("29"))
				{
					g.fillOval(250,275,30,30);
				}
				else if(posi.equals("30"))
				{
					g.fillOval(300,275,30,30);
				}
			}
			else if(ex.equalsIgnoreCase("two"))
			{
				String posi=position.getText();
				g.setColor(Color.blue);
				if(posi.equals("1"))
				{
					g.fillOval(50,75,30,30);
				}
				else if(posi.equals("2"))
				{
					g.fillOval(100,75,30,30);
				}
				else if(posi.equals("3"))
				{
					g.fillOval(150,75,30,30);
				}
				else if(posi.equals("4"))
				{
					g.fillOval(200,75,30,30);
				}
				else if(posi.equals("5"))
				{
					g.fillOval(250,75,30,30);
				}
				else if(posi.equals("6"))
				{
					g.fillOval(300,75,30,30);
				}
				else if(posi.equals("7"))
				{
					g.fillOval(50,125,30,30);
				}
				else if(posi.equals("8"))
				{
					g.fillOval(100,125,30,30);
				}
				else if(posi.equals("9"))
				{
					g.fillOval(150,125,30,30);
				}
				else if(posi.equals("10"))
				{
					g.fillOval(200,125,30,30);
				}
				else if(posi.equals("11"))
				{
					g.fillOval(250,125,30,30);
				}
				else if(posi.equals("12"))
				{
					g.fillOval(300,125,30,30);
				}
				else if(posi.equals("13"))
				{
					g.fillOval(50,175,30,30);
				}
				else if(posi.equals("14"))
				{
					g.fillOval(100,175,30,30);
				}
				else if(posi.equals("15"))
				{
					g.fillOval(150,175,30,30);
				}
				else if(posi.equals("16"))
				{
					g.fillOval(200,175,30,30);
				}
				else if(posi.equals("17"))
				{
					g.fillOval(250,175,30,30);
				}
				else if(posi.equals("18"))
				{
					g.fillOval(300,175,30,30);
				}
				else if(posi.equals("19"))
				{
					g.fillOval(50,225,30,30);
				}
				else if(posi.equals("20"))
				{
					g.fillOval(100,225,30,30);
				}
				else if(posi.equals("21"))
				{
					g.fillOval(150,225,30,30);
				}
				else if(posi.equals("22"))
				{
					g.fillOval(200,225,30,30);
				}
				else if(posi.equals("23"))
				{
					g.fillOval(250,225,30,30);
				}
				else if(posi.equals("24"))
				{
					g.fillOval(300,225,30,30);
				}
				else if(posi.equals("25"))
				{
					g.fillOval(50,275,30,30);
				}
				else if(posi.equals("26"))
				{
					g.fillOval(100,275,30,30);
				}
				else if(posi.equals("27"))
				{
					g.fillOval(150,275,30,30);
				}
				else if(posi.equals("28"))
				{
					g.fillOval(200,275,30,30);
				}
				else if(posi.equals("29"))
				{
					g.fillOval(250,275,30,30);
				}
				else if(posi.equals("30"))
				{
					g.fillOval(300,275,30,30);
				}
			}
		}
		
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