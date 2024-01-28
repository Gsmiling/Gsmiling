package view;
import javax.swing.*;

public class CustomDialog extends JDialog {
    public CustomDialog(JFrame parent, JInternalFrame customView) {
        super(parent, "Boîte de dialogue personnalisée", true);

        // Ajoutez la vue personnalisée à la boîte de dialogue
        add(customView);

        // Configurez la boîte de dialogue (taille, etc.)
        setSize(1150, 300);
        setLocationRelativeTo(parent);
    }
    private void handleConfirmAction() {
        int result = JOptionPane.showConfirmDialog(this, "Confirmez-vous votre choix : ", "Confirmation", JOptionPane.YES_NO_OPTION);

        // Si l'utilisateur clique sur "Oui", fermez la boîte de dialogue
        if (result == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
  
    }
    
