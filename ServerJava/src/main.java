import java.net.*;
import java.io.*;

public class main {

	/*	public static void main (String args[])  {
		ServerSocket a;
		try {
			a = new ServerSocket(7777);

			while(true){
				Socket a1=a.accept(); 
				//BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
				BufferedReader inPut= new BufferedReader(new InputStreamReader(a1.getInputStream()));
				BufferedWriter out= new BufferedWriter(new OutputStreamWriter(a1.getOutputStream()));

				String pippo="<HTML>  CIao </HTML>";
				int conta=pippo.getBytes().length;


				out.write("HTTP/1.0 200 OK\r\n");
				out.write("Date: Fri, 31 Dec 2015 23:59:59 GMT\r\n");
				out.write("Server: Apache/0.8.4\r\n");
				out.write("Content-Type: text/html\r\n");
				out.write("Content-Length: "+conta+"\r\n");
				out.write("Expires: Sat, 01 Jan 2000 00:59:59 GMT\r\n");
				out.write("Last-modified: Fri, 09 Aug 1996 14:21:40 GMT\r\n");
				out.write("\r\n");
				out.write(pippo);

			//	String s;
		//		while(!(s=inPut.readLine()).isEmpty()) {
		//			System.out.println(s);
				//	if(s.isEmpty())
					//	break;
		//		}

				String bandiera = inPut.readLine();
				while (!bandiera.isEmpty()) {
					System.out.println(bandiera);
					bandiera = inPut.readLine();
				}

				out.close();
				inPut.close();
				a1.close();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}*/

	public static void main (String args[])  {
		Thread1800 threadVariazione = new Thread1800();
		Thread thread = new Thread(threadVariazione);
		thread.start();
		System.out.println("Avvio thread Variazione orario");
		Thread1801 threadOrarioCompleto = new Thread1801();
		Thread thread2 = new Thread(threadOrarioCompleto);
		thread2.start();
		System.out.println("Avvio thread Orario Completo");

	}


}
