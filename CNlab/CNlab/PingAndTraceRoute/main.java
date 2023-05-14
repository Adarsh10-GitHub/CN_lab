package PingAndTraceRoute;

import java.io.*;
import java.net.*;
class pingserver
{
public static void main(String args[])
{
try
{
String str;
System.out.print(" Enter the IP Address to be Ping : ");
DataInputStream dis=new DataInputStream(System.in);
String ip=dis.readLine();
Runtime H=Runtime.getRuntime();
Process p=H.exec("ping " + ip);
InputStream in=p.getInputStream();
DataInputStream buf2=new DataInputStream(in);
while((str=buf2.readLine())!=null)
{
System.out.println(" " + str);
}
}
catch(Exception e)
{

System.out.println(e.getMessage());
}
}}
