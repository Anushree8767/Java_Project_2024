import java.applet.*;
import java.awt.*;
public class Applet7Demo extends Applet
{
	public void paint(Graphics g)
	{
		Font f = new Font("Cooper Black",Font.PLAIN,15);
		g.drawString("Welcome to Jungle...",20,30);
		g.setFont(f);
		g.drawString("Welcome to Java Programming...",20,60);
	}
}
/*<applet code="Applet7Demo" width=400 height=400></applet>*/