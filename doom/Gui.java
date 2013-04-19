/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doom;

import java.util.Arrays;

public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Credits = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        inventoryPanel = new javax.swing.JPanel();
        inventFour = new javax.swing.JLabel();
        inventEight = new javax.swing.JLabel();
        inventThree = new javax.swing.JLabel();
        inventTwo = new javax.swing.JLabel();
        inventOne = new javax.swing.JLabel();
        inventSeven = new javax.swing.JLabel();
        inventSix = new javax.swing.JLabel();
        inventFive = new javax.swing.JLabel();
        eventPanel = new javax.swing.JPanel();
        waterBar = new javax.swing.JProgressBar();
        eventLabel = new javax.swing.JLabel();
        healthBar = new javax.swing.JProgressBar();
        moneyCounter = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        helpButton = new javax.swing.JButton();
        shopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doom");
        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(1000, 760));
        setMinimumSize(new java.awt.Dimension(1000, 760));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 760));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        mainLabel.setBackground(new java.awt.Color(255, 51, 51));
        mainLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainLabel.setFocusable(false);

        Credits.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Credits.setText("created by L0rdh3lm & MIndstormerx");

        exitButton.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        exitButton.setText("X");
        exitButton.setToolTipText("Quit");
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        inventoryPanel.setBackground(new java.awt.Color(204, 204, 204));
        inventoryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inventoryPanel.setFocusable(false);

        inventFour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventFour.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-4-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(51, 51, 51))); // NOI18N
        inventFour.setMaximumSize(new java.awt.Dimension(100, 100));
        inventFour.setMinimumSize(new java.awt.Dimension(100, 100));
        inventFour.setPreferredSize(new java.awt.Dimension(100, 100));

        inventEight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventEight.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-8-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventEight.setMaximumSize(new java.awt.Dimension(100, 100));
        inventEight.setMinimumSize(new java.awt.Dimension(100, 100));
        inventEight.setPreferredSize(new java.awt.Dimension(100, 100));

        inventThree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventThree.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-3-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventThree.setMaximumSize(new java.awt.Dimension(100, 100));
        inventThree.setMinimumSize(new java.awt.Dimension(100, 100));
        inventThree.setPreferredSize(new java.awt.Dimension(100, 100));

        inventTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventTwo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-2-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventTwo.setMaximumSize(new java.awt.Dimension(100, 100));
        inventTwo.setMinimumSize(new java.awt.Dimension(100, 100));
        inventTwo.setPreferredSize(new java.awt.Dimension(100, 100));

        inventOne.setBackground(new java.awt.Color(153, 153, 153));
        inventOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventOne.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-1-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventOne.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inventOne.setMaximumSize(new java.awt.Dimension(100, 100));
        inventOne.setMinimumSize(new java.awt.Dimension(100, 100));
        inventOne.setName(""); // NOI18N
        inventOne.setOpaque(true);
        inventOne.setPreferredSize(new java.awt.Dimension(100, 100));

        inventSeven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventSeven.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-7-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventSeven.setMaximumSize(new java.awt.Dimension(100, 100));
        inventSeven.setMinimumSize(new java.awt.Dimension(100, 100));
        inventSeven.setPreferredSize(new java.awt.Dimension(100, 100));

        inventSix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventSix.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-6-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventSix.setMaximumSize(new java.awt.Dimension(100, 100));
        inventSix.setMinimumSize(new java.awt.Dimension(100, 100));
        inventSix.setPreferredSize(new java.awt.Dimension(100, 100));

        inventFive.setBackground(new java.awt.Color(0, 0, 0));
        inventFive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventFive.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "-5-", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Courier New", 0, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        inventFive.setMaximumSize(new java.awt.Dimension(100, 100));
        inventFive.setMinimumSize(new java.awt.Dimension(100, 100));
        inventFive.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout inventoryPanelLayout = new javax.swing.GroupLayout(inventoryPanel);
        inventoryPanel.setLayout(inventoryPanelLayout);
        inventoryPanelLayout.setHorizontalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inventOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        inventoryPanelLayout.setVerticalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inventOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventEight, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(inventSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        eventPanel.setBackground(new java.awt.Color(204, 204, 204));
        eventPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eventPanel.setFocusable(false);
        eventPanel.setPreferredSize(new java.awt.Dimension(321, 633));

        waterBar.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        waterBar.setForeground(new java.awt.Color(51, 51, 255));
        waterBar.setMaximum(1500);
        waterBar.setToolTipText("");
        waterBar.setValue(1503);
        waterBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        waterBar.setString("Water");
        waterBar.setStringPainted(true);

        eventLabel.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        eventLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eventLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eventLabel.setMaximumSize(new java.awt.Dimension(299, 440));
        eventLabel.setPreferredSize(new java.awt.Dimension(299, 440));

        healthBar.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        healthBar.setForeground(new java.awt.Color(204, 0, 0));
        healthBar.setMaximum(2000);
        healthBar.setToolTipText("");
        healthBar.setValue(2000);
        healthBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        healthBar.setString("Health");
        healthBar.setStringPainted(true);

        moneyCounter.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        moneyCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moneyCounter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout eventPanelLayout = new javax.swing.GroupLayout(eventPanel);
        eventPanel.setLayout(eventPanelLayout);
        eventPanelLayout.setHorizontalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneyCounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(waterBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(healthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(eventLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap())
        );
        eventPanelLayout.setVerticalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moneyCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(healthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(waterBar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        helpButton.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        helpButton.setText("?");
        helpButton.setToolTipText("Help");
        helpButton.setFocusable(false);
        helpButton.setPreferredSize(new java.awt.Dimension(50, 50));
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        shopButton.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        shopButton.setText("$");
        shopButton.setToolTipText("Shop");
        shopButton.setFocusable(false);
        shopButton.setPreferredSize(new java.awt.Dimension(50, 50));
        shopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inventoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(shopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Credits)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inventoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(eventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Credits)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * action after pressing any key on your keyboard
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        char c = evt.getKeyChar();
        String s = c + "";
        String[] inv = {"1", "2", "3", "4", "5", "6", "7", "8"};
        
        if ((s.equals("w")) || (s.equals("a")) || (s.equals("s")) || (s.equals("d"))){
            GameMain.play(s);
        }else if(Arrays.asList(inv).contains(s)){
            GameMain.triggerItems(s);
        }
        
    }//GEN-LAST:event_formKeyPressed
    /**
     * functionality of the exit-button 
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    /**
     * functionality of the help-button 
     */
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        HelpWindow helpWindow = new HelpWindow();
        helpWindow.setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed
    /**
     * functionality of the shop-button 
     */
    private void shopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    
    //function to draw a string into the mainLabel
    public void setMainLabel(String s) {
        this.mainLabel.setText("<html>"+s+"</html>");
    }
    
    //function to manage the content of the eventLabel
    public void setEventLabel(String s){
        this.eventLabel.setText(s);
    }
    
    //function to manage the visibility
    public void setVisibility(boolean b){
        if (!(b)) {
            this.eventLabel.setText("");
        } 
    }
    
    //function to manage the waterStatusBar
    public void setWaterBar (int value) {
        this.waterBar.setValue(value);
        this.waterBar.setString("Water: " + value);
    }
    
    //function to manage the healthStatusBar
    public void setHealthBar(int value){
        this.healthBar.setValue(value);
        this.healthBar.setString("Health: " + value);
    }
    
    //function to manage the moneyCounter
    public void setMoneyCounter(int value) {
        this.moneyCounter.setText("You got: " + value + "$.");
    }
    
    public javax.swing.JLabel[] getInventoryLabels(){
        javax.swing.JLabel[] inventoryobj = {inventOne, inventTwo, inventThree, inventFour, inventFive, inventSix, inventSeven, inventEight};
        return inventoryobj;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Credits;
    private javax.swing.JLabel eventLabel;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JProgressBar healthBar;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel inventEight;
    private javax.swing.JLabel inventFive;
    private javax.swing.JLabel inventFour;
    private javax.swing.JLabel inventOne;
    private javax.swing.JLabel inventSeven;
    private javax.swing.JLabel inventSix;
    private javax.swing.JLabel inventThree;
    private javax.swing.JLabel inventTwo;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel moneyCounter;
    private javax.swing.JButton shopButton;
    private javax.swing.JProgressBar waterBar;
    // End of variables declaration//GEN-END:variables
}
