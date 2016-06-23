/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacopa;

import java.util.ArrayList;
import java.awt.event.*;
import java.text.Collator;

/**
 *
 * @author yojvn
 */
public class WinCopa extends javax.swing.JFrame implements ItemListener{

    /**
     * Creates new form WinCopa2
     */
    private static ArrayList <SeleccionNacional> selecciones = new ArrayList <SeleccionNacional>();
        
    public WinCopa() {
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

        seleccion1 = new javax.swing.JComboBox<>();
        seleccion2 = new javax.swing.JComboBox<>();
        rank = new javax.swing.JLabel();
        rank2 = new javax.swing.JLabel();
        goles = new javax.swing.JButton();
        goles1 = new javax.swing.JLabel();
        goles2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        winner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        seleccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chile", "Argentina", "Colombia", "EEUU" }));
        seleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion1ActionPerformed(evt);
            }
        });

        seleccion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chile", "Argentina", "Colombia", "EEUU" }));

        goles.setText("Goles");
        goles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golesActionPerformed(evt);
            }
        });

        goles1.setText("0");

        goles2.setText("0");

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular Ganador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(goles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seleccion1, 0, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seleccion2, 0, 111, Short.MAX_VALUE)
                    .addComponent(rank2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goles2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rank2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goles1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goles2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goles)
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(limpiar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void golesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golesActionPerformed
        goles1.setText(Integer.toString(generarGoles()));
        goles2.setText(Integer.toString(generarGoles()));
    }//GEN-LAST:event_golesActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void seleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion1ActionPerformed
        
    }//GEN-LAST:event_seleccion1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ganador();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(WinCopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        agregarSeleccion("Chile", 10);
        agregarSeleccion("Argentina", 6);
        agregarSeleccion("Colombia",11);
        agregarSeleccion("EEUU",12);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinCopa().setVisible(true);
            }
        });
    }
    public static void agregarSeleccion(String nombre, int rank){
        SeleccionNacional temp = new SeleccionNacional(nombre, rank);
        selecciones.add(temp);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goles;
    private javax.swing.JLabel goles1;
    private javax.swing.JLabel goles2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel rank;
    private javax.swing.JLabel rank2;
    private javax.swing.JComboBox<String> seleccion1;
    private javax.swing.JComboBox<String> seleccion2;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables

    private int generarGoles() {
        int goles = 0;
        goles = (int)Math.floor(Math.random()*(0-10)+10);
        return goles;
    }
    
    private void limpiar(){
        goles1.setText("");
        goles2.setText("");
        winner.setText("");
        rank.setText("");
        rank2.setText("");
        winner.setText("");
    }
    public void itemStateChanged(ItemEvent e) {
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        if (e.getSource()==seleccion1) {
            String seleccionado=(String)seleccion1.getSelectedItem();
            for(int i = 0; i < selecciones.size(); i++){
                if((selecciones.get(i).getSelec()).equals(seleccionado)){
                    rank.setText(Integer.toString(selecciones.get(i).getRank()));
                }
            }
        }
        if (e.getSource()==seleccion2) {
            String seleccionado=(String)seleccion2.getSelectedItem();
            for(int i = 0; i < selecciones.size(); i++){
                if((selecciones.get(i).getSelec()).equals(seleccionado)){
                    rank2.setText(Integer.toString(selecciones.get(i).getRank()));
                }
            }
        }        
    }

    private void ganador() {
        if(Integer.parseInt(goles1.getText())>Integer.parseInt(goles2.getText())){
            winner.setText("Gana la Seleccion 1");
        }
        if(Integer.parseInt(goles1.getText())<Integer.parseInt(goles2.getText())){
            winner.setText("Gana la Seleccion 2");
        }
        if(Integer.parseInt(goles1.getText())==Integer.parseInt(goles2.getText())){
            winner.setText("El partido es un empate");
        }        
    }
}
