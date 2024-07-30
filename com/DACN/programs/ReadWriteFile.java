import java.io.*;
class ReadWriteFile
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fout = new FileWriter("ABC.dat");
		System.out.println("Write One Line: ");
		fout.write(br.readLine());
		fout.flush();
	}
}