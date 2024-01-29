
package view;

import controller.ClientController;
import controller.ReservationController;
import controller.RoomController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.IdentifiedObject;
import model.Reservation;
import model.ReservationStatement;
import model.Room;


public final class ReservationView extends javax.swing.JInternalFrame  {
    private Client client;
    private Room room;
    final ReservationController controller ;
    RoomController roomController = new RoomController();
    ClientController clientController = new ClientController();
    JFrame parent;
    public ReservationView(ReservationController controller, JFrame parent) {
        initComponents();
        this.controller = controller;
        this.parent =  parent;
        initComponents();
        setReservationTableData(controller.getReservations());
    }
 public void setReservationTableData(List<Reservation> reservations) {
        // Met à jour la table des réservation dans la vue avec les données fournies

    DefaultTableModel model = (DefaultTableModel) reservationList.getModel();
    model.setRowCount(0); // Efface toutes les lignes existantes

    for (Reservation reservation : reservations) {
        System.out.println(reservation);

        // Vous devrez peut-être convertir les dates au format souhaité ici
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");

        // Ajoutez une nouvelle ligne pour chaque réservation
        model.addRow(new Object[]{
            
            reservation.getRoomNum(),
            reservation.getClientId(),
            reservation.getDateArrivee(),
            reservation.getDateDepart(),
            reservation.getDateReservation(),
            reservation.getReservationStatement()
                
        });
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        chnum = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        chclient = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        reservationList = new javax.swing.JTable();
        EditReservationButtton = new javax.swing.JButton();
        DeleteReservationButton = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        chstatus = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        AddReservationButton = new javax.swing.JButton();
        chdatedepart = new com.toedter.calendar.JDateChooser();
        chdatearrivee = new com.toedter.calendar.JDateChooser();
        chreservation = new com.toedter.calendar.JDateChooser();
        jLabel47 = new javax.swing.JLabel();
        Rechercher = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel42.setText("N°CHAMBRE");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        chnum.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel43.setText("N°CLIENT");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        chclient.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel44.setText("DATE ARRIVEE");

        jLabel45.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel45.setText("DATE DE DEPART");

        reservationList.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        reservationList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°Chambre", "Client", "DateArrivee", "DateDepart", "DateReservation", "Statut"
            }
        ));
        reservationList.setGridColor(new java.awt.Color(0, 153, 153));
        reservationList.setRowHeight(25);
        reservationList.setRowMargin(1);
        reservationList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                reservationListMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(reservationList);

        EditReservationButtton.setBackground(new java.awt.Color(51, 102, 255));
        EditReservationButtton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        EditReservationButtton.setForeground(new java.awt.Color(255, 255, 255));
        EditReservationButtton.setText("MODIFIER");
        EditReservationButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditReservationButttonActionPerformed(evt);
            }
        });

        DeleteReservationButton.setBackground(new java.awt.Color(153, 0, 51));
        DeleteReservationButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        DeleteReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteReservationButton.setText("SUPPRIMER");
        DeleteReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteReservationButtonActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel41.setText("DATE RESERVATION");

        chstatus.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        chstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESERVE", "CONFIRME", "ANNULE" }));

        jLabel46.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel46.setText("ETAT RESERVATION");

        AddReservationButton.setBackground(new java.awt.Color(0, 153, 0));
        AddReservationButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        AddReservationButton.setForeground(new java.awt.Color(255, 255, 255));
        AddReservationButton.setText("AJOUTER");
        AddReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReservationButtonActionPerformed(evt);
            }
        });

        chdatedepart.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        chdatearrivee.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        chreservation.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel47.setText("Rechercher");

        Rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherActionPerformed(evt);
            }
        });
        Rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RechercherKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chstatus, 0, 176, Short.MAX_VALUE)
                        .addComponent(chdatedepart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chnum, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(chclient)
                        .addComponent(jLabel41)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chdatearrivee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chreservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(AddReservationButton)
                        .addGap(204, 204, 204)
                        .addComponent(EditReservationButtton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(DeleteReservationButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(92, 92, 92)
                            .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(176, 176, 176))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chnum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chclient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chdatearrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chdatedepart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chreservation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddReservationButton)
                            .addComponent(EditReservationButtton)
                            .addComponent(DeleteReservationButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditReservationButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditReservationButttonActionPerformed
        int index = reservationList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) reservationList.getModel();
        Date arrivee = chdatearrivee.getDate();
        Date depart = chdatedepart.getDate();
        Date dreservation = chreservation.getDate();
        String status = chstatus.getSelectedItem().toString();
        Reservation reservation = new Reservation(
                controller.getReservations().get(index).getId(), 
                controller.getReservations().get(index).getClientId(),
                controller.getReservations().get(index).getRoomId(),
                controller.getReservations().get(index).getRoomNum(), 
                controller.getReservations().get(index).getClientName(),
                arrivee, 
                depart, 
                dreservation, 
                ReservationStatement.fromString(status)
        );
        if(controller.editReservation(reservation)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "La réservation a été modifiée avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setReservationTableData(controller.getReservations());
            clearField();
            return;
        }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe de modifier la réservation");
    }//GEN-LAST:event_EditReservationButttonActionPerformed

    private void DeleteReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteReservationButtonActionPerformed
        int index = reservationList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) reservationList.getModel();
        Date arrivee = chdatearrivee.getDate();
        Date depart = chdatedepart.getDate();
        Date dreservation = chreservation.getDate();
        String status = chstatus.getSelectedItem().toString();
        Reservation reservation = new Reservation(
                controller.getReservations().get(index).getId(), 
                controller.getReservations().get(index).getClientId(),
                controller.getReservations().get(index).getRoomId(),
                controller.getReservations().get(index).getRoomNum(), 
                controller.getReservations().get(index).getClientName(),
                arrivee, 
                depart, 
                dreservation, 
                ReservationStatement.fromString(status)
        );
        if(controller.deleteReservation(reservation)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "La réservation a été supprimée avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setReservationTableData(controller.getReservations());
            clearField();
            return;
        }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe de supprimer la réservation");
    }//GEN-LAST:event_DeleteReservationButtonActionPerformed

    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercherActionPerformed

    private void RechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechercherKeyReleased

        /* try {
        ps = con.prepareStatement("SELECT client.id AS Matricule , client.nom AS Firstname , categorie.intitule AS CategorieName FROM Client JOIN Categorie ON client.categorie_id=categorie.id where nom like ? ");
        ps.setString(1,"%" +Rechercher.getText() + "%");
        rs=ps.executeQuery();
        // TableClients.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
        System.err.print(ex.getMessage());// fonction pour rechercher en tapant n'importe quoi
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercherKeyReleased

    private void AddReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReservationButtonActionPerformed
        Date arrivee = chdatearrivee.getDate();
        Date depart = chdatedepart.getDate();
        Date dreservation = chreservation.getDate();
        String status = chstatus.getSelectedItem().toString();
        Reservation reservation = new Reservation(
                1, 
                 client.getId(),
                room.getId(),
                room.getNumeroChambre(),
                client.getNameCli(),
                arrivee, 
                depart, 
                dreservation, 
                ReservationStatement.fromString(status)
        );
        if(controller.addReservation(reservation)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "La réservation a été ajoutée"
                    + ""
                    + " avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setReservationTableData(controller.getReservations());
           clearField();
            return;
      }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe d'ajouter la réservation");
    }//GEN-LAST:event_AddReservationButtonActionPerformed

    private void reservationListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationListMouseReleased
            int i = reservationList.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel) reservationList.getModel();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            chnum.setText(model.getValueAt(i, 0).toString());
            chclient.setText(model.getValueAt(i, 1).toString());

            // Convert String representation to Date
            try {
                Date dateArrivee = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(i, 2).toString());
                chdatearrivee.setDate(dateArrivee);

                Date dateDepart = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(i, 3).toString());
                chdatedepart.setDate(dateDepart);

                Date dateReservation = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(i, 4).toString());
                chreservation.setDate(dateReservation);

            } catch (ParseException ex) {
                ex.printStackTrace();
                
            }

            chstatus.setSelectedItem(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_reservationListMouseReleased

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
       ListRoomView cl = new ListRoomView(roomController);
        final CustomDialog customDialog = new CustomDialog(parent, cl);
                cl.setSelection(new IdentifiedObject.Selection() {
            @Override
            public void onSelected(IdentifiedObject object) {
                chnum.setText(((Room)object).getNumeroChambre());
               room = (Room) object;
               
//                System.out.println(".onSelected()"+ room.getNumeroChambre());
        System.out.println("view.ReservationView.jLabel42MouseClicked()");
         int result = JOptionPane.showConfirmDialog(parent, "Confirmez-vous votre choix : ", "Confirmation", JOptionPane.YES_NO_OPTION);

        // Si l'utilisateur clique sur "Oui", fermez la boîte de dialogue
        if (result == JOptionPane.YES_OPTION) {
             customDialog.dispose();
        }
    
               
            }
                });
        cl.setVisible(true);
                customDialog.setVisible(true);
        
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        UserView cl = new UserView(clientController);
        final CustomDialog customDialog = new CustomDialog(parent, cl);
                cl.setSelection(new IdentifiedObject.Selection() {
            @Override
            public void onSelected(IdentifiedObject object) {
                chclient.setText(((Client)object).getNameCli());
                 client = (Client) object;
                 System.out.println("Client sélectionné - ID : " + client.getNameCli());
                System.out.println(".onSelected()");
         int result = JOptionPane.showConfirmDialog(parent, "Confirmez-vous votre choix : ", "Confirmation", JOptionPane.YES_NO_OPTION);

        // Si l'utilisateur clique sur "Oui", fermez la boîte de dialogue
        if (result == JOptionPane.YES_OPTION) {
             customDialog.dispose();
        }
    
               
            }
                });
        cl.setVisible(true);
                customDialog.setVisible(true);
    }//GEN-LAST:event_jLabel43MouseClicked
    /* public void showReservationDialog(List<Room> availableRooms, Component parentComponent) {
    ListRoomView cl = new ListRoomView(roomController);
    this.add(cl);
    try {
    cl.setMaximum(true);
    } catch (PropertyVetoException ex) {
    }
    cl.show();
    }*/
    public void clearField(){
        chclient.setText("");
        chnum.setText("");
        chreservation.setDate(null);
        chdatearrivee.setDate(null);
        chdatedepart.setDate(null);
    }
      
     private void showErrorDialog(String errorMessage) {
        // Affiche une boîte de dialogue d'erreur
        JOptionPane.showMessageDialog(this, errorMessage, "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddReservationButton;
    private javax.swing.JButton DeleteReservationButton;
    private javax.swing.JButton EditReservationButtton;
    private javax.swing.JTextField Rechercher;
    private javax.swing.JTextField chclient;
    private com.toedter.calendar.JDateChooser chdatearrivee;
    private com.toedter.calendar.JDateChooser chdatedepart;
    private javax.swing.JTextField chnum;
    private com.toedter.calendar.JDateChooser chreservation;
    private javax.swing.JComboBox<String> chstatus;
    private javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable reservationList;
    // End of variables declaration//GEN-END:variables
}
