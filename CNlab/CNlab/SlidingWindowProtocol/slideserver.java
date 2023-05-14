package SlidingWindowProtocol;

import java.io.*;
import java.net.*;
public class slideserver
{
public static void main(String args[])throws IOException
{
byte msg[]=new byte[200];
ServerSocket ser=new ServerSocket(2000);
Socket s;
PrintStream pout;
DataInputStream in=new DataInputStream(System.in);
int start,end,l,j=0,i,ws=5,k=0;
String st,stl[]=new String[100];
System.out.println("Type\"Stop\"to exit");
s=ser.accept();
pout=new PrintStream(s.getOutputStream());
DataInputStream rin=new DataInputStream(s.getInputStream());
System.out.println("enter data to be send:");
while(true)
{
st=in.readLine();
l=st.length();
start=0;
end=10;
j=0;
if(st.equals("STOP"))
{
pout.println(st);
break;
}
if(l<10)
{stl[j++]=l+st;
}
else
{
for(i=l,j=0;i>0;i=i-10,j++)
{
stl[j]=(j+1)+st.substring(start,end);
start=end;
end=end+10;
if(end>l)
{
end=((start-10)+i);
}}
System.out.println("total number of packet"+j);
}
pout.println(j);
for(i=0;i<j;i++)
{
pout.println(stl[i]);
if((i+1)%ws==0)
{
System.out.println(rin.readLine());
}}
if(i%ws!=0)
{
System.out.println(rin.readLine());
System.out.println("enter next data to send");
}
}}}
