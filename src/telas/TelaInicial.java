package telas;

import java.awt.Color;
import global.Global;
import global.GlobalGrupo;
import global.GlobalVery;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import model.bean.Grupos;
import model.bean.Tarefas;
import model.bean.Usuarios;
import model.dao.GruposDAO;
import model.dao.TarefasDAO;
import model.dao.UsuariosDAO;
import raven.toast.Notifications;


public class TelaInicial extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modeloNomes = new DefaultListModel();
    DefaultListModel modeloGrupos = new DefaultListModel();
    List<Usuarios> list = new ArrayList();
    List<String> list2 = new ArrayList();
    List<Grupos> listGrupos2 = new ArrayList();
    List<Tarefas> tarefa = new ArrayList();
    List<Grupos> grupoList = new ArrayList();
    List<Usuarios> listUsuarios = new ArrayList();
    int id = 0;
    boolean very, very2;
    
    
    public TelaInicial() {
        initComponents();
        inicia();
        buscarGrupo();
        iniciaCriarTarefas();
        iniciarPanelTarefas();
        iniciarPanelGrupos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonFecha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelOla = new javax.swing.JLabel();
        panelTeste = new javax.swing.JPanel();
        abasPannel = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        panelFundo = new objects.PannelGradient();
        panelGrupos = new javax.swing.JPanel();
        panelEntrarGrupo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textIdGrupo = new javax.swing.JTextField();
        buttonEntrar = new objects.PannelGradient();
        jLabel4 = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        labelId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelGrupo1 = new objects.PannelGradient();
        popGrupo = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pannelGradient3 = new objects.PannelGradient();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        popDelete = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        buttonCancelar1 = new javax.swing.JButton();
        buttonDeletar = new javax.swing.JButton();
        labelNomeTarefa = new javax.swing.JLabel();
        fundoPop = new javax.swing.JPanel();
        pannelGradient6 = new objects.PannelGradient();
        labelTitulo = new javax.swing.JLabel();
        labelPrazo = new javax.swing.JLabel();
        labelPostagem = new javax.swing.JLabel();
        labelDescricao1 = new javax.swing.JLabel();
        pannelGradient7 = new objects.PannelGradient();
        labelIntegrantes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaTarefa = new javax.swing.JTextArea();
        pannelGradient8 = new objects.PannelGradient();
        jScrollPane5 = new javax.swing.JScrollPane();
        listTarefas = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        buttonAtualizar = new javax.swing.JLabel();
        buttonDeleteEntered = new javax.swing.JLabel();
        buttonDeleteExit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pannelGradient2 = new objects.PannelGradient();
        jPanel15 = new javax.swing.JPanel();
        fundoPopGrupo = new javax.swing.JPanel();
        panelPopGrupo = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        labelNomeGrupo = new javax.swing.JLabel();
        buttonCancelaPop = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pannelGradient9 = new objects.PannelGradient();
        jScrollPane6 = new javax.swing.JScrollPane();
        listGrupos1 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        buttonDeleteExit1 = new javax.swing.JLabel();
        buttonDeleteEntred = new javax.swing.JLabel();
        buttonAtualizar1 = new javax.swing.JLabel();
        abasGrupo = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        textSenha1 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        textDescricao1 = new javax.swing.JTextArea();
        buttonCriar = new objects.PannelGradient();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listIntegrantes = new javax.swing.JList<>();
        labelNomeGrupoInfo = new javax.swing.JLabel();
        labelDataCriacaoGrupo = new javax.swing.JLabel();
        labelDescricaoInfo = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        buttonRemove = new javax.swing.JButton();
        buttonCancela = new javax.swing.JButton();
        labelIdGrupo = new javax.swing.JLabel();
        labelNumeroIntegrantes = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pannelGradient4 = new objects.PannelGradient();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        textTitulo = new javax.swing.JTextField();
        textDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textIntegrantes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        scrollList = new javax.swing.JScrollPane();
        listNomes = new javax.swing.JList<>();
        labelTarefa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textTarefa = new javax.swing.JTextArea();
        labelTarefa1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listNomes2 = new javax.swing.JList<>();
        labelTarefa2 = new javax.swing.JLabel();
        buttonConfirmar = new objects.PannelGradient();
        jLabel13 = new javax.swing.JLabel();
        radioLivre = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listGrupos = new javax.swing.JList<>();
        labelTarefa3 = new javax.swing.JLabel();
        textGrupo = new javax.swing.JTextField();
        labelGrupo = new javax.swing.JLabel();
        textPrazo = new javax.swing.JTextField();
        checkPrazo = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        pannelGradient5 = new objects.PannelGradient();
        jPanel11 = new javax.swing.JPanel();
        panelPopPerfil = new javax.swing.JPanel();
        buttonFechaPop = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        editSenhaPerfil = new javax.swing.JPasswordField();
        buttonConfirma = new javax.swing.JButton();
        labelEndereco = new javax.swing.JLabel();
        editEndereco = new javax.swing.JTextField();
        buttonEditEndereco = new javax.swing.JLabel();
        buttonEditUsuario = new javax.swing.JLabel();
        editUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelNome2 = new javax.swing.JLabel();
        editNome = new javax.swing.JTextField();
        buttonEditNome = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        buttonEditSenha = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        editSenha = new javax.swing.JPasswordField();
        pannelGradient1 = new objects.PannelGradient();
        btn4 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fundoPerfil1 = new objects.FundoPerfil();
        jLabel10 = new javax.swing.JLabel();
        labelPerfilUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonFecha.setBackground(new java.awt.Color(255, 0, 0));
        buttonFecha.setText("X");
        buttonFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFechaMouseExited(evt);
            }
        });
        buttonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 47, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerencix");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, -1));

        labelOla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelOla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOla.setText("Bem vindo(a)");
        jPanel2.add(labelOla, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 11, 1170, 38));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        panelTeste.setBackground(new java.awt.Color(255, 255, 255));

        abasPannel.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        panelFundo.setEnd(new java.awt.Color(204, 0, 102));
        panelFundo.setStart(new java.awt.Color(0, 0, 153));
        panelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGrupos.setBackground(new java.awt.Color(255, 255, 255));
        panelGrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelEntrarGrupo.setBackground(new java.awt.Color(0, 204, 153));
        panelEntrarGrupo.setPreferredSize(new java.awt.Dimension(260, 438));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Entre em algum grupo");

        textIdGrupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textIdGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textIdGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textIdGrupoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIdGrupoFocusLost(evt);
            }
        });
        textIdGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdGrupoActionPerformed(evt);
            }
        });
        textIdGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textIdGrupoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdGrupoKeyTyped(evt);
            }
        });

        buttonEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEntrar.setEnd(new java.awt.Color(102, 204, 255));
        buttonEntrar.setStart(new java.awt.Color(51, 153, 255));
        buttonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEntrarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Entrar");

        javax.swing.GroupLayout buttonEntrarLayout = new javax.swing.GroupLayout(buttonEntrar);
        buttonEntrar.setLayout(buttonEntrarLayout);
        buttonEntrarLayout.setHorizontalGroup(
            buttonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonEntrarLayout.setVerticalGroup(
            buttonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonEntrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        textSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSenhaFocusGained(evt);
            }
        });
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSenhaKeyPressed(evt);
            }
        });

        labelId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelId.setText("Id do grupo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Senha");

        javax.swing.GroupLayout panelEntrarGrupoLayout = new javax.swing.GroupLayout(panelEntrarGrupo);
        panelEntrarGrupo.setLayout(panelEntrarGrupoLayout);
        panelEntrarGrupoLayout.setHorizontalGroup(
            panelEntrarGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntrarGrupoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelEntrarGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textSenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textIdGrupo)
                    .addComponent(labelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        panelEntrarGrupoLayout.setVerticalGroup(
            panelEntrarGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntrarGrupoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(labelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textIdGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGrupo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelGrupo1.setEnd(new java.awt.Color(0, 102, 102));
        panelGrupo1.setStart(new java.awt.Color(0, 102, 102));
        panelGrupo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        popGrupo.setBackground(new java.awt.Color(255, 255, 255));
        popGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        popGrupo.setPreferredSize(new java.awt.Dimension(200, 80));

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sair do grupo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout popGrupoLayout = new javax.swing.GroupLayout(popGrupo);
        popGrupo.setLayout(popGrupoLayout);
        popGrupoLayout.setHorizontalGroup(
            popGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        popGrupoLayout.setVerticalGroup(
            popGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popGrupoLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelGrupo1.add(popGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 70));

        labelNome.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNome.setText("Grupo");
        panelGrupo1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, 238, -1));

        labelDescricao.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescricao.setText("Descrição do Grupo");
        panelGrupo1.add(labelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 92, 238, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText(":");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panelGrupo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        javax.swing.GroupLayout panelGruposLayout = new javax.swing.GroupLayout(panelGrupos);
        panelGrupos.setLayout(panelGruposLayout);
        panelGruposLayout.setHorizontalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGruposLayout.createSequentialGroup()
                .addComponent(panelGrupo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEntrarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelGruposLayout.setVerticalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEntrarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addComponent(panelGrupo1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFundo.add(panelGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 270, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(panelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasPannel.addTab("tab2", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        pannelGradient3.setEnd(new java.awt.Color(255, 204, 0));
        pannelGradient3.setStart(new java.awt.Color(204, 0, 204));

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));
        jPanel13.setPreferredSize(new java.awt.Dimension(800, 440));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 773, -1));

        popDelete.setBackground(new java.awt.Color(0, 153, 153));
        popDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Deletar Tarefa Selecionada?");

        buttonCancelar1.setText("Cancelar");
        buttonCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelar1MouseClicked(evt);
            }
        });

        buttonDeletar.setBackground(new java.awt.Color(255, 0, 0));
        buttonDeletar.setForeground(new java.awt.Color(255, 255, 255));
        buttonDeletar.setText("Deletar");
        buttonDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDeletarMouseClicked(evt);
            }
        });

        labelNomeTarefa.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeTarefa.setText("Tarefa");

        javax.swing.GroupLayout popDeleteLayout = new javax.swing.GroupLayout(popDelete);
        popDelete.setLayout(popDeleteLayout);
        popDeleteLayout.setHorizontalGroup(
            popDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popDeleteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(buttonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(popDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        popDeleteLayout.setVerticalGroup(
            popDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popDeleteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(labelNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(popDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel13.add(popDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 260, 160));

        fundoPop.setOpaque(false);
        fundoPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundoPopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fundoPopLayout = new javax.swing.GroupLayout(fundoPop);
        fundoPop.setLayout(fundoPopLayout);
        fundoPopLayout.setHorizontalGroup(
            fundoPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        fundoPopLayout.setVerticalGroup(
            fundoPopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel13.add(fundoPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        pannelGradient6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pannelGradient6.setEnd(new java.awt.Color(153, 0, 153));
        pannelGradient6.setStart(new java.awt.Color(0, 204, 204));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Titulo");

        labelPrazo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPrazo.setForeground(new java.awt.Color(255, 255, 0));
        labelPrazo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPrazo.setText("Prazo");

        labelPostagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPostagem.setForeground(new java.awt.Color(255, 255, 255));
        labelPostagem.setText("Postagem");

        labelDescricao1.setForeground(new java.awt.Color(255, 255, 255));
        labelDescricao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescricao1.setText("Descrição");

        javax.swing.GroupLayout pannelGradient6Layout = new javax.swing.GroupLayout(pannelGradient6);
        pannelGradient6.setLayout(pannelGradient6Layout);
        pannelGradient6Layout.setHorizontalGroup(
            pannelGradient6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pannelGradient6Layout.createSequentialGroup()
                        .addComponent(labelPostagem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pannelGradient6Layout.setVerticalGroup(
            pannelGradient6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pannelGradient6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricao1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel13.add(pannelGradient6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 380, 150));

        pannelGradient7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pannelGradient7.setEnd(new java.awt.Color(0, 102, 255));
        pannelGradient7.setStart(new java.awt.Color(153, 0, 153));

        labelIntegrantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIntegrantes.setForeground(new java.awt.Color(255, 255, 255));
        labelIntegrantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIntegrantes.setText("Integrantes");

        areaTarefa.setEditable(false);
        areaTarefa.setColumns(20);
        areaTarefa.setLineWrap(true);
        areaTarefa.setRows(5);
        areaTarefa.setText("Tarefa");
        jScrollPane4.setViewportView(areaTarefa);

        javax.swing.GroupLayout pannelGradient7Layout = new javax.swing.GroupLayout(pannelGradient7);
        pannelGradient7.setLayout(pannelGradient7Layout);
        pannelGradient7Layout.setHorizontalGroup(
            pannelGradient7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        pannelGradient7Layout.setVerticalGroup(
            pannelGradient7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.add(pannelGradient7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 380, 240));

        pannelGradient8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        pannelGradient8.setEnd(new java.awt.Color(255, 255, 255));
        pannelGradient8.setStart(new java.awt.Color(0, 153, 204));

        listTarefas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setViewportView(listTarefas);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tarefas");

        buttonAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        buttonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgBotaoAtualiza (1)2.png"))); // NOI18N
        buttonAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAtualizarMouseClicked(evt);
            }
        });

        buttonDeleteEntered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgDeleteEntred1909090.png"))); // NOI18N
        buttonDeleteEntered.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDeleteEnteredMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDeleteEnteredMouseExited(evt);
            }
        });

        buttonDeleteExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgDeleteExit1000000.png"))); // NOI18N
        buttonDeleteExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDeleteExitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pannelGradient8Layout = new javax.swing.GroupLayout(pannelGradient8);
        pannelGradient8.setLayout(pannelGradient8Layout);
        pannelGradient8Layout.setHorizontalGroup(
            pannelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelGradient8Layout.createSequentialGroup()
                        .addComponent(buttonAtualizar)
                        .addGap(256, 256, 256)
                        .addComponent(buttonDeleteEntered, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(buttonDeleteExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(pannelGradient8Layout.createSequentialGroup()
                        .addGroup(pannelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pannelGradient8Layout.setVerticalGroup(
            pannelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelGradient8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDeleteExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDeleteEntered, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.add(pannelGradient8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 400));

        javax.swing.GroupLayout pannelGradient3Layout = new javax.swing.GroupLayout(pannelGradient3);
        pannelGradient3.setLayout(pannelGradient3Layout);
        pannelGradient3Layout.setHorizontalGroup(
            pannelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(pannelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelGradient3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pannelGradient3Layout.setVerticalGroup(
            pannelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(pannelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelGradient3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(pannelGradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelGradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasPannel.addTab("tab2", jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        pannelGradient2.setEnd(new java.awt.Color(102, 0, 204));
        pannelGradient2.setStart(new java.awt.Color(0, 153, 153));
        pannelGradient2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(0, 153, 153));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoPopGrupo.setOpaque(false);
        fundoPopGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundoPopGrupoMouseClicked(evt);
            }
        });

        panelPopGrupo.setBackground(new java.awt.Color(255, 204, 0));
        panelPopGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Deletar Grupo Selecionado?");

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
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jLabel17)
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

        jPanel15.add(fundoPopGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        pannelGradient9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pannelGradient9.setEnd(new java.awt.Color(0, 204, 204));
        pannelGradient9.setStart(new java.awt.Color(102, 51, 255));

        jScrollPane6.setViewportView(listGrupos1);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Grupos Criados");

        buttonDeleteExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgDeleteExit1000000.png"))); // NOI18N
        buttonDeleteExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDeleteExit1MouseEntered(evt);
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

        buttonAtualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/imgBotaoAtualiza (1)2.png"))); // NOI18N
        buttonAtualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAtualizar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pannelGradient9Layout = new javax.swing.GroupLayout(pannelGradient9);
        pannelGradient9.setLayout(pannelGradient9Layout);
        pannelGradient9Layout.setHorizontalGroup(
            pannelGradient9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelGradient9Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pannelGradient9Layout.createSequentialGroup()
                        .addGroup(pannelGradient9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pannelGradient9Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pannelGradient9Layout.createSequentialGroup()
                                .addComponent(buttonAtualizar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonDeleteEntred)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDeleteExit1)))
                        .addGap(10, 10, 10))))
        );
        pannelGradient9Layout.setVerticalGroup(
            pannelGradient9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelGradient9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelGradient9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAtualizar1)
                    .addComponent(buttonDeleteEntred)
                    .addComponent(buttonDeleteExit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(pannelGradient9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 360));

        abasGrupo.setBackground(new java.awt.Color(0, 153, 153));
        abasGrupo.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel16.setBackground(new java.awt.Color(0, 153, 153));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Senha");

        textSenha1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSenha1FocusGained(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Descrição");

        textDescricao1.setColumns(20);
        textDescricao1.setLineWrap(true);
        textDescricao1.setRows(5);
        textDescricao1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textDescricao1FocusGained(evt);
            }
        });
        jScrollPane7.setViewportView(textDescricao1);

        buttonCriar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCriar.setStart(new java.awt.Color(0, 204, 204));
        buttonCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCriarMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Criar grupo");

        javax.swing.GroupLayout buttonCriarLayout = new javax.swing.GroupLayout(buttonCriar);
        buttonCriar.setLayout(buttonCriarLayout);
        buttonCriarLayout.setHorizontalGroup(
            buttonCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonCriarLayout.setVerticalGroup(
            buttonCriarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonCriarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nome do grupo");

        textNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNomeFocusGained(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Criar um grupo");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(textNome)
                            .addComponent(buttonCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(textSenha1))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addGap(5, 5, 5)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(buttonCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        abasGrupo.addTab("tab1", jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 153, 153));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Informações do Grupo");

        jScrollPane8.setViewportView(listIntegrantes);

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

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Integrantes");

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

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelDataCriacaoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(labelDescricaoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(labelNomeGrupoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelNumeroIntegrantes))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonRemove, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonCancela, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataCriacaoGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIdGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNomeGrupoInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescricaoInfo)
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(labelNumeroIntegrantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(buttonRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCancela)))
                .addContainerGap())
        );

        abasGrupo.addTab("tab2", jPanel17);

        jPanel15.add(abasGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 380, 370));

        pannelGradient2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 760, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pannelGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasPannel.addTab("tab3", jPanel3);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        pannelGradient4.setEnd(new java.awt.Color(0, 153, 153));
        pannelGradient4.setStart(new java.awt.Color(0, 153, 51));

        jPanel12.setBackground(new java.awt.Color(0, 204, 102));
        jPanel12.setPreferredSize(new java.awt.Dimension(800, 435));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textTituloFocusGained(evt);
            }
        });
        textTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTituloKeyPressed(evt);
            }
        });
        jPanel12.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 259, 28));

        textDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textDescricaoFocusGained(evt);
            }
        });
        textDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDescricaoKeyPressed(evt);
            }
        });
        jPanel12.add(textDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 259, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descrição");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 86, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Titulo");
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, -1));

        textIntegrantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textIntegrantesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textIntegrantesFocusLost(evt);
            }
        });
        textIntegrantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textIntegrantesMousePressed(evt);
            }
        });
        textIntegrantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIntegrantesKeyTyped(evt);
            }
        });
        jPanel12.add(textIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 259, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Integrantes");
        jPanel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 115, -1));

        listNomes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listNomesFocusLost(evt);
            }
        });
        scrollList.setViewportView(listNomes);

        jPanel12.add(scrollList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 306, 259, 60));

        labelTarefa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTarefa.setForeground(new java.awt.Color(255, 255, 255));
        labelTarefa.setText("Grupo");
        jPanel12.add(labelTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(164, 94));

        textTarefa.setColumns(20);
        textTarefa.setLineWrap(true);
        textTarefa.setRows(5);
        jScrollPane1.setViewportView(textTarefa);

        jPanel12.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 210, 280));

        labelTarefa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTarefa1.setForeground(new java.awt.Color(255, 255, 255));
        labelTarefa1.setText("Prazo");
        jPanel12.add(labelTarefa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        listNomes2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listNomes2FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(listNomes2);

        jPanel12.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 195, 180));

        labelTarefa2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTarefa2.setForeground(new java.awt.Color(255, 255, 255));
        labelTarefa2.setText("Nomes");
        jPanel12.add(labelTarefa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        buttonConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonConfirmar.setEnd(new java.awt.Color(51, 153, 255));
        buttonConfirmar.setStart(new java.awt.Color(102, 102, 255));
        buttonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonConfirmarMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Salvar");

        javax.swing.GroupLayout buttonConfirmarLayout = new javax.swing.GroupLayout(buttonConfirmar);
        buttonConfirmar.setLayout(buttonConfirmarLayout);
        buttonConfirmarLayout.setHorizontalGroup(
            buttonConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        buttonConfirmarLayout.setVerticalGroup(
            buttonConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.add(buttonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 280, 40));

        radioLivre.setText("Deixar Livre");
        radioLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLivreActionPerformed(evt);
            }
        });
        jPanel12.add(radioLivre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jScrollPane3.setViewportView(listGrupos);

        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        labelTarefa3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTarefa3.setForeground(new java.awt.Color(255, 255, 255));
        labelTarefa3.setText("Tarefa");
        jPanel12.add(labelTarefa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 116, -1));

        textGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textGrupoKeyTyped(evt);
            }
        });
        jPanel12.add(textGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        labelGrupo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrupo.setText("Grupo");
        jPanel12.add(labelGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 250, -1));

        textPrazo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPrazoFocusLost(evt);
            }
        });
        textPrazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textPrazoKeyTyped(evt);
            }
        });
        jPanel12.add(textPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 150, 30));

        checkPrazo.setText("Sem Prazo");
        jPanel12.add(checkPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 100, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Dia(s)");
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 40, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout pannelGradient4Layout = new javax.swing.GroupLayout(pannelGradient4);
        pannelGradient4.setLayout(pannelGradient4Layout);
        pannelGradient4Layout.setHorizontalGroup(
            pannelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(pannelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelGradient4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pannelGradient4Layout.setVerticalGroup(
            pannelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(pannelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelGradient4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(pannelGradient4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelGradient4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasPannel.addTab("tab4", jPanel7);

        pannelGradient5.setEnd(new java.awt.Color(0, 153, 153));
        pannelGradient5.setStart(new java.awt.Color(102, 102, 102));

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPopPerfil.setBackground(new java.awt.Color(0, 102, 204));

        buttonFechaPop.setBackground(new java.awt.Color(255, 0, 0));
        buttonFechaPop.setText("X");
        buttonFechaPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFechaPopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFechaPopMouseExited(evt);
            }
        });
        buttonFechaPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechaPopActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Antes confirme sua senha:");

        editSenhaPerfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editSenhaPerfilKeyPressed(evt);
            }
        });

        buttonConfirma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonConfirma.setText("Confirmar");
        buttonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPopPerfilLayout = new javax.swing.GroupLayout(panelPopPerfil);
        panelPopPerfil.setLayout(panelPopPerfilLayout);
        panelPopPerfilLayout.setHorizontalGroup(
            panelPopPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPopPerfilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonFechaPop))
            .addGroup(panelPopPerfilLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelPopPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(editSenhaPerfil)
                    .addComponent(buttonConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelPopPerfilLayout.setVerticalGroup(
            panelPopPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPopPerfilLayout.createSequentialGroup()
                .addComponent(buttonFechaPop)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(editSenhaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(buttonConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel11.add(panelPopPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelEndereco.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        labelEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEndereco.setText("Endereço:");
        jPanel11.add(labelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 23));

        editEndereco.setEditable(false);
        editEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editEndereco.setText("Endereço");
        editEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel11.add(editEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 30));

        buttonEditEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/iconEdit2.png"))); // NOI18N
        buttonEditEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditEnderecoMouseClicked(evt);
            }
        });
        jPanel11.add(buttonEditEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 30));

        buttonEditUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/iconEdit2.png"))); // NOI18N
        buttonEditUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditUsuarioMouseClicked(evt);
            }
        });
        jPanel11.add(buttonEditUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 30));

        editUsuario.setEditable(false);
        editUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editUsuario.setText("Usuario");
        editUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel11.add(editUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 30));

        labelUsuario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Nome de usuário:");
        jPanel11.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 190, 23));

        labelNome2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelNome2.setForeground(new java.awt.Color(255, 255, 255));
        labelNome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNome2.setText("Nome:");
        jPanel11.add(labelNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 190, 23));

        editNome.setEditable(false);
        editNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editNome.setText("Nome");
        editNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel11.add(editNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, 30));

        buttonEditNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/iconEdit2.png"))); // NOI18N
        buttonEditNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditNomeMouseClicked(evt);
            }
        });
        jPanel11.add(buttonEditNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 30));

        labelSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSenha.setText("Senha:");
        jPanel11.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 190, 23));

        buttonEditSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/iconEdit2.png"))); // NOI18N
        buttonEditSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditSenhaMouseClicked(evt);
            }
        });
        jPanel11.add(buttonEditSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, 30));

        buttonSalvar.setBackground(new java.awt.Color(0, 204, 204));
        buttonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSalvar.setText("Salvar alterações");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel11.add(buttonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, -1));

        buttonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(0, 255, 255));
        buttonCancelar.setText("Cancelar Alterações");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel11.add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 150, -1));

        editSenha.setEditable(false);
        editSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editSenha.setText("kokokoko");
        jPanel11.add(editSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 190, 30));

        javax.swing.GroupLayout pannelGradient5Layout = new javax.swing.GroupLayout(pannelGradient5);
        pannelGradient5.setLayout(pannelGradient5Layout);
        pannelGradient5Layout.setHorizontalGroup(
            pannelGradient5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelGradient5Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(271, 271, 271))
        );
        pannelGradient5Layout.setVerticalGroup(
            pannelGradient5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelGradient5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(pannelGradient5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelGradient5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasPannel.addTab("tab5", jPanel9);

        javax.swing.GroupLayout panelTesteLayout = new javax.swing.GroupLayout(panelTeste);
        panelTeste.setLayout(panelTesteLayout);
        panelTesteLayout.setHorizontalGroup(
            panelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTesteLayout.createSequentialGroup()
                .addComponent(abasPannel)
                .addContainerGap())
        );
        panelTesteLayout.setVerticalGroup(
            panelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abasPannel)
        );

        jPanel1.add(panelTeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 900, 490));

        pannelGradient1.setEnd(new java.awt.Color(51, 51, 51));
        pannelGradient1.setStart(new java.awt.Color(51, 51, 51));

        btn4.setBackground(new java.awt.Color(153, 153, 153));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        label4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Criar Tarefa");

        javax.swing.GroupLayout btn4Layout = new javax.swing.GroupLayout(btn4);
        btn4.setLayout(btn4Layout);
        btn4Layout.setHorizontalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn4Layout.setVerticalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        btn1.setBackground(new java.awt.Color(0, 204, 204));
        btn1.setPreferredSize(new java.awt.Dimension(200, 39));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Início");

        javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
        btn1.setLayout(btn1Layout);
        btn1Layout.setHorizontalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn1Layout.setVerticalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        btn3.setBackground(new java.awt.Color(153, 153, 153));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Grupos");

        javax.swing.GroupLayout btn3Layout = new javax.swing.GroupLayout(btn3);
        btn3.setLayout(btn3Layout);
        btn3Layout.setHorizontalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn3Layout.setVerticalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        btn2.setBackground(new java.awt.Color(153, 153, 153));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Tarefas");

        javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
        btn2.setLayout(btn2Layout);
        btn2Layout.setHorizontalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        btn2Layout.setVerticalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        buttonLogout.setBackground(new java.awt.Color(102, 102, 102));
        buttonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Logout");

        javax.swing.GroupLayout buttonLogoutLayout = new javax.swing.GroupLayout(buttonLogout);
        buttonLogout.setLayout(buttonLogoutLayout);
        buttonLogoutLayout.setHorizontalGroup(
            buttonLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buttonLogoutLayout.setVerticalGroup(
            buttonLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        fundoPerfil1.setBackground(new java.awt.Color(51, 51, 51));
        fundoPerfil1.setaEnd(new java.awt.Color(51, 153, 255));
        fundoPerfil1.setaStart(new java.awt.Color(153, 0, 153));
        fundoPerfil1.setPreferredSize(new java.awt.Dimension(52, 52));
        fundoPerfil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundoPerfil1MouseClicked(evt);
            }
        });
        fundoPerfil1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/account_profile_user_icon_190494.png"))); // NOI18N
        fundoPerfil1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelPerfilUsuario.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        labelPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelPerfilUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPerfilUsuario.setText("Usuario");

        javax.swing.GroupLayout pannelGradient1Layout = new javax.swing.GroupLayout(pannelGradient1);
        pannelGradient1.setLayout(pannelGradient1Layout);
        pannelGradient1Layout.setHorizontalGroup(
            pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pannelGradient1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelGradient1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fundoPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        pannelGradient1Layout.setVerticalGroup(
            pannelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelGradient1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(fundoPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPerfilUsuario)
                .addGap(40, 40, 40)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pannelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechaActionPerformed
        dispose();
    }//GEN-LAST:event_buttonFechaActionPerformed

    private void buttonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                dispose();
                new TelaLogin().setVisible(true);
            }

        });

    }//GEN-LAST:event_buttonLogoutMouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        trocaBack(1);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        trocaBack(2);
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        trocaBack(3);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        trocaBack(4);
    }//GEN-LAST:event_btn4MouseClicked

    private void textIdGrupoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdGrupoFocusGained

    }//GEN-LAST:event_textIdGrupoFocusGained

    private void textIdGrupoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIdGrupoFocusLost

    }//GEN-LAST:event_textIdGrupoFocusLost

    private void textIdGrupoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdGrupoKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

            acaoButton();
        }

    }//GEN-LAST:event_textIdGrupoKeyPressed

    private void buttonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEntrarMouseClicked
        acaoButton();
    }//GEN-LAST:event_buttonEntrarMouseClicked

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

            acaoButton();
        }

    }//GEN-LAST:event_textSenhaKeyPressed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked

        UsuariosDAO dao = new UsuariosDAO();
        dao.sairGrupo();
        popGrupo.setVisible(false);
        panelGrupo1.setVisible(false);
        textIdGrupo.setText("");
        textSenha.setText("");
        panelEntrarGrupo.setVisible(true);
        GlobalGrupo.setId(0);
        JOptionPane.showMessageDialog(null, "Você saiu do grupo!");
        

    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        if (!popGrupo.isVisible()) {

            popGrupo.setVisible(true);

        } else {

            popGrupo.setVisible(false);

        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void textIdGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdGrupoActionPerformed

    }//GEN-LAST:event_textIdGrupoActionPerformed

    private void textSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusGained
        
        if (textIdGrupo.getText().trim().isEmpty()) {
            
            textIdGrupo.setBorder(BorderFactory.createLineBorder(Color.RED));
            textIdGrupo.setText("");
            
        } else {
            
            textIdGrupo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
        }
        
    }//GEN-LAST:event_textSenhaFocusGained

    private void buttonFechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFechaMouseEntered
        
        buttonFecha.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_buttonFechaMouseEntered

    private void buttonFechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFechaMouseExited
        
        buttonFecha.setBackground(Color.red);
        
    }//GEN-LAST:event_buttonFechaMouseExited

    private void fundoPerfil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoPerfil1MouseClicked
      
        btn1.setBackground(new Color(153, 153, 153));
        btn2.setBackground(new Color(153, 153, 153));
        btn3.setBackground(new Color(153, 153, 153));
        btn4.setBackground(new Color(153, 153, 153));

        label1.setForeground(Color.black);
        label2.setForeground(Color.black);
        label3.setForeground(Color.black);
        label4.setForeground(Color.black);
        
        fundoPerfil1.setaFundo(Color.white);
        fundoPerfil1.repaint();
        
        panelPopPerfil.setVisible(false);
        abasPannel.setSelectedIndex(4);
        
    }//GEN-LAST:event_fundoPerfil1MouseClicked

    private void buttonEditEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditEnderecoMouseClicked
        
        veryPop(2);
        
    }//GEN-LAST:event_buttonEditEnderecoMouseClicked

    private void buttonEditUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditUsuarioMouseClicked

        veryPop(1);
    }//GEN-LAST:event_buttonEditUsuarioMouseClicked

    private void buttonEditNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditNomeMouseClicked
        
        veryPop(3);
        
    }//GEN-LAST:event_buttonEditNomeMouseClicked

    private void buttonEditSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditSenhaMouseClicked
        
        veryPop(4);
        
    }//GEN-LAST:event_buttonEditSenhaMouseClicked

    private void buttonFechaPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechaPopActionPerformed
        
        panelPopPerfil.setVisible(false);
        
    }//GEN-LAST:event_buttonFechaPopActionPerformed

    private void buttonFechaPopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFechaPopMouseEntered
       
        buttonFechaPop.setBackground(Color.white);
        
    }//GEN-LAST:event_buttonFechaPopMouseEntered

    private void buttonFechaPopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFechaPopMouseExited
        
        buttonFechaPop.setBackground(Color.red);
        
    }//GEN-LAST:event_buttonFechaPopMouseExited

    private void buttonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmaActionPerformed
        
       if (!editSenhaPerfil.getText().equals(Global.getSenha())) {
           
           Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_CENTER, "Senha não coincide!");
           
       } else {
           
           GlobalVery.setPopVery(true);
           panelPopPerfil.setVisible(false);
           buttonSalvar.setVisible(true);
           buttonCancelar.setVisible(true);
           
           Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Senha confirmada!");
           
       }
        
    }//GEN-LAST:event_buttonConfirmaActionPerformed

    private void editSenhaPerfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editSenhaPerfilKeyPressed
        
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            
            buttonConfirma.doClick();
            
        }
        
    }//GEN-LAST:event_editSenhaPerfilKeyPressed

    private void buttonLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseEntered
        
        buttonLogout.setBackground(Color.red);
        
    }//GEN-LAST:event_buttonLogoutMouseEntered

    private void buttonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseExited
        
        buttonLogout.setBackground(new Color(102,102,102));
        
    }//GEN-LAST:event_buttonLogoutMouseExited

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
      
        String senha = editSenha.getText().trim();
        
        if (editUsuario.getText().trim().equals(Global.getUser()) && editEndereco.getText().trim().equals(Global.getEndereco()) && editNome.getText().trim().equals(Global.getNome()) && senha.equals(Global.getSenha())) {
            
            Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_CENTER, "Nenhuma alteração feita!");
            
        } else {
            
        UsuariosDAO dao = new UsuariosDAO();
        Usuarios usuario = new Usuarios();
        
        usuario.setUser(editUsuario.getText().trim());
        usuario.setEndereco(editEndereco.getText().trim());
        usuario.setNome(editNome.getText().trim());
        usuario.setSenha(senha);
        
        Global.setUser(editUsuario.getText().trim());
        Global.setEndereco(editEndereco.getText().trim());
        Global.setNome(editNome.getText().trim());
        Global.setSenha(senha);
        
        dao.atualizar(usuario);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                dispose();
                new TelaInicial().setVisible(true);
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Alterações salvas com sucesso!");
                
            }
   
        });
            
        }
 
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        
        editUsuario.setText(Global.getUser());
        editEndereco.setText(Global.getEndereco());
        editNome.setText(Global.getNome());
        editSenha.setText(Global.getSenha());
        
        Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.BOTTOM_CENTER, "Alterações resetadas");
        
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textIdGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdGrupoKeyTyped
        
        String num = "1234567890";
        
        if (!num.contains(evt.getKeyChar() + "")) {
            
            evt.consume();
            
        }
        
    }//GEN-LAST:event_textIdGrupoKeyTyped

    private void textTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textTituloFocusGained

    }//GEN-LAST:event_textTituloFocusGained

    private void textTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTituloKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

            textDescricao.requestFocus();

        }
    }//GEN-LAST:event_textTituloKeyPressed

    private void textDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescricaoFocusGained

    }//GEN-LAST:event_textDescricaoFocusGained

    private void textDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDescricaoKeyPressed

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

            textIntegrantes.requestFocus();

        }
    }//GEN-LAST:event_textDescricaoKeyPressed

    private void textIntegrantesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIntegrantesFocusGained

    }//GEN-LAST:event_textIntegrantesFocusGained

    private void textIntegrantesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIntegrantesFocusLost

    }//GEN-LAST:event_textIntegrantesFocusLost

    private void textIntegrantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textIntegrantesMousePressed

    }//GEN-LAST:event_textIntegrantesMousePressed

    private void textIntegrantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIntegrantesKeyTyped

        if (!listGrupos.isSelectionEmpty() || !labelGrupo.getText().isEmpty()) {

            select();

        } else {

            JOptionPane.showMessageDialog(null, "Nenhum grupo selecionado");

        }

    }//GEN-LAST:event_textIntegrantesKeyTyped

    private void listNomesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listNomesFocusLost

    }//GEN-LAST:event_listNomesFocusLost

    private void listNomes2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listNomes2FocusLost
        listNomes2.setModel(modeloNomes);
    }//GEN-LAST:event_listNomes2FocusLost

    private void buttonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonConfirmarMouseClicked

        if (textTitulo.getText().trim().isEmpty() || textDescricao.getText().trim().isEmpty() || textTarefa.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de salvar a tarefa!");

        } else if (!radioLivre.isSelected() && modeloNomes.getSize() == 0) {

            JOptionPane.showMessageDialog(null, "Selecione algum integrante / Deixe livre");

        } else if (textPrazo.getText().isEmpty() && !checkPrazo.isSelected()) {

            JOptionPane.showMessageDialog(null, "Indique o prazo");

        } else if (labelGrupo.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Selecione um grupo");

        } else {

            int prazo = 0;

            if (!checkPrazo.isSelected()) {

                prazo = Integer.parseInt(textPrazo.getText());

            }

            LocalDate dataInicial = LocalDate.now();
            LocalDate dataFinal = dataInicial.plusDays(prazo);

            Tarefas tarefa = new Tarefas();

            tarefa.setTitulo(textTitulo.getText());
            tarefa.setDescricao(textDescricao.getText());
            tarefa.setTarefa(textTarefa.getText());
            tarefa.setGrupo(labelGrupo.getText());
            tarefa.setPostagem(Date.valueOf(dataInicial));
            tarefa.setPrazo(Date.valueOf(dataFinal));

            if (radioLivre.isSelected()) {

                tarefa.setColaboradores("Livre");

            } else {

                String integrantes = modeloNomes.toString();
                tarefa.setColaboradores(integrantes);

            }

            tarefa.setFk_id_grupo(id);
            tarefa.setFk_id_usuario(Global.getId());

            TarefasDAO dao = new TarefasDAO();
            dao.salvar(tarefa);
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Tarefa salva!");
            listar();

            textGrupo.setText("");
            labelGrupo.setText("");
            textTitulo.setText("");
            textDescricao.setText("");
            textTarefa.setText("");
            textPrazo.setText("");
            textIntegrantes.setText("");

            modeloNomes.clear();
            listNomes2.setModel(modeloNomes);
            id = 0;
            select();
            select2();

            if (radioLivre.isSelected()) {

                radioLivre.setSelected(false);

            }

            if (checkPrazo.isSelected()) {

                checkPrazo.setSelected(false);

            }

        }
    }//GEN-LAST:event_buttonConfirmarMouseClicked

    private void radioLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLivreActionPerformed

        clear();
    }//GEN-LAST:event_radioLivreActionPerformed

    private void textGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textGrupoKeyTyped

        if (!textGrupo.getText().equals("")) {

            select2();

        } else {

            listGrupos.clearSelection();
            id = 0;

        }

    }//GEN-LAST:event_textGrupoKeyTyped

    private void textPrazoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPrazoFocusLost

    }//GEN-LAST:event_textPrazoFocusLost

    private void textPrazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPrazoKeyTyped

        String valores = "0123456789";

        if (!valores.contains(evt.getKeyChar() + "")){

            evt.consume();

        }

    }//GEN-LAST:event_textPrazoKeyTyped

    private void buttonCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelar1MouseClicked

        popDelete.setVisible(false);
        fundoPop.setVisible(false);

    }//GEN-LAST:event_buttonCancelar1MouseClicked

    private void buttonDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeletarMouseClicked

        if (!listTarefas.isSelectionEmpty()) {

            Tarefas tarefa2 = new Tarefas();
            tarefa2.setId(tarefa.get(listTarefas.getSelectedIndex()).getId());

            TarefasDAO dao2 = new TarefasDAO();
            dao2.deletar(tarefa2);
            listar();
            popDelete.setVisible(false);
            fundoPop.setVisible(false);

            labelTitulo.setText("Titulo");
            labelPostagem.setText("Postagem");
            labelPrazo.setText("Prazo");
            areaTarefa.setText("Tarefa");
            labelDescricao1.setText("Descricao");
            labelIntegrantes.setText("Integrantes");

        }

    }//GEN-LAST:event_buttonDeletarMouseClicked

    private void fundoPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoPopMouseClicked

    }//GEN-LAST:event_fundoPopMouseClicked

    private void buttonAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtualizarMouseClicked

        listar();
    }//GEN-LAST:event_buttonAtualizarMouseClicked

    private void buttonDeleteEnteredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteEnteredMouseClicked

        if (!listTarefas.isSelectionEmpty()) {

            fundoPop.setVisible(true);
            popDelete.setVisible(true);
            labelNomeTarefa.setText(tarefa.get(listTarefas.getSelectedIndex()).getTitulo());

        }

    }//GEN-LAST:event_buttonDeleteEnteredMouseClicked

    private void buttonDeleteEnteredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteEnteredMouseExited

        buttonDeleteEntered.setVisible(false);
        buttonDeleteExit.setVisible(true);

    }//GEN-LAST:event_buttonDeleteEnteredMouseExited

    private void buttonDeleteExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteExitMouseEntered

        buttonDeleteExit.setVisible(false);
        buttonDeleteEntered.setVisible(true);

    }//GEN-LAST:event_buttonDeleteExitMouseEntered

    private void buttonCancelaPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelaPopActionPerformed

        if (buttonDeleteEntred.isVisible()) {

            buttonDeleteEntred.setVisible(false);
            buttonDeleteExit1.setVisible(true);

        }

        fundoPopGrupo.setVisible(false);
        panelPopGrupo.setVisible(false);

    }//GEN-LAST:event_buttonCancelaPopActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        GruposDAO dao = new GruposDAO();
        dao.deletar(grupoList.get(listGrupos1.getSelectedIndex()).getId());
        listar2();
        select2();
        
        if (buttonDeleteEntred.isVisible()) {

            buttonDeleteEntred.setVisible(false);
            buttonDeleteExit1.setVisible(true);

        }

        fundoPopGrupo.setVisible(false);
        panelPopGrupo.setVisible(false);
        abasGrupo.setSelectedIndex(0);
        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Grupo deletado!");
        listar();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void fundoPopGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoPopGrupoMouseClicked

    }//GEN-LAST:event_fundoPopGrupoMouseClicked

    private void buttonDeleteExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteExit1MouseEntered

        if (!listGrupos1.isSelectionEmpty()) {

            buttonDeleteExit1.setVisible(false);
            buttonDeleteEntred.setVisible(true);

        }

    }//GEN-LAST:event_buttonDeleteExit1MouseEntered

    private void buttonDeleteEntredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteEntredMouseClicked

        if (!listGrupos1.isSelectionEmpty()) {

            buttonCancelaPop.requestFocus();
            fundoPopGrupo.setVisible(true);
            labelNomeGrupo.setText(listGrupos1.getSelectedValue());
            panelPopGrupo.setVisible(true);

        }

    }//GEN-LAST:event_buttonDeleteEntredMouseClicked

    private void buttonDeleteEntredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteEntredMouseExited

        if (!panelPopGrupo.isVisible()) {

            buttonDeleteExit1.setVisible(true);
            buttonDeleteEntred.setVisible(false);

        }

    }//GEN-LAST:event_buttonDeleteEntredMouseExited

    private void buttonAtualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAtualizar1MouseClicked

        listar2();
        abasGrupo.setSelectedIndex(0);

    }//GEN-LAST:event_buttonAtualizar1MouseClicked

    private void textSenha1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenha1FocusGained

        if (textNome.getText().trim().isEmpty()) {

            textNome.setText("");

        } else {

            textNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }

    }//GEN-LAST:event_textSenha1FocusGained

    private void textDescricao1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDescricao1FocusGained

        if (textNome.getText().trim().isEmpty()) {

            textNome.setText("");

        } else{

            textNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }

        if (textSenha1.getText().trim().isEmpty()) {

            textSenha1.setText("");

        } else {

            textSenha1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }

    }//GEN-LAST:event_textDescricao1FocusGained

    private void buttonCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCriarMouseClicked

        if (textNome.getText().trim().isEmpty() || textSenha1.getText().trim().isEmpty() || textDescricao1.getText().trim().isEmpty()){

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de confirmar!");

        } else {

            GruposDAO dao = new GruposDAO();

            if (!dao.veryGrupo(textNome.getText().trim())) {

                Grupos grupo = new Grupos();
                grupo.setNome(textNome.getText().trim());
                grupo.setSenha(textSenha1.getText().trim());
                grupo.setDescricao(textDescricao1.getText().trim());

                dao.criar(grupo);
                JOptionPane.showMessageDialog(null, "Sucesso ao criar grupo!");
                listar2();
                select2();
                
                buttonCriar.requestFocus();

                textNome.setText(null);
                textSenha1.setText(null);
                textDescricao1.setText(null);
                textNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                textSenha1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            } else {

                JOptionPane.showMessageDialog(null, "Nome de grupo já existe");
                textNome.setBorder(BorderFactory.createLineBorder(Color.red));

            }

        }

    }//GEN-LAST:event_buttonCriarMouseClicked

    private void textNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomeFocusGained

        if (!textSenha1.getText().trim().isEmpty() && textSenha1.getBorder().equals(Color.RED)) {

            textSenha1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        }

    }//GEN-LAST:event_textNomeFocusGained

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed

        if (!listIntegrantes.isSelectionEmpty()) {

            GruposDAO dao = new GruposDAO();
            dao.removeGrupo(listUsuarios.get(listIntegrantes.getSelectedIndex()).getId());
            listarIntegrantes(grupoList.get(listGrupos1.getSelectedIndex()).getId());

            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.BOTTOM_CENTER, "Integrante removido!");

            buttonRemove.setVisible(false);
            buttonCancela.setVisible(false);
            
        }
    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void buttonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelaActionPerformed

        listIntegrantes.clearSelection();
        buttonRemove.setVisible(false);
        buttonCancela.setVisible(false);

    }//GEN-LAST:event_buttonCancelaActionPerformed

    public void trocaBack(int a) {
        
        fundoPerfil1.setaFundo(Color.black);
        fundoPerfil1.repaint();

        switch (a) {

            case 1:

                btn1.setBackground(new Color(0, 204, 204));
                btn2.setBackground(new Color(153, 153, 153));
                btn3.setBackground(new Color(153, 153, 153));
                btn4.setBackground(new Color(153, 153, 153));

                label1.setForeground(Color.white);
                label2.setForeground(Color.black);
                label3.setForeground(Color.black);
                label4.setForeground(Color.black);
                
                abasPannel.setSelectedIndex(0);

                break;

            case 2:

                btn2.setBackground(new Color(0, 204, 204));
                btn1.setBackground(new Color(153, 153, 153));
                btn3.setBackground(new Color(153, 153, 153));
                btn4.setBackground(new Color(153, 153, 153));

                label2.setForeground(Color.white);
                label1.setForeground(Color.black);
                label3.setForeground(Color.black);
                label4.setForeground(Color.black);

                abasPannel.setSelectedIndex(1);
                
                break;

            case 3:

                btn3.setBackground(new Color(0, 204, 204));
                btn2.setBackground(new Color(153, 153, 153));
                btn1.setBackground(new Color(153, 153, 153));
                btn4.setBackground(new Color(153, 153, 153));

                label3.setForeground(Color.white);
                label2.setForeground(Color.black);
                label1.setForeground(Color.black);
                label4.setForeground(Color.black);
                
                abasPannel.setSelectedIndex(2);

                break;

            case 4:

                btn4.setBackground(new Color(0, 204, 204));
                btn2.setBackground(new Color(153, 153, 153));
                btn1.setBackground(new Color(153, 153, 153));
                btn3.setBackground(new Color(153, 153, 153));

                label4.setForeground(Color.white);
                label2.setForeground(Color.black);
                label1.setForeground(Color.black);
                label3.setForeground(Color.black);
                
                abasPannel.setSelectedIndex(3);

                break;

        }

    }

    private void inicia() {

        switch (Global.getGenero()) {
            case "Masculino":
                labelOla.setText("Bem vindo " + Global.getNome());
                break;
            case "Feminino":
                labelOla.setText("Bem vinda " + Global.getNome());
                break;
            case "Outro":
                labelOla.setText("Bem vinde " + Global.getNome());
                break;
        }
        
        Notifications.getInstance().setJFrame(this);
        
        labelPerfilUsuario.setText(Global.getUser());
        
        editUsuario.setText(Global.getUser());
        editEndereco.setText(Global.getEndereco());
        editNome.setText(Global.getNome());
        editSenha.setText(Global.getSenha());
        
        visiObjects();

    }
    
    public void visiObjects() {
        
        if (Global.isMaster()) {
            
            btn4.setVisible(true);
            panelGrupos.setVisible(false);

        } else {

            btn3.setVisible(false);
            btn4.setVisible(false);
            panelGrupos.setVisible(true);
            
            UsuariosDAO dao = new UsuariosDAO();
        
            if (dao.buscarGrupo()) {
            
                panelEntrarGrupo.setVisible(false);
                panelGrupo1.setVisible(true);
                preencher();
            
            } else {
            
                panelEntrarGrupo.setVisible(true);
                panelGrupo1.setVisible(false);
            
            }

        }
        
        buttonSalvar.setVisible(false);
        buttonCancelar.setVisible(false);
        popGrupo.setVisible(false);
        panelPopPerfil.setVisible(false);
        GlobalVery.setPopVery(false);
        
    }
    
    private void buscarGrupo() {
        
        GruposDAO dao = new GruposDAO();
        dao.buscaGrupo();
        
    }
    
    public void acaoButton() {
        
        int id = Integer.parseInt(textIdGrupo.getText().trim());
        String senha = textSenha.getText().trim();

        if (textIdGrupo.getText().isEmpty() || textSenha.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de entrar!");

        } else {

            GruposDAO dao = new GruposDAO();

            if (dao.entrar(id, senha)) {

                JOptionPane.showMessageDialog(null, "Você entrou no grupo!");
                UsuariosDAO dao2 = new UsuariosDAO();
                dao2.insereGrupo();
                panelEntrarGrupo.setVisible(false);
                panelGrupo1.setVisible(true);
                preencher();

            } else {

                JOptionPane.showMessageDialog(null, "Grupo não encontrado!");

            }

        }
        
    }
    
    public void preencher() {
        
        GruposDAO dao = new GruposDAO();
        Grupos grupo = new Grupos();
        
        grupo = dao.infosGrupo();
        
        labelNome.setText(grupo.getNome());
        labelDescricao.setText(grupo.getDescricao());
        
    }
    
    public void veryPop(int escolha) {
        
        if (!GlobalVery.isPopVery()) {
            
            panelPopPerfil.setVisible(true);
            editSenhaPerfil.requestFocus();
            
        } else {
            
            switch(escolha) {
                
                case 1:
                    
                    editUsuario.setEditable(true);
                    editUsuario.requestFocus();
                    
                    break;
                    
                case 2:
                    
                    editEndereco.setEditable(true);
                    editEndereco.requestFocus();
                    
                    break;
                    
                case 3:
                    
                    editNome.setEditable(true);
                    editNome.requestFocus();
                    
                    break;
                    
                case 4:
                    
                    editSenha.setText("");
                    editSenha.setEditable(true);
                    editSenha.requestFocus();
                    
                    break;
                
            }
            
        }
        
    }
    
    public final void select() {

        String texto = textIntegrantes.getText().trim();

        if (modelo.getSize() > 0) {

            modelo.removeAllElements();

        }

        UsuariosDAO dao = new UsuariosDAO();
        list = dao.daoBuscar(texto, id);

        for (int i = 0; i < list.size(); i++) {

            String nome = list.get(i).getNome();
            modelo.addElement(nome);

        }

        listNomes.setModel(modelo);

    }

    public final void select2() {

        String text = textGrupo.getText().trim();

        if (modeloGrupos.getSize() > 0) {

            modeloGrupos.removeAllElements();

        }

        GruposDAO dao = new GruposDAO();
        listGrupos2 = dao.listar(1, text);

        for (int i = 0; i < listGrupos2.size(); i++) {

            modeloGrupos.add(i, listGrupos2.get(i).getNome());

        }

        listGrupos.setModel(modeloGrupos);

    }

    public void clear() {

        if (radioLivre.isSelected()) {

            modeloNomes.clear();

        } else {

            for (int i = 0; i < list2.size(); i++) {

                modeloNomes.add(i, list2.get(i));

            }

        }

    }
    
    public void listar() {

        DefaultListModel model = new DefaultListModel();

        TarefasDAO dao = new TarefasDAO();
        tarefa = dao.infos();

        for (int i = 0; i < tarefa.size(); i++) {

            model.addElement(tarefa.get(i).getTitulo());

        }

        listTarefas.setModel(model);

    }
    
    public void visiObjects2() {
        
        buttonDeleteEntered.setVisible(false);
        popDelete.setVisible(false);
        fundoPop.setVisible(false);
        
        if (!Global.isMaster()) {
            
            buttonDeleteExit.setVisible(false);
            
        }
        
    }
    
    public void iniciarPanelTarefas() {
        
        listar();
        visiObjects2();

        listTarefas.addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()) {

                if (listTarefas.getSelectedIndex() >= 0) {

                    labelTitulo.setText(tarefa.get(listTarefas.getSelectedIndex()).getTitulo());
                    labelDescricao1.setText(tarefa.get(listTarefas.getSelectedIndex()).getDescricao());
                    labelIntegrantes.setText(tarefa.get(listTarefas.getSelectedIndex()).getColaboradores());
                    areaTarefa.setText(tarefa.get(listTarefas.getSelectedIndex()).getTarefa());
                    labelPostagem.setText(tarefa.get(listTarefas.getSelectedIndex()).getPostagem().toString());
                    labelPrazo.setText(tarefa.get(listTarefas.getSelectedIndex()).getPrazo().toString());

                }

            }

        });
        
    }
    
    public void iniciaCriarTarefas() {
        
        select2();
        
        labelGrupo.setText("");

        listNomes.addListSelectionListener((ListSelectionEvent e) -> {

            if (!radioLivre.isSelected()) {

                if (!very && listNomes.getSelectedValue() != null) {

                    for (int i = 0; i < list2.size(); i++) {

                        if (listNomes.getSelectedValue().equals(list2.get(i))) {

                            very = true;

                        }

                    }

                    if (!very) {

                        modeloNomes.addElement(listNomes.getSelectedValue());
                        String text = listNomes.getSelectedValue();
                        list2.add(text);
                        listNomes2.setModel(modeloNomes);

                    }

                }

                if (very) {
                    very = false;
                }

            }

        });

        listNomes2.addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()) {

                list2.remove(listNomes2.getSelectedValue());
                modeloNomes.removeElement(listNomes2.getSelectedValue());
                listNomes2.setModel(modeloNomes);
                select();

            }

        });

        listGrupos.addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()) {

                if (!listGrupos.isSelectionEmpty()) {

                    labelGrupo.setText(listGrupos.getSelectedValue());
                    id = listGrupos2.get(listGrupos.getSelectedIndex()).getId();
                    list2.clear();
                    modeloNomes.clear();
                    select();

                }

            }

        });
        
    }
    
    
    private void listar2() {
        
       DefaultListModel model = new DefaultListModel();
       
       if (grupoList.size() > 0){
           
           grupoList.clear();
           
       }
       
       GruposDAO dao = new GruposDAO();      
       grupoList = dao.listar(3, null);
       
       for (int i = 0; i < grupoList.size(); i++) {
           
           model.add(i, grupoList.get(i).getNome());
           
       }
       
       listGrupos1.setModel(model);
       
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
    
    private void iniciarPanelGrupos() {
        
        listar2(); 
        
        buttonDeleteEntred.setVisible(false);
        fundoPopGrupo.setVisible(false);
        panelPopGrupo.setVisible(false);
        buttonRemove.setVisible(false);
        buttonCancela.setVisible(false);
        
        
        listGrupos1.addListSelectionListener(e -> {
            
            if (!e.getValueIsAdjusting()) {
                
                if (!listGrupos1.isSelectionEmpty()) {
                    
                    abasGrupo.setSelectedIndex(1);
                    
                    labelDataCriacaoGrupo.setText("Criado em: " + grupoList.get(listGrupos1.getSelectedIndex()).getData());
                    labelNomeGrupoInfo.setText("Nome: " + grupoList.get(listGrupos1.getSelectedIndex()).getNome());
                    labelDescricaoInfo.setText("Descrição: " + grupoList.get(listGrupos1.getSelectedIndex()).getDescricao());
                    labelIdGrupo.setText("ID: " + String.valueOf(grupoList.get(listGrupos1.getSelectedIndex()).getId()));
                    
                    listarIntegrantes(grupoList.get(listGrupos1.getSelectedIndex()).getId());   
                    
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
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasGrupo;
    private javax.swing.JTabbedPane abasPannel;
    private javax.swing.JTextArea areaTarefa;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JLabel buttonAtualizar;
    private javax.swing.JLabel buttonAtualizar1;
    private javax.swing.JButton buttonCancela;
    private javax.swing.JButton buttonCancelaPop;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonConfirma;
    private objects.PannelGradient buttonConfirmar;
    private objects.PannelGradient buttonCriar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JLabel buttonDeleteEntered;
    private javax.swing.JLabel buttonDeleteEntred;
    private javax.swing.JLabel buttonDeleteExit;
    private javax.swing.JLabel buttonDeleteExit1;
    private javax.swing.JLabel buttonEditEndereco;
    private javax.swing.JLabel buttonEditNome;
    private javax.swing.JLabel buttonEditSenha;
    private javax.swing.JLabel buttonEditUsuario;
    private objects.PannelGradient buttonEntrar;
    private javax.swing.JButton buttonFecha;
    private javax.swing.JButton buttonFechaPop;
    private javax.swing.JPanel buttonLogout;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JCheckBox checkPrazo;
    private javax.swing.JTextField editEndereco;
    private javax.swing.JTextField editNome;
    private javax.swing.JPasswordField editSenha;
    private javax.swing.JPasswordField editSenhaPerfil;
    private javax.swing.JTextField editUsuario;
    private objects.FundoPerfil fundoPerfil1;
    private javax.swing.JPanel fundoPop;
    private javax.swing.JPanel fundoPopGrupo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel labelDataCriacaoGrupo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDescricao1;
    private javax.swing.JLabel labelDescricaoInfo;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelGrupo;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIdGrupo;
    private javax.swing.JLabel labelIntegrantes;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome2;
    private javax.swing.JLabel labelNomeGrupo;
    private javax.swing.JLabel labelNomeGrupoInfo;
    private javax.swing.JLabel labelNomeTarefa;
    private javax.swing.JLabel labelNumeroIntegrantes;
    private javax.swing.JLabel labelOla;
    private javax.swing.JLabel labelPerfilUsuario;
    private javax.swing.JLabel labelPostagem;
    private javax.swing.JLabel labelPrazo;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTarefa;
    private javax.swing.JLabel labelTarefa1;
    private javax.swing.JLabel labelTarefa2;
    private javax.swing.JLabel labelTarefa3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JList<String> listGrupos;
    private javax.swing.JList<String> listGrupos1;
    private javax.swing.JList<String> listIntegrantes;
    private javax.swing.JList<String> listNomes;
    private javax.swing.JList<String> listNomes2;
    private javax.swing.JList<String> listTarefas;
    private javax.swing.JPanel panelEntrarGrupo;
    private objects.PannelGradient panelFundo;
    private objects.PannelGradient panelGrupo1;
    private javax.swing.JPanel panelGrupos;
    private javax.swing.JPanel panelPopGrupo;
    private javax.swing.JPanel panelPopPerfil;
    private javax.swing.JPanel panelTeste;
    private objects.PannelGradient pannelGradient1;
    private objects.PannelGradient pannelGradient2;
    private objects.PannelGradient pannelGradient3;
    private objects.PannelGradient pannelGradient4;
    private objects.PannelGradient pannelGradient5;
    private objects.PannelGradient pannelGradient6;
    private objects.PannelGradient pannelGradient7;
    private objects.PannelGradient pannelGradient8;
    private objects.PannelGradient pannelGradient9;
    private javax.swing.JPanel popDelete;
    private javax.swing.JPanel popGrupo;
    private javax.swing.JRadioButton radioLivre;
    private javax.swing.JScrollPane scrollList;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextArea textDescricao1;
    private javax.swing.JTextField textGrupo;
    private javax.swing.JTextField textIdGrupo;
    private javax.swing.JTextField textIntegrantes;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPrazo;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JPasswordField textSenha1;
    private javax.swing.JTextArea textTarefa;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
