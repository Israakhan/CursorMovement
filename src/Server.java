import java.awt.*;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String arg[])throws Exception{
 
      Robot r=new Robot();
      ServerSocket server=new ServerSocket(9090);
      Socket socket=server.accept();
      System.out.println("Connected");
      
      DataInputStream in=new DataInputStream(socket.getInputStream());
      PrintStream out=new PrintStream(socket.getOutputStream());
    
      do{          
            String s=in.readLine();
            System.out.println(s);
            
            String data[]=s.split(":");
            int x=Integer.parseInt(data[0]);
            int y=Integer.parseInt(data[1]);    
            r.mouseMove(x,y);  
    }while(true);
    
         

  }
    }

