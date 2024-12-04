package lista.della.spesa;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Lista extends javax.swing.JFrame {
    
    public Lista() {
        initComponents();
        ImageIcon img = new ImageIcon("./resources/icona.png");
        this.setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaLista = new javax.swing.JList<>();
        TextBoxTesto = new javax.swing.JTextField();
        ResetLista = new javax.swing.JButton();
        AddTesto = new javax.swing.JButton();
        CancellaElemento = new javax.swing.JButton();
        Esci = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LA MIA LISTA DELLA SPESA:");

        AreaLista.setBackground(new java.awt.Color(255, 255, 255));
        AreaLista.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(AreaLista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        TextBoxTesto.setBackground(new java.awt.Color(204, 204, 204));
        TextBoxTesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBoxTestoActionPerformed(evt);
            }
        });

        ResetLista.setBackground(new java.awt.Color(255, 255, 255));
        ResetLista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResetLista.setForeground(new java.awt.Color(0, 0, 0));
        ResetLista.setText("RESET LISTA");
        ResetLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetListaActionPerformed(evt);
            }
        });

        AddTesto.setBackground(new java.awt.Color(255, 255, 255));
        AddTesto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddTesto.setForeground(new java.awt.Color(0, 0, 0));
        AddTesto.setText("ADD TESTO");
        AddTesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTestoActionPerformed(evt);
            }
        });

        CancellaElemento.setBackground(new java.awt.Color(255, 255, 255));
        CancellaElemento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancellaElemento.setForeground(new java.awt.Color(0, 0, 0));
        CancellaElemento.setText("CANCELLA ELEMENTO");
        CancellaElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancellaElementoActionPerformed(evt);
            }
        });

        Esci.setBackground(new java.awt.Color(255, 255, 255));
        Esci.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Esci.setForeground(new java.awt.Color(0, 0, 0));
        Esci.setText("ESCI");
        Esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Esci)
                    .addComponent(ResetLista))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextBoxTesto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(CancellaElemento)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(AddTesto)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextBoxTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ResetLista)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancellaElemento)
                    .addComponent(Esci))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(459, Short.MAX_VALUE)
                    .addComponent(AddTesto)
                    .addGap(65, 65, 65)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    DefaultListModel<String> model = new DefaultListModel<>();
    private void AddTestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTestoActionPerformed
        String oggetto = TextBoxTesto.getText();
        if (!oggetto.isEmpty()) {
            model.addElement(oggetto);
            AreaLista.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "Elemento Vuoto!");
        }
        TextBoxTesto.setText("");
    }//GEN-LAST:event_AddTestoActionPerformed

    private void TextBoxTestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBoxTestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBoxTestoActionPerformed

    private void EsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsciActionPerformed
        int risposta = JOptionPane.showConfirmDialog(
        null,                               
        "Sei sicuro di voler uscire?",
        "Conferma Uscita",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
        );

        if (risposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_EsciActionPerformed

    private void CancellaElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancellaElementoActionPerformed
        int indiceSelezionato = AreaLista.getSelectedIndex();
        
        if (indiceSelezionato != -1) {
            DefaultListModel lista = (DefaultListModel) AreaLista.getModel();
            lista.removeElementAt(indiceSelezionato);
        } else {
            JOptionPane.showMessageDialog(null, "Attenzione Seleziona almeno un elemento");
        }
    }//GEN-LAST:event_CancellaElementoActionPerformed

    private void ResetListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetListaActionPerformed
        DefaultListModel lista = (DefaultListModel) AreaLista.getModel();
        lista.clear();
    }//GEN-LAST:event_ResetListaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTesto;
    private javax.swing.JList<String> AreaLista;
    private javax.swing.JButton CancellaElemento;
    private javax.swing.JButton Esci;
    private javax.swing.JButton ResetLista;
    private javax.swing.JTextField TextBoxTesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables


}
