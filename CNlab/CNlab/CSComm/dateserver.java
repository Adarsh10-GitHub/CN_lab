import java.net.*;
import java.io.*;
import java.util.*;

class dateserver
{
	public static void main(String args[])
	{
		ServerSocket ss;
		Socket s;
		PrintStream ps;
		DataInputStream dis;
		String inet;
		try 
		{
			ss = new ServerSocket(8020);
			while (true)
			{
			s = ss.accept();
			ps = new PrintStream(s.getOutputStream());
			Date d = new Date();
			ps.println(d);
			dis = new DataInputStream(s.getInputStream());
			inet = dis.readLine();
			System.out.println("THE CLIENT SYSTEM ADDRESS IS:" + inet);
			ps.close();
			}
		} 
		catch (IOException e) 
		{
			System.out.println("The Exception is :" + e);
		}
	}
}
