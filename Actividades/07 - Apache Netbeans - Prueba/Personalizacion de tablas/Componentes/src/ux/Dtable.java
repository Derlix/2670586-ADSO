/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ux;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author chris
 */
public class Dtable extends JTable {
    
    @Override
   public Component prepareRenderer(TableCellRenderer renderer, int rowIndex,int columnIndex){
       Component component = super.prepareRenderer(renderer, rowIndex, columnIndex);
       component.setBackground(Color.WHITE);
       component.setForeground(Color.BLACK);
       
       if((Float.class.equals(this.getColumnClass(columnIndex)))&& (getValueAt(rowIndex, columnIndex)!=null)){
           float val = Float.parseFloat(getValueAt(rowIndex, columnIndex).toString());
           if(val<=0){
               component.setBackground(Color.PINK);
               component.setForeground(Color.GREEN);
           }
        }    
       return component;
   }
}
