/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.ClientController;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.ClientCategory;
import utils.ImagePicker;

/**
 *
 * @author hp
 */
public final class ClientView extends javax.swing.JInternalFrame {
    
    final ClientController controller;
    File f = null;

    /**
     * Creates new form client
     * @param controller
     */
    public ClientView(ClientController controller) {
        this.controller = controller;
        initComponents();
        
        
        setClientTableData(controller.getClients());
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
    
    
    private void showErrorDialog(String errorMessage) {
        // Affiche une boîte de dialogue d'erreur
        JOptionPane.showMessageDialog(this, errorMessage, "Erreur", JOptionPane.ERROR_MESSAGE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        clnom = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        clprenom = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        clcarte = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ClientList = new javax.swing.JTable();
        AddPhotoButton4 = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        clphone = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        clnationalite = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        clcategorie = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        cladresse = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        photoLabel = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        Rechercher = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel42.setText("NOM");

        clnom.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel43.setText("PRENOM");

        clprenom.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel44.setText("N°CARTE");

        clcarte.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel45.setText("N°TELEPHONE");

        ClientList.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        ClientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nom", "Prenom", "N°Carte", "N°Telephone", "Nationalité", "Categorie", "Adresse"
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

        AddPhotoButton4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        AddPhotoButton4.setText("AJOUTER");
        AddPhotoButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPhotoButton4ActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(51, 153, 255));
        EditButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("MODIFIER");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(204, 0, 102));
        DeleteButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("SUPPRIMER");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        clphone.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel41.setText("NATIONALITE");

        clnationalite.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        clnationalite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFGHANISTAN", "ALBANIE", "ALGÉRIE", "ANDORRE", "ANGOLA", "ANTIGUA-ET-BARBUDA", "ARGENTINE", "ARMÉNIE", "AUSTRALIE", "AUTRICHE", "AZERBAÏDJAN", "BAHAMAS", "BAHREÏN", "BANGLADESH", "BARBADE", "BÉLARUS", "BELGIQUE", "BELIZE", "BÉNIN", "BHOUTAN", "BOLIVIE", "BOSNIE-HERZÉGOVINE", "BOTSWANA", "BRÉSIL", "BRUNÉI", "BULGARIE", "BURKINA FASO", "BURUNDI", "CABO VERDE", "CAMBODGE", "CAMEROUN", "CANADA", "RÉPUBLIQUE CENTRAFRICAINE", "TCHAD", "CHILI", "CHINE", "COLOMBIE", "COMORES", "CONGO (CONGO-BRAZZAVILLE)", "COSTA RICA", "CROATIE", "CUBA", "CHYPRE", "RÉPUBLIQUE TCHÈQUE", "RÉPUBLIQUE DÉMOCRATIQUE DU CONGO", "DANEMARK", "DJIBOUTI", "DOMINIQUE", "RÉPUBLIQUE DOMINICAINE", "ÉQUATEUR", "ÉGYPTE", "SALVADOR", "GUINÉE ÉQUATORIALE", "ÉRYTHRÉE", "ESTONIE", "ÉTHIOPIE", "FIDJI", "FINLANDE", "FRANCE", "GABON", "GAMBIE", "GÉORGIE", "ALLEMAGNE", "GHANA", "GRÈCE", "GRENADE", "GUATEMALA", "GUINÉE", "GUINÉE-BISSAU", "GUYANA", "HAÏTI", "SAINT-SIÈGE (ÉTAT DE LA CITÉ DU VATICAN)", "HONDURAS", "HONGRIE", "ISLANDE", "INDE", "INDONÉSIE", "IRAN", "IRAK", "IRLANDE", "ISRAËL", "ITALIE", "JAMAÏQUE", "JAPON", "JORDANIE", "KAZAKHSTAN", "KENYA", "KIRIBATI", "KOWEÏT", "KIRGHIZISTAN", "LAOS", "LETTONIE", "LIBAN", "LESOTHO", "LIBÉRIA", "LIBYE", "LIECHTENSTEIN", "LITUANIE", "LUXEMBOURG", "MACÉDOINE DU NORD", "MADAGASCAR", "MALAWI", "MALAISIE", "MALDIVES", "MALI", "MALTE", "ÎLES MARSHALL", "MAURITANIE", "MAURICE", "MEXIQUE", "MICRONÉSIE", "MOLDAVIE", "MONACO", "MONGOLIE", "MONTÉNÉGRO", "MAROC", "MOZAMBIQUE", "MYANMAR (BIRMANIE)", "NAMIBIE", "NAURU", "NÉPAL", "PAYS-BAS", "NOUVELLE-ZÉLANDE", "NICARAGUA", "NIGER", "NIGÉRIA", "CORÉE DU NORD", "NORVÈGE", "OMAN", "PAKISTAN", "PALAOS", "PALESTINE", "PANAMA", "PAPOUASIE-NOUVELLE-GUINÉE", "PARAGUAY", "PÉROU", "PHILIPPINES", "POLOGNE", "PORTUGAL", "QATAR", "CORÉE DU SUD", "ROUMANIE", "RUSSIE", "RWANDA", "SAINT-CHRISTOPHE-ET-NIÉVÈS", "SAINTE-LUCIE", "SAINT-VINCENT-ET-LES-GRENADINES", "SAMOA", "SAINT-MARIN", "SAO TOMÉ-ET-PRINCIPE", "ARABIE SAOUDITE", "SÉNÉGAL", "SERBIE", "SEYCHELLES", "SIERRA LEONE", "SINGAPOUR", "SLOVAQUIE", "SLOVÉNIE", "ÎLES SALOMON", "SOMALIE", "AFRIQUE DU SUD", "SOUDAN DU SUD", "ESPAGNE", "SRI LANKA", "SOUDAN", "SURINAME", "SUÈDE", "SUISSE", "SYRIE", "TADJIKISTAN", "TANZANIE", "THAÏLANDE", "TIMOR ORIENTAL", "TOGO", "TONGA", "TRINITÉ-ET-TOBAGO", "TUNISIE", "TURQUIE", "TURKMÉNISTAN", "TUVALU", "OUGANDA", "UKRAINE", "ÉMIRATS ARABES UNIS", "ROYAUME-UNI", "ÉTATS-UNIS", "URUGUAY", "OUZBÉKISTAN", "VANUATU", "VENEZUELA", "VIETNAM", "YÉMEN", "ZAMBIE", "ZIMBABWE" }));

        jLabel46.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel46.setText("CATEGORIE");

        clcategorie.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        clcategorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENT PRIVE", "CLIENT AFFAIRE", "CLIENT VIP", "CLIENT GROUPE" }));

        jLabel47.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel47.setText("ADRESSE");

        cladresse.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        cladresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cladressetxtadresseActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel48.setText("CARTE FIDELITE");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        photoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel50.setText("PHOTO");

        AddButton.setBackground(new java.awt.Color(0, 153, 153));
        AddButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("AJOUTER");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel52.setText("Rechercher");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clnom, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(103, 103, 103))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(clnationalite, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(clphone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cladresse, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clcategorie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clcarte, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddPhotoButton4)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(AddButton)
                                .addGap(152, 152, 152)
                                .addComponent(EditButton)
                                .addGap(165, 165, 165)
                                .addComponent(DeleteButton)))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(clnom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddPhotoButton4)
                                    .addComponent(clcarte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clphone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(clnationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clcategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cladresse, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddButton)
                        .addComponent(EditButton)
                        .addComponent(DeleteButton)))
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jCheckBox1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        int index = ClientList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ClientList.getModel();
        String nom = clnom.getText();
        String prenom = clprenom.getText();
        int carte = Integer.parseInt(clcarte.getText());
        int phone = Integer.parseInt(clphone.getText());
        String nationalite = clnationalite.getSelectedItem().toString();
        String categorie = clcategorie.getSelectedItem().toString();
        String adresse = cladresse.getText();
        Client cl = new Client(controller.getClients().get(index).getId(), nom, prenom, carte, 
                phone, nationalite, 
                adresse, 
                ClientCategory.fromString(categorie),
                photoByte(controller.getClients().get(index).getPhoto()));
     
      if(controller.editClient(cl)) {
            setClientTableData(controller.getClients());
            clearField();
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "Le client a été modifié avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            return;
      }
        showErrorDialog("Erreur inattendue : " + "Impossibe de modifier le client");
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int index = ClientList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ClientList.getModel();
        String nom = clnom.getText();
        String prenom = clprenom.getText();
        int carte = Integer.parseInt(clcarte.getText());
        int phone = Integer.parseInt(clphone.getText());
        String nationalite = clnationalite.getSelectedItem().toString();
        String categorie = clcategorie.getSelectedItem().toString();
        String adresse = cladresse.getText();
        Client cl = new Client(controller.getClients().get(index).getId(), nom, prenom, carte, phone, nationalite, adresse, ClientCategory.fromString(categorie), null);
     int p = JOptionPane.showConfirmDialog(null, "êtes vous sûre de vouloir supprimer ce client?","Suprimer",JOptionPane.YES_NO_OPTION);
     if(p == 0){
      if(controller.deleteClient(cl)) {
            setClientTableData(controller.getClients());
           clearField();
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "Le client a été supprimé avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            return;
      }
        showErrorDialog("Erreur inattendue : " + "Impossibe de supprimer le client");       
    }//GEN-LAST:event_DeleteButtonActionPerformed
    }
    private void cladressetxtadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cladressetxtadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cladressetxtadresseActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
      String nom = clnom.getText();
      String prenom = clprenom.getText();
      int carte = Integer.parseInt(clcarte.getText());
      int phone = Integer.parseInt(clphone.getText());
      String nationalite = clnationalite.getSelectedItem().toString();
      String categorie = clcategorie.getSelectedItem().toString();
      String adresse = cladresse.getText();
      Client cl = new Client(1, nom, prenom, carte, phone, nationalite, adresse, 
                ClientCategory.fromString(categorie), photoByte(null));
     
      if(controller.addClient(cl)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "Le client a été ajouté avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setClientTableData(controller.getClients());
           clearField();
            return;
      }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe d'ajouter le client");
              
    }//GEN-LAST:event_AddButtonActionPerformed
     
    private byte[] photoByte(byte [] pf){
        
      byte [] photo = pf;
      if(f != null){
          try {
              photo = ImagePicker.readBytesFromFile(f);
          } catch (IOException ex) {
              Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      return photo;
    }
    private void RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercherActionPerformed

    private void RechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechercherKeyReleased

        String searchText = Rechercher.getText().trim().toLowerCase();
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
    }//GEN-LAST:event_RechercherKeyReleased

    private void ClientListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientListMouseReleased
       int i = ClientList.getSelectedRow();
              DefaultTableModel model=(DefaultTableModel) ClientList.getModel();
                 clnom.setText(model.getValueAt(i, 0).toString());
                 clprenom.setText(model.getValueAt(i, 1).toString());
                 clcarte.setText(model.getValueAt(i, 2).toString());
                 clphone.setText(model.getValueAt(i, 3).toString());
                 clnationalite.setSelectedItem(model.getValueAt(i, 4).toString());
                  clcategorie.setSelectedItem(model.getValueAt(i, 5).toString());
                  cladresse.setText(model.getValueAt(i, 6).toString());
                  byte [] photo = controller.getClients().get(i).getPhoto();
                  if(photo != null){
            photoLabel.setIcon(resizeImage(null,photo));
                  }
    }//GEN-LAST:event_ClientListMouseReleased

    private void AddPhotoButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPhotoButton4ActionPerformed

              File f = ImagePicker.pick();
              if(f == null){
                  return;
              }
              this.f = f;
  
                   photoLabel.setIcon(resizeImage(f.getAbsolutePath(),null));
              
                 
    }//GEN-LAST:event_AddPhotoButton4ActionPerformed

        public ImageIcon resizeImage(String Imagepath , byte[] pic){
        ImageIcon myImage = null ;
        if(Imagepath !=null){
            myImage = new ImageIcon(Imagepath);
        }else{
                    myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        //Image newimg = img.getScaledInstance(lt.getWidth(), lt.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        return image ;
    }
        private void clearField(){
            clnom.setText("");
            clprenom.setText("");
            clcarte.setText("");
            clphone.setText("");
            cladresse.setText("");
            photoLabel.setIcon(resizeImage(null, new byte[0]));
            f = null;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddPhotoButton4;
    private javax.swing.JTable ClientList;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField Rechercher;
    private javax.swing.JTextField cladresse;
    private javax.swing.JTextField clcarte;
    private javax.swing.JComboBox<String> clcategorie;
    private javax.swing.JComboBox<String> clnationalite;
    private javax.swing.JTextField clnom;
    private javax.swing.JTextField clphone;
    private javax.swing.JTextField clprenom;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel photoLabel;
    // End of variables declaration//GEN-END:variables
}
