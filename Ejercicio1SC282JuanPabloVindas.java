/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.sc282.juan.pablo.vindas;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Ejercicio1SC282JuanPabloVindas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nempleados;
        double salario=0;
        String cantidad;
        double salariosem;
        double sal;
        
        
        cantidad= JOptionPane.showInputDialog("Digite cauntos empleados trabajan actualmente en la empresa");
         nempleados= Integer.parseInt(cantidad);
         
    
        for (int i = 0; i < nempleados; i++) {
           
            salario= Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del trabajador")); 
        }
        salariosem= salario+1;
        salariosem= salario * 0.0925;
        sal=salariosem * 0.0508;
        
        JOptionPane.showMessageDialog(null, "El monto total es del"+sal);
        
      
   
         
         
         
            
        }
       
        
    }
    

