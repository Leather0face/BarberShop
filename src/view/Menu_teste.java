/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Marina Savitzki
 */
public class Menu_teste extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu_teste() {
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

        bg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar_menu = new javax.swing.JMenuBar();
        jMenu_cadastro = new javax.swing.JMenu();
        jMenuItem_cliente = new javax.swing.JMenuItem();
        jMenuItem_servico = new javax.swing.JMenuItem();
        jMenuItem_usuario = new javax.swing.JMenuItem();
        jMenu_operacao = new javax.swing.JMenu();
        jMenu_relatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1900, 1080));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Prancheta 2.png"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(1981, 1000));

        jPanel1.setBackground(new java.awt.Color(189, 150, 98));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jMenuBar_menu.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jMenuBar_menu.setPreferredSize(new java.awt.Dimension(209, 40));

        jMenu_cadastro.setText("Cadastro");
        jMenu_cadastro.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jMenuItem_cliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jMenuItem_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/cliente-icon.png"))); // NOI18N
        jMenuItem_cliente.setText("Cliente");
        jMenuItem_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clienteActionPerformed(evt);
            }
        });
        jMenu_cadastro.add(jMenuItem_cliente);

        jMenuItem_servico.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jMenuItem_servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/tesoura-icon.png"))); // NOI18N
        jMenuItem_servico.setText("Serviço");
        jMenu_cadastro.add(jMenuItem_servico);

        jMenuItem_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jMenuItem_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/usuario-icon.png"))); // NOI18N
        jMenuItem_usuario.setText("Usuário");
        jMenu_cadastro.add(jMenuItem_usuario);

        jMenuBar_menu.add(jMenu_cadastro);

        jMenu_operacao.setText("Operação");
        jMenu_operacao.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jMenuBar_menu.add(jMenu_operacao);

        jMenu_relatorio.setText("Relatório");
        jMenu_relatorio.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jMenuBar_menu.add(jMenu_relatorio);

        setJMenuBar(jMenuBar_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 933, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JMenuBar jMenuBar_menu;
    private javax.swing.JMenuItem jMenuItem_cliente;
    private javax.swing.JMenuItem jMenuItem_servico;
    private javax.swing.JMenuItem jMenuItem_usuario;
    private javax.swing.JMenu jMenu_cadastro;
    private javax.swing.JMenu jMenu_operacao;
    private javax.swing.JMenu jMenu_relatorio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
