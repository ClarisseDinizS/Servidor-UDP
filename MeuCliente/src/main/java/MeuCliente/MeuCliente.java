/*

******************************************* 

  DUPLA: CLARISSE DINIZ E DOUGLAS ALMEIDA

******************************************* 

*/
package MeuCliente;

import java.net.*;
import java.io.*;

public class MeuCliente {
    private String nomeDNS;
    private int serverPort;
    private byte[] meuIP;
    
    public MeuCliente(){
        // Método construtor
        
        try{
           InetAddress endereco = InetAddress.getLocalHost();
           
           nomeDNS = endereco.getHostName();
           meuIP = endereco.getAddress();
           
        }catch(UnknownHostException e){
            System.out.println("Host Desconhecido" + e.getMessage( ));  
        }// try catch
        
        serverPort = 6789;
    }// meu cliente
    
    public String enviaMensagem (String mensagem) throws UnknownHostException{
        DatagramSocket aSocket = null;
        String resposta = new String("");
        
        try{
            aSocket = new DatagramSocket();
            byte []m = mensagem.getBytes();
            InetAddress aHost = InetAddress.getByName(nomeDNS);
            
            DatagramPacket request = new DatagramPacket(m,m.length, aHost, serverPort);
            
            aSocket.send(request);
            
            byte[ ] buffer = new byte[600];
            
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            
            aSocket.receive(reply);
            
            resposta = new String(reply.getData());
            
            resposta = resposta + "\n";
    
        }catch(SocketException e){
            System.out.println("Socket " + e.getMessage()); 
        }catch(IOException e){
            System.out.println("Input Output" + e.getMessage()); 
        }finally{
            if(aSocket != null) 
                aSocket.close();
        } //tru catch
        return resposta;
    }//enviaMensagem
    
    public String receberMsgUsuario() throws UnknownHostException, IOException {
        DatagramSocket aSocket = null;
        
        String resposta = new String("");
        
        aSocket = new DatagramSocket();
        
        byte[] buffer = new byte[600];
        
        DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
        
        aSocket.receive(reply);
        
        resposta = new String(reply.getData());

        resposta = resposta + "\n";
        
        return resposta;
    }
    
    
    public MeuCliente(String nomeDNSServidor){
        // Método construtor para quando o servidor e cliente rodarem
        // em máquinas diferentes
        nomeDNS = "Usuário-PC";
        meuIP = null;
        serverPort = 6789;
    }

    public String getNomeDNS() {
        return nomeDNS;
    }

    public int getServerPort() {
        return serverPort;
    }

    public String getMeuIP() {
        String s = new String(meuIP);
        return s;
    }
         
}// class
