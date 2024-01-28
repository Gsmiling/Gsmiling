/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.RoomController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Characteristic;
import model.Location;
import model.Room;
import model.RoomType;

/**
 *
 * @author hp
 */
public final class RoomView extends javax.swing.JInternalFrame {

   final RoomController controller;
   
    public RoomView(RoomController controller) {
        
        this.controller = controller;
        initComponents();
        setRoomTableData(controller.getRooms());
    }

    public void setRoomTableData(List<Room> rooms) {
        // Met à jour la table des clients dans la vue avec les données fournies
        

        // Exemple générique (suppose que votre JTable est un DefaultTableModel)
        DefaultTableModel model = (DefaultTableModel) RoomList.getModel();
        model.setRowCount(0); // Efface toutes les lignes existantes

        for (Room room : rooms) {
            System.out.println(room);
            // Ajoutez une nouvelle ligne pour chaque client
            model.addRow(new Object[]{
                
                   
                    room.getNumeroChambre(),
                    room.getRoomType(),
                    room.getLocation(),
                    room.getCharacteristic(),
                    room.getStatus(),
                    room.getPrix(),
                    
                
                

            });
        }
    }
    
     private void showErrorDialog(String errorMessage) {
        // Affiche une boîte de dialogue d'erreur
        JOptionPane.showMessageDialog(this, errorMessage, "Erreur", JOptionPane.ERROR_MESSAGE);
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        numRoom = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        RoomList = new javax.swing.JTable();
        roomprice = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        roomstatus = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        roomsituation = new javax.swing.JComboBox<>();
        roomcharacteristic = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        AddRoomButton = new javax.swing.JButton();
        EditRoomButton = new javax.swing.JButton();
        DeleteRoomButton = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        Rechercher = new javax.swing.JTextField();
        roomcategory = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel42.setText("N°CHAMBRE");

        numRoom.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel43.setText("CATEGORIE");

        jLabel44.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel44.setText("SITUATION");

        jLabel45.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel45.setText("CARACTERISTIQUE");

        RoomList.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        RoomList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°Chambre", "Type", "Situation", "Caractéristique", "Statut", "Prix"
            }
        ));
        RoomList.setGridColor(new java.awt.Color(0, 153, 153));
        RoomList.setRowHeight(25);
        RoomList.setRowMargin(1);
        RoomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RoomListMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(RoomList);

        roomprice.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel41.setText("STATUT");

        roomstatus.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        roomstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE", "OCCUPE" }));

        jLabel46.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel46.setText("PRIX");

        roomsituation.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        roomsituation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VUE MER", "VUE JARDIN", "VUE RUE", "VUE MONTAGNE" }));

        roomcharacteristic.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        roomcharacteristic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VENTILATION", "CLIMATISATION" }));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AddRoomButton.setBackground(new java.awt.Color(0, 153, 153));
        AddRoomButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        AddRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        AddRoomButton.setText("AJOUTER");
        AddRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomButtonActionPerformed(evt);
            }
        });

        EditRoomButton.setBackground(new java.awt.Color(51, 153, 255));
        EditRoomButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        EditRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        EditRoomButton.setText("MODIFIER");
        EditRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRoomButtonActionPerformed(evt);
            }
        });

        DeleteRoomButton.setBackground(new java.awt.Color(204, 0, 102));
        DeleteRoomButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        DeleteRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteRoomButton.setText("SUPPRIMER");
        DeleteRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        roomcategory.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        roomcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "DOUBLE", "TRIPLE" }));
        roomcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomcharacteristic, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(roomprice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roomstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numRoom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roomsituation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roomcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(roomsituation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomcharacteristic, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomprice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
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

    private void EditRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRoomButtonActionPerformed
        int index = RoomList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) RoomList.getModel();
        String num = numRoom.getText();
        String type = roomcategory.getSelectedItem().toString(); 
        String situation = roomsituation.getSelectedItem().toString();
        String caracteristic = roomcharacteristic.getSelectedItem().toString();
        String status = roomstatus.getSelectedItem().toString();
        double price = Double.parseDouble(roomprice.getText());
        Room room = new Room(controller.getRooms().get(index).getId(),
                num,
                price,
                Location.fromString(situation), 
                Characteristic.fromString(caracteristic), 
                RoomType.fromString(type), 
                status
               );
     
      if(controller.editRoom(room)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "La chambre a été modifié avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setRoomTableData(controller.getRooms());
           clearField();
            return;
      }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe de modifier la chambre");
    }//GEN-LAST:event_EditRoomButtonActionPerformed

    private void DeleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRoomButtonActionPerformed
        int index = RoomList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) RoomList.getModel();
        String num = numRoom.getText();
        String type = roomcategory.getSelectedItem().toString(); 
        String situation = roomsituation.getSelectedItem().toString();
        String caracteristic = roomcharacteristic.getSelectedItem().toString();
        String status = roomstatus.getSelectedItem().toString();
        double price = Double.parseDouble(roomprice.getText());
        Room room = new Room(controller.getRooms().get(index).getId(),
                num,
                price,
                Location.fromString(situation), 
                Characteristic.fromString(caracteristic), 
                RoomType.fromString(type), 
                status
                    );
             int p = JOptionPane.showConfirmDialog(null, "êtes vous sûre de vouloir supprimer cette chambre?","Suprimer",JOptionPane.YES_NO_OPTION);
        if(p == 0){
            if(controller.deleteRoom(room)) {
                setRoomTableData(controller.getRooms());
                clearField();
                // Affichez une boîte de dialogue de succès
                JOptionPane.showMessageDialog(this, "La chambre a été supprimé avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    return;
            }

               showErrorDialog("Erreur inattendue : " + "Impossibe de supprimer la chambre");
               
        }
    }//GEN-LAST:event_DeleteRoomButtonActionPerformed

    private void AddRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomButtonActionPerformed
      
      String num = numRoom.getText();
      String type = roomcategory.getSelectedItem().toString(); 
      String situation = roomsituation.getSelectedItem().toString();
      String caracteristic = roomcharacteristic.getSelectedItem().toString();
      String status = roomstatus.getSelectedItem().toString();
      double price = Double.parseDouble(roomprice.getText());
      Room room = new Room(1, 
              num,
              price,
              Location.fromString(situation), 
              Characteristic.fromString(caracteristic), 
              RoomType.fromString(type), 
             status
               );
     
      if(controller.addRoom(room)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "La chambre a été ajouté avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setRoomTableData(controller.getRooms());
           clearField();
            return;
      }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe d'ajouter la chambre");
    }//GEN-LAST:event_AddRoomButtonActionPerformed
     
    public void clearField(){
        numRoom.setText("");
        roomprice.setText("");
    }
    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercherActionPerformed

    private void RechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechercherKeyReleased

        /*try {
        ps = con.prepareStatement("SELECT client.id AS Matricule , client.nom AS Firstname , categorie.intitule AS CategorieName FROM Client JOIN Categorie ON client.categorie_id=categorie.id where nom like ? ");
        ps.setString(1,"%" +Rechercher.getText() + "%");
        rs=ps.executeQuery();
        // TableClients.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
        System.err.print(ex.getMessage());// fonction pour rechercher en tapant n'importe quoi
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercherKeyReleased

    private void roomcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomcategoryActionPerformed

    private void RoomListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomListMouseReleased
        int i = RoomList.getSelectedRow();
            DefaultTableModel model=(DefaultTableModel) RoomList.getModel();
                 numRoom.setText(model.getValueAt(i, 0).toString());
                 roomcategory.setSelectedItem(model.getValueAt(i, 1).toString());
                 roomsituation.setSelectedItem(model.getValueAt(i, 2).toString());
                 roomcharacteristic.setSelectedItem(model.getValueAt(i, 3).toString());
                 roomstatus.setSelectedItem(model.getValueAt(i, 4).toString());
                 roomprice.setText(model.getValueAt(i, 5).toString()); 
                 
    }//GEN-LAST:event_RoomListMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoomButton;
    private javax.swing.JButton DeleteRoomButton;
    private javax.swing.JButton EditRoomButton;
    private javax.swing.JTextField Rechercher;
    private javax.swing.JTable RoomList;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField numRoom;
    private javax.swing.JComboBox<String> roomcategory;
    private javax.swing.JComboBox<String> roomcharacteristic;
    private javax.swing.JTextField roomprice;
    private javax.swing.JComboBox<String> roomsituation;
    private javax.swing.JComboBox<String> roomstatus;
    // End of variables declaration//GEN-END:variables
}
