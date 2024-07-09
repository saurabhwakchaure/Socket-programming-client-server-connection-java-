//sending data from client to server
/*import java.net.*;
import java.io.*;
public class Client
{
	public static void main(String args[])throws IOException
	{
		Socket s=new Socket("localhost",4999);
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("Hello");
		pw.flush();
	}
}*/

import java.net.*;
import java.io.*;
public class Client
{
	public static void main(String args[])throws IOException
	{
		Socket s=new Socket("localhost",4999);
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("Hello i am client");
		pw.flush();
		
		InputStreamReader isr=new InputStreamReader(s.getInputStream());
		BufferedReader bfr=new BufferedReader(isr);
		String str=bfr.readLine();
		System.out.println("server Message is:"+str);
	}
}
