
/*

******************************************* 

  DUPLA: CLARISSE DINIZ E DOUGLAS ALMEIDA

******************************************* 

*/

package MeuCliente;

import MeuCliente.MeuCliente;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Formulario extends javax.swing.JDialog {

    public Formulario(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        MeuCliente cliente = new MeuCliente();
        
        TxtServ.setText(cliente.getNomeDNS());
        TxtId.setText(JOptionPane.showInputDialog(null, " Informe seu UserName para iniciar o chat =) : "));
        TxtMensagem.setText("");
        TxtMensagem.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LBServidor = new javax.swing.JLabel();
        TxtServ = new javax.swing.JTextField();
        LBId = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        LBMensagem = new javax.swing.JLabel();
        TxtMensagem = new javax.swing.JTextField();
        LBMensagem1 = new javax.swing.JLabel();
        txtResposta = new javax.swing.JTextField();
        ButtonEnviar = new javax.swing.JButton();
        ButtonAtualizar = new javax.swing.JButton();
        ButtonMostrarRespostas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LBMensagem2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fórum de Mensagens");
        setPreferredSize(new java.awt.Dimension(420, 637));
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Fórum de Mensagens");

        LBServidor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBServidor.setText("Servidor: ");

        LBId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBId.setText("ID:");

        LBMensagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBMensagem.setText("Mensagem: ");

        LBMensagem1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBMensagem1.setText("Mostrar Mensagem por Parâmetro");

        ButtonEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonEnviar.setForeground(new java.awt.Color(0, 51, 204));
        ButtonEnviar.setText("ENVIAR");
        ButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnviarActionPerformed(evt);
            }
        });

        ButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAtualizar.setForeground(new java.awt.Color(0, 51, 204));
        ButtonAtualizar.setText("ATUALIZAR");
        ButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtualizarActionPerformed(evt);
            }
        });

        ButtonMostrarRespostas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonMostrarRespostas.setForeground(new java.awt.Color(0, 51, 204));
        ButtonMostrarRespostas.setText("MOSTRAR RESPOSTAS");
        ButtonMostrarRespostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarRespostasActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(10);
        jTextArea1.setTabSize(50);
        jScrollPane1.setViewportView(jTextArea1);

        LBMensagem2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBMensagem2.setText("Bate-papo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonEnviar)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LBMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtMensagem)
                                .addComponent(txtResposta)
                                .addComponent(LBMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtServ)
                                .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonMostrarRespostas, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LBMensagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBServidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LBMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LBMensagem1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBMensagem2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAtualizar)
                    .addComponent(ButtonMostrarRespostas))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviarActionPerformed
        String idMsg = txtResposta.getText();
        String msg = TxtMensagem.getText();
        
        
        if(msg.isEmpty()){
          JOptionPane.showMessageDialog(null,"Favor informar MENSAGEM a ser enviada.");  
        } 
        else{
          msg = "("+ TxtId.getText()+"): " + msg;
          if(!idMsg.isEmpty()){
              msg = msg + "  (" + idMsg + ")  ";
          }
          MeuCliente cliente = new MeuCliente();
          String resposta;
            try {
                resposta = cliente.enviaMensagem(msg);
                jTextArea1.setText(resposta);
                TxtMensagem.setText("");
                
                
                
                TxtMensagem.requestFocus();
            } catch (UnknownHostException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonEnviarActionPerformed

    private void ButtonMostrarRespostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarRespostasActionPerformed
        
        
        String idMsg = txtResposta.getText();
        idMsg += "---------";
        
        
        MeuCliente cliente = new MeuCliente();
            String resposta;
            try {
                resposta = cliente.enviaMensagem(idMsg);
                jTextArea1.setText(resposta);
                TxtMensagem.setText("");
                TxtMensagem.requestFocus();
                
            } catch (UnknownHostException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonMostrarRespostasActionPerformed

    private void ButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtualizarActionPerformed
       String msg = "";
       
       
       MeuCliente cliente = new MeuCliente();
            String resposta;
            
            try {
                
                resposta = cliente.enviaMensagem(msg);
                jTextArea1.setText(resposta);
                TxtMensagem.setText("");
                TxtMensagem.requestFocus();
                
            } catch (UnknownHostException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario dialog = new Formulario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAtualizar;
    private javax.swing.JButton ButtonEnviar;
    private javax.swing.JButton ButtonMostrarRespostas;
    private javax.swing.JLabel LBId;
    private javax.swing.JLabel LBMensagem;
    private javax.swing.JLabel LBMensagem1;
    private javax.swing.JLabel LBMensagem2;
    private javax.swing.JLabel LBServidor;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtMensagem;
    private javax.swing.JTextField TxtServ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtResposta;
    // End of variables declaration//GEN-END:variables
}
