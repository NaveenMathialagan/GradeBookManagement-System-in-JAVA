
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen kumar
 */
public class dbms33 extends javax.swing.JFrame {
String s,s1,s2,s3;
    /**
     * Creates new form dbms33
     */
    public dbms33() {
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

        l = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 36)); // NOI18N
        l.setForeground(new java.awt.Color(255, 255, 255));
        l.setText("Course Information");
        getContentPane().add(l);
        l.setBounds(390, 40, 340, 50);

        jLabel2.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course code :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 160, 190, 60);

        jLabel3.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 240, 170, 70);

        jLabel4.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Faculty code :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 330, 180, 70);

        t.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        getContentPane().add(t);
        t.setBounds(410, 160, 310, 60);

        t1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(410, 250, 310, 60);

        t2.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(410, 340, 310, 60);

        jButton4.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 450, 140, 40);

        jButton5.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jButton5.setText("Next >>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(590, 520, 150, 40);

        jButton6.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jButton6.setText("<<Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(410, 520, 140, 40);

        jButton7.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 24)); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(590, 450, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ios_7_galaxy-1920x1440 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 650);

        setBounds(0, 0, 1069, 683);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        s=t.getText();
        s1=t1.getText();
        s2=t2.getText();
       
      if(s.equals("")||s1.equals("")||s2.equals(""))
     {
        
           JOptionPane.showMessageDialog(null,"please!! Enter the values" );
          
     }
      else
     { 
        SQL d=new SQL("jdbc:oracle:thin:@localhost:1521:XE","oracle.jdbc.OracleDriver","hr","hr");
        String str="insert into dbcours values('"+s+"','"+s1+"','"+s2+"')";
   try{
       
        d.executeQuery(str);
        
            d.rs.next();
            
          JOptionPane.showMessageDialog(null,"Student information Successfully updated" );
        t.setText("");
       t1.setText("");
       t2.setText("");
            JOptionPane.showMessageDialog(null,"Enter the Course information");
   }
   catch(Exception e)
   { JOptionPane.showMessageDialog(null,"Error in your Entry");
     
   }
     }   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       t.setText("");
       t1.setText("");
       t2.setText("");
        JOptionPane.showMessageDialog(null,"Enter the Course information");
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dbms32 d32=new dbms32();
        d32.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dbms34 d34=new dbms34();
        d34.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(dbms33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dbms33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dbms33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dbms33.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dbms33().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l;
    private javax.swing.JTextField t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
