package view;

import controller.MenuTesteController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marina Savitzki
 */
public class MenuTeste extends javax.swing.JFrame {

    private final MenuTesteController controller;

    /**
     * Creates new form MenuTeste
     */
    public MenuTeste() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.controller = new MenuTesteController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        center = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        agendamentoTxt = new javax.swing.JLabel();
        newButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCliente_tb = new javax.swing.JTable();
        bg_main = new javax.swing.JLabel();
        agenda = new javax.swing.JPanel();
        homeButtonAgenda = new javax.swing.JButton();
        id_tf = new javax.swing.JTextField();
        cliente_cb = new javax.swing.JComboBox<>();
        servico_cb = new javax.swing.JComboBox<>();
        valorTf = new javax.swing.JTextField();
        dataFtf = new javax.swing.JFormattedTextField();
        hora_ftf = new javax.swing.JFormattedTextField();
        hora_txt = new javax.swing.JLabel();
        data_txt = new javax.swing.JLabel();
        valor_txt = new javax.swing.JLabel();
        servico_txt = new javax.swing.JLabel();
        cliente_txt = new javax.swing.JLabel();
        id_txt1 = new javax.swing.JLabel();
        id_txt = new javax.swing.JLabel();
        cancelButtonAgenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observTxtArea = new javax.swing.JTextArea();
        agendar_bt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaCliente_tb1 = new javax.swing.JTable();
        tituloTabelaTxt = new javax.swing.JLabel();
        bg_main1 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        tittleUsers = new javax.swing.JLabel();
        listUsers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        homeButtonUser = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        updateUserButton = new javax.swing.JButton();
        bg_users = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButtonFooter = new javax.swing.JButton();
        exitButtonFooter = new javax.swing.JButton();
        bg_footer = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        recordsPanel = new javax.swing.JPanel();
        recordLabel = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        servicePanel = new javax.swing.JPanel();
        serviceLabel = new javax.swing.JLabel();
        clientPanel = new javax.swing.JPanel();
        clientLabel = new javax.swing.JLabel();
        gerenciaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1980, 1080));
        setPreferredSize(new java.awt.Dimension(1980, 1060));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        center.setBackground(new java.awt.Color(200, 200, 200));
        center.setLayout(new javax.swing.BoxLayout(center, javax.swing.BoxLayout.LINE_AXIS));

        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agendamentoTxt.setBackground(new java.awt.Color(51, 51, 51));
        agendamentoTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        agendamentoTxt.setForeground(new java.awt.Color(51, 51, 51));
        agendamentoTxt.setText("Agendamentos");
        main.add(agendamentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1230, 50));

        newButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        newButton.setForeground(new java.awt.Color(51, 51, 51));
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-soma-24.png"))); // NOI18N
        newButton.setText("Novo");
        newButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        main.add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 880, 270, 50));

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

        main.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1520, 760));

        bg_main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseSemCor.png"))); // NOI18N
        main.add(bg_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 960));

        center.add(main);

        agenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButtonAgenda.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        homeButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-alterar-24.png"))); // NOI18N
        homeButtonAgenda.setText("Home");
        homeButtonAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonAgendaActionPerformed(evt);
            }
        });
        agenda.add(homeButtonAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 880, 270, 50));

        id_tf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        agenda.add(id_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 40));

        cliente_cb.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        agenda.add(cliente_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 490, 40));

        servico_cb.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        servico_cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servico_cbItemStateChanged(evt);
            }
        });
        agenda.add(servico_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 490, 40));

        valorTf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        agenda.add(valorTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 140, 40));

        try {
            dataFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFtf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        dataFtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFtfActionPerformed(evt);
            }
        });
        agenda.add(dataFtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 140, 40));

        try {
            hora_ftf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hora_ftf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        hora_ftf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora_ftfActionPerformed(evt);
            }
        });
        agenda.add(hora_ftf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 140, 40));

        hora_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        hora_txt.setForeground(new java.awt.Color(51, 51, 51));
        hora_txt.setText("Hora");
        agenda.add(hora_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, 40));

        data_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        data_txt.setForeground(new java.awt.Color(51, 51, 51));
        data_txt.setText("Data");
        agenda.add(data_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 40));

        valor_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        valor_txt.setForeground(new java.awt.Color(51, 51, 51));
        valor_txt.setText("Valor R$");
        agenda.add(valor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 40));

        servico_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        servico_txt.setForeground(new java.awt.Color(51, 51, 51));
        servico_txt.setText("Serviço");
        agenda.add(servico_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 40));

        cliente_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        cliente_txt.setForeground(new java.awt.Color(51, 51, 51));
        cliente_txt.setText("Cliente");
        agenda.add(cliente_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 40));

        id_txt1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        id_txt1.setForeground(new java.awt.Color(51, 51, 51));
        id_txt1.setText("ID");
        agenda.add(id_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 40));

        id_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        id_txt.setForeground(new java.awt.Color(51, 51, 51));
        id_txt.setText("Observação");
        agenda.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 140, 40));

        cancelButtonAgenda.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        cancelButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-excluir-24.png"))); // NOI18N
        cancelButtonAgenda.setText("Cancelar");
        cancelButtonAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonAgendaActionPerformed(evt);
            }
        });
        agenda.add(cancelButtonAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 880, 270, 50));

        observTxtArea.setColumns(20);
        observTxtArea.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        observTxtArea.setRows(5);
        jScrollPane1.setViewportView(observTxtArea);

        agenda.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 730, 350));

        agendar_bt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        agendar_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/agenda-icon.png"))); // NOI18N
        agendar_bt.setText("Agendar");
        agendar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendar_btActionPerformed(evt);
            }
        });
        agenda.add(agendar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 880, 270, 50));

        listaCliente_tb1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        listaCliente_tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaCliente_tb1.setToolTipText("");
        jScrollPane3.setViewportView(listaCliente_tb1);

        agenda.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 1530, 310));

        tituloTabelaTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloTabelaTxt.setForeground(new java.awt.Color(51, 51, 51));
        tituloTabelaTxt.setText("Lista de agendamentos");
        agenda.add(tituloTabelaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 980, 50));

        bg_main1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseSemCor.png"))); // NOI18N
        agenda.add(bg_main1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 960));

        center.add(agenda);

        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittleUsers.setBackground(new java.awt.Color(51, 51, 51));
        tittleUsers.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        tittleUsers.setForeground(new java.awt.Color(51, 51, 51));
        tittleUsers.setText("Usuários cadastrados");
        users.add(tittleUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1230, 50));

        jTable1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Nível de acesso", "Data cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listUsers.setViewportView(jTable1);

        users.add(listUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1520, 760));

        homeButtonUser.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        homeButtonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-alterar-24.png"))); // NOI18N
        homeButtonUser.setText("Home");
        homeButtonUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonUserActionPerformed(evt);
            }
        });
        users.add(homeButtonUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 880, 270, 50));

        newUserButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        newUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-soma-24.png"))); // NOI18N
        newUserButton.setText("Novo");
        newUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });
        users.add(newUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 880, 270, 50));

        deleteUserButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        deleteUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-excluir-24 (2).png"))); // NOI18N
        deleteUserButton.setText("Excluir");
        deleteUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users.add(deleteUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 880, 270, 50));

        updateUserButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        updateUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-alterar-24.png"))); // NOI18N
        updateUserButton.setText("Alterar");
        updateUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users.add(updateUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 880, 270, 50));

        bg_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseSemCor.png"))); // NOI18N
        users.add(bg_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 960));

        center.add(users);

        getContentPane().add(center, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1660, 960));

        footer.setBackground(new java.awt.Color(255, 255, 255));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("user login");
        footer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 270, 40));

        logoutButtonFooter.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        logoutButtonFooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-logout-arredondado-para-baixo-24.png"))); // NOI18N
        logoutButtonFooter.setText("Logout");
        footer.add(logoutButtonFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 20, 130, 40));

        exitButtonFooter.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        exitButtonFooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-sair-24.png"))); // NOI18N
        exitButtonFooter.setText("Sair");
        exitButtonFooter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonFooterActionPerformed(evt);
            }
        });
        footer.add(exitButtonFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 20, 130, 40));

        bg_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/footer.png"))); // NOI18N
        bg_footer.setText("jLabel1");
        footer.add(bg_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1980, 120));

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 960, 1980, 130));

        left.setBackground(new java.awt.Color(182, 127, 88));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsPanel.setBackground(new java.awt.Color(182, 127, 88));
        recordsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recordsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseExited(evt);
            }
        });
        recordsPanel.setLayout(null);

        recordLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        recordLabel.setForeground(new java.awt.Color(255, 255, 255));
        recordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordLabel.setText("Relatórios");
        recordsPanel.add(recordLabel);
        recordLabel.setBounds(20, 0, 280, 50);

        left.add(recordsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 320, 50));

        userPanel.setBackground(new java.awt.Color(182, 127, 88));
        userPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseExited(evt);
            }
        });
        userPanel.setLayout(null);

        userLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("Usuários");
        userPanel.add(userLabel);
        userLabel.setBounds(20, 0, 270, 50);

        left.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 320, 50));

        servicePanel.setBackground(new java.awt.Color(182, 127, 88));
        servicePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        servicePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseExited(evt);
            }
        });
        servicePanel.setLayout(null);

        serviceLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        serviceLabel.setForeground(new java.awt.Color(255, 255, 255));
        serviceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serviceLabel.setText("Serviços");
        servicePanel.add(serviceLabel);
        serviceLabel.setBounds(20, 0, 270, 50);

        left.add(servicePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 320, 50));

        clientPanel.setBackground(new java.awt.Color(182, 127, 88));
        clientPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuTeste.this.mouseExited(evt);
            }
        });
        clientPanel.setLayout(null);

        clientLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        clientLabel.setForeground(new java.awt.Color(255, 255, 255));
        clientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientLabel.setText("Clientes");
        clientPanel.add(clientLabel);
        clientLabel.setBounds(30, 0, 250, 50);

        left.add(clientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 320, 50));

        gerenciaTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        gerenciaTxt.setForeground(new java.awt.Color(255, 255, 255));
        gerenciaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciaTxt.setText("Gerenciamento");
        left.add(gerenciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 50));

        getContentPane().add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 320, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_newButtonActionPerformed

    private void servico_cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servico_cbItemStateChanged
        //        this.controller.refreshValue();
    }//GEN-LAST:event_servico_cbItemStateChanged

    private void dataFtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFtfActionPerformed

    private void hora_ftfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora_ftfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hora_ftfActionPerformed

    private void agendar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendar_btActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_agendar_btActionPerformed

    private void cancelButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonAgendaActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_cancelButtonAgendaActionPerformed

    private void exitButtonFooterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonFooterActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_exitButtonFooterActionPerformed

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void homeButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonAgendaActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_homeButtonAgendaActionPerformed

    private void homeButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonUserActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_homeButtonUserActionPerformed

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        if (evt.getSource() == clientPanel) {
            clientPanel.setBackground(new Color(240, 240, 240));
            clientLabel.setForeground(new Color(51, 51, 51));
        } else if (evt.getSource() == servicePanel) {
            servicePanel.setBackground(new Color(240, 240, 240));
            serviceLabel.setForeground(new Color(51, 51, 51));
        } else if (evt.getSource() == userPanel) {
            userPanel.setBackground(new Color(240, 240, 240));
            userLabel.setForeground(new Color(51, 51, 51));
        } else if (evt.getSource() == recordsPanel) {
            recordsPanel.setBackground(new Color(240, 240, 240));
            recordLabel.setForeground(new Color(51, 51, 51));
        }

    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        if (evt.getSource() == clientPanel) {
            clientPanel.setBackground(new Color(182, 127, 88));
            clientLabel.setForeground(new Color(255, 255, 255));
        } else if (evt.getSource() == servicePanel) {
            servicePanel.setBackground(new Color(182, 127, 88));
            serviceLabel.setForeground(new Color(255, 255, 255));
        } else if (evt.getSource() == userPanel) {
            userPanel.setBackground(new Color(182, 127, 88));
            userLabel.setForeground(new Color(255, 255, 255));
        } else if (evt.getSource() == recordsPanel) {
            recordsPanel.setBackground(new Color(182, 127, 88));
            recordLabel.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_mouseExited

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
            controller.visibleView(evt);
    }//GEN-LAST:event_mouseClicked

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
            java.util.logging.Logger.getLogger(MenuTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agenda;
    private javax.swing.JLabel agendamentoTxt;
    private javax.swing.JButton agendar_bt;
    private javax.swing.JLabel bg_footer;
    private javax.swing.JLabel bg_main;
    private javax.swing.JLabel bg_main1;
    private javax.swing.JLabel bg_users;
    private javax.swing.JButton cancelButtonAgenda;
    private javax.swing.JPanel center;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JPanel clientPanel;
    private javax.swing.JComboBox<String> cliente_cb;
    private javax.swing.JLabel cliente_txt;
    private javax.swing.JFormattedTextField dataFtf;
    private javax.swing.JLabel data_txt;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton exitButtonFooter;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel gerenciaTxt;
    private javax.swing.JButton homeButtonAgenda;
    private javax.swing.JButton homeButtonUser;
    private javax.swing.JFormattedTextField hora_ftf;
    private javax.swing.JLabel hora_txt;
    private javax.swing.JTextField id_tf;
    private javax.swing.JLabel id_txt;
    private javax.swing.JLabel id_txt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel left;
    private javax.swing.JScrollPane listUsers;
    private javax.swing.JTable listaCliente_tb;
    private javax.swing.JTable listaCliente_tb1;
    private javax.swing.JButton logoutButtonFooter;
    private javax.swing.JPanel main;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newUserButton;
    private javax.swing.JTextArea observTxtArea;
    private javax.swing.JLabel recordLabel;
    private javax.swing.JPanel recordsPanel;
    private javax.swing.JLabel serviceLabel;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JComboBox<String> servico_cb;
    private javax.swing.JLabel servico_txt;
    private javax.swing.JLabel tittleUsers;
    private javax.swing.JLabel tituloTabelaTxt;
    private javax.swing.JButton updateUserButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel users;
    private javax.swing.JTextField valorTf;
    private javax.swing.JLabel valor_txt;
    // End of variables declaration//GEN-END:variables

    public JPanel getAgenda() {
        return agenda;
    }

    public void setAgenda(JPanel agenda) {
        this.agenda = agenda;
    }

    public JButton getAgendar_bt() {
        return agendar_bt;
    }

    public void setAgendar_bt(JButton agendar_bt) {
        this.agendar_bt = agendar_bt;
    }

    public JButton getCancelButtonAgenda() {
        return cancelButtonAgenda;
    }

    public void setCancelButtonAgenda(JButton cancelButtonAgenda) {
        this.cancelButtonAgenda = cancelButtonAgenda;
    }

    public JComboBox<String> getCliente_cb() {
        return cliente_cb;
    }

    public void setCliente_cb(JComboBox<String> cliente_cb) {
        this.cliente_cb = cliente_cb;
    }

    public JFormattedTextField getDataFtf() {
        return dataFtf;
    }

    public void setDataFtf(JFormattedTextField dataFtf) {
        this.dataFtf = dataFtf;
    }


    public JFormattedTextField getHora_ftf() {
        return hora_ftf;
    }

    public void setHora_ftf(JFormattedTextField hora_ftf) {
        this.hora_ftf = hora_ftf;
    }

    public JTextField getId_tf() {
        return id_tf;
    }

    public void setId_tf(JTextField id_tf) {
        this.id_tf = id_tf;
    }

    public JLabel getId_txt1() {
        return id_txt1;
    }

    public void setId_txt1(JLabel id_txt1) {
        this.id_txt1 = id_txt1;
    }

    public JTable getListaCliente_tb() {
        return listaCliente_tb;
    }

    public void setListaCliente_tb(JTable listaCliente_tb) {
        this.listaCliente_tb = listaCliente_tb;
    }

    public JTable getListaCliente_tb1() {
        return listaCliente_tb1;
    }

    public void setListaCliente_tb1(JTable listaCliente_tb1) {
        this.listaCliente_tb1 = listaCliente_tb1;
    }

    public JPanel getMain() {
        return main;
    }

    public void setMain(JPanel main) {
        this.main = main;
    }

    public JButton getNewButton() {
        return newButton;
    }

    public void setNewButton(JButton newButton) {
        this.newButton = newButton;
    }

    public JTextArea getObservTxtArea() {
        return observTxtArea;
    }

    public void setObservTxtArea(JTextArea observTxtArea) {
        this.observTxtArea = observTxtArea;
    }

    public JComboBox<String> getServico_cb() {
        return servico_cb;
    }

    public void setServico_cb(JComboBox<String> servico_cb) {
        this.servico_cb = servico_cb;
    }

    public JPanel getUsuarios() {
        return users;
    }

    public void setUsuarios(JPanel usuarios) {
        this.users = usuarios;
    }

    public JTextField getValorTf() {
        return valorTf;
    }

    public void setValorTf(JTextField valorTf) {
        this.valorTf = valorTf;
    }

    public JButton getExitButtonFooter() {
        return exitButtonFooter;
    }

    public void setExitButtonFooter(JButton exitButtonFooter) {
        this.exitButtonFooter = exitButtonFooter;
    }

    public JButton getLogoutButtonFooter() {
        return logoutButtonFooter;
    }

    public void setLogoutButtonFooter(JButton logoutButtonFooter) {
        this.logoutButtonFooter = logoutButtonFooter;
    }

    public JButton getHomeButtonAgenda() {
        return homeButtonAgenda;
    }

    public void setHomeButtonAgenda(JButton homeButtonAgenda) {
        this.homeButtonAgenda = homeButtonAgenda;
    }

    public JButton getHomeButtonUser() {
        return homeButtonUser;
    }

    public void setHomeButtonUser(JButton homeButtonUser) {
        this.homeButtonUser = homeButtonUser;
    }

    public JLabel getClientLabel() {
        return clientLabel;
    }

    public void setClientLabel(JLabel clientLabel) {
        this.clientLabel = clientLabel;
    }

    public JPanel getClientPanel() {
        return clientPanel;
    }

    public void setClientPanel(JPanel clientPanel) {
        this.clientPanel = clientPanel;
    }

    public JLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(JLabel userLabel) {
        this.userLabel = userLabel;
    }

    public JPanel getUserPanel() {
        return userPanel;
    }

    public void setUserPanel(JPanel userPanel) {
        this.userPanel = userPanel;
    }

    
}
