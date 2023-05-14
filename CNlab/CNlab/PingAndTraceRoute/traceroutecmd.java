package PingAndTraceRoute;



import java.io.*;
import java.net.*;

public class traceroutecmd {

     public static void runSystemCommand(String command)
     {
          try
          {
              Process p = Runtime.getRuntime().exec(command);
	DataInputStream inputstream=new DataInputStream(p.getInputStream());
              

              String s = "";
              while ((s = inputstream.readLine()) != null)
                   System.out.println(s);
          }
          catch (Exception e)
          {
          }}

     public static void main(String[] args)
     {  
          String ip = "www.google.co.in";
        
        
          runSystemCommand("tracert " + ip);
     }
}
