
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Relatorio extends javax.swing.JFrame {
    private static final String url = "jdbc:mysql://localhost/recursoshumanos";
    private static final String username = "root";
    private static final String password = "";
    
    public Relatorio() {
        initComponents();
        this.setLocationRelativeTo(null);        
        this.setTitle("RH - Relatório");
        
         try (Connection connection = DriverManager.getConnection(url, username, password)) {       
            String sql = "SELECT COUNT(*) FROM funcionario"; 
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();        
             if (rs.next()) {   
                String Total = rs.getString("COUNT(*)"); 
                LF.setText("Total de Funcionários na Empresa:: "+Total);  
            } 
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error");
        } 
         
        try (Connection connection = DriverManager.getConnection(url, username, password)) {       
            String sql = "SELECT COUNT(*) FROM salario"; 
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();        
             if (rs.next()) {   
                String Total = rs.getString("COUNT(*)"); 
                LS.setText("Total de Salarios Pagos: "+Total);  
            } 
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error");
        } 
        
        try (Connection connection = DriverManager.getConnection(url, username, password)) {       
            String sql = "SELECT COUNT(*) FROM falta"; 
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();        
             if (rs.next()) {   
                String Total = rs.getString("COUNT(*)"); 
                LFR.setText("Total de Faltas Registradas: "+Total);  
            } 
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error");
        } 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Voltar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LF = new javax.swing.JLabel();
        LS = new javax.swing.JLabel();
        LFR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Voltar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Voltar1.setForeground(new java.awt.Color(0, 0, 255));
        Voltar1.setText("Voltar");
        Voltar1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("    Relatório  da Empresa");

        LF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LF.setForeground(new java.awt.Color(0, 0, 255));
        LF.setText("Total de Funcionários na Empresa:");

        LS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LS.setForeground(new java.awt.Color(0, 0, 255));
        LS.setText("Total de Salarios Pagos");

        LFR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LFR.setForeground(new java.awt.Color(0, 0, 255));
        LFR.setText("Total de Faltas Registradas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(LFR, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LS, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LF, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(211, 211, 211)))
                .addComponent(Voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(LF)
                        .addGap(28, 28, 28)
                        .addComponent(LS)))
                .addGap(30, 30, 30)
                .addComponent(LFR)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar1ActionPerformed
        //voltar...
        try{
            setVisible(false);
            new AdmLogado().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_Voltar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LF;
    private javax.swing.JLabel LFR;
    private javax.swing.JLabel LS;
    private javax.swing.JButton Voltar1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
