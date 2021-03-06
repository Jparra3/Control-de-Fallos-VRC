/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrc;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author Jhonatan
 */
public class VRC extends javax.swing.JFrame {

    /**
     * Creates new form VRC
     */
    public VRC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        chbModi = new javax.swing.JCheckBox();
        txtGenerado = new javax.swing.JTextField();
        lblCantBits = new javax.swing.JLabel();
        lblCantUno = new javax.swing.JLabel();
        btnComprobado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dato a enviar");

        txtDato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDatoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDatoKeyTyped(evt);
            }
        });

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        chbModi.setText("Modificar");
        chbModi.setEnabled(false);
        chbModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbModiActionPerformed(evt);
            }
        });

        txtGenerado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGenerado.setEnabled(false);
        txtGenerado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGeneradoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGeneradoKeyTyped(evt);
            }
        });

        lblCantBits.setText("Cantidad de bits:");

        lblCantUno.setText("Cantidad de 1:");

        btnComprobado.setText("Comprobar");
        btnComprobado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantUno)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnGenerar))
                            .addComponent(txtGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnComprobado)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbModi)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblCantBits)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantUno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(lblCantBits))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbModi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComprobado)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatoKeyPressed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatoKeyPressed

    public void validarUnoCero(java.awt.event.KeyEvent evt){
        String le= String.valueOf(evt.getKeyChar());
        if(!le.matches("[10]")){
            evt.consume();
            //getToolkit().beep();
        
        }
    }
    private void txtDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatoKeyTyped
        validarUnoCero(evt);
    }//GEN-LAST:event_txtDatoKeyTyped
    int suma=0;
    int cantEnviar=0;
    String datoGenerado="";
    public void sumarUnos(String dato){
        for(int i=0;i<dato.length();i++){        
            if(dato.charAt(i)=='1'){
                suma+=1;
            }
        }
    }
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
    
     String dato=txtDato.getText();
     if(dato.length()==0){
        JOptionPane.showMessageDialog(null,"Ingrese Un dato a Enviar","Aviso",JOptionPane.INFORMATION_MESSAGE);
        txtDato.requestFocus();
     }else{
         suma=0;
        String agrega="";
        String compara="";
         sumarUnos(dato);
        if(suma%2==0){        
            agrega="0";
        }else{
            agrega="1";
        }
        dato+=agrega;
        txtGenerado.setText(dato);
        lblCantUno.setText("Cantidad de 1: "+String.valueOf(suma));
        cantEnviar=dato.length();
        lblCantBits.setText("Cantidad de Bits a Enviar: "+String.valueOf(cantEnviar));        
        datoGenerado=dato;
       chbModi.setEnabled(true);
     }
    
    
// TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void chbModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbModiActionPerformed
        if(chbModi.isSelected()){
            txtGenerado.setEnabled(true);
            txtGenerado.requestFocus();
           
        }else{
            txtGenerado.setText(datoGenerado);
            txtGenerado.setEnabled(false);
        }
        
    }//GEN-LAST:event_chbModiActionPerformed

    private void txtGeneradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneradoKeyTyped
        
       
         if(txtGenerado.getText().length()>=cantEnviar){
             evt.consume();
             getToolkit().beep();
         }
        validarUnoCero(evt);
        
        
        
    }//GEN-LAST:event_txtGeneradoKeyTyped

    private void btnComprobadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobadoActionPerformed
        String mensaje="";
        if(txtGenerado.getText().length()<cantEnviar)
       {
           JOptionPane.showMessageDialog(null,"para que se genere la comprobación\n"
                   + "debe enviarse la misma cantidad de bits\n"
                   + "en este caso la cantidad de bits es: "+cantEnviar,"Informacion",JOptionPane.INFORMATION_MESSAGE);
           txtGenerado.requestFocus();
       }
       else{
           
           suma=0;
          String dato=txtGenerado.getText();
            sumarUnos(dato);
          if(suma%2==0){
                   mensaje="El dato llegó correctamente";
                   if(!datoGenerado.equals(txtGenerado.getText())){
                       mensaje+="\nEl sistema VRC no detecto el error";
                   }
               }
               else{
                   mensaje="El dato llegó con errores";
               }
               JOptionPane.showMessageDialog(null,mensaje);
       }
       
    }//GEN-LAST:event_btnComprobadoActionPerformed

    private void txtGeneradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneradoKeyPressed
         
    }//GEN-LAST:event_txtGeneradoKeyPressed

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
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobado;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JCheckBox chbModi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCantBits;
    private javax.swing.JLabel lblCantUno;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtGenerado;
    // End of variables declaration//GEN-END:variables
}
