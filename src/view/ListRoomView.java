
package view;

import controller.RoomController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IdentifiedObject;
import model.Room;

public class ListRoomView extends javax.swing.JInternalFrame {
    private IdentifiedObject.Selection s;

    public ListRoomView() {
        this.controller = null;
    }
    final RoomController controller;
    public ListRoomView(RoomController controller) {
        this.controller = controller;
        initComponents();
        setRoomTableData(controller.getRooms());
       RoomList.getSelectionModel().addListSelectionListener(e -> roomListSelectionChanged());
        
    }
    public void setSelection(IdentifiedObject.Selection s){
        this.s = s;
    }
    private void roomListSelectionChanged() {
                                      
        int selectedIndex = RoomList.getSelectedRow();
    
        if (selectedIndex >= 0 && selectedIndex < controller.getRooms().size()) {
            // L'index est valide, on peut accéder à la liste des chambres
            s.onSelected(controller.getRooms().get(selectedIndex));
        } else {
            // L'index n'est pas valide, peut-être aucune ligne n'est sélectionnée
            // Vous pouvez gérer cela en conséquence, par exemple, en ne faisant rien
        }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        RoomList = new javax.swing.JTable();
        Rechercher2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();

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

        Rechercher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rechercher2ActionPerformed(evt);
            }
        });
        Rechercher2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Rechercher2KeyReleased(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel47.setText("Rechercher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Rechercher2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rechercher2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomListMouseReleased
        int i = RoomList.getSelectedRow();
        s.onSelected(controller.getRooms().get(i));
    }//GEN-LAST:event_RoomListMouseReleased

    private void Rechercher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rechercher2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rechercher2ActionPerformed

    private void Rechercher2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rechercher2KeyReleased
        String searchText = Rechercher2.getText().trim().toLowerCase();
        filterRooms(searchText);
    }

    private void filterRooms(String searchText) {
        List<Room> filteredRooms = new ArrayList<>();

        for (Room room : controller.getRooms()) {
            if (room.getNumeroChambre().toLowerCase().contains(searchText) ||
                room.getRoomType().toString().contains(searchText) ||
                room.getLocation().toString().contains(searchText) ||
                room.getCharacteristic().toString().contains(searchText) ||
                room.getStatus().toLowerCase().contains(searchText) ||
                String.valueOf(room.getPrix()).toLowerCase().contains(searchText)) {
                filteredRooms.add(room);
            }
        }

        setRoomTableData(filteredRooms);
        
    }//GEN-LAST:event_Rechercher2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rechercher2;
    private javax.swing.JTable RoomList;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
