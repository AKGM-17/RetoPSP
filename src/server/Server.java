package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private final int PUERTO = 5000;
    public void iniciar() {
        //ServerSocket servidor = null;
        Socket cliente = null;
        ObjectInputStream entrada = null;
        ObjectOutputStream salida = null;
        try ( ServerSocket servidor = new ServerSocket(PUERTO))
        {
        	while (true) 
        	{
	            System.out.println("Esperando conexiones del cliente...");
	            
	            try
	            {
		            cliente = servidor.accept();
		            System.out.println("Cliente conectado.");
		            salida = new ObjectOutputStream (cliente.getOutputStream());
		            entrada = new ObjectInputStream(cliente.getInputStream());
		           
		
		            salida.writeObject("Hola ¡Cliente!");
	            } catch (Exception e) {
	            	System.out.println("Error: " + e.getMessage());
	            } finally {
	            	try {	 
  				if (entrada != null)
		                    entrada.close();
		                if (salida != null)
		                    salida.close();           		
		                if (cliente != null)
		                    cliente.close();             
	            	} catch (Exception e) {
	            		System.out.println("Error: " + e.getMessage());
	            	}
	            }
        	}
        
    	} catch (IOException e) {
        e.printStackTrace();
    	}   

    }
    public static void main(String[] args) {
        Server s = new Server();
        s.iniciar();
    }
}
