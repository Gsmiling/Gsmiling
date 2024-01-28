/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.ClientController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.IdentifiedObject;

/**
 *
 * @author gr
 */
public class UserView extends javax.swing.JInternalFrame {
    private IdentifiedObject.Selection s;
    final ClientController controller;
    public UserView(ClientController controller) {
        initComponents();
        this.controller = controller;
        
        setClientTableData(controller.getClients());
        ClientList.getSelectionModel().addListSelectionListener(e -> clientListSelectionChanged());
    }
     public void setSelection(IdentifiedObject.Selection s){
        this.s = s;
    }
    private void clientListSelectionChanged() {
                                      
        int i = ClientList.getSelectedRow();
        s.onSelected(controller.getClients().get(i));
    }

      public void setClientTableData(List<Client> clients) {
    // Met à jour la table des clients dans la vue avec les données fournies
    
    // Exemple générique (suppose que votre JTable est un DefaultTableModel)
    DefaultTableModel model = (DefaultTableModel) ClientList.getModel();
    model.setRowCount(0); // Efface toutes les lignes existantes

    for (Client client : clients) {
        System.out.println(client);
        // Ajoutez une nouvelle ligne pour chaque client
        model.addRow(new Object[]{
                client.getId(),
                client.getNameCli(),
                client.getFirstName(),
                client.getNumCart(),
                client.getNumPhone(),
                client.getNationality(),
                client.getClientCategory(),
                client.getAddress()
                
                
        });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        ClientList = new javax.swing.JTable();
        Rechercher2 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();

        ClientList.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        ClientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "Nom", "Prenom", "N°Carte", "N°Telephone", "Nationalité", "Categorie", "Adresse"
            }
        ));
        ClientList.setGridColor(new java.awt.Color(0, 153, 153));
        ClientList.setRowHeight(25);
        ClientList.setRowMargin(1);
        ClientList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ClientListMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(ClientList);

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

        jLabel50.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel50.setText("Rechercher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(Rechercher2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rechercher2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientListMouseReleased
        int i = ClientList.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) ClientList.getModel();
        
        
    }//GEN-LAST:event_ClientListMouseReleased

    private void Rechercher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rechercher2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rechercher2ActionPerformed

    private void Rechercher2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rechercher2KeyReleased

        String searchText = Rechercher2.getText().trim().toLowerCase();
        filterClients(searchText);
     }

    private void filterClients(String searchText) {
           List<Client> allClients = controller.getClients();
           List<Client> filteredClients = new ArrayList<>();

           for (Client client : allClients) {
               if (client.getNameCli().toLowerCase().contains(searchText) || client.getFirstName().toLowerCase().contains(searchText)) {
                   filteredClients.add(client);
               }
            }

         setClientTableData(filteredClients);
    }//GEN-LAST:event_Rechercher2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClientList;
    private javax.swing.JTextField Rechercher2;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
