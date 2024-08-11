package objects;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.bean.Grupos;
import model.bean.Usuarios;
import model.dao.GruposDAO;
import model.dao.UsuariosDAO;
import raven.toast.Notifications;


public class PanelGrupos extends javax.swing.JPanel {

    List<Grupos> grupoList = new ArrayList();
    List<Usuarios> listUsuarios = new ArrayList();

    public PanelGrupos() {
        initComponents();
        listar(); 
        
        buttonDeleteEntred.setVisible(false);
        fundoPopGrupo.setVisible(false);
        panelPopGrupo.setVisible(false);
        buttonRemove.setVisible(false);
        buttonCancela.setVisible(false);
        
        
        listGrupos.addListSelectionListener(e -> {
            
            if (!e.getValueIsAdjusting()) {
                
                if (!listGrupos.isSelectionEmpty()) {
                    
                    abasGrupo.setSelectedIndex(1);
                    
                    labelDataCriacaoGrupo.setText("Criado em: " + grupoList.get(listGrupos.getSelectedIndex()).getData());
                    labelNomeGrupoInfo.setText("Nome: " + grupoList.get(listGrupos.getSelectedIndex()).getNome());
                    labelDescricaoInfo.setText("Descrição: " + grupoList.get(listGrupos.getSelectedIndex()).getDescricao());
                    labelIdGrupo.setText("ID: " + String.valueOf(grupoList.get(listGrupos.getSelectedIndex()).getId()));
                    
                    listarIntegrantes(grupoList.get(listGrupos.getSelectedIndex()).getId());   
                    
                    buttonRemove.setVisible(false);
                    buttonCancela.setVisible(false);
                    
                }
                
            }
            
        });
        
        listIntegrantes.addListSelectionListener(e -> {
            
            if (e.getValueIsAdjusting()) {
                
                buttonRemove.setVisible(true);
                buttonCancela.setVisible(true);
                
            }
            
        });
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fundoPopGrupo = new javax.swing.JPanel();
        panelPopGrupo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelNomeGrupo = new javax.swing.JLabel();
        buttonCancelaPop = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pannelGradient1 = new objects.PannelGradient();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGrupos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        buttonDeleteExit = new javax.swing.JLabel();
        buttonDeleteEntred = new javax.swing.JLabel();
        buttonAtualizar = new javax.swing.JLabel();
        abasGrupo = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        buttonCriar = new objects.PannelGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listIntegrantes = new javax.swing.JList<>();
        labelNomeGrupoInfo = new javax.swing.JLabel();
        labelDataCriacaoGrupo = new javax.swing.JLabel();
        labelDescricaoInfo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonRemove = new javax.swing.JButton();
        buttonCancela = new javax.swing.JButton();
        labelIdGrupo = new javax.swing.JLabel();
        labelNumeroIntegrantes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoPopGrupo.setOpaque(false);
        fundoPopGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundoPopGrupoMouseClicked(evt);
            }
        });

        panelPopGrupo.setBackground(new java.awt.Color(255, 204, 0));
        panelPopGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Deletar Grupo Selecionado?");

        labelNomeGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNomeGrupo.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeGrupo.setText("Grupo");

        buttonCancelaPop.setText("Cancelar");
        buttonCancelaPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelaPopActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPopGrupoLayout = new javax.swing.GroupLayout(panelPopGrupo);
        panelPopGrupo.setLayout(panelPopGrupoLayout);
        panelPopGrupoLayout.setHorizontalGroup(
            panelPopGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPopGrupoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPopGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPopGrupoLayout.createSequentialGroup()
                        .addComponent(buttonCancelaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPopGrupoLayout.setVerticalGroup(
            panelPopGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPopGrupoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(labelNomeGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelPopGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout fundoPopGrupoLayout = new javax.swing.GroupLayout(fundoPopGrupo);
        fundoPopGrupo.setLayout(fundoPopGrupoLayout);
        fundoPopGrupoLayout.setHorizontalGroup(
            fundoPopGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPopGrupoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPopGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        fundoPopGrupoLayout.setVerticalGroup(
            fundoPopGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPopGrupoLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(panelPopGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jPanel1.add(fundoPopGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 440));

        pannelGradient1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pannelGradient1.setEnd(new java.awt.Color(0, 204, 204));
        pannelGradient1.setStart(new java.awt.Color(102, 51, 255));

        jScrollPane2.setViewportView(listGrupos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Grupos Criados");

        buttonDeleteExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgDeleteExit1000000.png"))); // NOI18N
        buttonDeleteExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDeleteExitMouseEntered(evt);
            }
        });

        buttonDeleteEntred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgDeleteEntred1909090.png"))); // NOI18N
        buttonDeleteEntred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDeleteEntredMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDeleteEntredMouseExited(evt);
            }
        });

        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgBotaoAtualiza (1)2.png"))); // NOI18N
        buttonAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAtualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pannelGradient1Layout = new javax.swing.GroupLayout(pannelGradient1);
        pannelGradient1.setLayout(pannelGradient1Layout);
        pannelGradient1Layout.setHorizontalGroup(
            pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pannelGradient1Layout.createSequentialGroup()
                        .addGroup(pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pannelGradient1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pannelGradient1Layout.createSequentialGroup()
                                .addComponent(buttonAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonDeleteEntred)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDeleteExit)))
                        .addGap(10, 10, 10))))
        );
        pannelGradient1Layout.setVerticalGroup(
            pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAtualizar)
                    .addComponent(buttonDeleteEntred)
                    .addComponent(buttonDeleteExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pannelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 360));

        abasGrupo.setBackground(new java.awt.Color(0, 153, 153));
        abasGrupo.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");

        textSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSenhaFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrição");

        textDescricao.setColumns(20);
        textDescricao.setLineWrap(true);
        textDescricao.setRows(5);
        textDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textDescricaoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(textDescricao);

        buttonCriar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCriar.setStart(new java.awt.Color(0, 204, 204));
        buttonCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCriarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Criar grupo");

        javax.swing.GroupLayout buttonCriarLayout = new javax.swing.GroupLayout(buttonCriar);
        buttonCriar.setLayout(buttonCriarLayout);
        buttonCriarLayout.setHorizontalGroup(
            buttonCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonCriarLayout.setVerticalGroup(
            buttonCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonCriarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do grupo");

        textNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNomeFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar um grupo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(textNome)
                            .addComponent(buttonCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(textSenha))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(buttonCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        abasGrupo.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Informações do Grupo");

        jScrollPane3.setViewportView(listIntegrantes);

        labelNomeGrupoInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNomeGrupoInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeGrupoInfo.setText("Grupo");

        labelDataCriacaoGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDataCriacaoGrupo.setForeground(new java.awt.Color(255, 255, 255));
        labelDataCriacaoGrupo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDataCriacaoGrupo.setText("Data Criação");

        labelDescricaoInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDescricaoInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelDescricaoInfo.setText("Descrição");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Integrantes");

        buttonRemove.setBackground(new java.awt.Color(255, 0, 0));
        buttonRemove.setText("X");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        buttonCancela.setBackground(new java.awt.Color(153, 153, 153));
        buttonCancela.setText("C");
        buttonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelaActionPerformed(evt);
            }
        });

        labelIdGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIdGrupo.setForeground(new java.awt.Color(255, 255, 255));
        labelIdGrupo.setText("ID");

        labelNumeroIntegrantes.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroIntegrantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroIntegrantes.setText("Numero");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelDataCriacaoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelDescricaoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelNomeGrupoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelNumeroIntegrantes))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonRemove, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonCancela, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataCriacaoGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIdGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNomeGrupoInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricaoInfo)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelNumeroIntegrantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancela)))
                .addContainerGap())
        );

        abasGrupo.addTab("tab2", jPanel3);

        jPanel1.add(abasGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 380, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCriarMouseClicked
       
        if (textNome.getText().trim().isEmpty() || textSenha.getText().trim().isEmpty() || textDescricao.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de confirmar!");
            
        } else {
            
            GruposDAO dao = new GruposDAO();
            
            if (!dao.veryGrupo(textNome.getText().trim())) {
                
               Grupos grupo = new Grupos();
            grupo.setNome(textNome.getText().trim());
            grupo.setSenha(textSenha.getText().trim());
            grupo.setDescricao(textDescricao.getText().trim());
            
            dao.criar(grupo);
            JOptionPane.showMessageDialog(null, "Sucesso ao criar grupo!");
            listar();
            
            textNome.setText(null);
            textSenha.setText(null);
            textDescricao.setText(null);
            textNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            textSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Nome de grupo já existe");
                textNome.setBorder(BorderFactory.createLineBorder(Color.red));
                
            }
            

        }
        
    }//GEN-LAST:event_buttonCriarMouseClicked

    private void buttonDeleteExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteExitMouseEntered

       if (!listGrupos.isSelectionEmpty()) {
           
        buttonDeleteExit.setVisible(false);
        buttonDeleteEntred.setVisible(true);   
           
       }   
        
    }//GEN-LAST:event_buttonDeleteExitMouseEntered

    private void buttonDeleteEntredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteEntredMouseExited
       
       if (!panelPopGrupo.isVisible()) {
           
         buttonDeleteExit.setVisible(true);
         buttonDeleteEntred.setVisible(false);  
           
       } 
   
    }//GEN-LAST:event_buttonDeleteEntredMouseExited

    private void buttonAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtualizarMouseClicked
        
        listar();
        abasGrupo.setSelectedIndex(0);
        
    }//GEN-LAST:event_buttonAtualizarMouseClicked

    private void buttonDeleteEntredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteEntredMouseClicked
       
        if (!listGrupos.isSelectionEmpty()) {
            
            buttonCancelaPop.requestFocus();
            fundoPopGrupo.setVisible(true);
            labelNomeGrupo.setText(listGrupos.getSelectedValue());
            panelPopGrupo.setVisible(true);
            
        }
        
        
        
    }//GEN-LAST:event_buttonDeleteEntredMouseClicked

    private void textSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusGained
        
        if (textNome.getText().trim().isEmpty()) {
            
            textNome.setBorder(BorderFactory.createLineBorder(Color.RED));
            textNome.setText("");
            
        } else {
            
            textNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
        }
        
    }//GEN-LAST:event_textSenhaFocusGained

    private void textDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescricaoFocusGained
        
       if (textNome.getText().trim().isEmpty()) {
            
            textNome.setBorder(BorderFactory.createLineBorder(Color.RED));
            textNome.setText("");
            
        } else{
            
            textNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
        } 
       
       if (textSenha.getText().trim().isEmpty()) {
           
           textSenha.setBorder(BorderFactory.createLineBorder(Color.RED));
            textSenha.setText("");
           
       } else {
           
           textSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
           
       }
        
    }//GEN-LAST:event_textDescricaoFocusGained

    private void textNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomeFocusGained
        
        if (!textSenha.getText().trim().isEmpty() && textSenha.getBorder().equals(Color.RED)) {
            
            textSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
        }
        
    }//GEN-LAST:event_textNomeFocusGained

    private void buttonCancelaPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelaPopActionPerformed

        if (buttonDeleteEntred.isVisible()) {
            
            buttonDeleteEntred.setVisible(false);
            buttonDeleteExit.setVisible(true);
            
        }
        
        fundoPopGrupo.setVisible(false);
        panelPopGrupo.setVisible(false);
        
    }//GEN-LAST:event_buttonCancelaPopActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (buttonDeleteEntred.isVisible()) {
            
            buttonDeleteEntred.setVisible(false);
            buttonDeleteExit.setVisible(true);
            
        }
        
        fundoPopGrupo.setVisible(false);
        panelPopGrupo.setVisible(false);
        GruposDAO dao = new GruposDAO();
        dao.deletar(grupoList.get(listGrupos.getSelectedIndex()).getId()); 
        listar();
        abasGrupo.setSelectedIndex(0);
        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Grupo deletado!");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fundoPopGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoPopGrupoMouseClicked
        
        
        
    }//GEN-LAST:event_fundoPopGrupoMouseClicked

    private void buttonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelaActionPerformed
        
        listIntegrantes.clearSelection();
        buttonRemove.setVisible(false);
        buttonCancela.setVisible(false);
        
    }//GEN-LAST:event_buttonCancelaActionPerformed

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        
        if (!listIntegrantes.isSelectionEmpty()) {
            
           GruposDAO dao = new GruposDAO();
           dao.removeGrupo(listUsuarios.get(listIntegrantes.getSelectedIndex()).getId());
           System.out.println(listUsuarios.get(listIntegrantes.getSelectedIndex()).getId());
           listarIntegrantes(grupoList.get(listGrupos.getSelectedIndex()).getId()); 
           
           Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Integrante removido!");
            
        }

    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void listar() {
        
       DefaultListModel model = new DefaultListModel();
       
       if (grupoList.size() > 0){
           
           grupoList.clear();
           
       }
       
       GruposDAO dao = new GruposDAO();      
       grupoList = dao.listar(3, null);
       
       for (int i = 0; i < grupoList.size(); i++) {
           
           model.add(i, grupoList.get(i).getNome());
           
       }
       
       listGrupos.setModel(model);
       
    }
    
    private void listarIntegrantes(int id_grupo) {
        
        DefaultListModel model = new DefaultListModel();
        
        if (listUsuarios.size() > 0) {
            
            listUsuarios.clear();
            
        }
        
        UsuariosDAO dao = new UsuariosDAO();
        listUsuarios = dao.listarUsuarios(id_grupo);
        
        for (int i = 0; i < listUsuarios.size(); i++) {
            
            model.add(i, listUsuarios.get(i).getNome());
            
        }
        
        listIntegrantes.setModel(model);
        labelNumeroIntegrantes.setText("Total: " + String.valueOf(listUsuarios.size()));
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasGrupo;
    private javax.swing.JLabel buttonAtualizar;
    private javax.swing.JButton buttonCancela;
    private javax.swing.JButton buttonCancelaPop;
    private objects.PannelGradient buttonCriar;
    private javax.swing.JLabel buttonDeleteEntred;
    private javax.swing.JLabel buttonDeleteExit;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JPanel fundoPopGrupo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDataCriacaoGrupo;
    private javax.swing.JLabel labelDescricaoInfo;
    private javax.swing.JLabel labelIdGrupo;
    private javax.swing.JLabel labelNomeGrupo;
    private javax.swing.JLabel labelNomeGrupoInfo;
    private javax.swing.JLabel labelNumeroIntegrantes;
    private javax.swing.JList<String> listGrupos;
    private javax.swing.JList<String> listIntegrantes;
    private javax.swing.JPanel panelPopGrupo;
    private objects.PannelGradient pannelGradient1;
    private javax.swing.JTextArea textDescricao;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
