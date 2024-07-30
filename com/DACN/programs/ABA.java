//code to illustrate paint 
//method gets called again 
//and again 

import java.applet.*;// used 

import java.awt.*;//Graphic 

import java.util.Date;
public class ABA extends Applet 
{ 
	public void paint(Graphics g) 
	{ 
		Date dt = new Date(); 
		super.showStatus("Today is" + dt); 

	} 
}
