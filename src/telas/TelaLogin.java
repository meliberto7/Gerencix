package telas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.dao.UsuariosDAO;
import raven.toast.Notifications;


public class TelaLogin extends javax.swing.JFrame {


    public TelaLogin() {
        initComponents();
        inicia();
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        buttonCadastrar = new javax.swing.JButton();
        textUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        buttonFechaLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonConfirmar = new objects.PannelGradient();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newClass12 = new objects.PannelGradient();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCadastrar.setBackground(new java.awt.Color(255, 204, 51));
        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });
        panelLogin.add(buttonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 453, -1, 36));

        textUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        textUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textUsuarioFocusLost(evt);
            }
        });
        textUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textUsuarioKeyPressed(evt);
            }
        });
        panelLogin.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 240, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngs/2815428 (4).png"))); // NOI18N
        panelLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 27, 318, 108));

        textSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        textSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSenhaFocusLost(evt);
            }
        });
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSenhaKeyPressed(evt);
            }
        });
        panelLogin.add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 240, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("NÃO TEM UMA CONTA? CRIE AQUI");
        panelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 23));

        buttonFechaLogin.setBackground(new java.awt.Color(255, 0, 0));
        buttonFechaLogin.setText("X");
        buttonFechaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonFechaLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonFechaLoginMouseExited(evt);
            }
        });
        buttonFechaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechaLoginActionPerformed(evt);
            }
        });
        panelLogin.add(buttonFechaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Usuário");
        panelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 50, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Senha");
        panelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 40, 20));

        buttonConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonConfirmar.setEnd(new java.awt.Color(51, 255, 204));
        buttonConfirmar.setStart(new java.awt.Color(0, 153, 255));
        buttonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonConfirmarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Entrar");

        javax.swing.GroupLayout buttonConfirmarLayout = new javax.swing.GroupLayout(buttonConfirmar);
        buttonConfirmar.setLayout(buttonConfirmarLayout);
        buttonConfirmarLayout.setHorizontalGroup(
            buttonConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonConfirmarLayout.setVerticalGroup(
            buttonConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLogin.add(buttonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 240, 40));

        jPanel1.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 360, 500));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 640, -1));

        newClass12.setEnd(new java.awt.Color(0, 153, 204));
        newClass12.setStart(new java.awt.Color(204, 0, 204));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GERENCIX");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel4.setText("Gerencie suas tarefas de maneira");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel5.setText("simples e fácil!");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout newClass12Layout = new javax.swing.GroupLayout(newClass12);
        newClass12.setLayout(newClass12Layout);
        newClass12Layout.setHorizontalGroup(
            newClass12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClass12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(newClass12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        newClass12Layout.setVerticalGroup(
            newClass12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClass12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 354, Short.MAX_VALUE))
        );

        jPanel1.add(newClass12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFechaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechaLoginActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_buttonFechaLoginActionPerformed
  
    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        
        irTelaCadastro();
        
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void textUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsuarioFocusGained

    }//GEN-LAST:event_textUsuarioFocusGained

    private void textUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsuarioFocusLost
  
    }//GEN-LAST:event_textUsuarioFocusLost

    private void textSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusGained
   
    }//GEN-LAST:event_textSenhaFocusGained

    private void textSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusLost
     
    }//GEN-LAST:event_textSenhaFocusLost

    private void textUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsuarioKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            acaoButton();
            
        }
        
    }//GEN-LAST:event_textUsuarioKeyPressed

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            acaoButton();
            
        }
        
    }//GEN-LAST:event_textSenhaKeyPressed

    private void buttonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonConfirmarMouseClicked
       
        acaoButton();
        
    }//GEN-LAST:event_buttonConfirmarMouseClicked

    private void buttonFechaLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFechaLoginMouseEntered
        
        buttonFechaLogin.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_buttonFechaLoginMouseEntered

    private void buttonFechaLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFechaLoginMouseExited
        
        buttonFechaLogin.setBackground(Color.red);
        
    }//GEN-LAST:event_buttonFechaLoginMouseExited

    public void acaoButton() {
        
        
        if (textUsuario.getText().trim().isEmpty() || textSenha.getText().trim().isEmpty() || textUsuario.getText().equals(" Usuário") || textSenha.getText().equals(" Senha")){
          
          JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de confirmar!");
          
      } else {
          
          String user = textUsuario.getText().trim();
          String senha = textSenha.getText().trim();
          
          UsuariosDAO dao = new UsuariosDAO();
          if (dao.login(user, senha)){
              
              trocarTela();
                   
          } else {
              
              textUsuario.setBorder(BorderFactory.createLineBorder(Color.RED));
              textSenha.setBorder(BorderFactory.createLineBorder(Color.RED));
               
          }
          
      }   
        
    }
    
    public void irTelaCadastro() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            
                dispose();
                new TelaCadastro().setVisible(true);
                
            }
            
        });
        
    }
    
    public void trocarTela() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                dispose();
                new TelaInicial().setVisible(true);
            }
 
        });
        
    }
    
    private void inicia() {
        
        textUsuario.requestFocus();
        Notifications.getInstance().setJFrame(this);
        
    }
        
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private objects.PannelGradient buttonConfirmar;
    private javax.swing.JButton buttonFechaLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private objects.PannelGradient newClass12;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
