
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Bill;
import provider.BillProvider;


public class BillController {
     private BillProvider billProvider;
    List<Bill> bills = new ArrayList<>();

    public BillController() {
        this.billProvider = billProvider.getInstance();
        updateBillTable(null);
    }

    public boolean addBill(Bill bill) {
            // Ajoutez le client à la base de données via le ClientProvider
            if (billProvider.add(bill)) {

            // Mettez à jour la vue avec la nouvelle liste de clients
            updateBillTable(bill);
            return true;

              
            }
            return false;
     
    }

    // Autres méthodes du contrôleur

    private void updateBillTable(Bill bill) {
        // Mettez à jour la table des clients dans la vue
        if(bill != null){
            bills.add(0, bill);
        } else {
        
        bills = billProvider.getAllBills();
            
        }
        
    }
    
    public List<Bill> getBills() {
        return bills;
    }
    public boolean editBill(Bill bill){
        if(billProvider.update(bill)){
            updateBillTable(null);
            return true;
        }
        
        return false;
    }
    
    public boolean deleteBill(Bill bill){
        if(billProvider.delete(bill)){
            //clients.removeIf(name -> name.getId())
           billProvider.delete(bill);
        updateBillTable(null);
        return true;
    }
        return false;
    }
    
}
