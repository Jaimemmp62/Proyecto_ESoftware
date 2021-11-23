package org.theoffice.duckish.ui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.theoffice.duckish.obj.Dish;
import org.theoffice.duckish.proc.CRUD;

public class AddDish extends javax.swing.JFrame {

    /**
     * Creates new form AddDish
     */
    CRUD myCRUD = new CRUD("root", "902020");
    public AddDish() {
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

        jPanelAddInfoDish = new javax.swing.JPanel();
        TitleAddInfoDish = new javax.swing.JLabel();
        NameDish = new javax.swing.JLabel();
        InNameDishtxt = new javax.swing.JTextField();
        PiceDish = new javax.swing.JLabel();
        InPriceDishtxt = new javax.swing.JTextField();
        btnBackAddDish = new javax.swing.JButton();
        bntAddDishConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Dish");
        setName("VInfoDish"); // NOI18N
        setResizable(false);

        jPanelAddInfoDish.setBackground(new java.awt.Color(180, 212, 222));
        jPanelAddInfoDish.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TitleAddInfoDish.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TitleAddInfoDish.setText("Add dish's info");

        NameDish.setText("Name Dish: ");

        InNameDishtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InNameDishtxtActionPerformed(evt);
            }
        });

        PiceDish.setText("Price: ");

        InPriceDishtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPriceDishtxtActionPerformed(evt);
            }
        });
        InPriceDishtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InPriceDishtxtKeyTyped(evt);
            }
        });

        btnBackAddDish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_2.png"))); // NOI18N
        btnBackAddDish.setMinimumSize(new java.awt.Dimension(30, 30));
        btnBackAddDish.setPreferredSize(new java.awt.Dimension(50, 45));
        btnBackAddDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackAddDishActionPerformed(evt);
            }
        });

        bntAddDishConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        bntAddDishConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddDishConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddInfoDishLayout = new javax.swing.GroupLayout(jPanelAddInfoDish);
        jPanelAddInfoDish.setLayout(jPanelAddInfoDishLayout);
        jPanelAddInfoDishLayout.setHorizontalGroup(
            jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddInfoDishLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddInfoDishLayout.createSequentialGroup()
                        .addGroup(jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PiceDish)
                            .addComponent(NameDish))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InNameDishtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(InPriceDishtxt)))
                    .addGroup(jPanelAddInfoDishLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBackAddDish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(bntAddDishConfirm)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddInfoDishLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(TitleAddInfoDish)
                .addGap(74, 74, 74))
        );
        jPanelAddInfoDishLayout.setVerticalGroup(
            jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddInfoDishLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TitleAddInfoDish)
                .addGap(50, 50, 50)
                .addGroup(jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameDish, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InNameDishtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PiceDish)
                    .addComponent(InPriceDishtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanelAddInfoDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackAddDish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntAddDishConfirm))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddInfoDish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAddInfoDish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InNameDishtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InNameDishtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InNameDishtxtActionPerformed

    private void InPriceDishtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPriceDishtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InPriceDishtxtActionPerformed

    private void btnBackAddDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackAddDishActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminUI bkc = new AdminUI();
        bkc.setVisible(true);
    }//GEN-LAST:event_btnBackAddDishActionPerformed

    private void bntAddDishConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddDishConfirmActionPerformed
        Dish myDish = new Dish();
        if (InNameDishtxt.getText().trim().equals("")
                && (InPriceDishtxt.getText().trim().equals(""))) {

        }
        if (myCRUD.connect()) {
            myDish.setName(InNameDishtxt.getText());
            myDish.setPrice(Float.parseFloat(InPriceDishtxt.getText()));
            myDish.setDescription("Dish");
            myCRUD.connect();
            myCRUD.useDataBase();
            if (myCRUD.addDish(myDish)) {
                JOptionPane.showMessageDialog(null, "The dish has been added");
                InNameDishtxt.setText("");
                InPriceDishtxt.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error adding a dish");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error connecting with the Data Base");
        }
        myCRUD.disconnect();
    }//GEN-LAST:event_bntAddDishConfirmActionPerformed

    private void InPriceDishtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InPriceDishtxtKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9'))
                && (c != '\b')
                && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.' || InPriceDishtxt.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_InPriceDishtxtKeyTyped

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
            java.util.logging.Logger.getLogger(AddDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InNameDishtxt;
    private javax.swing.JTextField InPriceDishtxt;
    private javax.swing.JLabel NameDish;
    private javax.swing.JLabel PiceDish;
    private javax.swing.JLabel TitleAddInfoDish;
    private javax.swing.JButton bntAddDishConfirm;
    private javax.swing.JButton btnBackAddDish;
    private javax.swing.JPanel jPanelAddInfoDish;
    // End of variables declaration//GEN-END:variables
}
