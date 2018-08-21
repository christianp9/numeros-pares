/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropares0.x;

import javax.swing.JOptionPane;

/**
 *
 * @author CHRISTIAN
 */
public class NumeroPares0X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese limite")); 
              int i=0;
      
      for (int a = 0;a<num;a++){
      if (a%2==0){
        System.out.println(a);  
      }
          
      
      }
    }
    
}
