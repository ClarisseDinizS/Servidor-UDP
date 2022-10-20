/*

******************************************* 

  DUPLA: CLARISSE DINIZ E DOUGLAS ALMEIDA

******************************************* 

*/
package meuservidorudp;

import java.util.ArrayList;

public class BaseDeDados {
    private ArrayList lista = null; 
    
    public BaseDeDados(){
        lista = new ArrayList();
    }
    public void insere(String msg){
        lista.add(msg.trim());
    }
    public String le(){
        String s = "\n";
        
        int fim = lista.size();
        
        for (int pos = 0; pos < fim; pos++) {
           s = s + "[" + (pos + 1) + "]" + (String)lista.get(pos)+ "\n";
        }
        
        return s;
    }
    
    public String respostasBatePapo(String idMsg){
        String formatacaoMsg = "";
        int finalLista = lista.size();
        String identacaoTab = "       ";
        
        String stringAuxiliadora;
        int pos = Integer.parseInt(idMsg);
        
        String parametroIDMsg = "(" + idMsg + ")";
        
        formatacaoMsg += "[" + idMsg + "]" + (String)lista.get(Integer.parseInt(idMsg) - 1) + "\n";
        
        do{
            stringAuxiliadora = (String)lista.get(pos);
            
            if(stringAuxiliadora.endsWith(parametroIDMsg)){
                formatacaoMsg+= identacaoTab + "[" + ( pos+1 ) + "]" + stringAuxiliadora + "\n";
            }
            pos++;
        }while( pos < finalLista );
        return formatacaoMsg;
    }   
}
