
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdmLogado extends javax.swing.JFrame {
    
    public AdmLogado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RH - Conta Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cadastrarFuncionario = new javax.swing.JButton();
        TodosFuncionarios = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        ListarFaltas = new javax.swing.JButton();
        RegistrarSalario = new javax.swing.JButton();
        registrarFalta = new javax.swing.JButton();
        Listarpagamentos = new javax.swing.JButton();
        relatoriofuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("CONTA ADMINISTRADOR");

        cadastrarFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        cadastrarFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cadastrarFuncionario.setForeground(new java.awt.Color(0, 0, 255));
        cadastrarFuncionario.setText("Cadastrar Funcionario");
        cadastrarFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });

        TodosFuncionarios.setBackground(new java.awt.Color(204, 204, 204));
        TodosFuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TodosFuncionarios.setForeground(new java.awt.Color(0, 0, 255));
        TodosFuncionarios.setText("Listar Funcionários");
        TodosFuncionarios.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        TodosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosFuncionariosActionPerformed(evt);
            }
        });

        Sair.setBackground(new java.awt.Color(204, 204, 204));
        Sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sair.setForeground(new java.awt.Color(0, 0, 255));
        Sair.setText("Encerrar");
        Sair.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        ListarFaltas.setBackground(new java.awt.Color(204, 204, 204));
        ListarFaltas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ListarFaltas.setForeground(new java.awt.Color(0, 0, 255));
        ListarFaltas.setText("Listar Faltas");
        ListarFaltas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        ListarFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarFaltasActionPerformed(evt);
            }
        });

        RegistrarSalario.setBackground(new java.awt.Color(204, 204, 204));
        RegistrarSalario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RegistrarSalario.setForeground(new java.awt.Color(0, 0, 255));
        RegistrarSalario.setText("Registrar Salário");
        RegistrarSalario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        RegistrarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarSalarioActionPerformed(evt);
            }
        });

        registrarFalta.setBackground(new java.awt.Color(204, 204, 204));
        registrarFalta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registrarFalta.setForeground(new java.awt.Color(0, 0, 255));
        registrarFalta.setText("Regisrar Faltas");
        registrarFalta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        registrarFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarFaltaActionPerformed(evt);
            }
        });

        Listarpagamentos.setBackground(new java.awt.Color(204, 204, 204));
        Listarpagamentos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Listarpagamentos.setForeground(new java.awt.Color(0, 0, 255));
        Listarpagamentos.setText("Listar Pagamento/Salários");
        Listarpagamentos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        Listarpagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarpagamentosActionPerformed(evt);
            }
        });

        relatoriofuncionarios.setBackground(new java.awt.Color(204, 204, 204));
        relatoriofuncionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        relatoriofuncionarios.setForeground(new java.awt.Color(0, 0, 255));
        relatoriofuncionarios.setText("Relatório");
        relatoriofuncionarios.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        relatoriofuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriofuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RegistrarSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrarFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TodosFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListarFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Listarpagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(relatoriofuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TodosFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Listarpagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relatoriofuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new AddFuncionario().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void TodosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosFuncionariosActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new ListarFuncionario().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_TodosFuncionariosActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        //Encerrar aplicação
        try{
            setVisible(false);
            new LoginAdm().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_SairActionPerformed

    private void ListarFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarFaltasActionPerformed
        try{
            setVisible(false);
            new ListarFalta().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        } catch (SQLException ex) {
            Logger.getLogger(AdmLogado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListarFaltasActionPerformed

    private void RegistrarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarSalarioActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new RegistrarSalario().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_RegistrarSalarioActionPerformed

    private void registrarFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarFaltaActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new RegistrarFalta().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_registrarFaltaActionPerformed

    private void ListarpagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarpagamentosActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new ListarSalarios().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        } catch (SQLException ex) {
            Logger.getLogger(AdmLogado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListarpagamentosActionPerformed

    private void relatoriofuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriofuncionariosActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new Relatorio().setVisible(true);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_relatoriofuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(AdmLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdmLogado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarFaltas;
    private javax.swing.JButton Listarpagamentos;
    private javax.swing.JButton RegistrarSalario;
    private javax.swing.JButton Sair;
    private javax.swing.JButton TodosFuncionarios;
    private javax.swing.JButton cadastrarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registrarFalta;
    private javax.swing.JButton relatoriofuncionarios;
    // End of variables declaration//GEN-END:variables
}
