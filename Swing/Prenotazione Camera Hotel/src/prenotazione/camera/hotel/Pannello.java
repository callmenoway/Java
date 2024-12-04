package prenotazione.camera.hotel;
import javax.swing.JOptionPane;

public class Pannello extends javax.swing.JFrame {

    public Pannello() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TipoCamere = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        TipoS = new javax.swing.JCheckBox();
        TipoM = new javax.swing.JCheckBox();
        TipoSB = new javax.swing.JCheckBox();
        TipoK = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        TipoV = new javax.swing.JRadioButton();
        TipoI = new javax.swing.JRadioButton();
        TipoD = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BottoneCancella = new javax.swing.JButton();
        BottoneEsci = new javax.swing.JButton();
        BottoneCalcola = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextImport = new javax.swing.JTextField();
        TextIVA = new javax.swing.JTextField();
        TextTotale = new javax.swing.JTextField();

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Prenotazione Camera Hotel");
        jLabel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        TipoCamere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suite Room", "Standard Room", "Superior Room", "Junior Suite", "Superior Suite" }));
        TipoCamere.setActionCommand("tipocamere");
        TipoCamere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCamereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(TipoCamere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(TipoCamere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipologia di camere");

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        TipoS.setBackground(new java.awt.Color(153, 153, 153));
        TipoS.setForeground(new java.awt.Color(0, 0, 0));
        TipoS.setText("Letto Singolo");

        TipoM.setBackground(new java.awt.Color(153, 153, 153));
        TipoM.setForeground(new java.awt.Color(0, 0, 0));
        TipoM.setText("Letto Matrimoniale");
        TipoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMActionPerformed(evt);
            }
        });

        TipoSB.setBackground(new java.awt.Color(153, 153, 153));
        TipoSB.setForeground(new java.awt.Color(0, 0, 0));
        TipoSB.setText("King Size Bed");
        TipoSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoSBActionPerformed(evt);
            }
        });

        TipoK.setBackground(new java.awt.Color(153, 153, 153));
        TipoK.setForeground(new java.awt.Color(0, 0, 0));
        TipoK.setText("Super King Size Bed");
        TipoK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoK)
                    .addComponent(TipoSB)
                    .addComponent(TipoM)
                    .addComponent(TipoS))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TipoS)
                .addGap(20, 20, 20)
                .addComponent(TipoM)
                .addGap(18, 18, 18)
                .addComponent(TipoSB)
                .addGap(18, 18, 18)
                .addComponent(TipoK)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        TipoV.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(TipoV);
        TipoV.setForeground(new java.awt.Color(0, 0, 0));
        TipoV.setText("Vasca");
        TipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoVActionPerformed(evt);
            }
        });

        TipoI.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(TipoI);
        TipoI.setForeground(new java.awt.Color(0, 0, 0));
        TipoI.setText("Idromassaggio");
        TipoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoIActionPerformed(evt);
            }
        });

        TipoD.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(TipoD);
        TipoD.setForeground(new java.awt.Color(0, 0, 0));
        TipoD.setText("Doccia");
        TipoD.setToolTipText("");
        TipoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TipoI)
                    .addComponent(TipoD, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoV, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TipoV)
                .addGap(18, 18, 18)
                .addComponent(TipoI)
                .addGap(18, 18, 18)
                .addComponent(TipoD)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipologia di letto");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipologia di bagno");

        BottoneCancella.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BottoneCancella.setText("Cancella");
        BottoneCancella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneCancellaActionPerformed(evt);
            }
        });

        BottoneEsci.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BottoneEsci.setText("Esci");
        BottoneEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneEsciActionPerformed(evt);
            }
        });

        BottoneCalcola.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BottoneCalcola.setText("Calcola");
        BottoneCalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneCalcolaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("IVA");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Totale");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Importo");

        TextImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextImportActionPerformed(evt);
            }
        });

        TextIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIVAActionPerformed(evt);
            }
        });

        TextTotale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTotaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(81, 81, 81)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(190, 190, 190)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(55, 55, 55))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextTotale, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(TextImport, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(BottoneCalcola, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BottoneCancella, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(BottoneEsci, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(394, 394, 394))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(290, 290, 290)
                    .addComponent(jLabel7)
                    .addContainerGap(705, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BottoneCancella, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottoneEsci, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottoneCalcola, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(TextImport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextTotale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(509, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(162, 162, 162)))
        );

        TextImport.getAccessibleContext().setAccessibleName("TextImport");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoIActionPerformed

    private void TipoCamereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoCamereActionPerformed
        //COMBOBOX
    }//GEN-LAST:event_TipoCamereActionPerformed

    private void TextImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextImportActionPerformed

    private void TextIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIVAActionPerformed

    private void TipoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoMActionPerformed

    private void TipoSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoSBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoSBActionPerformed

    private void TipoKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoKActionPerformed

    private void TipoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoVActionPerformed

    private void TipoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoDActionPerformed

    private void BottoneCalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneCalcolaActionPerformed
        int importo = 0;
        String selezione = (String) TipoCamere.getSelectedItem();
        switch (selezione) {
            case "Suite Room":
                importo = 20;
                break;
            case "Standard Room":
                importo = 30;
                break;
            case "Superior Room":
                importo = 40;
                break;
            case "Junior Suite":
                importo = 50;
                break;
            case "Presidential Suite":
                importo = 60;
                break;
        }
        
        if(TipoS.isSelected())
            importo += 10;
        else if(TipoM.isSelected())
            importo += 20;
        else if(TipoSB.isSelected())
            importo += 30;
        else if(TipoK.isSelected())
            importo += 40;
        else{
            JOptionPane.showMessageDialog(
                null,
                "Si è verificato un errore!",
                "Errore",  
                JOptionPane.ERROR_MESSAGE      
            );
            return;
        }
        
        if(TipoV.isSelected())
            importo += 10;
        else if(TipoI.isSelected())
            importo += 20;
        else if(TipoD.isSelected())
            importo += 30;
        else{
            JOptionPane.showMessageDialog(
                null,
                "Si è verificato un errore!",
                "Errore",  
                JOptionPane.ERROR_MESSAGE      
            );
            return;
        }
        
        TextImport.setText(String.valueOf(importo));
        TextIVA.setText(String.valueOf((importo*12)/100));
        TextTotale.setText(String.valueOf(((importo*12)/100)+importo));
                
    }//GEN-LAST:event_BottoneCalcolaActionPerformed

    private void BottoneCancellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneCancellaActionPerformed
        TextImport.setText("");
        TextIVA.setText("");
        TextTotale.setText("");
        TipoS.setSelected(false);
        TipoM.setSelected(false);
        TipoSB.setSelected(false);
        TipoK.setSelected(false);
        TipoV.setSelected(false);
        TipoI.setSelected(false);
        TipoD.setSelected(false);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_BottoneCancellaActionPerformed

    private void BottoneEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BottoneEsciActionPerformed

    private void TextTotaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTotaleActionPerformed
    }//GEN-LAST:event_TextTotaleActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pannello().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottoneCalcola;
    private javax.swing.JButton BottoneCancella;
    private javax.swing.JButton BottoneEsci;
    private javax.swing.JTextField TextIVA;
    private javax.swing.JTextField TextImport;
    private javax.swing.JTextField TextTotale;
    private javax.swing.JComboBox<String> TipoCamere;
    private javax.swing.JRadioButton TipoD;
    private javax.swing.JRadioButton TipoI;
    private javax.swing.JCheckBox TipoK;
    private javax.swing.JCheckBox TipoM;
    private javax.swing.JCheckBox TipoS;
    private javax.swing.JCheckBox TipoSB;
    private javax.swing.JRadioButton TipoV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
