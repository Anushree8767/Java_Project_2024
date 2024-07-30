class One {
    public void print_anu()
    {
        System.out.println("Anu");
    }
}
 
class Two extends One {
    public void print_riya() {
	System.out.println("Riya"); 
	}
}

public class Main {
    
    public static void main(String[] args)
    {
        Two g = new Two();
        g.print_anu();
        g.print_riya();
      
    }
}