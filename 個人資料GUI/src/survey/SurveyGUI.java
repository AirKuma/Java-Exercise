/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

/**
 *
 * @author user
 */
public class SurveyGUI extends javax.swing.JFrame {

    /**
     * Creates new form SurveyGUI
     */
    public SurveyGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        nLabel = new javax.swing.JLabel();
        TextFieldname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mList = new javax.swing.JList();
        mRadioButton = new javax.swing.JRadioButton();
        fRadioButton = new javax.swing.JRadioButton();
        eButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        mjLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nLabel.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        nLabel.setForeground(new java.awt.Color(0, 51, 153));
        nLabel.setText("Name");

        mList.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        mList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Fianace", "Information Management", "Engish", "Chinese", "Math" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(mList);

        buttonGroup1.add(mRadioButton);
        mRadioButton.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        mRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        mRadioButton.setText("Male");
        mRadioButton.setName("Male"); // NOI18N

        buttonGroup1.add(fRadioButton);
        fRadioButton.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        fRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        fRadioButton.setText("Female");
        fRadioButton.setName("Female"); // NOI18N

        eButton.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        eButton.setForeground(new java.awt.Color(0, 51, 204));
        eButton.setText("Enter");
        eButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eButtonMouseClicked(evt);
            }
        });

        cButton.setFont(new java.awt.Font("新細明體", 1, 14)); // NOI18N
        cButton.setForeground(new java.awt.Color(0, 51, 204));
        cButton.setText("Clear");
        cButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cButtonMouseClicked(evt);
            }
        });

        mjLabel.setFont(new java.awt.Font("新細明體", 0, 14)); // NOI18N
        mjLabel.setForeground(new java.awt.Color(0, 51, 153));
        mjLabel.setText("Major");

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Please complete the following data fileds");

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane2.setViewportView(TextArea);

        jLabel4.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Here is the data you entered");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mRadioButton)
                    .addComponent(fRadioButton))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextFieldname)
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(nLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nLabel)
                    .addComponent(TextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mRadioButton)
                            .addComponent(mjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fRadioButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eButton)
                    .addComponent(cButton))
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eButtonMouseClicked
       String name = new String();
       String major = new String();
       String gender = new String();
       
       name = TextFieldname.getText();
       
       if(mRadioButton.isSelected())
           gender = mRadioButton.getName();
       else if(fRadioButton.isSelected())
           gender = fRadioButton.getName();
       
       major = (String)mList.getSelectedValue();
       TextArea.setText("name: "+name+"\ngender: "+gender+"\nmajor: "+major );
    }//GEN-LAST:event_eButtonMouseClicked

    private void cButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cButtonMouseClicked
        TextArea.setText("");
        TextFieldname.setText("");
        mRadioButton.setSelected(false);
        fRadioButton.setSelected(false);
        int indextNo = -1;
        mList.setSelectedIndex(indextNo);
    }//GEN-LAST:event_cButtonMouseClicked

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
            java.util.logging.Logger.getLogger(SurveyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurveyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurveyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurveyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SurveyGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField TextFieldname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cButton;
    private javax.swing.JButton eButton;
    private javax.swing.JRadioButton fRadioButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList mList;
    private javax.swing.JRadioButton mRadioButton;
    private javax.swing.JLabel mjLabel;
    private javax.swing.JLabel nLabel;
    // End of variables declaration//GEN-END:variables
}
