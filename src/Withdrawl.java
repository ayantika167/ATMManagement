import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleDriver;
import oracle.jdbc.OracleStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Withdrawl extends javax.swing.JFrame {

    /**
     * Creates new form Withdrawl
     */
    
    
    public Withdrawl() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lbl2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl2.setText("Withdrawal Balance");

        tf2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbl1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl1.setText("Main balance");

        tf1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lbl3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl3.setText("After Withdrawal");

        tf3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btn1.setBackground(new java.awt.Color(0, 102, 102));
        btn1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn1.setText("OK");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl4.setText("Account No.");

        tf4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(153, 153, 153));
        btn2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn2.setText("Back");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf1)
                                    .addComponent(tf2)
                                    .addComponent(tf3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
      // TODO add your handling code here:
      try{
           DriverManager.registerDriver(new OracleDriver());
            
            // 2. CREATING THE CONNECTION OBJECT
            OracleConnection oconn =(OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-B2LQN4P:1521:orcl","ankita","mitra");
            
            // 3. CREATING THE STATEMENT OBJECT
            OracleStatement ostmt = (OracleStatement)oconn.createStatement();
          int num1 = Integer.parseInt(tf1.getText().toString());
          // tf1.setText(String.valueOf(String.format("%.12f", num1)));
            
          int num2=Integer.parseInt(tf2.getText().toString());
            if(num1 < num2)
        {
           JOptionPane.showMessageDialog(this,"Withdrwal should be less than Main Balance");
        }
        else
        {
          int num3 = num1 - num2;
          String num4=Integer.toString(num3);
           tf3.setText(num4);
           
             String main,with,afterwith;
            
            // 5. ASSIGNING THE VALUES
            main = tf1.getText();
            with = tf2.getText();
            afterwith = tf3.getText();
            
            
            // 6. CREATING THE SQL STATEMENT
            String sql = "insert into withdrawl values('"+main+"','"+with+"','"+afterwith+"')";
            JOptionPane.showMessageDialog(this, sql);
            
            // 7. EXECUTING THE INSERT
            ostmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(this,"Record added successfully"); 
           
        }
        }
        catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        
      }
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // 1. REGISTRATION OF JAVA PROGRAM WITH ORACLE
            DriverManager.registerDriver(new OracleDriver());
            
            // 2. CREATING THE CONNECTION OBJECT
            OracleConnection oconn =(OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-B2LQN4P:1521:orcl","ankita","mitra");
            
            // 3. CREATING THE STATEMENT OBJECT
            OracleStatement ostmt = (OracleStatement)oconn.createStatement();
            
            String sql = "Select * from customer_details where account_number=?";
            String main_bal;
            PreparedStatement pst;
            pst = oconn.prepareStatement(sql);
            main_bal = tf4.getText();
             
            pst.setString(1,main_bal);
            
            ResultSet rs = pst.executeQuery();

            if(rs.next()) {
               
                tf1.setText(rs.getString("mainbalance"));
               
           
               }
            else {
                JOptionPane.showMessageDialog(null, "Sorry record not found!!");
            }
        }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
Account ob7= new Account();
         ob7.setVisible(true);
         setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed
        
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
            java.util.logging.Logger.getLogger(Withdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdrawl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
