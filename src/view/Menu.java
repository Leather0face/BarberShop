package view;

import controller.MenuController;
import javax.swing.JOptionPane;
/**
 *
 * @author Marina Savitzki
 */
public class Menu extends javax.swing.JFrame {

    private final MenuController controller;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
//        iniciar a tela principal maximizada
        setExtendedState(MAXIMIZED_BOTH);
        this.controller = new MenuController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gerenciaTxt = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        usuarioAutenticadoTxt = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        relatorioButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();
        serviceButton = new javax.swing.JButton();
        clientButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCliente_tb = new javax.swing.JTable();
        footer = new javax.swing.JLabel();
        agendamentoTxt = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BarberShop");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gerenciaTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        gerenciaTxt.setForeground(new java.awt.Color(255, 255, 255));
        gerenciaTxt.setText("Gerenciamento");
        getContentPane().add(gerenciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 50));

        nomeUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(204, 204, 204));
        nomeUsuario.setText("usuário");
        getContentPane().add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 980, 220, 40));

        usuarioAutenticadoTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        usuarioAutenticadoTxt.setForeground(new java.awt.Color(204, 204, 204));
        usuarioAutenticadoTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-conta-verificada-24.png"))); // NOI18N
        usuarioAutenticadoTxt.setText("Usuário autenticado:");
        getContentPane().add(usuarioAutenticadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 980, 220, 40));

        logoutButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-logout-arredondado-para-baixo-24.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 980, 170, 50));

        helpButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        helpButton.setText("Ajuda");
        helpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 980, 170, 50));

        quitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        quitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-sair-24.png"))); // NOI18N
        quitButton.setText("Sair");
        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, 370, 50));

        relatorioButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        relatorioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/relatorioTrabalho24-icon.png"))); // NOI18N
        relatorioButton.setText("Relatório");
        relatorioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        relatorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(relatorioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 370, 50));

        paymentButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        paymentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-dinheiro-24.png"))); // NOI18N
        paymentButton.setText("Finanças");
        paymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentButton.setEnabled(false);
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 370, 50));

        userButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        userButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-usuário-16.png"))); // NOI18N
        userButton.setText("Usuário");
        userButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 370, 50));

        serviceButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        serviceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-serviço-24.png"))); // NOI18N
        serviceButton.setText("Serviço");
        serviceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(serviceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 370, 50));

        clientButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        clientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/grupo-de-usuário24.png"))); // NOI18N
        clientButton.setText("Cliente");
        clientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 370, 50));

        updateButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-alterar-24.png"))); // NOI18N
        updateButton.setText("Alterar");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 780, 270, 50));

        deleteButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-excluir-24 (2).png"))); // NOI18N
        deleteButton.setText("Excluir");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 780, 270, 50));

        newButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-soma-24.png"))); // NOI18N
        newButton.setText("Novo");
        newButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 780, 270, 50));

        listaCliente_tb.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        listaCliente_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Data do agendamento", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listaCliente_tb);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 1210, 630));

        footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/footer.png"))); // NOI18N
        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 956, 1950, 100));

        agendamentoTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        agendamentoTxt.setForeground(new java.awt.Color(204, 204, 204));
        agendamentoTxt.setText("Agendamentos");
        getContentPane().add(agendamentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 960, 50));

        bg.setBackground(new java.awt.Color(233, 118, 45));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        bg.setText(" ");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1990, 1110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
       controller.goAgenda();
    }//GEN-LAST:event_newButtonActionPerformed

    private void clientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientButtonActionPerformed

    private void serviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceButtonActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userButtonActionPerformed

    private void relatorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
//        adiocionar ao controlador
        JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o sistema?");
        
    }//GEN-LAST:event_quitButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agendamentoTxt;
    private javax.swing.JLabel bg;
    private javax.swing.JButton clientButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel gerenciaTxt;
    private javax.swing.JButton helpButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaCliente_tb;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton relatorioButton;
    private javax.swing.JButton serviceButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton userButton;
    private javax.swing.JLabel usuarioAutenticadoTxt;
    // End of variables declaration//GEN-END:variables


}
