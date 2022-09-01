package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        Socket cliente = servidor.accept();
        System.out.println("Nova conexão com o cliente " +  
            cliente.getInetAddress().getHostAddress()
        );

        Scanner s = new Scanner(cliente.getInputStream());
        
        do{
        
        System.out.println(s.nextLine());
        
        }while(!"exit".equals(s.nextLine()));
        
         s.close();
         servidor.close();
         cliente.close();
         System.out.println("\n Sistema Fechado");
        
    }
}
