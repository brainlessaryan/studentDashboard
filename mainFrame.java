
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
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

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel NAME = new javax.swing.JLabel();
        TFNAME = new javax.swing.JTextField();
        javax.swing.JLabel PHONE = new javax.swing.JLabel();
        TFPHONE = new javax.swing.JTextField();
        javax.swing.JButton ADD = new javax.swing.JButton();
        javax.swing.JButton CLEAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TFEMAIL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFADDRESS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFROLL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFBRANCH = new javax.swing.JTextField();
        javax.swing.JButton DELETE = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tablestudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dashboard");
        setMinimumSize(new java.awt.Dimension(996, 404));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Stylus BT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jLabel1.setText("List of students");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Student details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        NAME.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        NAME.setText("NAME:");

        TFNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNAMEActionPerformed(evt);
            }
        });

        PHONE.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        PHONE.setText("PHONE NUMBER");

        TFPHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPHONEActionPerformed(evt);
            }
        });

        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel2.setText("EMAIL");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel3.setText("ADDRESS");

        TFADDRESS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFADDRESSActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        jLabel4.setText("ROLL NUMBER");

        TFROLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFROLLActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel5.setText("Branch");

        TFBRANCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBRANCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TFNAME)
            .addComponent(PHONE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TFPHONE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ADD)
                .addGap(18, 18, 18)
                .addComponent(CLEAR)
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TFEMAIL)
            .addComponent(TFADDRESS)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TFROLL)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TFBRANCH)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ADD, CLEAR});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NAME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFROLL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFBRANCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD)
                    .addComponent(CLEAR))
                .addContainerGap())
        );

        DELETE.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        DELETE.setText("DELETE ENTRY");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        tablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME OF STUDENT", "PHONE NUMBER", "EMAIL", "ADDRESS", "ROLL NUMBER", "BRANCH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablestudent.setMaximumSize(new java.awt.Dimension(2147483647, 483647));
        jScrollPane1.setViewportView(tablestudent);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DELETE)
                                .addGap(0, 521, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void TFNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNAMEActionPerformed

    private void TFPHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPHONEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        String NAME = TFNAME.getText();
        String PHONE = TFPHONE.getText();
        String EMAIL = TFEMAIL.getText();
        String ADDRESS = TFADDRESS.getText();
        String ROLL = TFROLL.getText();
        String BRANCH = TFBRANCH.getText();
        
        if (NAME.isEmpty() || PHONE.isEmpty() || EMAIL.isEmpty() || ADDRESS.isEmpty() || ROLL.isEmpty() || BRANCH.isEmpty())
        {
            JOptionPane.showMessageDialog(this,
                    "ERROR!!",
                    "PLEASE ENTER ALL THE FIELDS",
                    JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) tablestudent.getModel();
            model.addRow(new Object[]{NAME, PHONE, EMAIL, ADDRESS, ROLL, BRANCH});
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        TFNAME.setText("");
        TFPHONE.setText("");
        TFEMAIL.setText("");
        TFADDRESS.setText("");
        TFROLL.setText("");
        TFBRANCH.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        int row = tablestudent.getSelectedRow();
        
        if(row<0)
        {
            JOptionPane.showMessageDialog(this,
                    "NO ROW SELECTED!",
                    "SELECT ATLEAST ONE ROW",
                    JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) tablestudent.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DefaultTableModel model = (DefaultTableModel) tablestudent.getModel();
        Vector<Vector> tableData = model.getDataVector();
        
        //SAVING THE OBJECT IN THE FILE
        
        try
        {
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            //serialization of object
            
            output.writeObject(tableData);
            
            output.close();
            file.close();
        }
        catch(Exception E)
                { 
                    E.printStackTrace(); 
                }
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try {
            Vector<Vector> tableData;
            try (FileInputStream file = new FileInputStream("file.bin")) {
                ObjectInputStream input = new ObjectInputStream(file);
                tableData = (Vector<Vector>) input.readObject();
                input.close();
            }
            
            DefaultTableModel model = (DefaultTableModel) tablestudent.getModel();
            for(int i=0; i<tableData.size(); i++)
            {
                Vector row = tableData.get(1);
                model.addRow(new Object[]{row.get(0), row.get(1), row.get(2), row.get(3), row.get(4), row.get(5)});
            }
        }
        catch(Exception E)
                {
                    E.printStackTrace();
                }
    }//GEN-LAST:event_formWindowOpened

    private void TFADDRESSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFADDRESSActionPerformed

    }//GEN-LAST:event_TFADDRESSActionPerformed

    private void TFBRANCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBRANCHActionPerformed

    }//GEN-LAST:event_TFBRANCHActionPerformed

    private void TFROLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFROLLActionPerformed

    }//GEN-LAST:event_TFROLLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFADDRESS;
    private javax.swing.JTextField TFBRANCH;
    private javax.swing.JTextField TFEMAIL;
    private javax.swing.JTextField TFNAME;
    private javax.swing.JTextField TFPHONE;
    private javax.swing.JTextField TFROLL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTable tablestudent;
    // End of variables declaration//GEN-END:variables
}