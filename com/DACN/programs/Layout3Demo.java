
import java.awt.*;
class Layout3Demo extends Frame
{
	Label lbl1,lbl2,lbl3,lbl4;
	TextField txt1,txt2;
	Button btn1,btn2,btn3;
	Layout3Demo()
	{
		super("Null Layout Demo");
		setSize(300,300);
		setLayout(null);
		Font f = new Font("Times New Roman",Font.BOLD,20);
		lbl1 = new Label("Log In Form");
		lbl1.setFont(f);
		lbl1.setBounds(100,30,150,50);
		lbl2 = new Label("User Name");
		lbl2.setBounds(20,90,80,20);
		lbl3 = new Label("Password");
		lbl3.setBounds(20,120,80,20);
		lbl4 = new Label("Message");
		lbl4.setBounds(20,190,250,20);
		lbl4.setBackground(Color.pink);
		txt1 =new TextField(20);
		txt1.setBounds(100,90,130,20);
		txt2 =new TextField(20);
		txt2.setBounds(100,120,130,20);
		btn1 = new Button("Login");
		btn1.setBounds(160,150,50,20);
		btn2 = new Button("Reset");
		btn2.setBounds(90,150,50,20);
		btn3 = new Button("Cancel");
		btn3.setBounds(20,150,50,20);
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(txt1);
		add(txt2);
		add(btn1);
		add(btn2);
		add(btn3);

		setBackground(Color.cyan);
		setVisible(true);
	}
	public static void main(String[] s)
	{
		Layout3Demo obj = new Layout3Demo();
	}
}
