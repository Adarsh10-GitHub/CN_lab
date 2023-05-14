import java.net.*;
import java.io.*;
class dateclient 
{
	public static void main(String[] args) 
	{
		Socket soc;
		DataInputStream dis;
		String sdate;
		PrintStream ps;
		try
		{
			InetAddress ia=InetAddress.getLocalHost();
			soc=new Socket(ia,8020);
			dis=new DataInputStream(soc.getInputStream());
			sdate=dis.readLine();
			System.out.println("THE date in the server is:"+sdate);
			ps=new PrintStream(soc.getOutputStream());
			ps.println(ia);
		}
		catch(IOException e)
		{
			System.out.println("THE EXCEPTION is: "+e);		
		}
	}
}
