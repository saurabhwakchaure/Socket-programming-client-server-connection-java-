//client server connection
/*import java.net.*;
import java.io.*;
public class Client
{
	public static void main(String args[])throws IOException
	{
		ServerSocket ss=new ServerSocket(4999);
		Socket s=ss.accept();
		
		System.out.println("client connected");	
	}
}*/
//sending data from client to server
/*import java.net.*;
import java.io.*;
public class Server
{
	public static void main(String args[])throws IOException
	{
		ServerSocket ss=new ServerSocket(4999);
		Socket s=ss.accept();
		
		System.out.println("client connected");	
		InputStreamReader isr=new InputStreamReader(s.getInputStream());
		BufferedReader bfr=new BufferedReader(isr);
		String str=bfr.readLine();
		System.out.println("Client Message is:"+str);
	}
}*/

import java.net.*;
import java.io.*;
public class Server
{
	public static void main(String args[])throws IOException
	{
		ServerSocket ss=new ServerSocket(4999);
		Socket s=ss.accept();
		
		System.out.println("client connected");	
		InputStreamReader isr=new InputStreamReader(s.getInputStream());
		BufferedReader bfr=new BufferedReader(isr);
		String str=bfr.readLine();
		System.out.println("Client Message is:"+str);
		
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		pw.println("Hello i am server");
		pw.flush();
	}
}
