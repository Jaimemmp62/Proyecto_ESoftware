package org.theoffice.duckish.ui;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.theoffice.duckish.proc.CRUD;
import org.theoffice.duckish.obj.Dish;
public class AddDrink extends javax.swing.JFrame {

    /**
     * Creates new form AddDrink
     */
    CRUD myCRUD = new CRUD("root", "902020");
    
    public AddDrink() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAddInfoDrink = new javax.swing.JPanel();
        TitleAddInfoDrink = new javax.swing.JLabel();
        NameDrink = new javax.swing.JLabel();
        PriceDrink = new javax.swing.JLabel();
        InNameDrinktxt = new javax.swing.JTextField();
        InPriceDrinktxt = new javax.swing.JTextField();
        btnBckAddDrink = new javax.swing.JButton();
        btnAddDrinkConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddDrink");
        setName("AddDrink"); // NOI18N
        setPreferredSize(new java.awt.Dimension(380, 400));
        setResizable(false);

        jPanelAddInfoDrink.setBackground(new java.awt.Color(180, 212, 222));
        jPanelAddInfoDrink.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAddInfoDrink.setPreferredSize(new java.awt.Dimension(380, 400));

        TitleAddInfoDrink.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TitleAddInfoDrink.setText("Add drink's info");

        NameDrink.setText("Name: ");

        PriceDrink.setText("Price: ");

        InPriceDrinktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InPriceDrinktxtKeyTyped(evt);
            }
        });

        btnBckAddDrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_2.png"))); // NOI18N
        btnBckAddDrink.setPreferredSize(new java.awt.Dimension(50, 44));
        btnBckAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBckAddDrinkActionPerformed(evt);
            }
        });

        btnAddDrinkConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAddDrinkConfirm.setPreferredSize(new java.awt.Dimension(50, 45));
        btnAddDrinkConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrinkConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddInfoDrinkLayout = new javax.swing.GroupLayout(jPanelAddInfoDrink);
        jPanelAddInfoDrink.setLayout(jPanelAddInfoDrinkLayout);
        jPanelAddInfoDrinkLayout.setHorizontalGroup(
            jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddInfoDrinkLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(TitleAddInfoDrink)
                .addGap(69, 69, 69))
            .addGroup(jPanelAddInfoDrinkLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddInfoDrinkLayout.createSequentialGroup()
                        .addGroup(jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PriceDrink)
                            .addComponent(NameDrink))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InNameDrinktxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(InPriceDrinktxt)))
                    .addGroup(jPanelAddInfoDrinkLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnBckAddDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(btnAddDrinkConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAddInfoDrinkLayout.setVerticalGroup(
            jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddInfoDrinkLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleAddInfoDrink)
                .addGap(50, 50, 50)
                .addGroup(jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameDrink)
                    .addComponent(InNameDrinktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceDrink)
                    .addComponent(InPriceDrinktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanelAddInfoDrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBckAddDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDrinkConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddInfoDrink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAddInfoDrink, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnBckAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBckAddDrinkActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminUI bck = new AdminUI();
        bck.setVisible(true);        
    }//GEN-LAST:event_btnBckAddDrinkActionPerformed

    private void btnAddDrinkConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkConfirmActionPerformed
        Dish myDish = new Dish();
        if (InNameDrinktxt.getText().trim().equals("")
                && (InPriceDrinktxt.getText().trim().equals(""))) {

        }
        if (myCRUD.connect()) {
            myDish.setName(InNameDrinktxt.getText());
            myDish.setPrice(Float.parseFloat(InPriceDrinktxt.getText()));
            myDish.setDescription("Drink");
            myCRUD.connect();
            myCRUD.useDataBase();
            if (myCRUD.addDish(myDish)) {
                JOptionPane.showMessageDialog(null, "The dish has been added");
                InNameDrinktxt.setText("");
                InPriceDrinktxt.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error adding a dish");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error connecting with the Data Base");
        }
        myCRUD.disconnect();
    }//GEN-LAST:event_btnAddDrinkConfirmActionPerformed

    private void InPriceDrinktxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InPriceDrinktxtKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9'))
                && (c != '\b')
                && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.' || InPriceDrinktxt.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_InPriceDrinktxtKeyTyped

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
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDrink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InNameDrinktxt;
    private javax.swing.JTextField InPriceDrinktxt;
    private javax.swing.JLabel NameDrink;
    private javax.swing.JLabel PriceDrink;
    private javax.swing.JLabel TitleAddInfoDrink;
    private javax.swing.JButton btnAddDrinkConfirm;
    private javax.swing.JButton btnBckAddDrink;
    private javax.swing.JPanel jPanelAddInfoDrink;
    // End of variables declaration//GEN-END:variables
}
