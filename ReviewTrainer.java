
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ReviewTrainer extends javax.swing.JDialog {

    /**
     * Creates new form ReviewTrainer
     */
    public ReviewTrainer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        submitBtn = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        statLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        feeLabel1 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        maxPartLabel = new javax.swing.JLabel();
        MaxPartTitleLabel = new javax.swing.JLabel();
        numPartLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        trainerLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        specialLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        notesLabel = new javax.swing.JLabel();
        NotesTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(25, 24, 28));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Date");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel4.setBackground(new java.awt.Color(25, 24, 28));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(242, 146, 22)));

        submitBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitBtn.setText("Submit");
        submitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 830, 340, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Review");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator6.setForeground(new java.awt.Color(242, 146, 22));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 340, 10));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Title");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Status");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("title");
        jPanel3.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("date");
        jPanel3.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("time");
        jPanel3.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Time");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        statLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        statLabel.setForeground(new java.awt.Color(255, 255, 255));
        statLabel.setText("status");
        jPanel3.add(statLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Fee");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        feeLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        feeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        feeLabel1.setText("fee");
        jPanel3.add(feeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        typeLabel.setText("type");
        jPanel3.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Type");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        maxPartLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        maxPartLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxPartLabel.setText("max");
        jPanel3.add(maxPartLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        MaxPartTitleLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        MaxPartTitleLabel.setForeground(new java.awt.Color(153, 153, 153));
        MaxPartTitleLabel.setText("maxPartLabel");
        jPanel3.add(MaxPartTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        numPartLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        numPartLabel.setForeground(new java.awt.Color(255, 255, 255));
        numPartLabel.setText("number");
        jPanel3.add(numPartLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Rating");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        trainerLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        trainerLabel.setForeground(new java.awt.Color(255, 255, 255));
        trainerLabel.setText("trainer");
        jPanel3.add(trainerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Trainer");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        specialLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        specialLabel.setForeground(new java.awt.Color(255, 255, 255));
        specialLabel.setText("specialty");
        jPanel3.add(specialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Specialty");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 370, 200));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Number of Participants");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("Comments");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("1");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("5");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("2");
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("3");
        jPanel3.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("4");
        jPanel3.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        notesLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        notesLabel.setForeground(new java.awt.Color(255, 255, 255));
        notesLabel.setText("notes");
        jPanel3.add(notesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        NotesTitleLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        NotesTitleLabel.setForeground(new java.awt.Color(153, 153, 153));
        NotesTitleLabel.setText("Notes");
        jPanel3.add(NotesTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseExited
        submitBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_submitBtnMouseExited

    private void submitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseEntered
        submitBtn.setForeground(new Color(242,146,22));
    }//GEN-LAST:event_submitBtnMouseEntered

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
            java.util.logging.Logger.getLogger(ReviewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewTrainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReviewTrainer dialog = new ReviewTrainer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaxPartTitleLabel;
    private javax.swing.JLabel NotesTitleLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel feeLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel maxPartLabel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JLabel numPartLabel;
    private javax.swing.JLabel specialLabel;
    private javax.swing.JLabel statLabel;
    private javax.swing.JLabel submitBtn;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel trainerLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}