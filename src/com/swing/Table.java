/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Admin
 */
public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int il) {
              Table_Header header = new Table_Header(o +" ");
                if (il == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
               return header;
            }
            
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int il) {
                if (il != 4) {
                    Component  com = super.getTableCellRendererComponent(table, o, isSelected, hasFocus, row, il);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        com.setForeground(new Color(15,89,140));
                    } else {
                        com.setForeground(new Color(102,102,102));
                    }
                    return com;
                }else{
//                    StatusType type=(StatusType)o;
//                    CellStatus cell= new CellStatus(type);
//                    return cell;
                    return new JLabel("Testing");
                }
            }
            
        });
    }
        
}
