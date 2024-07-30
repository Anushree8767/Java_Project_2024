class Employee  
{    
	int salary=387764;    
}    
public class Executive extends Employee  
{   
	int bonus=30000;  
	public static void main(String args[])  
	{  
		Executive obj=new Executive();   
		System.out.println("Total salary credited: "+obj.salary);    
		System.out.println("Bonus of six months: "+obj.bonus);   
	}    
}   