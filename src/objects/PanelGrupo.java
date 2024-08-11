
package objects;

import model.bean.Grupos;
import model.dao.GruposDAO;
import model.dao.UsuariosDAO;



public class PanelGrupo extends javax.swing.JPanel {


    public PanelGrupo() {
        initComponents();
        preencher();
        popGrupo.setVisible(false);
    }


    public void preencher() {
        
        GruposDAO dao = new GruposDAO();
        Grupos grupo = new Grupos();
        
        grupo = dao.infosGrupo();
        
        labelNome.setText(grupo.getNome());
        labelDescricao.setText(grupo.getDescricao());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelGrupo = new objects.PannelGradient();
        popGrupo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelGrupo.setEnd(new java.awt.Color(0, 204, 204));
        panelGrupo.setStart(new java.awt.Color(0, 153, 204));
        panelGrupo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        popGrupo.setBackground(new java.awt.Color(255, 255, 255));
        popGrupo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        popGrupo.setPreferredSize(new java.awt.Dimension(200, 80));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sair do grupo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout popGrupoLayout = new javax.swing.GroupLayout(popGrupo);
        popGrupo.setLayout(popGrupoLayout);
        popGrupoLayout.setHorizontalGroup(
            popGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        popGrupoLayout.setVerticalGroup(
            popGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popGrupoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        panelGrupo.add(popGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, -1));

        labelNome.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNome.setText("Grupo");
        panelGrupo.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 57, 238, -1));

        labelDescricao.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescricao.setText("Descrição do Grupo");
        panelGrupo.add(labelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 92, 238, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(":");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelGrupo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 25, -1, 21));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        if (!popGrupo.isVisible()) {
            
            popGrupo.setVisible(true);
            
        } else {
            
            popGrupo.setVisible(false);
            
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
        UsuariosDAO dao = new UsuariosDAO();
        dao.sairGrupo();
        popGrupo.setVisible(false);
        jPanel1.setVisible(false);
        
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private objects.PannelGradient panelGrupo;
    private javax.swing.JPanel popGrupo;
    // End of variables declaration//GEN-END:variables
}
