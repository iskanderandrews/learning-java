/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js_club.dPlaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tony
 */
public class Malls extends javax.swing.JFrame {

    /**
     * Creates new form Restaurants
     */
    public Malls() {
        
        initComponents();
        
        File f = new File("Mailes_Info.txt");
        try {
            Scanner sc = new Scanner(f);
            
            while (sc.hasNext()) {                
                Info.append(sc.nextLine()+"\n");
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File Info not Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        setResizable(false);
        setSize(625 , 430);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Info = new javax.swing.JTextArea();
        Restaurant_name = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Info.setEditable(false);
        Info.setColumns(20);
        Info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Info.setRows(5);
        jScrollPane1.setViewportView(Info);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(8, 130, 600, 167);

        Restaurant_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Restaurant_name.setForeground(new java.awt.Color(255, 255, 255));
        Restaurant_name.setText("Cairo Mailes");
        getContentPane().add(Restaurant_name);
        Restaurant_name.setBounds(170, 20, 69, 17);

        Back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(531, 310, 70, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/js_club/dPlaces/Mall.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Place p = new Place();
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextArea Info;
    private javax.swing.JLabel Restaurant_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
