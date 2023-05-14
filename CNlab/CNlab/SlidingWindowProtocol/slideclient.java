package SlidingWindowProtocol;

import java.io.*;
import java.net.*;
public class slideclient
{
           	public static void main(String args[])throws IOException
           	{
                	byte msg[]=new byte[200];
                	Socket s=new Socket(InetAddress.getLocalHost(),2000);
                	DataInputStream in=new DataInputStream(s.getInputStream());
                	DataInputStream ain=new DataInputStream(System.in);
                	PrintStream p=new PrintStream(s.getOutputStream());
                	char ch;
                	int i=0,ws=5;
                	while(true)
                	{
                          	String str,astr;
                          	int j=0;
                                    i=0;
                          	str=in.readLine();
                          	if(str.equals("STOP"))
                                    	System.exit(0);
                          	j=Integer.parseInt(str);
                          	for(i=0;i<j;i++)
                          	{
                                    	str=in.readLine();
                                    	System.out.println(str);
                                    	if((i+1)%ws==0)
                                    	{
                                              	System.out.println("Give the ack by press\"Enter\"key");
                                              	astr=ain.readLine();
                                              	p.println((i+1)+"ack");
                                    	}}
                          	if((i%ws)!=0)
                          	{
                                    	System.out.println("Give the ack by press\"Enter\"key");
                                    	astr=ain.readLine();
                                    	p.println(i+"ack");}
                          	System.out.println("All data are recieved and ack");
                	}}}
