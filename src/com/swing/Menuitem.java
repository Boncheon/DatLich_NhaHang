
package com.swing;

import com.model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Admin
 */
public class Menuitem extends javax.swing.JPanel {

    /**
     * @param selected the selected to set
     */
  

    private boolean selected;
    
    public Menuitem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if(data.getType() == Model_Menu.MenuType.MENU){
            
                lblcon.setIcon(data.toIcon());
                lbName.setText(data.getName());
            
        }else if(data.getType() == Model_Menu.MenuType.TITLE){
            lblcon.setText(data.getName());
            lblcon.setFont(new Font("sansserif",1,12));
            lbName.setVisible(false);
            
        }else{
            
            lbName.setText(" ");
        }
    }
    
      public void setSelected(boolean selected) {
        this.selected = selected;
          repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        lblcon.setForeground(new java.awt.Color(255, 255, 255));

        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblcon)
                .addGap(18, 18, 18)
                .addComponent(lbName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbName)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(lblcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphcs) {
       
        if(selected){
            
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255,255,255,80));
        g2.fillRoundRect(10, 0, getWidth()-20, getHeight(), 5, 5);
        }
        
        super.paintComponent(grphcs); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lblcon;
    // End of variables declaration//GEN-END:variables
}
