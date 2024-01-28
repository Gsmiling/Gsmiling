/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.BillController;
import controller.ClientController;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import model.Client;
import model.IdentifiedObject;

/**
 *
 * @author gr
 */
public class BillView extends javax.swing.JInternalFrame  {

    /**
     * Creates new form BillView
     * @param controller
     * @param parent
     */
    
    ClientController clientController = new ClientController();
    JFrame parent;
    final BillController controller;
     private Client client;
     
     
    public BillView(BillController controller, JFrame parent) {
        initComponents();
        this.controller = controller;
        this.parent =  parent;
          initComponents();
        setBillTableData(controller.getBills());
    }
    
    public BillView(BillController controller,Client client){
         initComponents();
        this.client = client;
        this.controller = controller;
    }
     public void setBillTableData(List<Bill> bills) {
        // Met à jour la table des réservation dans la vue avec les données fournies

    DefaultTableModel model = (DefaultTableModel) BillList.getModel();
    model.setRowCount(0); // Efface toutes les lignes existantes

    for (Bill bill : bills) {
        System.out.println(bill);

        // Vous devrez peut-être convertir les dates au format souhaité ici
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");

        // Ajoutez une nouvelle ligne pour chaque réservation
        model.addRow(new Object[]{
            
            bill.getBillNum(),
            bill.getClient(),
            bill.getBillDate(),
            bill.getAmount()
        });
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        bnum = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        bcl = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        BillList = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        bamount = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        bdate = new com.toedter.calendar.JDateChooser();
        Rechercher = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel42.setText("N°CLIENT");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        bnum.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel43.setText("Rechercher");

        bcl.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel44.setText("DATE FACTURE");

        label.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        label.setText("MONTANT");

        BillList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N°Facture", "Client", "DateFacture", "Montant"
            }
        ));
        BillList.setGridColor(new java.awt.Color(0, 153, 153));
        BillList.setRowHeight(25);
        BillList.setRowMargin(1);
        jScrollPane5.setViewportView(BillList);

        EditButton.setBackground(new java.awt.Color(0, 102, 204));
        EditButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("MODIFIER");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(204, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("SUPPRIMER");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        bamount.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        AddButton.setBackground(new java.awt.Color(0, 153, 51));
        AddButton.setFont(new java.awt.Font("Cantarell", 1, 22)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("AJOUTER");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        bdate.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

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

        jLabel46.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel46.setText("N°FACTURE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bamount)
                        .addComponent(bnum, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(bcl)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addGap(174, 174, 174)
                        .addComponent(EditButton)
                        .addGap(179, 179, 179)
                        .addComponent(DeleteButton))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(EditButton)
                    .addComponent(DeleteButton))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bnum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bcl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bamount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

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

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        UserView cl = new UserView(clientController);
        final CustomDialog customDialog = new CustomDialog(parent, cl);
        cl.setSelection(new IdentifiedObject.Selection() {
        @Override
        public void onSelected(IdentifiedObject object) {
        bcl.setText(((Client)object).getNameCli());
        Client selectedClient = (Client) object;
        //                 System.out.println("Client sélectionné - ID : " + client.getNameCli());
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
    }//GEN-LAST:event_jLabel42MouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        Date billDate = bdate.getDate();
        String bnum = this.bnum.getText();
        int amount = Integer.parseInt( bamount.getText());
        
        Bill bill = new Bill(
                1, 
                bnum,
                client.getNameCli(),
                billDate,
                amount
               
        );
        if(controller.addBill(bill)) {
            // Affichez une boîte de dialogue de succès
            JOptionPane.showMessageDialog(this, "La facture a été ajoutée"
                    + ""
                    + " avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            setBillTableData(controller.getBills());
           clearField();
            return;
      }
      
            showErrorDialog("Erreur inattendue : " + "Impossibe d'ajouter la facture");        
    }//GEN-LAST:event_AddButtonActionPerformed
       
    
     private void showErrorDialog(String errorMessage) {
        // Affiche une boîte de dialogue d'erreur
        JOptionPane.showMessageDialog(this, errorMessage, "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    
     
     public void clearField(){
        bnum.setText("");
        bcl.setText("");
        bdate.setDate(null);
        label.setText("");
     }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTable BillList;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField Rechercher;
    private javax.swing.JTextField bamount;
    private javax.swing.JTextField bcl;
    private com.toedter.calendar.JDateChooser bdate;
    private javax.swing.JTextField bnum;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}