package view;


import controller.BillController;
import controller.ClientController;
import controller.ReservationController;
import controller.RoomController;
import static java.awt.Color.blue;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import provider.Provider;
import provider.UserProvider;
import view.AccueilView;
import view.BillView;
import view.ClientView;
import view.ListRoomView;
import view.LoginView;
import view.ReservationView;
import view.RoomView;
import view.ServiceView;
import view.UserView;


public class Mainpage extends javax.swing.JFrame {
    ClientController clientController = new ClientController();
    RoomController roomController = new RoomController();
    ReservationController reservationController = new ReservationController();
    BillController billController = new BillController();

    
    public Mainpage() {
        
        initComponents();
        view.SwingUtils.centerFrame(this);
        accueil();
    }
    public void accueil(){
         this.mere.removeAll();
        this.mere.repaint();
        ListRoomView cl = new ListRoomView(roomController);
        this.mere.add(cl);
        try {
        cl.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
        cl.show();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roomButton = new javax.swing.JButton();
        clientButton = new javax.swing.JButton();
        serviceButton = new javax.swing.JButton();
        accueilButton = new javax.swing.JButton();
        reservationButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        mere = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        roomButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        roomButton.setText("Chambres");
        roomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomButtonActionPerformed(evt);
            }
        });

        clientButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        clientButton.setText("Client");
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonActionPerformed(evt);
            }
        });

        serviceButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        serviceButton.setText("Service");
        serviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceButtonActionPerformed(evt);
            }
        });

        accueilButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        accueilButton.setText("Accueil");
        accueilButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accueilButtonMouseClicked(evt);
            }
        });
        accueilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accueilButtonActionPerformed(evt);
            }
        });

        reservationButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        reservationButton.setText("Reservations");
        reservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationButtonActionPerformed(evt);
            }
        });

        billButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        billButton.setText("Facturations");
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 0, 102));
        jButton6.setFont(new java.awt.Font("Cantarell", 0, 22)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("DECONNEXION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accueilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(clientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(serviceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(billButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(accueilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mere.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout mereLayout = new javax.swing.GroupLayout(mere);
        mere.setLayout(mereLayout);
        mereLayout.setHorizontalGroup(
            mereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1249, Short.MAX_VALUE)
        );
        mereLayout.setVerticalGroup(
            mereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(mere))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(mere))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomButtonActionPerformed
        // TODO add your handling code here:
         this.mere.removeAll();
        this.mere.repaint();
        RoomView per = new RoomView(roomController);
        this.mere.add(per);
         try {
            per.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
        per.show();
    }//GEN-LAST:event_roomButtonActionPerformed

    private void clientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonActionPerformed
        // TODO add your handling code here:
        
         this.mere.removeAll();
        this.mere.repaint();
        ClientView cl = new ClientView(clientController);
        this.mere.add(cl);
         try {
            cl.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
        cl.show();


    }//GEN-LAST:event_clientButtonActionPerformed

    private void serviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceButtonActionPerformed
           this.mere.removeAll();
        this.mere.repaint();
        ServiceView  cl = new ServiceView();
        this.mere.add(cl);
         try {
            cl.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
        cl.show();
    }//GEN-LAST:event_serviceButtonActionPerformed

    private void accueilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accueilButtonActionPerformed
        
       accueil();
    }//GEN-LAST:event_accueilButtonActionPerformed

    private void reservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationButtonActionPerformed
        this.mere.removeAll();
        this.mere.repaint();
        ReservationView cl = new ReservationView(reservationController,this);
        this.mere.add(cl);
         try {
            cl.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
        cl.show();
    }//GEN-LAST:event_reservationButtonActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
        this.mere.removeAll();
        this.mere.repaint();
        BillView cl = new BillView(billController,this);
        this.mere.add(cl);
         try {
            cl.setMaximum(true);
        } catch (PropertyVetoException ex) {
        }
        cl.show();
    }//GEN-LAST:event_billButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int choix = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment vous déconnecter ?", "Confirmation", JOptionPane.YES_NO_OPTION);

            // Vérifier la réponse de l'utilisateur
            if (choix == JOptionPane.YES_OPTION) {
                // Code à exécuter si l'utilisateur choisit "Oui"
                System.out.println("Déconnexion en cours...");
                this.dispose();
            } else {
                // Code à exécuter si l'utilisateur choisit "Non" ou ferme la boîte de dialogue
                System.out.println("Déconnexion annulée.");
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void accueilButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accueilButtonMouseClicked
     // accueilButton.setBackground(blue);
    }//GEN-LAST:event_accueilButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        //new Mainpage().setVisible(true);
                         Provider.getInstance(
                        "jdbc:mysql://localhost:3306/hotel",
                        "root",
                        "designmydream",
                        true);

                UserProvider userProvider = UserProvider.getInstance();
                SwingUtilities.invokeLater(() -> {
                LoginView fenetre = new LoginView();

                fenetre.setLocationRelativeTo(null);

                fenetre.setVisible(true);

                });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accueilButton;
    private javax.swing.JButton billButton;
    private javax.swing.JButton clientButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane mere;
    private javax.swing.JButton reservationButton;
    private javax.swing.JButton roomButton;
    private javax.swing.JButton serviceButton;
    // End of variables declaration//GEN-END:variables
}
