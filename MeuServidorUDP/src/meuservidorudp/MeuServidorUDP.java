/*

******************************************* 

  DUPLA: CLARISSE DINIZ E DOUGLAS ALMEIDA
  

******************************************* 

*/
package meuservidorudp;

import java.net.*;
import java.io.*;

public class MeuServidorUDP {
    private static BaseDeDados bd = null;
    
    public static void main(String[] args) {
        DatagramSocket aSocket = null;
        bd = new BaseDeDados();
        
        try{
            aSocket = new DatagramSocket(6789); // Número da Porta
            
            while(true){
                // ======= Recebimento de mensagem do cliente =======
                //
                byte[] buffer = new byte[600];
                DatagramPacket request = new DatagramPacket (buffer, buffer.length);
                aSocket.receive(request); // Coloca o Servidor em espera pela requisição do cliente
                
                //========= Processamento do Servidor sobre a
                // mensagem recebida ======
            
                String msg = new String(request.getData()); // Faz a conversão de dados
                
                msg = msg.trim();
                String resposta = null;
                if(msg.endsWith("---------")){
                    int num = msg.length() - 9;
                    msg = msg.substring(0, num);
                    resposta = bd.respostasBatePapo(msg);
                }
                else if(!msg.isEmpty()){
                    bd.insere(msg.toUpperCase());
                    resposta = bd.le();
                }
                else{
                    resposta = bd.le();
                }
                byte [] todasMsg = resposta.getBytes();
                
                //========= Envio de Mensagem de resposta
                
                DatagramPacket reply = new DatagramPacket(todasMsg, todasMsg.length, request.getAddress(), request.getPort());
                aSocket.send(reply);
            }
        }catch(SocketException e){
            System.out.println("SERVIDOR - Socket " + e.getMessage()); 
        }catch(IOException e){
            System.out.println("SERVIDOR - Input Output" + e.getMessage()); 
        }finally{
            if(aSocket != null) {
                aSocket.close();
            }
        } 
    } 
}
