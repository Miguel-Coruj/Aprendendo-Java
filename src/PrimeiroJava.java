
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class PrimeiroJava extends javax.swing.JFrame {

    public PrimeiroJava() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLingua = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        btnHora = new javax.swing.JButton();
        btnTamanho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("O que aprendi");

        btnLingua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLingua.setText("Língua");
        btnLingua.setActionCommand("clickLingua");
        btnLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinguaAction(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setText("Click");
        lblMensagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHora.setText("Hora");
        btnHora.setActionCommand("clickLingua");
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraAction(evt);
            }
        });

        btnTamanho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTamanho.setText("Tamanho da Janela");
        btnTamanho.setActionCommand("clickLingua");
        btnTamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTamanho.setDefaultCapable(false);
        btnTamanho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanhoAction(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLingua)
                .addGap(96, 96, 96)
                .addComponent(btnTamanho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHora)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLingua)
                    .addComponent(btnHora)
                    .addComponent(btnTamanho))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLinguaAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinguaAction
        Locale lc = Locale.getDefault();
        
        lblMensagem.setText(lc.getDisplayLanguage());
    }//GEN-LAST:event_btnLinguaAction

    private void btnHoraAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraAction
        Date relogio = new Date();
        
        lblMensagem.setText(relogio.toString());
    }//GEN-LAST:event_btnHoraAction

    private void btnTamanhoAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamanhoAction
        Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();
        
        lblMensagem.setText(d.width + " por " + d.height);
    }//GEN-LAST:event_btnTamanhoAction

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
            java.util.logging.Logger.getLogger(PrimeiroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeiroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeiroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiroJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeiroJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHora;
    private javax.swing.JButton btnLingua;
    private javax.swing.JButton btnTamanho;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
